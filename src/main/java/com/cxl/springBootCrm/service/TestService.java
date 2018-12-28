package com.cxl.springBootCrm.service;

import com.cxl.springBootCrm.dao.OrderHeadDao;
import com.cxl.springBootCrm.dao.OrderHeadMiniDao;
import com.cxl.springBootCrm.entity.OrderHeadEntity;
import com.cxl.springBootCrm.vo.CommonVo;
import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {
    @Autowired
    OrderHeadDao orderHeadDao;
    @Autowired
    OrderHeadMiniDao orderHeadMiniDao;

    public String test1(String param){
        List<OrderHeadEntity> list1=orderHeadDao.findAll();
        List plist1=new ArrayList<String>();
        plist1.add("8a82496f669952590166997159d70002");
        plist1.add("8a82496f6699525901669a540bb90393");
        List<OrderHeadEntity> list2=orderHeadDao.findAllById(plist1);
        OrderHeadEntity orderHeadEntity=orderHeadDao.getOne("8a82496f669952590166997159d70002");
        int page=1,size=10;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(page, size, sort);
        Page<OrderHeadEntity> pagelist3=orderHeadDao.findAll(pageable);
        List<OrderHeadEntity> list4=orderHeadDao.findByOrderCode("1000006582");
        OrderHeadEntity orderHeadEntity2=orderHeadDao.getByOrderCode("1000006582");
        List<OrderHeadEntity> list5=orderHeadDao.findByCustSapCode("41030011");
        List<OrderHeadEntity> list6=orderHeadDao.findByLikeCustName("郑州办事处（1141）","6");
        List<OrderHeadEntity> list7=orderHeadDao.getByCustName("郑州办事处（1141）");
        List<OrderHeadEntity> list8=orderHeadDao.findEntityByLikeCustName("郑州办事处（1141）","6");
        List<OrderHeadEntity> list9=orderHeadDao.getEntityByCustName("郑州办事处（1141）");
        OrderHeadEntity vo=new OrderHeadEntity();
        vo.setCustCompanyName("郑州办事处（1141）");
        MiniDaoPage<OrderHeadEntity> miniDaoPage1=orderHeadMiniDao.findMiniByVo2(vo,10,1);
        MiniDaoPage<CommonVo> miniDaoPage2=orderHeadMiniDao.findMiniByVo3(vo,10,1);
        return "TestService/test1:"+param+orderHeadDao.count();
    }

}
