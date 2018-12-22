package com.cxl.springBootCrm.dao;

import com.cxl.springBootCrm.entity.OrderHeadEntity;
import com.cxl.springBootCrm.vo.CommonVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderHeadDao extends JpaRepository<OrderHeadEntity,String> {

    public List<OrderHeadEntity> findByOrderCode(String orderCode);
    public OrderHeadEntity getByOrderCode(String orderCode);
    public List<OrderHeadEntity> findByCustSapCode(String CustSapCode);

    @Query(value="select o.* from order_head o join order_head_items oi on oi.other_id=o.id where o.cust_company_name like %?% and o.satisfy_Cartype like %?%",nativeQuery=true)
    public List<OrderHeadEntity> findByLikeCustName(String custName, String satisfyCartype);

    @Query(value="select * from order_head o where o.cust_company_name=? ",nativeQuery=true)
    public List<OrderHeadEntity> getByCustName(String custName);

    @Query(value="select o from OrderHeadEntity o where o.custCompanyName like %?1% and o.satisfyCartype like %?2%")
    public List<OrderHeadEntity> findEntityByLikeCustName(String custName, String satisfyCartype);

    @Query(value="select o from OrderHeadEntity o where o.custCompanyName=?1 ")
    public List<OrderHeadEntity> getEntityByCustName(String custName);

}
