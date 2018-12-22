package com.cxl.springBootCrm;

import org.jeecgframework.minidao.aop.MiniDaoHandler;
import org.jeecgframework.minidao.factory.MiniDaoBeanScannerConfigurer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class MiniDaoConfiguration {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource() {
        this.dataSource=DataSourceBuilder.create().build();
        return this.dataSource;
    }

    @Bean(name = "jdbcTemplate")
    public JdbcTemplate jdbcTemplate() {
        this.jdbcTemplate=new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }

    @Bean(name = "namedParameterJdbcTemplate")
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
        this.namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
        return this.namedParameterJdbcTemplate;
    }

    @Bean
    public MiniDaoBeanScannerConfigurer miniDaoBeanScannerConfigurer(){
        MiniDaoBeanScannerConfigurer miniDaoBeanScannerConfigurer=new MiniDaoBeanScannerConfigurer();
        miniDaoBeanScannerConfigurer.setDbType("oracle");
        miniDaoBeanScannerConfigurer.setFormatSql(true);
        miniDaoBeanScannerConfigurer.setKeyType("lower");
        miniDaoBeanScannerConfigurer.setShowSql(true);
        miniDaoBeanScannerConfigurer.setBasePackage("com.cxl.*");
        return miniDaoBeanScannerConfigurer;
    }
}
