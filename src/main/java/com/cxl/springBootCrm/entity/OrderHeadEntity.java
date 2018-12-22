package com.cxl.springBootCrm.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ORDER_HEAD")
public class OrderHeadEntity extends BaseEntity implements Serializable {

    /**
     * stauts:订单状态
     订单状态:
     -10:已取消（业务取消/客服取消）
     10:新建，待提交
     20:已提交，待支付
     30:已支付，待审核
     40:已查看，审核中
     50:已处理
     60:部分交货
     70:全部交货完成
     80:已发货，待收货
     90:已收货，待评价
     100:已评价
    */


    /**
     * 经销商组织编码
     */
    private String vkorgCode;
    /**
     * 经销商组织
     */
    private String vkorg;
    /**
     * 发货工厂
     */
    private String factoryName;
    /**
     * 经销商名称
     */
    private String custCompanyName;
    /**
     *经销商编号
     */
    private String custSapCode;
    /**
     * 客户类型
     */
    private String customerType;
    /**
     *客户收货地址
     */
    private String custAddress;
    /**
     *收货人姓名
     */
    private String custReceiveName;
    /**
     *收货人电话
     */
    private String custReceivePhone;
    /**
     *客户业务代表姓名
     */
    private String custSalesmanName;
    /**
     *客户业务代表电话
     */
    private String custSalesmanPhone;
    /**
     *订单总金额
     */
    private String totalAmount;
    /**
     *订单总件数
     */
    private BigDecimal totalNum;
    /**
     * 订单标准件数
     */
    private BigDecimal standardNum;
    /**
     * 订单总吨数
     */
    private BigDecimal totalWeight;
    /**
     *可用资金
     */
    private String availableFunds;
    /**
     *实际支付
     */
    private String actualPayment;
    /**
     *需打款
     */
    private String needPay;
    /**
     * 最佳匹配车型
     */
    private String satisfyCartype;
    /**
     * //订单类型 1=(经销商订单[客户前台下单，业代后台下单，客服后台下单]) 2=(直营订单[分部内勤后台下单,KA抓单]) 3=(纯赠订单，分部内勤后台下单) 4=(UB转储单[公司间调拨，后台创建])
     * 订单类型 1=总部订单 2=分部订单 3=(纯赠订单，分部内勤后台下单) 4=(UB转储单[公司间调拨，后台创建])
     *  1 总部订单  ZDOS
     *  2 分部订单  ZDOR
     *  3 纯赠     ZKL
     *  4 UB      UB
     *  5 退货
     *  1=ZDOS  2=ZDOS  3=ZKL   4=UB
     */
    private String type;
    /**
     * 订单来源 1=(客户前台下单) 2=(业务员创建) 3=(订单员创建) 4=(KA订单抓过来的)
     */
    private String fromType;
    /**
     * 订单编号
     */
    private String orderCode;
    /**
     * 原始订单编号
     */
    private String originalOrderCode;
    /**
     * SAP订单编号
     */
    private String sapOrderCode;
    /**
     * 省
     */
    private String sheng;
    private String shengName;
    /**
     * 市
     */
    private String shi;
    private String shiName;
    /**
     * 县
     */
    private String xian;
    private String xianName;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 工厂编码
     */
    private String factoryCode;
    /**
     * 搭赠金额
     */
    private BigDecimal dzAmount;
    /**
     * 货补金额
     */
    private BigDecimal hbAmount;
    /**
     * 赠品金额
     */
    private BigDecimal zpAmount;
    /**
     * 折扣金额(实际使用折扣金额=min(zkAmount,inputZkAmount))
     * zkAmount=min(totalAmount*zkRadio/100,maxZkAmount)
     */
    private BigDecimal zkAmount;
    /**
     * 手动输入折扣金额
     */
    private BigDecimal inputZkAmount;
    /**
     * 单据日期
     */
    private String documentsDate;
    private String tempFlag = "1";//  后台订单保存 1:已经生效  0：临时状态
    /**
     * 转入工厂编码
     */
    private String toFactoryCode;//保存的是拆单前的工厂名和编码，拆单转单后的工厂信息保存在 factoryName 上
    /**
     * 转入工厂名称
     */
    private String toFactoryName;
    /**
     * 运输方式
     */
    private String transportType;
    /**
     * 采购订单编号--直营订单
     */
    private String procurementOrderCode;
    /**
     * 转入状态 2  代表转入
     */
    private String toTransferStatus;
    /**
     * UB采购组织名称
     */
    private String purchOrgName;
    /**
     * UB采购组织编码
     */
    private String purchOrgCode;
    /**
     * UB采购组
      */
    private String purchGroupCode;
    /**
     * ka系统
     */
    private String kaSystem;
    /**
     * 总件数单位
     */
    private String totalNumUnit;
    /**
     * 预案号
     */
    private String planNum;
    /**
     * 成本中心
     */
    private String costCenter;
    /**
     * 伙伴利润中心
     */
    private String partnerProfitsCenter;
    /**
     * 订单评价
     */
    private String orderEstimate;
    /**
     * 订单保存时间
     */
    private Date saveTime;
    /**
     * 订单提交时间
     */
    private Date submitTime;

    /**
     * 线路
     */
    private String remRoute;

    /**
     * 路线编码
     */
    private String remRouteCode;

    /**
     * AUGRU 订单原因 - 数据字典编码
     */
    private String augru;

    /**
     * AUGRU_TXT 订单原因描述
     */
    private String augruTxt;

    /**
     * 订单行中单位计算标准(1-以基本单位计算,2-以零售单位计算)
     */
    private String unitType;

    private String companyCode; // 订单类型为"UB"时，采购员所在公司编码

    @Column(name = "REMROUTE_CODE")
    public String getRemRouteCode() {
        return remRouteCode;
    }

    public void setRemRouteCode(String remRouteCode) {
        this.remRouteCode = remRouteCode;
    }

    @Column(name = "REMROUTE")
    public String getRemRoute() {
        return remRoute;
    }

    public void setRemRoute(String remRoute) {
        this.remRoute = remRoute;
    }

    @Column(name = "TO_TRANSFER_STATUS")
    public String getToTransferStatus() {
        return toTransferStatus;
    }

    public void setToTransferStatus(String toTransferStatus) {
        this.toTransferStatus = toTransferStatus;
    }

    @Column(name = "FACTORY_CODE")
    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    @Column(name = "VKORG_CODE")
    public String getVkorgCode() {
        return vkorgCode;
    }

    public void setVkorgCode(String vkorgCode) {
        this.vkorgCode = vkorgCode;
    }

    @Column(name = "VKORG")
    public String getVkorg() {
        return vkorg;
    }

    public void setVkorg(String vkorg) {
        this.vkorg = vkorg;
    }

    @Column(name = "FACTORY_NAME")
    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    @Column(name = "ORDER_CODE")
    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    @Column(name = "original_Order_Code")
    public String getOriginalOrderCode() {
        return originalOrderCode;
    }

    public void setOriginalOrderCode(String originalOrderCode) {
        this.originalOrderCode = originalOrderCode;
    }

    @Column(name = "SAP_ORDER_CODE")
    public String getSapOrderCode() {
        return sapOrderCode;
    }

    public void setSapOrderCode(String sapOrderCode) {
        this.sapOrderCode = sapOrderCode;
    }

    @Column(name = "REMARKS")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Column(name = "CUST_COMPANY_NAME", nullable = true, length = 100)
    public String getCustCompanyName() {
        return custCompanyName;
    }

    public void setCustCompanyName(String custCompanyName) {
        this.custCompanyName = custCompanyName;
    }

    @Column(name = "CUST_SAP_CODE", nullable = true, length = 100)
    public String getCustSapCode() {
        return custSapCode;
    }

    public void setCustSapCode(String custSapCode) {
        this.custSapCode = custSapCode;
    }

    @Column(name = "CUST_ADDRESS", nullable = true, length = 200)
    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    @Column(name = "CUST_RECEIVE_NAME", nullable = true, length = 64)
    public String getCustReceiveName() {
        return custReceiveName;
    }

    public void setCustReceiveName(String custReceiveName) {
        this.custReceiveName = custReceiveName;
    }

    @Column(name = "CUST_RECEIVE_PHONE", nullable = true, length = 32)
    public String getCustReceivePhone() {
        return custReceivePhone;
    }

    public void setCustReceivePhone(String custReceivePhone) {
        this.custReceivePhone = custReceivePhone;
    }

    @Column(name = "CUST_SALESMAN_NAME", nullable = true, length = 32)
    public String getCustSalesmanName() {
        return custSalesmanName;
    }

    public void setCustSalesmanName(String custSalesmanName) {
        this.custSalesmanName = custSalesmanName;
    }

    @Column(name = "CUST_SALESMAN_PHONE", nullable = true, length = 32)
    public String getCustSalesmanPhone() {
        return custSalesmanPhone;
    }

    public void setCustSalesmanPhone(String custSalesmanPhone) {
        this.custSalesmanPhone = custSalesmanPhone;
    }

    @Column(name = "TOTAL_AMOUNT", nullable = true, length = 64)
    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Column(name = "TOTAL_NUM", nullable = true, length = 32)
    public BigDecimal getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(BigDecimal totalNum) {
        this.totalNum = totalNum;
    }

    @Column(name = "AVAILABLE_FUNDS", nullable = true, length = 32)
    public String getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(String availableFunds) {
        this.availableFunds = availableFunds;
    }

    @Column(name = "NEED_PAY", nullable = true, length = 32)
    public String getNeedPay() {
        return needPay;
    }

    public void setNeedPay(String needPay) {
        this.needPay = needPay;
    }

    @Column(name = "SATISFY_CARTYPE", nullable = true, length = 200)
    public String getSatisfyCartype() {
        return satisfyCartype;
    }

    public void setSatisfyCartype(String satisfyCartype) {
        this.satisfyCartype = satisfyCartype;
    }

    @Column(name = "TYPE", nullable = true, length = 32)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "STANDARD_NUM")
    public BigDecimal getStandardNum() {
        return standardNum;
    }

    public void setStandardNum(BigDecimal standardNum) {
        this.standardNum = standardNum;
    }

    @Column(name = "TOTAL_WEIGHT")
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    @Column(name = "SHENG")
    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    @Column(name = "SHENG_NAME")
    public String getShengName() {
        return shengName;
    }

    public void setShengName(String shengName) {
        this.shengName = shengName;
    }

    @Column(name = "SHI")
    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    @Column(name = "SHI_NAME")
    public String getShiName() {
        return shiName;
    }

    public void setShiName(String shiName) {
        this.shiName = shiName;
    }

    @Column(name = "XIAN")
    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    @Column(name = "XIAN_NAME")
    public String getXianName() {
        return xianName;
    }

    public void setXianName(String xianName) {
        this.xianName = xianName;
    }

    @Column(name = "from_type")
    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    @Column(name = "customer_Type")
    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Column(name = "dz_Amount")
    public BigDecimal getDzAmount() {
        return dzAmount;
    }

    public void setDzAmount(BigDecimal dzAmount) {
        this.dzAmount = dzAmount;
    }

    @Column(name = "hb_Amount")
    public BigDecimal getHbAmount() {
        return hbAmount;
    }

    public void setHbAmount(BigDecimal hbAmount) {
        this.hbAmount = hbAmount;
    }

    @Column(name = "zp_Amount")
    public BigDecimal getZpAmount() {
        return zpAmount;
    }

    public void setZpAmount(BigDecimal zpAmount) {
        this.zpAmount = zpAmount;
    }

    @Column(name = "zk_Amount")
    public BigDecimal getZkAmount() {
        return zkAmount;
    }

    public void setZkAmount(BigDecimal zkAmount) {
        this.zkAmount = zkAmount;
    }

    @Column(name = "INPUT_ZK_AMOUNT")
    public BigDecimal getInputZkAmount() {
        return inputZkAmount;
    }

    public void setInputZkAmount(BigDecimal inputZkAmount) {
        this.inputZkAmount = inputZkAmount;
    }

    @Column(name = "DOCUMENTS_DATE")
    public String getDocumentsDate() {
        return documentsDate;
    }

    public void setDocumentsDate(String documentsDate) {
        this.documentsDate = documentsDate;
    }
    @Column(name = "TEMP_FLAG")
    public String getTempFlag() {
        return tempFlag;
    }

    public void setTempFlag(String tempFlag) {
        this.tempFlag = tempFlag;
    }

    @Column(name = "TRANSPORT_TYPE")
    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    @Column(name = "TO_FACTORY_CODE")
    public String getToFactoryCode() {
        return toFactoryCode;
    }

    public void setToFactoryCode(String toFactoryCode) {
        this.toFactoryCode = toFactoryCode;
    }

    @Column(name = "TO_FACTORY_NAME")
    public String getToFactoryName() {
        return toFactoryName;
    }

    public void setToFactoryName(String toFactoryName) {
        this.toFactoryName = toFactoryName;
    }

    @Column(name = "procurement_Order_Code")
    public String getProcurementOrderCode() {
        return procurementOrderCode;
    }

    public void setProcurementOrderCode(String procurementOrderCode) {
        this.procurementOrderCode = procurementOrderCode;
    }

    @Column(name = "ORDER_ESTIMATE")
    public String getOrderEstimate() {
        return orderEstimate;
    }

    public void setOrderEstimate(String orderEstimate) {
        this.orderEstimate = orderEstimate;
    }

    @Column(name = "PURCH_ORG_NAME")
    public String getPurchOrgName() {
        return purchOrgName;
    }

    public void setPurchOrgName(String purchOrgName) {
        this.purchOrgName = purchOrgName;
    }

    @Column(name = "PURCH_ORG_CODE")
    public String getPurchOrgCode() {
        return purchOrgCode;
    }

    public void setPurchOrgCode(String purchOrgCode) {
        this.purchOrgCode = purchOrgCode;
    }

    @Column(name = "PURCH_GROUP_CODE")
    public String getPurchGroupCode() {
        return purchGroupCode;
    }

    public void setPurchGroupCode(String purchGroupCode) {
        this.purchGroupCode = purchGroupCode;
    }

    @Column(name = "ka_System")
    public String getKaSystem() {
        return kaSystem;
    }

    public void setKaSystem(String kaSystem) {
        this.kaSystem = kaSystem;
    }

    @Column(name = "TOTAL_NUM_UNIT")
    public String getTotalNumUnit() {
        return totalNumUnit;
    }

    public void setTotalNumUnit(String totalNumUnit) {
        this.totalNumUnit = totalNumUnit;
    }

    @Column(name = "PLAN_NUM")
    public String getPlanNum() {
        return planNum;
    }

    public void setPlanNum(String planNum) {
        this.planNum = planNum;
    }

    @Column(name = "COST_CENTER")
    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    @Column(name = "PARTNER_PROFITS_CENTER")
    public String getPartnerProfitsCenter() {
        return partnerProfitsCenter;
    }

    public void setPartnerProfitsCenter(String partnerProfitsCenter) {
        this.partnerProfitsCenter = partnerProfitsCenter;
    }

    @Column(name = "save_Time")
    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }

    @Column(name = "submit_Time")
    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    @Column(name = "actual_Payment")
    public String getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(String actualPayment) {
        this.actualPayment = actualPayment;
    }

    @Column(name = "AUGRU")
    public String getAugru() {
        return augru;
    }

    public void setAugru(String augru) {
        this.augru = augru;
    }

    @Column(name = "AUGRU_TXT")
    public String getAugruTxt() {
        return augruTxt;
    }

    public void setAugruTxt(String augruTxt) {
        this.augruTxt = augruTxt;
    }

    @Column(name = "UNIT_TYPE")
    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    @Column(name = "COMPANY_CODE")
    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
}
