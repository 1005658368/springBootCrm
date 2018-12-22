package com.cxl.springBootCrm.dao;

import com.cxl.springBootCrm.entity.OrderHeadEntity;
import com.cxl.springBootCrm.vo.CommonVo;
import org.jeecgframework.minidao.annotation.Arguments;
import org.jeecgframework.minidao.annotation.MiniDao;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.annotation.Sql;
import org.jeecgframework.minidao.pojo.MiniDaoPage;

@MiniDao
public interface OrderHeadMiniDao {
    public static final String findMiniVoSql =
            " select * from order_head o " +
            " where 1=1 " +
            "<#if vo.custCompanyName ? exists && vo.custCompanyName ? length gt 0> "+
            " and o.cust_company_name like '%'||:vo.custCompanyName||'%' " +
            "</#if>"
            ;
    @Sql(findMiniVoSql)
    @Arguments({"vo","rows","page"})
    @ResultType(OrderHeadEntity.class)
    MiniDaoPage<OrderHeadEntity> findMiniByVo(OrderHeadEntity vo, int rows, int page);

    @Arguments({"vo","rows","page"})
    @ResultType(OrderHeadEntity.class)
    MiniDaoPage<OrderHeadEntity> findMiniByVo2(OrderHeadEntity vo, int rows, int page);

    public static final String findMiniVoSql3 =
            " select * from order_head o " +
                    " where 1=1 " +
                    "<#if vo.custCompanyName ? exists && vo.custCompanyName ? length gt 0> "+
                    " and o.cust_company_name like '%'||:vo.custCompanyName||'%' " +
                    "</#if>"
            ;
    @Sql(findMiniVoSql3)
    @Arguments({"vo","rows","page"})
    @ResultType(CommonVo.class)
    MiniDaoPage<CommonVo> findMiniByVo3(OrderHeadEntity vo, int rows, int page);

}
