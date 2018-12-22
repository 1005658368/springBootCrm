package com.cxl.springBootCrm.controller;

import com.cxl.springBootCrm.service.PropertiesService;
import com.cxl.springBootCrm.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("test")
public class TestController {
    Logger log=LoggerFactory.getLogger(TestController.class);
    @Resource
    PropertiesService properties;
    @Autowired
    TestService testService;

    @RequestMapping("/test1")
    public String test1(String p1,String p2){
//        log.info(properties.getTitle()+"-------"+p1+properties.getDescription());
//        FreemarkerParseFactory.parseTemplateContent(" select * from order_head o  where 1=1 <#if vo.custCompanyName ? exists && vo.custCompanyName ? length gt 0>  and o.cust_company_name like '%'||:vo.custCompanyName||'%' </#if>", null);
        String result=testService.test1(p1);
        return result;
    }
}
