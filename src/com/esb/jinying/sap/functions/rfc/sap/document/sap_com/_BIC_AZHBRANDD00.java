/**
 * _BIC_AZHBRANDD00.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class _BIC_AZHBRANDD00  implements java.io.Serializable {
    /* Calendar year/month */
    private java.lang.String CALMONTH;

    private java.lang.String _BIC_ZZPP;

    private java.lang.String _BIC_ZZML;

    /* Company */
    private java.lang.String COMPANY;

    /* Vendor */
    private java.lang.String VENDOR;

    private java.lang.String _BIC_ZBRAND_N;

    private java.lang.String _BIC_ZGSMC;

    private java.lang.String _BIC_ZVENDOR_N;

    private java.lang.String _BIC_ZHTHM;

    private java.lang.String _BIC_ZPL_N;

    private java.math.BigDecimal _BIC_ZNLJSX;

    private java.math.BigDecimal _BIC_ZNLJGSP;

    private java.math.BigDecimal _BIC_ZLJCWML;

    /* BW Delta Process: Record Mode */
    private java.lang.String RECORDMODE;

    private java.math.BigDecimal _BIC_ZNPJCWMLL;

    private java.math.BigDecimal _BIC_ZKDJ;

    private java.math.BigDecimal _BIC_ZMLPXT;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date _BIC_ZHTKSRQ;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date _BIC_ZQXJSRQ;

    private java.math.BigDecimal _BIC_ZHTPXMJ;

    private java.lang.String _BIC_ZKLKD;

    private java.math.BigDecimal _BIC_ZHTXZ;

    private java.math.BigDecimal _BIC_ZHTVIP;

    /* Document currency */
    private java.lang.String DOC_CURRCY;

    /* Unit of Area */
    private java.lang.String AREA_UNIT;

    private java.math.BigDecimal _BIC_ZLJCWMLTB;

    private java.math.BigDecimal _BIC_ZNLJGSPTB;

    private java.math.BigDecimal _BIC_ZNLJSXTB;

    private java.math.BigDecimal _BIC_ZLJMLLTB;

    private java.math.BigInteger _BIC_ZKMC;

    private java.math.BigInteger _BIC_ZHJPPS;

    private java.math.BigDecimal _BIC_ZVIPGXL;

    private java.math.BigDecimal _BIC_ZVNZB;

    private java.math.BigDecimal _BIC_ZVIPNZB;

    private java.lang.String _BIC_ZNLDMS;

    public _BIC_AZHBRANDD00() {
    }

    public _BIC_AZHBRANDD00(
           java.lang.String CALMONTH,
           java.lang.String _BIC_ZZPP,
           java.lang.String _BIC_ZZML,
           java.lang.String COMPANY,
           java.lang.String VENDOR,
           java.lang.String _BIC_ZBRAND_N,
           java.lang.String _BIC_ZGSMC,
           java.lang.String _BIC_ZVENDOR_N,
           java.lang.String _BIC_ZHTHM,
           java.lang.String _BIC_ZPL_N,
           java.math.BigDecimal _BIC_ZNLJSX,
           java.math.BigDecimal _BIC_ZNLJGSP,
           java.math.BigDecimal _BIC_ZLJCWML,
           java.lang.String RECORDMODE,
           java.math.BigDecimal _BIC_ZNPJCWMLL,
           java.math.BigDecimal _BIC_ZKDJ,
           java.math.BigDecimal _BIC_ZMLPXT,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date _BIC_ZHTKSRQ,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date _BIC_ZQXJSRQ,
           java.math.BigDecimal _BIC_ZHTPXMJ,
           java.lang.String _BIC_ZKLKD,
           java.math.BigDecimal _BIC_ZHTXZ,
           java.math.BigDecimal _BIC_ZHTVIP,
           java.lang.String DOC_CURRCY,
           java.lang.String AREA_UNIT,
           java.math.BigDecimal _BIC_ZLJCWMLTB,
           java.math.BigDecimal _BIC_ZNLJGSPTB,
           java.math.BigDecimal _BIC_ZNLJSXTB,
           java.math.BigDecimal _BIC_ZLJMLLTB,
           java.math.BigInteger _BIC_ZKMC,
           java.math.BigInteger _BIC_ZHJPPS,
           java.math.BigDecimal _BIC_ZVIPGXL,
           java.math.BigDecimal _BIC_ZVNZB,
           java.math.BigDecimal _BIC_ZVIPNZB,
           java.lang.String _BIC_ZNLDMS) {
           this.CALMONTH = CALMONTH;
           this._BIC_ZZPP = _BIC_ZZPP;
           this._BIC_ZZML = _BIC_ZZML;
           this.COMPANY = COMPANY;
           this.VENDOR = VENDOR;
           this._BIC_ZBRAND_N = _BIC_ZBRAND_N;
           this._BIC_ZGSMC = _BIC_ZGSMC;
           this._BIC_ZVENDOR_N = _BIC_ZVENDOR_N;
           this._BIC_ZHTHM = _BIC_ZHTHM;
           this._BIC_ZPL_N = _BIC_ZPL_N;
           this._BIC_ZNLJSX = _BIC_ZNLJSX;
           this._BIC_ZNLJGSP = _BIC_ZNLJGSP;
           this._BIC_ZLJCWML = _BIC_ZLJCWML;
           this.RECORDMODE = RECORDMODE;
           this._BIC_ZNPJCWMLL = _BIC_ZNPJCWMLL;
           this._BIC_ZKDJ = _BIC_ZKDJ;
           this._BIC_ZMLPXT = _BIC_ZMLPXT;
           this._BIC_ZHTKSRQ = _BIC_ZHTKSRQ;
           this._BIC_ZQXJSRQ = _BIC_ZQXJSRQ;
           this._BIC_ZHTPXMJ = _BIC_ZHTPXMJ;
           this._BIC_ZKLKD = _BIC_ZKLKD;
           this._BIC_ZHTXZ = _BIC_ZHTXZ;
           this._BIC_ZHTVIP = _BIC_ZHTVIP;
           this.DOC_CURRCY = DOC_CURRCY;
           this.AREA_UNIT = AREA_UNIT;
           this._BIC_ZLJCWMLTB = _BIC_ZLJCWMLTB;
           this._BIC_ZNLJGSPTB = _BIC_ZNLJGSPTB;
           this._BIC_ZNLJSXTB = _BIC_ZNLJSXTB;
           this._BIC_ZLJMLLTB = _BIC_ZLJMLLTB;
           this._BIC_ZKMC = _BIC_ZKMC;
           this._BIC_ZHJPPS = _BIC_ZHJPPS;
           this._BIC_ZVIPGXL = _BIC_ZVIPGXL;
           this._BIC_ZVNZB = _BIC_ZVNZB;
           this._BIC_ZVIPNZB = _BIC_ZVIPNZB;
           this._BIC_ZNLDMS = _BIC_ZNLDMS;
    }


    /**
     * Gets the CALMONTH value for this _BIC_AZHBRANDD00.
     * 
     * @return CALMONTH   * Calendar year/month
     */
    public java.lang.String getCALMONTH() {
        return CALMONTH;
    }


    /**
     * Sets the CALMONTH value for this _BIC_AZHBRANDD00.
     * 
     * @param CALMONTH   * Calendar year/month
     */
    public void setCALMONTH(java.lang.String CALMONTH) {
        this.CALMONTH = CALMONTH;
    }


    /**
     * Gets the _BIC_ZZPP value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZZPP
     */
    public java.lang.String get_BIC_ZZPP() {
        return _BIC_ZZPP;
    }


    /**
     * Sets the _BIC_ZZPP value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZZPP
     */
    public void set_BIC_ZZPP(java.lang.String _BIC_ZZPP) {
        this._BIC_ZZPP = _BIC_ZZPP;
    }


    /**
     * Gets the _BIC_ZZML value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZZML
     */
    public java.lang.String get_BIC_ZZML() {
        return _BIC_ZZML;
    }


    /**
     * Sets the _BIC_ZZML value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZZML
     */
    public void set_BIC_ZZML(java.lang.String _BIC_ZZML) {
        this._BIC_ZZML = _BIC_ZZML;
    }


    /**
     * Gets the COMPANY value for this _BIC_AZHBRANDD00.
     * 
     * @return COMPANY   * Company
     */
    public java.lang.String getCOMPANY() {
        return COMPANY;
    }


    /**
     * Sets the COMPANY value for this _BIC_AZHBRANDD00.
     * 
     * @param COMPANY   * Company
     */
    public void setCOMPANY(java.lang.String COMPANY) {
        this.COMPANY = COMPANY;
    }


    /**
     * Gets the VENDOR value for this _BIC_AZHBRANDD00.
     * 
     * @return VENDOR   * Vendor
     */
    public java.lang.String getVENDOR() {
        return VENDOR;
    }


    /**
     * Sets the VENDOR value for this _BIC_AZHBRANDD00.
     * 
     * @param VENDOR   * Vendor
     */
    public void setVENDOR(java.lang.String VENDOR) {
        this.VENDOR = VENDOR;
    }


    /**
     * Gets the _BIC_ZBRAND_N value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZBRAND_N
     */
    public java.lang.String get_BIC_ZBRAND_N() {
        return _BIC_ZBRAND_N;
    }


    /**
     * Sets the _BIC_ZBRAND_N value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZBRAND_N
     */
    public void set_BIC_ZBRAND_N(java.lang.String _BIC_ZBRAND_N) {
        this._BIC_ZBRAND_N = _BIC_ZBRAND_N;
    }


    /**
     * Gets the _BIC_ZGSMC value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZGSMC
     */
    public java.lang.String get_BIC_ZGSMC() {
        return _BIC_ZGSMC;
    }


    /**
     * Sets the _BIC_ZGSMC value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZGSMC
     */
    public void set_BIC_ZGSMC(java.lang.String _BIC_ZGSMC) {
        this._BIC_ZGSMC = _BIC_ZGSMC;
    }


    /**
     * Gets the _BIC_ZVENDOR_N value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZVENDOR_N
     */
    public java.lang.String get_BIC_ZVENDOR_N() {
        return _BIC_ZVENDOR_N;
    }


    /**
     * Sets the _BIC_ZVENDOR_N value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZVENDOR_N
     */
    public void set_BIC_ZVENDOR_N(java.lang.String _BIC_ZVENDOR_N) {
        this._BIC_ZVENDOR_N = _BIC_ZVENDOR_N;
    }


    /**
     * Gets the _BIC_ZHTHM value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZHTHM
     */
    public java.lang.String get_BIC_ZHTHM() {
        return _BIC_ZHTHM;
    }


    /**
     * Sets the _BIC_ZHTHM value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZHTHM
     */
    public void set_BIC_ZHTHM(java.lang.String _BIC_ZHTHM) {
        this._BIC_ZHTHM = _BIC_ZHTHM;
    }


    /**
     * Gets the _BIC_ZPL_N value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZPL_N
     */
    public java.lang.String get_BIC_ZPL_N() {
        return _BIC_ZPL_N;
    }


    /**
     * Sets the _BIC_ZPL_N value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZPL_N
     */
    public void set_BIC_ZPL_N(java.lang.String _BIC_ZPL_N) {
        this._BIC_ZPL_N = _BIC_ZPL_N;
    }


    /**
     * Gets the _BIC_ZNLJSX value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZNLJSX
     */
    public java.math.BigDecimal get_BIC_ZNLJSX() {
        return _BIC_ZNLJSX;
    }


    /**
     * Sets the _BIC_ZNLJSX value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZNLJSX
     */
    public void set_BIC_ZNLJSX(java.math.BigDecimal _BIC_ZNLJSX) {
        this._BIC_ZNLJSX = _BIC_ZNLJSX;
    }


    /**
     * Gets the _BIC_ZNLJGSP value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZNLJGSP
     */
    public java.math.BigDecimal get_BIC_ZNLJGSP() {
        return _BIC_ZNLJGSP;
    }


    /**
     * Sets the _BIC_ZNLJGSP value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZNLJGSP
     */
    public void set_BIC_ZNLJGSP(java.math.BigDecimal _BIC_ZNLJGSP) {
        this._BIC_ZNLJGSP = _BIC_ZNLJGSP;
    }


    /**
     * Gets the _BIC_ZLJCWML value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZLJCWML
     */
    public java.math.BigDecimal get_BIC_ZLJCWML() {
        return _BIC_ZLJCWML;
    }


    /**
     * Sets the _BIC_ZLJCWML value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZLJCWML
     */
    public void set_BIC_ZLJCWML(java.math.BigDecimal _BIC_ZLJCWML) {
        this._BIC_ZLJCWML = _BIC_ZLJCWML;
    }


    /**
     * Gets the RECORDMODE value for this _BIC_AZHBRANDD00.
     * 
     * @return RECORDMODE   * BW Delta Process: Record Mode
     */
    public java.lang.String getRECORDMODE() {
        return RECORDMODE;
    }


    /**
     * Sets the RECORDMODE value for this _BIC_AZHBRANDD00.
     * 
     * @param RECORDMODE   * BW Delta Process: Record Mode
     */
    public void setRECORDMODE(java.lang.String RECORDMODE) {
        this.RECORDMODE = RECORDMODE;
    }


    /**
     * Gets the _BIC_ZNPJCWMLL value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZNPJCWMLL
     */
    public java.math.BigDecimal get_BIC_ZNPJCWMLL() {
        return _BIC_ZNPJCWMLL;
    }


    /**
     * Sets the _BIC_ZNPJCWMLL value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZNPJCWMLL
     */
    public void set_BIC_ZNPJCWMLL(java.math.BigDecimal _BIC_ZNPJCWMLL) {
        this._BIC_ZNPJCWMLL = _BIC_ZNPJCWMLL;
    }


    /**
     * Gets the _BIC_ZKDJ value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZKDJ
     */
    public java.math.BigDecimal get_BIC_ZKDJ() {
        return _BIC_ZKDJ;
    }


    /**
     * Sets the _BIC_ZKDJ value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZKDJ
     */
    public void set_BIC_ZKDJ(java.math.BigDecimal _BIC_ZKDJ) {
        this._BIC_ZKDJ = _BIC_ZKDJ;
    }


    /**
     * Gets the _BIC_ZMLPXT value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZMLPXT
     */
    public java.math.BigDecimal get_BIC_ZMLPXT() {
        return _BIC_ZMLPXT;
    }


    /**
     * Sets the _BIC_ZMLPXT value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZMLPXT
     */
    public void set_BIC_ZMLPXT(java.math.BigDecimal _BIC_ZMLPXT) {
        this._BIC_ZMLPXT = _BIC_ZMLPXT;
    }


    /**
     * Gets the _BIC_ZHTKSRQ value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZHTKSRQ
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date get_BIC_ZHTKSRQ() {
        return _BIC_ZHTKSRQ;
    }


    /**
     * Sets the _BIC_ZHTKSRQ value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZHTKSRQ
     */
    public void set_BIC_ZHTKSRQ(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date _BIC_ZHTKSRQ) {
        this._BIC_ZHTKSRQ = _BIC_ZHTKSRQ;
    }


    /**
     * Gets the _BIC_ZQXJSRQ value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZQXJSRQ
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date get_BIC_ZQXJSRQ() {
        return _BIC_ZQXJSRQ;
    }


    /**
     * Sets the _BIC_ZQXJSRQ value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZQXJSRQ
     */
    public void set_BIC_ZQXJSRQ(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date _BIC_ZQXJSRQ) {
        this._BIC_ZQXJSRQ = _BIC_ZQXJSRQ;
    }


    /**
     * Gets the _BIC_ZHTPXMJ value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZHTPXMJ
     */
    public java.math.BigDecimal get_BIC_ZHTPXMJ() {
        return _BIC_ZHTPXMJ;
    }


    /**
     * Sets the _BIC_ZHTPXMJ value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZHTPXMJ
     */
    public void set_BIC_ZHTPXMJ(java.math.BigDecimal _BIC_ZHTPXMJ) {
        this._BIC_ZHTPXMJ = _BIC_ZHTPXMJ;
    }


    /**
     * Gets the _BIC_ZKLKD value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZKLKD
     */
    public java.lang.String get_BIC_ZKLKD() {
        return _BIC_ZKLKD;
    }


    /**
     * Sets the _BIC_ZKLKD value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZKLKD
     */
    public void set_BIC_ZKLKD(java.lang.String _BIC_ZKLKD) {
        this._BIC_ZKLKD = _BIC_ZKLKD;
    }


    /**
     * Gets the _BIC_ZHTXZ value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZHTXZ
     */
    public java.math.BigDecimal get_BIC_ZHTXZ() {
        return _BIC_ZHTXZ;
    }


    /**
     * Sets the _BIC_ZHTXZ value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZHTXZ
     */
    public void set_BIC_ZHTXZ(java.math.BigDecimal _BIC_ZHTXZ) {
        this._BIC_ZHTXZ = _BIC_ZHTXZ;
    }


    /**
     * Gets the _BIC_ZHTVIP value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZHTVIP
     */
    public java.math.BigDecimal get_BIC_ZHTVIP() {
        return _BIC_ZHTVIP;
    }


    /**
     * Sets the _BIC_ZHTVIP value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZHTVIP
     */
    public void set_BIC_ZHTVIP(java.math.BigDecimal _BIC_ZHTVIP) {
        this._BIC_ZHTVIP = _BIC_ZHTVIP;
    }


    /**
     * Gets the DOC_CURRCY value for this _BIC_AZHBRANDD00.
     * 
     * @return DOC_CURRCY   * Document currency
     */
    public java.lang.String getDOC_CURRCY() {
        return DOC_CURRCY;
    }


    /**
     * Sets the DOC_CURRCY value for this _BIC_AZHBRANDD00.
     * 
     * @param DOC_CURRCY   * Document currency
     */
    public void setDOC_CURRCY(java.lang.String DOC_CURRCY) {
        this.DOC_CURRCY = DOC_CURRCY;
    }


    /**
     * Gets the AREA_UNIT value for this _BIC_AZHBRANDD00.
     * 
     * @return AREA_UNIT   * Unit of Area
     */
    public java.lang.String getAREA_UNIT() {
        return AREA_UNIT;
    }


    /**
     * Sets the AREA_UNIT value for this _BIC_AZHBRANDD00.
     * 
     * @param AREA_UNIT   * Unit of Area
     */
    public void setAREA_UNIT(java.lang.String AREA_UNIT) {
        this.AREA_UNIT = AREA_UNIT;
    }


    /**
     * Gets the _BIC_ZLJCWMLTB value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZLJCWMLTB
     */
    public java.math.BigDecimal get_BIC_ZLJCWMLTB() {
        return _BIC_ZLJCWMLTB;
    }


    /**
     * Sets the _BIC_ZLJCWMLTB value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZLJCWMLTB
     */
    public void set_BIC_ZLJCWMLTB(java.math.BigDecimal _BIC_ZLJCWMLTB) {
        this._BIC_ZLJCWMLTB = _BIC_ZLJCWMLTB;
    }


    /**
     * Gets the _BIC_ZNLJGSPTB value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZNLJGSPTB
     */
    public java.math.BigDecimal get_BIC_ZNLJGSPTB() {
        return _BIC_ZNLJGSPTB;
    }


    /**
     * Sets the _BIC_ZNLJGSPTB value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZNLJGSPTB
     */
    public void set_BIC_ZNLJGSPTB(java.math.BigDecimal _BIC_ZNLJGSPTB) {
        this._BIC_ZNLJGSPTB = _BIC_ZNLJGSPTB;
    }


    /**
     * Gets the _BIC_ZNLJSXTB value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZNLJSXTB
     */
    public java.math.BigDecimal get_BIC_ZNLJSXTB() {
        return _BIC_ZNLJSXTB;
    }


    /**
     * Sets the _BIC_ZNLJSXTB value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZNLJSXTB
     */
    public void set_BIC_ZNLJSXTB(java.math.BigDecimal _BIC_ZNLJSXTB) {
        this._BIC_ZNLJSXTB = _BIC_ZNLJSXTB;
    }


    /**
     * Gets the _BIC_ZLJMLLTB value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZLJMLLTB
     */
    public java.math.BigDecimal get_BIC_ZLJMLLTB() {
        return _BIC_ZLJMLLTB;
    }


    /**
     * Sets the _BIC_ZLJMLLTB value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZLJMLLTB
     */
    public void set_BIC_ZLJMLLTB(java.math.BigDecimal _BIC_ZLJMLLTB) {
        this._BIC_ZLJMLLTB = _BIC_ZLJMLLTB;
    }


    /**
     * Gets the _BIC_ZKMC value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZKMC
     */
    public java.math.BigInteger get_BIC_ZKMC() {
        return _BIC_ZKMC;
    }


    /**
     * Sets the _BIC_ZKMC value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZKMC
     */
    public void set_BIC_ZKMC(java.math.BigInteger _BIC_ZKMC) {
        this._BIC_ZKMC = _BIC_ZKMC;
    }


    /**
     * Gets the _BIC_ZHJPPS value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZHJPPS
     */
    public java.math.BigInteger get_BIC_ZHJPPS() {
        return _BIC_ZHJPPS;
    }


    /**
     * Sets the _BIC_ZHJPPS value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZHJPPS
     */
    public void set_BIC_ZHJPPS(java.math.BigInteger _BIC_ZHJPPS) {
        this._BIC_ZHJPPS = _BIC_ZHJPPS;
    }


    /**
     * Gets the _BIC_ZVIPGXL value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZVIPGXL
     */
    public java.math.BigDecimal get_BIC_ZVIPGXL() {
        return _BIC_ZVIPGXL;
    }


    /**
     * Sets the _BIC_ZVIPGXL value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZVIPGXL
     */
    public void set_BIC_ZVIPGXL(java.math.BigDecimal _BIC_ZVIPGXL) {
        this._BIC_ZVIPGXL = _BIC_ZVIPGXL;
    }


    /**
     * Gets the _BIC_ZVNZB value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZVNZB
     */
    public java.math.BigDecimal get_BIC_ZVNZB() {
        return _BIC_ZVNZB;
    }


    /**
     * Sets the _BIC_ZVNZB value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZVNZB
     */
    public void set_BIC_ZVNZB(java.math.BigDecimal _BIC_ZVNZB) {
        this._BIC_ZVNZB = _BIC_ZVNZB;
    }


    /**
     * Gets the _BIC_ZVIPNZB value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZVIPNZB
     */
    public java.math.BigDecimal get_BIC_ZVIPNZB() {
        return _BIC_ZVIPNZB;
    }


    /**
     * Sets the _BIC_ZVIPNZB value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZVIPNZB
     */
    public void set_BIC_ZVIPNZB(java.math.BigDecimal _BIC_ZVIPNZB) {
        this._BIC_ZVIPNZB = _BIC_ZVIPNZB;
    }


    /**
     * Gets the _BIC_ZNLDMS value for this _BIC_AZHBRANDD00.
     * 
     * @return _BIC_ZNLDMS
     */
    public java.lang.String get_BIC_ZNLDMS() {
        return _BIC_ZNLDMS;
    }


    /**
     * Sets the _BIC_ZNLDMS value for this _BIC_AZHBRANDD00.
     * 
     * @param _BIC_ZNLDMS
     */
    public void set_BIC_ZNLDMS(java.lang.String _BIC_ZNLDMS) {
        this._BIC_ZNLDMS = _BIC_ZNLDMS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _BIC_AZHBRANDD00)) return false;
        _BIC_AZHBRANDD00 other = (_BIC_AZHBRANDD00) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CALMONTH==null && other.getCALMONTH()==null) || 
             (this.CALMONTH!=null &&
              this.CALMONTH.equals(other.getCALMONTH()))) &&
            ((this._BIC_ZZPP==null && other.get_BIC_ZZPP()==null) || 
             (this._BIC_ZZPP!=null &&
              this._BIC_ZZPP.equals(other.get_BIC_ZZPP()))) &&
            ((this._BIC_ZZML==null && other.get_BIC_ZZML()==null) || 
             (this._BIC_ZZML!=null &&
              this._BIC_ZZML.equals(other.get_BIC_ZZML()))) &&
            ((this.COMPANY==null && other.getCOMPANY()==null) || 
             (this.COMPANY!=null &&
              this.COMPANY.equals(other.getCOMPANY()))) &&
            ((this.VENDOR==null && other.getVENDOR()==null) || 
             (this.VENDOR!=null &&
              this.VENDOR.equals(other.getVENDOR()))) &&
            ((this._BIC_ZBRAND_N==null && other.get_BIC_ZBRAND_N()==null) || 
             (this._BIC_ZBRAND_N!=null &&
              this._BIC_ZBRAND_N.equals(other.get_BIC_ZBRAND_N()))) &&
            ((this._BIC_ZGSMC==null && other.get_BIC_ZGSMC()==null) || 
             (this._BIC_ZGSMC!=null &&
              this._BIC_ZGSMC.equals(other.get_BIC_ZGSMC()))) &&
            ((this._BIC_ZVENDOR_N==null && other.get_BIC_ZVENDOR_N()==null) || 
             (this._BIC_ZVENDOR_N!=null &&
              this._BIC_ZVENDOR_N.equals(other.get_BIC_ZVENDOR_N()))) &&
            ((this._BIC_ZHTHM==null && other.get_BIC_ZHTHM()==null) || 
             (this._BIC_ZHTHM!=null &&
              this._BIC_ZHTHM.equals(other.get_BIC_ZHTHM()))) &&
            ((this._BIC_ZPL_N==null && other.get_BIC_ZPL_N()==null) || 
             (this._BIC_ZPL_N!=null &&
              this._BIC_ZPL_N.equals(other.get_BIC_ZPL_N()))) &&
            ((this._BIC_ZNLJSX==null && other.get_BIC_ZNLJSX()==null) || 
             (this._BIC_ZNLJSX!=null &&
              this._BIC_ZNLJSX.equals(other.get_BIC_ZNLJSX()))) &&
            ((this._BIC_ZNLJGSP==null && other.get_BIC_ZNLJGSP()==null) || 
             (this._BIC_ZNLJGSP!=null &&
              this._BIC_ZNLJGSP.equals(other.get_BIC_ZNLJGSP()))) &&
            ((this._BIC_ZLJCWML==null && other.get_BIC_ZLJCWML()==null) || 
             (this._BIC_ZLJCWML!=null &&
              this._BIC_ZLJCWML.equals(other.get_BIC_ZLJCWML()))) &&
            ((this.RECORDMODE==null && other.getRECORDMODE()==null) || 
             (this.RECORDMODE!=null &&
              this.RECORDMODE.equals(other.getRECORDMODE()))) &&
            ((this._BIC_ZNPJCWMLL==null && other.get_BIC_ZNPJCWMLL()==null) || 
             (this._BIC_ZNPJCWMLL!=null &&
              this._BIC_ZNPJCWMLL.equals(other.get_BIC_ZNPJCWMLL()))) &&
            ((this._BIC_ZKDJ==null && other.get_BIC_ZKDJ()==null) || 
             (this._BIC_ZKDJ!=null &&
              this._BIC_ZKDJ.equals(other.get_BIC_ZKDJ()))) &&
            ((this._BIC_ZMLPXT==null && other.get_BIC_ZMLPXT()==null) || 
             (this._BIC_ZMLPXT!=null &&
              this._BIC_ZMLPXT.equals(other.get_BIC_ZMLPXT()))) &&
            ((this._BIC_ZHTKSRQ==null && other.get_BIC_ZHTKSRQ()==null) || 
             (this._BIC_ZHTKSRQ!=null &&
              this._BIC_ZHTKSRQ.equals(other.get_BIC_ZHTKSRQ()))) &&
            ((this._BIC_ZQXJSRQ==null && other.get_BIC_ZQXJSRQ()==null) || 
             (this._BIC_ZQXJSRQ!=null &&
              this._BIC_ZQXJSRQ.equals(other.get_BIC_ZQXJSRQ()))) &&
            ((this._BIC_ZHTPXMJ==null && other.get_BIC_ZHTPXMJ()==null) || 
             (this._BIC_ZHTPXMJ!=null &&
              this._BIC_ZHTPXMJ.equals(other.get_BIC_ZHTPXMJ()))) &&
            ((this._BIC_ZKLKD==null && other.get_BIC_ZKLKD()==null) || 
             (this._BIC_ZKLKD!=null &&
              this._BIC_ZKLKD.equals(other.get_BIC_ZKLKD()))) &&
            ((this._BIC_ZHTXZ==null && other.get_BIC_ZHTXZ()==null) || 
             (this._BIC_ZHTXZ!=null &&
              this._BIC_ZHTXZ.equals(other.get_BIC_ZHTXZ()))) &&
            ((this._BIC_ZHTVIP==null && other.get_BIC_ZHTVIP()==null) || 
             (this._BIC_ZHTVIP!=null &&
              this._BIC_ZHTVIP.equals(other.get_BIC_ZHTVIP()))) &&
            ((this.DOC_CURRCY==null && other.getDOC_CURRCY()==null) || 
             (this.DOC_CURRCY!=null &&
              this.DOC_CURRCY.equals(other.getDOC_CURRCY()))) &&
            ((this.AREA_UNIT==null && other.getAREA_UNIT()==null) || 
             (this.AREA_UNIT!=null &&
              this.AREA_UNIT.equals(other.getAREA_UNIT()))) &&
            ((this._BIC_ZLJCWMLTB==null && other.get_BIC_ZLJCWMLTB()==null) || 
             (this._BIC_ZLJCWMLTB!=null &&
              this._BIC_ZLJCWMLTB.equals(other.get_BIC_ZLJCWMLTB()))) &&
            ((this._BIC_ZNLJGSPTB==null && other.get_BIC_ZNLJGSPTB()==null) || 
             (this._BIC_ZNLJGSPTB!=null &&
              this._BIC_ZNLJGSPTB.equals(other.get_BIC_ZNLJGSPTB()))) &&
            ((this._BIC_ZNLJSXTB==null && other.get_BIC_ZNLJSXTB()==null) || 
             (this._BIC_ZNLJSXTB!=null &&
              this._BIC_ZNLJSXTB.equals(other.get_BIC_ZNLJSXTB()))) &&
            ((this._BIC_ZLJMLLTB==null && other.get_BIC_ZLJMLLTB()==null) || 
             (this._BIC_ZLJMLLTB!=null &&
              this._BIC_ZLJMLLTB.equals(other.get_BIC_ZLJMLLTB()))) &&
            ((this._BIC_ZKMC==null && other.get_BIC_ZKMC()==null) || 
             (this._BIC_ZKMC!=null &&
              this._BIC_ZKMC.equals(other.get_BIC_ZKMC()))) &&
            ((this._BIC_ZHJPPS==null && other.get_BIC_ZHJPPS()==null) || 
             (this._BIC_ZHJPPS!=null &&
              this._BIC_ZHJPPS.equals(other.get_BIC_ZHJPPS()))) &&
            ((this._BIC_ZVIPGXL==null && other.get_BIC_ZVIPGXL()==null) || 
             (this._BIC_ZVIPGXL!=null &&
              this._BIC_ZVIPGXL.equals(other.get_BIC_ZVIPGXL()))) &&
            ((this._BIC_ZVNZB==null && other.get_BIC_ZVNZB()==null) || 
             (this._BIC_ZVNZB!=null &&
              this._BIC_ZVNZB.equals(other.get_BIC_ZVNZB()))) &&
            ((this._BIC_ZVIPNZB==null && other.get_BIC_ZVIPNZB()==null) || 
             (this._BIC_ZVIPNZB!=null &&
              this._BIC_ZVIPNZB.equals(other.get_BIC_ZVIPNZB()))) &&
            ((this._BIC_ZNLDMS==null && other.get_BIC_ZNLDMS()==null) || 
             (this._BIC_ZNLDMS!=null &&
              this._BIC_ZNLDMS.equals(other.get_BIC_ZNLDMS())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCALMONTH() != null) {
            _hashCode += getCALMONTH().hashCode();
        }
        if (get_BIC_ZZPP() != null) {
            _hashCode += get_BIC_ZZPP().hashCode();
        }
        if (get_BIC_ZZML() != null) {
            _hashCode += get_BIC_ZZML().hashCode();
        }
        if (getCOMPANY() != null) {
            _hashCode += getCOMPANY().hashCode();
        }
        if (getVENDOR() != null) {
            _hashCode += getVENDOR().hashCode();
        }
        if (get_BIC_ZBRAND_N() != null) {
            _hashCode += get_BIC_ZBRAND_N().hashCode();
        }
        if (get_BIC_ZGSMC() != null) {
            _hashCode += get_BIC_ZGSMC().hashCode();
        }
        if (get_BIC_ZVENDOR_N() != null) {
            _hashCode += get_BIC_ZVENDOR_N().hashCode();
        }
        if (get_BIC_ZHTHM() != null) {
            _hashCode += get_BIC_ZHTHM().hashCode();
        }
        if (get_BIC_ZPL_N() != null) {
            _hashCode += get_BIC_ZPL_N().hashCode();
        }
        if (get_BIC_ZNLJSX() != null) {
            _hashCode += get_BIC_ZNLJSX().hashCode();
        }
        if (get_BIC_ZNLJGSP() != null) {
            _hashCode += get_BIC_ZNLJGSP().hashCode();
        }
        if (get_BIC_ZLJCWML() != null) {
            _hashCode += get_BIC_ZLJCWML().hashCode();
        }
        if (getRECORDMODE() != null) {
            _hashCode += getRECORDMODE().hashCode();
        }
        if (get_BIC_ZNPJCWMLL() != null) {
            _hashCode += get_BIC_ZNPJCWMLL().hashCode();
        }
        if (get_BIC_ZKDJ() != null) {
            _hashCode += get_BIC_ZKDJ().hashCode();
        }
        if (get_BIC_ZMLPXT() != null) {
            _hashCode += get_BIC_ZMLPXT().hashCode();
        }
        if (get_BIC_ZHTKSRQ() != null) {
            _hashCode += get_BIC_ZHTKSRQ().hashCode();
        }
        if (get_BIC_ZQXJSRQ() != null) {
            _hashCode += get_BIC_ZQXJSRQ().hashCode();
        }
        if (get_BIC_ZHTPXMJ() != null) {
            _hashCode += get_BIC_ZHTPXMJ().hashCode();
        }
        if (get_BIC_ZKLKD() != null) {
            _hashCode += get_BIC_ZKLKD().hashCode();
        }
        if (get_BIC_ZHTXZ() != null) {
            _hashCode += get_BIC_ZHTXZ().hashCode();
        }
        if (get_BIC_ZHTVIP() != null) {
            _hashCode += get_BIC_ZHTVIP().hashCode();
        }
        if (getDOC_CURRCY() != null) {
            _hashCode += getDOC_CURRCY().hashCode();
        }
        if (getAREA_UNIT() != null) {
            _hashCode += getAREA_UNIT().hashCode();
        }
        if (get_BIC_ZLJCWMLTB() != null) {
            _hashCode += get_BIC_ZLJCWMLTB().hashCode();
        }
        if (get_BIC_ZNLJGSPTB() != null) {
            _hashCode += get_BIC_ZNLJGSPTB().hashCode();
        }
        if (get_BIC_ZNLJSXTB() != null) {
            _hashCode += get_BIC_ZNLJSXTB().hashCode();
        }
        if (get_BIC_ZLJMLLTB() != null) {
            _hashCode += get_BIC_ZLJMLLTB().hashCode();
        }
        if (get_BIC_ZKMC() != null) {
            _hashCode += get_BIC_ZKMC().hashCode();
        }
        if (get_BIC_ZHJPPS() != null) {
            _hashCode += get_BIC_ZHJPPS().hashCode();
        }
        if (get_BIC_ZVIPGXL() != null) {
            _hashCode += get_BIC_ZVIPGXL().hashCode();
        }
        if (get_BIC_ZVNZB() != null) {
            _hashCode += get_BIC_ZVNZB().hashCode();
        }
        if (get_BIC_ZVIPNZB() != null) {
            _hashCode += get_BIC_ZVIPNZB().hashCode();
        }
        if (get_BIC_ZNLDMS() != null) {
            _hashCode += get_BIC_ZNLDMS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(_BIC_AZHBRANDD00.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "_-BIC_-AZHBRANDD00"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALMONTH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CALMONTH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZZPP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZZPP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZZML");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZZML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMPANY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COMPANY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VENDOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VENDOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZBRAND_N");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZBRAND_N"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZGSMC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZGSMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZVENDOR_N");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZVENDOR_N"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZHTHM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZHTHM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZPL_N");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZPL_N"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZNLJSX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZNLJSX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZNLJGSP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZNLJGSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZLJCWML");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZLJCWML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RECORDMODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RECORDMODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZNPJCWMLL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZNPJCWMLL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZKDJ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZKDJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZMLPXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZMLPXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZHTKSRQ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZHTKSRQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZQXJSRQ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZQXJSRQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZHTPXMJ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZHTPXMJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZKLKD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZKLKD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZHTXZ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZHTXZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZHTVIP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZHTVIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOC_CURRCY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DOC_CURRCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AREA_UNIT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AREA_UNIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZLJCWMLTB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZLJCWMLTB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZNLJGSPTB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZNLJGSPTB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZNLJSXTB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZNLJSXTB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZLJMLLTB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZLJMLLTB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZKMC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZKMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZHJPPS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZHJPPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZVIPGXL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZVIPGXL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZVNZB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZVNZB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZVIPNZB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZVIPNZB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZNLDMS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZNLDMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
