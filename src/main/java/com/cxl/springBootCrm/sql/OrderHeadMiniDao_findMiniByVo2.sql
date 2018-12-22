 select * from order_head o
 where 1=1
<#if vo.custCompanyName ? exists && vo.custCompanyName ? length gt 0>
 and o.cust_company_name like '%'||:vo.custCompanyName||'%'
</#if>


