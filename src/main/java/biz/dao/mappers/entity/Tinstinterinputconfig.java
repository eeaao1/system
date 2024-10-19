/*
 * Tinstinterinputconfig.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers.entity;

/**
 * 
 * @Date 2023-08-18 11:17:44
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
public class Tinstinterinputconfig {
    /**
     * cSystem 对接系统
     */
    private String cSystem;

    /**
     * cFunctionid 接口功能号
     */
    private String cFunctionid;

    /**
     * cInterfaceid 接口号
     */
    private String cInterfaceid;

    /**
     * cFieldcode java处理端的字段
     */
    private String cFieldcode;

    /**
     * cOtherfieldcode dataset字段
     */
    private String cOtherfieldcode;

    /**
     * cType 数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
     */
    private String cType;

    /**
     * cIsmust 是否必填
     */
    private String cIsmust;

    /**
     * cFormat 输入数据格式，正则表达式
     */
    private String cFormat;

    /**
     * cDatasetid datasetid
     */
    private String cDatasetid;

    /**
     * cDatatype 数据类型 0或空:字段;1:DataSet
     */
    private String cDatatype;

    /**
     * cParammap 参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
     */
    private String cParammap;

    /**
     * cRelatcolumn null
     */
    private String cRelatcolumn;

    /**
     * cVersion 接口版本
     */
    private String cVersion;

    /**
     * cParty 配置所属系统
     */
    private String cParty;

    /**
     * cTransfermap 接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
     */
    private String cTransfermap;

    /**
     * cLength null
     */
    private String cLength;

    /**
     * cDictname null
     */
    private String cDictname;

    /**
     * cFieldname null
     */
    private String cFieldname;

    /**
     * 获取 对接系统 字段:TINSTINTERINPUTCONFIG.C_SYSTEM
     *
     * @return TINSTINTERINPUTCONFIG.C_SYSTEM, 对接系统
     */
    public String getcSystem() {
        return cSystem;
    }

    /**
     * 设置 对接系统 字段:TINSTINTERINPUTCONFIG.C_SYSTEM
     *
     * @param cSystem the value for TINSTINTERINPUTCONFIG.C_SYSTEM, 对接系统
     */
    public void setcSystem(String cSystem) {
        this.cSystem = cSystem == null ? null : cSystem.trim();
    }

    /**
     * 获取 接口功能号 字段:TINSTINTERINPUTCONFIG.C_FUNCTIONID
     *
     * @return TINSTINTERINPUTCONFIG.C_FUNCTIONID, 接口功能号
     */
    public String getcFunctionid() {
        return cFunctionid;
    }

    /**
     * 设置 接口功能号 字段:TINSTINTERINPUTCONFIG.C_FUNCTIONID
     *
     * @param cFunctionid the value for TINSTINTERINPUTCONFIG.C_FUNCTIONID, 接口功能号
     */
    public void setcFunctionid(String cFunctionid) {
        this.cFunctionid = cFunctionid == null ? null : cFunctionid.trim();
    }

    /**
     * 获取 接口号 字段:TINSTINTERINPUTCONFIG.C_INTERFACEID
     *
     * @return TINSTINTERINPUTCONFIG.C_INTERFACEID, 接口号
     */
    public String getcInterfaceid() {
        return cInterfaceid;
    }

    /**
     * 设置 接口号 字段:TINSTINTERINPUTCONFIG.C_INTERFACEID
     *
     * @param cInterfaceid the value for TINSTINTERINPUTCONFIG.C_INTERFACEID, 接口号
     */
    public void setcInterfaceid(String cInterfaceid) {
        this.cInterfaceid = cInterfaceid == null ? null : cInterfaceid.trim();
    }

    /**
     * 获取 java处理端的字段 字段:TINSTINTERINPUTCONFIG.C_FIELDCODE
     *
     * @return TINSTINTERINPUTCONFIG.C_FIELDCODE, java处理端的字段
     */
    public String getcFieldcode() {
        return cFieldcode;
    }

    /**
     * 设置 java处理端的字段 字段:TINSTINTERINPUTCONFIG.C_FIELDCODE
     *
     * @param cFieldcode the value for TINSTINTERINPUTCONFIG.C_FIELDCODE, java处理端的字段
     */
    public void setcFieldcode(String cFieldcode) {
        this.cFieldcode = cFieldcode == null ? null : cFieldcode.trim();
    }

    /**
     * 获取 dataset字段 字段:TINSTINTERINPUTCONFIG.C_OTHERFIELDCODE
     *
     * @return TINSTINTERINPUTCONFIG.C_OTHERFIELDCODE, dataset字段
     */
    public String getcOtherfieldcode() {
        return cOtherfieldcode;
    }

    /**
     * 设置 dataset字段 字段:TINSTINTERINPUTCONFIG.C_OTHERFIELDCODE
     *
     * @param cOtherfieldcode the value for TINSTINTERINPUTCONFIG.C_OTHERFIELDCODE, dataset字段
     */
    public void setcOtherfieldcode(String cOtherfieldcode) {
        this.cOtherfieldcode = cOtherfieldcode == null ? null : cOtherfieldcode.trim();
    }

    /**
     * 获取 数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss 字段:TINSTINTERINPUTCONFIG.C_TYPE
     *
     * @return TINSTINTERINPUTCONFIG.C_TYPE, 数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
     */
    public String getcType() {
        return cType;
    }

    /**
     * 设置 数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss 字段:TINSTINTERINPUTCONFIG.C_TYPE
     *
     * @param cType the value for TINSTINTERINPUTCONFIG.C_TYPE, 数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
     */
    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

    /**
     * 获取 是否必填 字段:TINSTINTERINPUTCONFIG.C_ISMUST
     *
     * @return TINSTINTERINPUTCONFIG.C_ISMUST, 是否必填
     */
    public String getcIsmust() {
        return cIsmust;
    }

    /**
     * 设置 是否必填 字段:TINSTINTERINPUTCONFIG.C_ISMUST
     *
     * @param cIsmust the value for TINSTINTERINPUTCONFIG.C_ISMUST, 是否必填
     */
    public void setcIsmust(String cIsmust) {
        this.cIsmust = cIsmust == null ? null : cIsmust.trim();
    }

    /**
     * 获取 输入数据格式，正则表达式 字段:TINSTINTERINPUTCONFIG.C_FORMAT
     *
     * @return TINSTINTERINPUTCONFIG.C_FORMAT, 输入数据格式，正则表达式
     */
    public String getcFormat() {
        return cFormat;
    }

    /**
     * 设置 输入数据格式，正则表达式 字段:TINSTINTERINPUTCONFIG.C_FORMAT
     *
     * @param cFormat the value for TINSTINTERINPUTCONFIG.C_FORMAT, 输入数据格式，正则表达式
     */
    public void setcFormat(String cFormat) {
        this.cFormat = cFormat == null ? null : cFormat.trim();
    }

    /**
     * 获取 datasetid 字段:TINSTINTERINPUTCONFIG.C_DATASETID
     *
     * @return TINSTINTERINPUTCONFIG.C_DATASETID, datasetid
     */
    public String getcDatasetid() {
        return cDatasetid;
    }

    /**
     * 设置 datasetid 字段:TINSTINTERINPUTCONFIG.C_DATASETID
     *
     * @param cDatasetid the value for TINSTINTERINPUTCONFIG.C_DATASETID, datasetid
     */
    public void setcDatasetid(String cDatasetid) {
        this.cDatasetid = cDatasetid == null ? null : cDatasetid.trim();
    }

    /**
     * 获取 数据类型 0或空:字段;1:DataSet 字段:TINSTINTERINPUTCONFIG.C_DATATYPE
     *
     * @return TINSTINTERINPUTCONFIG.C_DATATYPE, 数据类型 0或空:字段;1:DataSet
     */
    public String getcDatatype() {
        return cDatatype;
    }

    /**
     * 设置 数据类型 0或空:字段;1:DataSet 字段:TINSTINTERINPUTCONFIG.C_DATATYPE
     *
     * @param cDatatype the value for TINSTINTERINPUTCONFIG.C_DATATYPE, 数据类型 0或空:字段;1:DataSet
     */
    public void setcDatatype(String cDatatype) {
        this.cDatatype = cDatatype == null ? null : cDatatype.trim();
    }

    /**
     * 获取 参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开 字段:TINSTINTERINPUTCONFIG.C_PARAMMAP
     *
     * @return TINSTINTERINPUTCONFIG.C_PARAMMAP, 参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
     */
    public String getcParammap() {
        return cParammap;
    }

    /**
     * 设置 参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开 字段:TINSTINTERINPUTCONFIG.C_PARAMMAP
     *
     * @param cParammap the value for TINSTINTERINPUTCONFIG.C_PARAMMAP, 参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
     */
    public void setcParammap(String cParammap) {
        this.cParammap = cParammap == null ? null : cParammap.trim();
    }

    /**
     * 获取 null 字段:TINSTINTERINPUTCONFIG.C_RELATCOLUMN
     *
     * @return TINSTINTERINPUTCONFIG.C_RELATCOLUMN, null
     */
    public String getcRelatcolumn() {
        return cRelatcolumn;
    }

    /**
     * 设置 null 字段:TINSTINTERINPUTCONFIG.C_RELATCOLUMN
     *
     * @param cRelatcolumn the value for TINSTINTERINPUTCONFIG.C_RELATCOLUMN, null
     */
    public void setcRelatcolumn(String cRelatcolumn) {
        this.cRelatcolumn = cRelatcolumn == null ? null : cRelatcolumn.trim();
    }

    /**
     * 获取 接口版本 字段:TINSTINTERINPUTCONFIG.C_VERSION
     *
     * @return TINSTINTERINPUTCONFIG.C_VERSION, 接口版本
     */
    public String getcVersion() {
        return cVersion;
    }

    /**
     * 设置 接口版本 字段:TINSTINTERINPUTCONFIG.C_VERSION
     *
     * @param cVersion the value for TINSTINTERINPUTCONFIG.C_VERSION, 接口版本
     */
    public void setcVersion(String cVersion) {
        this.cVersion = cVersion == null ? null : cVersion.trim();
    }

    /**
     * 获取 配置所属系统 字段:TINSTINTERINPUTCONFIG.C_PARTY
     *
     * @return TINSTINTERINPUTCONFIG.C_PARTY, 配置所属系统
     */
    public String getcParty() {
        return cParty;
    }

    /**
     * 设置 配置所属系统 字段:TINSTINTERINPUTCONFIG.C_PARTY
     *
     * @param cParty the value for TINSTINTERINPUTCONFIG.C_PARTY, 配置所属系统
     */
    public void setcParty(String cParty) {
        this.cParty = cParty == null ? null : cParty.trim();
    }

    /**
     * 获取 接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"} 字段:TINSTINTERINPUTCONFIG.C_TRANSFERMAP
     *
     * @return TINSTINTERINPUTCONFIG.C_TRANSFERMAP, 接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
     */
    public String getcTransfermap() {
        return cTransfermap;
    }

    /**
     * 设置 接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"} 字段:TINSTINTERINPUTCONFIG.C_TRANSFERMAP
     *
     * @param cTransfermap the value for TINSTINTERINPUTCONFIG.C_TRANSFERMAP, 接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
     */
    public void setcTransfermap(String cTransfermap) {
        this.cTransfermap = cTransfermap == null ? null : cTransfermap.trim();
    }

    /**
     * 获取 null 字段:TINSTINTERINPUTCONFIG.C_LENGTH
     *
     * @return TINSTINTERINPUTCONFIG.C_LENGTH, null
     */
    public String getcLength() {
        return cLength;
    }

    /**
     * 设置 null 字段:TINSTINTERINPUTCONFIG.C_LENGTH
     *
     * @param cLength the value for TINSTINTERINPUTCONFIG.C_LENGTH, null
     */
    public void setcLength(String cLength) {
        this.cLength = cLength == null ? null : cLength.trim();
    }

    /**
     * 获取 null 字段:TINSTINTERINPUTCONFIG.C_DICTNAME
     *
     * @return TINSTINTERINPUTCONFIG.C_DICTNAME, null
     */
    public String getcDictname() {
        return cDictname;
    }

    /**
     * 设置 null 字段:TINSTINTERINPUTCONFIG.C_DICTNAME
     *
     * @param cDictname the value for TINSTINTERINPUTCONFIG.C_DICTNAME, null
     */
    public void setcDictname(String cDictname) {
        this.cDictname = cDictname == null ? null : cDictname.trim();
    }

    /**
     * 获取 null 字段:TINSTINTERINPUTCONFIG.C_FIELDNAME
     *
     * @return TINSTINTERINPUTCONFIG.C_FIELDNAME, null
     */
    public String getcFieldname() {
        return cFieldname;
    }

    /**
     * 设置 null 字段:TINSTINTERINPUTCONFIG.C_FIELDNAME
     *
     * @param cFieldname the value for TINSTINTERINPUTCONFIG.C_FIELDNAME, null
     */
    public void setcFieldname(String cFieldname) {
        this.cFieldname = cFieldname == null ? null : cFieldname.trim();
    }
}