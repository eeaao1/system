/*
 * Tblockcontrols.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers.entity;

import java.math.BigDecimal;

/**
 * 
 * @Date 2023-08-15 16:32:21
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
public class Tblockcontrols {
    /**
     * cBlockcontrolid 该表主键
     */
    private String cBlockcontrolid;

    /**
     * cBlockid 关联区块配置表主键
     */
    private String cBlockid;

    /**
     * lNum 顺序号
     */
    private BigDecimal lNum;

    /**
     * lCols 组件所占列数
     */
    private BigDecimal lCols;

    /**
     * cIsjrescomponent 是否研发中心组件
     */
    private String cIsjrescomponent;

    /**
     * cComponenttype 组件类型
     */
    private String cComponenttype;

    /**
     * cInvisible 是否启用
     */
    private String cInvisible;

    /**
     * cLabel 组件标签名称
     */
    private String cLabel;

    /**
     * cCheck 组件数据校验
     */
    private String cCheck;

    /**
     * cValue 组件值
     */
    private String cValue;

    /**
     * cValue2 用于日期组等存在两个value的组件
     */
    private String cValue2;

    /**
     * cName 组件name属性
     */
    private String cName;

    /**
     * cName2 组件name（用于日期组等需要两个name的组件）
     */
    private String cName2;

    /**
     * cDictname 数据字典
     */
    private String cDictname;

    /**
     * cItems 值域（用于手动配置数据字典）
     */
    private String cItems;

    /**
     * cReadonly 是否只读
     */
    private String cReadonly;

    /**
     * cEvent 触发事件
     */
    private String cEvent;

    /**
     * cEvents 触发事件
     */
    private String cEvents;

    /**
     * cComponentid 组件ID
     */
    private String cComponentid;

    /**
     * cDisabled 是否禁用（页面依旧显示）
     */
    private String cDisabled;

    /**
     * cSplit 显示分隔符，用于金额组件
     */
    private String cSplit;

    /**
     * cBigtips 是否开启大tips展示，用于金额组件
     */
    private String cBigtips;

    /**
     * cInputtype typefield的输入数据的类型
     */
    private String cInputtype;

    /**
     * lMaxlength 整数位数需要保留几位数
     */
    private BigDecimal lMaxlength;

    /**
     * cHeaditem 下拉框默认显示
     */
    private String cHeaditem;

    /**
     * cConfig 格式化格式（日期组件）
     */
    private String cConfig;

    /**
     * cDefvalue 默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
     */
    private String cDefvalue;

    /**
     * cDefvalue2 默认值2（日期组需要两个默认值）
     */
    private String cDefvalue2;

    /**
     * cAlias 组件别名
     */
    private String cAlias;

    /**
     * cMultiple 是否开启多选（用于下拉组件）
     */
    private String cMultiple;

    /**
     * cDelimiter 多选时的显示分隔符（）
     */
    private String cDelimiter;

    /**
     * cSelectall 全选框（用于下拉组件）
     */
    private String cSelectall;

    /**
     * cEditable 是否可编辑
     */
    private String cEditable;

    /**
     * cHidden 是否隐藏
     */
    private String cHidden;

    /**
     * cSql 输入框模糊查询sql脚本（Biz_Search）
     */
    private String cSql;

    /**
     * cAfterclear 弹出框清空值后需要callback的事件配置
     */
    private String cAfterclear;

    /**
     * cMosaiccolumn 用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
     */
    private String cMosaiccolumn;

    /**
     * cTablename 用于关联数据库表（信保基金需求，方便添加字段，插入表名）
     */
    private String cTablename;

    /**
     * cTips 字段描述
     */
    private String cTips;

    /**
     * cFilterdicts null
     */
    private String cFilterdicts;

    /**
     * cShowdicts null
     */
    private String cShowdicts;

    /**
     * cFormat null
     */
    private String cFormat;

    /**
     * cComparecolumn 对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
     */
    private String cComparecolumn;

    /**
     * lIntegernum 整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
     */
    private BigDecimal lIntegernum;

    /**
     * lSuffixnum 小数点后缀保留几位数，默认保留两位（对金额类型有效）
     */
    private BigDecimal lSuffixnum;

    /**
     * cChgeventid 字段值变化相应事件
     */
    private String cChgeventid;

    /**
     * cViewflag 是否在查看页面展示（1，不展示；2，展示）
     */
    private String cViewflag;

    /**
     * cSelectonchange targetselect组件弹出框事件
     */
    private String cSelectonchange;

    /**
     * 获取 该表主键 字段:TBLOCKCONTROLS.C_BLOCKCONTROLID
     *
     * @return TBLOCKCONTROLS.C_BLOCKCONTROLID, 该表主键
     */
    public String getcBlockcontrolid() {
        return cBlockcontrolid;
    }

    /**
     * 设置 该表主键 字段:TBLOCKCONTROLS.C_BLOCKCONTROLID
     *
     * @param cBlockcontrolid the value for TBLOCKCONTROLS.C_BLOCKCONTROLID, 该表主键
     */
    public void setcBlockcontrolid(String cBlockcontrolid) {
        this.cBlockcontrolid = cBlockcontrolid == null ? null : cBlockcontrolid.trim();
    }

    /**
     * 获取 关联区块配置表主键 字段:TBLOCKCONTROLS.C_BLOCKID
     *
     * @return TBLOCKCONTROLS.C_BLOCKID, 关联区块配置表主键
     */
    public String getcBlockid() {
        return cBlockid;
    }

    /**
     * 设置 关联区块配置表主键 字段:TBLOCKCONTROLS.C_BLOCKID
     *
     * @param cBlockid the value for TBLOCKCONTROLS.C_BLOCKID, 关联区块配置表主键
     */
    public void setcBlockid(String cBlockid) {
        this.cBlockid = cBlockid == null ? null : cBlockid.trim();
    }

    /**
     * 获取 顺序号 字段:TBLOCKCONTROLS.L_NUM
     *
     * @return TBLOCKCONTROLS.L_NUM, 顺序号
     */
    public BigDecimal getlNum() {
        return lNum;
    }

    /**
     * 设置 顺序号 字段:TBLOCKCONTROLS.L_NUM
     *
     * @param lNum the value for TBLOCKCONTROLS.L_NUM, 顺序号
     */
    public void setlNum(BigDecimal lNum) {
        this.lNum = lNum;
    }

    /**
     * 获取 组件所占列数 字段:TBLOCKCONTROLS.L_COLS
     *
     * @return TBLOCKCONTROLS.L_COLS, 组件所占列数
     */
    public BigDecimal getlCols() {
        return lCols;
    }

    /**
     * 设置 组件所占列数 字段:TBLOCKCONTROLS.L_COLS
     *
     * @param lCols the value for TBLOCKCONTROLS.L_COLS, 组件所占列数
     */
    public void setlCols(BigDecimal lCols) {
        this.lCols = lCols;
    }

    /**
     * 获取 是否研发中心组件 字段:TBLOCKCONTROLS.C_ISJRESCOMPONENT
     *
     * @return TBLOCKCONTROLS.C_ISJRESCOMPONENT, 是否研发中心组件
     */
    public String getcIsjrescomponent() {
        return cIsjrescomponent;
    }

    /**
     * 设置 是否研发中心组件 字段:TBLOCKCONTROLS.C_ISJRESCOMPONENT
     *
     * @param cIsjrescomponent the value for TBLOCKCONTROLS.C_ISJRESCOMPONENT, 是否研发中心组件
     */
    public void setcIsjrescomponent(String cIsjrescomponent) {
        this.cIsjrescomponent = cIsjrescomponent == null ? null : cIsjrescomponent.trim();
    }

    /**
     * 获取 组件类型 字段:TBLOCKCONTROLS.C_COMPONENTTYPE
     *
     * @return TBLOCKCONTROLS.C_COMPONENTTYPE, 组件类型
     */
    public String getcComponenttype() {
        return cComponenttype;
    }

    /**
     * 设置 组件类型 字段:TBLOCKCONTROLS.C_COMPONENTTYPE
     *
     * @param cComponenttype the value for TBLOCKCONTROLS.C_COMPONENTTYPE, 组件类型
     */
    public void setcComponenttype(String cComponenttype) {
        this.cComponenttype = cComponenttype == null ? null : cComponenttype.trim();
    }

    /**
     * 获取 是否启用 字段:TBLOCKCONTROLS.C_INVISIBLE
     *
     * @return TBLOCKCONTROLS.C_INVISIBLE, 是否启用
     */
    public String getcInvisible() {
        return cInvisible;
    }

    /**
     * 设置 是否启用 字段:TBLOCKCONTROLS.C_INVISIBLE
     *
     * @param cInvisible the value for TBLOCKCONTROLS.C_INVISIBLE, 是否启用
     */
    public void setcInvisible(String cInvisible) {
        this.cInvisible = cInvisible == null ? null : cInvisible.trim();
    }

    /**
     * 获取 组件标签名称 字段:TBLOCKCONTROLS.C_LABEL
     *
     * @return TBLOCKCONTROLS.C_LABEL, 组件标签名称
     */
    public String getcLabel() {
        return cLabel;
    }

    /**
     * 设置 组件标签名称 字段:TBLOCKCONTROLS.C_LABEL
     *
     * @param cLabel the value for TBLOCKCONTROLS.C_LABEL, 组件标签名称
     */
    public void setcLabel(String cLabel) {
        this.cLabel = cLabel == null ? null : cLabel.trim();
    }

    /**
     * 获取 组件数据校验 字段:TBLOCKCONTROLS.C_CHECK
     *
     * @return TBLOCKCONTROLS.C_CHECK, 组件数据校验
     */
    public String getcCheck() {
        return cCheck;
    }

    /**
     * 设置 组件数据校验 字段:TBLOCKCONTROLS.C_CHECK
     *
     * @param cCheck the value for TBLOCKCONTROLS.C_CHECK, 组件数据校验
     */
    public void setcCheck(String cCheck) {
        this.cCheck = cCheck == null ? null : cCheck.trim();
    }

    /**
     * 获取 组件值 字段:TBLOCKCONTROLS.C_VALUE
     *
     * @return TBLOCKCONTROLS.C_VALUE, 组件值
     */
    public String getcValue() {
        return cValue;
    }

    /**
     * 设置 组件值 字段:TBLOCKCONTROLS.C_VALUE
     *
     * @param cValue the value for TBLOCKCONTROLS.C_VALUE, 组件值
     */
    public void setcValue(String cValue) {
        this.cValue = cValue == null ? null : cValue.trim();
    }

    /**
     * 获取 用于日期组等存在两个value的组件 字段:TBLOCKCONTROLS.C_VALUE2
     *
     * @return TBLOCKCONTROLS.C_VALUE2, 用于日期组等存在两个value的组件
     */
    public String getcValue2() {
        return cValue2;
    }

    /**
     * 设置 用于日期组等存在两个value的组件 字段:TBLOCKCONTROLS.C_VALUE2
     *
     * @param cValue2 the value for TBLOCKCONTROLS.C_VALUE2, 用于日期组等存在两个value的组件
     */
    public void setcValue2(String cValue2) {
        this.cValue2 = cValue2 == null ? null : cValue2.trim();
    }

    /**
     * 获取 组件name属性 字段:TBLOCKCONTROLS.C_NAME
     *
     * @return TBLOCKCONTROLS.C_NAME, 组件name属性
     */
    public String getcName() {
        return cName;
    }

    /**
     * 设置 组件name属性 字段:TBLOCKCONTROLS.C_NAME
     *
     * @param cName the value for TBLOCKCONTROLS.C_NAME, 组件name属性
     */
    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    /**
     * 获取 组件name（用于日期组等需要两个name的组件） 字段:TBLOCKCONTROLS.C_NAME2
     *
     * @return TBLOCKCONTROLS.C_NAME2, 组件name（用于日期组等需要两个name的组件）
     */
    public String getcName2() {
        return cName2;
    }

    /**
     * 设置 组件name（用于日期组等需要两个name的组件） 字段:TBLOCKCONTROLS.C_NAME2
     *
     * @param cName2 the value for TBLOCKCONTROLS.C_NAME2, 组件name（用于日期组等需要两个name的组件）
     */
    public void setcName2(String cName2) {
        this.cName2 = cName2 == null ? null : cName2.trim();
    }

    /**
     * 获取 数据字典 字段:TBLOCKCONTROLS.C_DICTNAME
     *
     * @return TBLOCKCONTROLS.C_DICTNAME, 数据字典
     */
    public String getcDictname() {
        return cDictname;
    }

    /**
     * 设置 数据字典 字段:TBLOCKCONTROLS.C_DICTNAME
     *
     * @param cDictname the value for TBLOCKCONTROLS.C_DICTNAME, 数据字典
     */
    public void setcDictname(String cDictname) {
        this.cDictname = cDictname == null ? null : cDictname.trim();
    }

    /**
     * 获取 值域（用于手动配置数据字典） 字段:TBLOCKCONTROLS.C_ITEMS
     *
     * @return TBLOCKCONTROLS.C_ITEMS, 值域（用于手动配置数据字典）
     */
    public String getcItems() {
        return cItems;
    }

    /**
     * 设置 值域（用于手动配置数据字典） 字段:TBLOCKCONTROLS.C_ITEMS
     *
     * @param cItems the value for TBLOCKCONTROLS.C_ITEMS, 值域（用于手动配置数据字典）
     */
    public void setcItems(String cItems) {
        this.cItems = cItems == null ? null : cItems.trim();
    }

    /**
     * 获取 是否只读 字段:TBLOCKCONTROLS.C_READONLY
     *
     * @return TBLOCKCONTROLS.C_READONLY, 是否只读
     */
    public String getcReadonly() {
        return cReadonly;
    }

    /**
     * 设置 是否只读 字段:TBLOCKCONTROLS.C_READONLY
     *
     * @param cReadonly the value for TBLOCKCONTROLS.C_READONLY, 是否只读
     */
    public void setcReadonly(String cReadonly) {
        this.cReadonly = cReadonly == null ? null : cReadonly.trim();
    }

    /**
     * 获取 触发事件 字段:TBLOCKCONTROLS.C_EVENT
     *
     * @return TBLOCKCONTROLS.C_EVENT, 触发事件
     */
    public String getcEvent() {
        return cEvent;
    }

    /**
     * 设置 触发事件 字段:TBLOCKCONTROLS.C_EVENT
     *
     * @param cEvent the value for TBLOCKCONTROLS.C_EVENT, 触发事件
     */
    public void setcEvent(String cEvent) {
        this.cEvent = cEvent == null ? null : cEvent.trim();
    }

    /**
     * 获取 触发事件 字段:TBLOCKCONTROLS.C_EVENTS
     *
     * @return TBLOCKCONTROLS.C_EVENTS, 触发事件
     */
    public String getcEvents() {
        return cEvents;
    }

    /**
     * 设置 触发事件 字段:TBLOCKCONTROLS.C_EVENTS
     *
     * @param cEvents the value for TBLOCKCONTROLS.C_EVENTS, 触发事件
     */
    public void setcEvents(String cEvents) {
        this.cEvents = cEvents == null ? null : cEvents.trim();
    }

    /**
     * 获取 组件ID 字段:TBLOCKCONTROLS.C_COMPONENTID
     *
     * @return TBLOCKCONTROLS.C_COMPONENTID, 组件ID
     */
    public String getcComponentid() {
        return cComponentid;
    }

    /**
     * 设置 组件ID 字段:TBLOCKCONTROLS.C_COMPONENTID
     *
     * @param cComponentid the value for TBLOCKCONTROLS.C_COMPONENTID, 组件ID
     */
    public void setcComponentid(String cComponentid) {
        this.cComponentid = cComponentid == null ? null : cComponentid.trim();
    }

    /**
     * 获取 是否禁用（页面依旧显示） 字段:TBLOCKCONTROLS.C_DISABLED
     *
     * @return TBLOCKCONTROLS.C_DISABLED, 是否禁用（页面依旧显示）
     */
    public String getcDisabled() {
        return cDisabled;
    }

    /**
     * 设置 是否禁用（页面依旧显示） 字段:TBLOCKCONTROLS.C_DISABLED
     *
     * @param cDisabled the value for TBLOCKCONTROLS.C_DISABLED, 是否禁用（页面依旧显示）
     */
    public void setcDisabled(String cDisabled) {
        this.cDisabled = cDisabled == null ? null : cDisabled.trim();
    }

    /**
     * 获取 显示分隔符，用于金额组件 字段:TBLOCKCONTROLS.C_SPLIT
     *
     * @return TBLOCKCONTROLS.C_SPLIT, 显示分隔符，用于金额组件
     */
    public String getcSplit() {
        return cSplit;
    }

    /**
     * 设置 显示分隔符，用于金额组件 字段:TBLOCKCONTROLS.C_SPLIT
     *
     * @param cSplit the value for TBLOCKCONTROLS.C_SPLIT, 显示分隔符，用于金额组件
     */
    public void setcSplit(String cSplit) {
        this.cSplit = cSplit == null ? null : cSplit.trim();
    }

    /**
     * 获取 是否开启大tips展示，用于金额组件 字段:TBLOCKCONTROLS.C_BIGTIPS
     *
     * @return TBLOCKCONTROLS.C_BIGTIPS, 是否开启大tips展示，用于金额组件
     */
    public String getcBigtips() {
        return cBigtips;
    }

    /**
     * 设置 是否开启大tips展示，用于金额组件 字段:TBLOCKCONTROLS.C_BIGTIPS
     *
     * @param cBigtips the value for TBLOCKCONTROLS.C_BIGTIPS, 是否开启大tips展示，用于金额组件
     */
    public void setcBigtips(String cBigtips) {
        this.cBigtips = cBigtips == null ? null : cBigtips.trim();
    }

    /**
     * 获取 typefield的输入数据的类型 字段:TBLOCKCONTROLS.C_INPUTTYPE
     *
     * @return TBLOCKCONTROLS.C_INPUTTYPE, typefield的输入数据的类型
     */
    public String getcInputtype() {
        return cInputtype;
    }

    /**
     * 设置 typefield的输入数据的类型 字段:TBLOCKCONTROLS.C_INPUTTYPE
     *
     * @param cInputtype the value for TBLOCKCONTROLS.C_INPUTTYPE, typefield的输入数据的类型
     */
    public void setcInputtype(String cInputtype) {
        this.cInputtype = cInputtype == null ? null : cInputtype.trim();
    }

    /**
     * 获取 整数位数需要保留几位数 字段:TBLOCKCONTROLS.L_MAXLENGTH
     *
     * @return TBLOCKCONTROLS.L_MAXLENGTH, 整数位数需要保留几位数
     */
    public BigDecimal getlMaxlength() {
        return lMaxlength;
    }

    /**
     * 设置 整数位数需要保留几位数 字段:TBLOCKCONTROLS.L_MAXLENGTH
     *
     * @param lMaxlength the value for TBLOCKCONTROLS.L_MAXLENGTH, 整数位数需要保留几位数
     */
    public void setlMaxlength(BigDecimal lMaxlength) {
        this.lMaxlength = lMaxlength;
    }

    /**
     * 获取 下拉框默认显示 字段:TBLOCKCONTROLS.C_HEADITEM
     *
     * @return TBLOCKCONTROLS.C_HEADITEM, 下拉框默认显示
     */
    public String getcHeaditem() {
        return cHeaditem;
    }

    /**
     * 设置 下拉框默认显示 字段:TBLOCKCONTROLS.C_HEADITEM
     *
     * @param cHeaditem the value for TBLOCKCONTROLS.C_HEADITEM, 下拉框默认显示
     */
    public void setcHeaditem(String cHeaditem) {
        this.cHeaditem = cHeaditem == null ? null : cHeaditem.trim();
    }

    /**
     * 获取 格式化格式（日期组件） 字段:TBLOCKCONTROLS.C_CONFIG
     *
     * @return TBLOCKCONTROLS.C_CONFIG, 格式化格式（日期组件）
     */
    public String getcConfig() {
        return cConfig;
    }

    /**
     * 设置 格式化格式（日期组件） 字段:TBLOCKCONTROLS.C_CONFIG
     *
     * @param cConfig the value for TBLOCKCONTROLS.C_CONFIG, 格式化格式（日期组件）
     */
    public void setcConfig(String cConfig) {
        this.cConfig = cConfig == null ? null : cConfig.trim();
    }

    /**
     * 获取 默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值） 字段:TBLOCKCONTROLS.C_DEFVALUE
     *
     * @return TBLOCKCONTROLS.C_DEFVALUE, 默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
     */
    public String getcDefvalue() {
        return cDefvalue;
    }

    /**
     * 设置 默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值） 字段:TBLOCKCONTROLS.C_DEFVALUE
     *
     * @param cDefvalue the value for TBLOCKCONTROLS.C_DEFVALUE, 默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
     */
    public void setcDefvalue(String cDefvalue) {
        this.cDefvalue = cDefvalue == null ? null : cDefvalue.trim();
    }

    /**
     * 获取 默认值2（日期组需要两个默认值） 字段:TBLOCKCONTROLS.C_DEFVALUE2
     *
     * @return TBLOCKCONTROLS.C_DEFVALUE2, 默认值2（日期组需要两个默认值）
     */
    public String getcDefvalue2() {
        return cDefvalue2;
    }

    /**
     * 设置 默认值2（日期组需要两个默认值） 字段:TBLOCKCONTROLS.C_DEFVALUE2
     *
     * @param cDefvalue2 the value for TBLOCKCONTROLS.C_DEFVALUE2, 默认值2（日期组需要两个默认值）
     */
    public void setcDefvalue2(String cDefvalue2) {
        this.cDefvalue2 = cDefvalue2 == null ? null : cDefvalue2.trim();
    }

    /**
     * 获取 组件别名 字段:TBLOCKCONTROLS.C_ALIAS
     *
     * @return TBLOCKCONTROLS.C_ALIAS, 组件别名
     */
    public String getcAlias() {
        return cAlias;
    }

    /**
     * 设置 组件别名 字段:TBLOCKCONTROLS.C_ALIAS
     *
     * @param cAlias the value for TBLOCKCONTROLS.C_ALIAS, 组件别名
     */
    public void setcAlias(String cAlias) {
        this.cAlias = cAlias == null ? null : cAlias.trim();
    }

    /**
     * 获取 是否开启多选（用于下拉组件） 字段:TBLOCKCONTROLS.C_MULTIPLE
     *
     * @return TBLOCKCONTROLS.C_MULTIPLE, 是否开启多选（用于下拉组件）
     */
    public String getcMultiple() {
        return cMultiple;
    }

    /**
     * 设置 是否开启多选（用于下拉组件） 字段:TBLOCKCONTROLS.C_MULTIPLE
     *
     * @param cMultiple the value for TBLOCKCONTROLS.C_MULTIPLE, 是否开启多选（用于下拉组件）
     */
    public void setcMultiple(String cMultiple) {
        this.cMultiple = cMultiple == null ? null : cMultiple.trim();
    }

    /**
     * 获取 多选时的显示分隔符（） 字段:TBLOCKCONTROLS.C_DELIMITER
     *
     * @return TBLOCKCONTROLS.C_DELIMITER, 多选时的显示分隔符（）
     */
    public String getcDelimiter() {
        return cDelimiter;
    }

    /**
     * 设置 多选时的显示分隔符（） 字段:TBLOCKCONTROLS.C_DELIMITER
     *
     * @param cDelimiter the value for TBLOCKCONTROLS.C_DELIMITER, 多选时的显示分隔符（）
     */
    public void setcDelimiter(String cDelimiter) {
        this.cDelimiter = cDelimiter == null ? null : cDelimiter.trim();
    }

    /**
     * 获取 全选框（用于下拉组件） 字段:TBLOCKCONTROLS.C_SELECTALL
     *
     * @return TBLOCKCONTROLS.C_SELECTALL, 全选框（用于下拉组件）
     */
    public String getcSelectall() {
        return cSelectall;
    }

    /**
     * 设置 全选框（用于下拉组件） 字段:TBLOCKCONTROLS.C_SELECTALL
     *
     * @param cSelectall the value for TBLOCKCONTROLS.C_SELECTALL, 全选框（用于下拉组件）
     */
    public void setcSelectall(String cSelectall) {
        this.cSelectall = cSelectall == null ? null : cSelectall.trim();
    }

    /**
     * 获取 是否可编辑 字段:TBLOCKCONTROLS.C_EDITABLE
     *
     * @return TBLOCKCONTROLS.C_EDITABLE, 是否可编辑
     */
    public String getcEditable() {
        return cEditable;
    }

    /**
     * 设置 是否可编辑 字段:TBLOCKCONTROLS.C_EDITABLE
     *
     * @param cEditable the value for TBLOCKCONTROLS.C_EDITABLE, 是否可编辑
     */
    public void setcEditable(String cEditable) {
        this.cEditable = cEditable == null ? null : cEditable.trim();
    }

    /**
     * 获取 是否隐藏 字段:TBLOCKCONTROLS.C_HIDDEN
     *
     * @return TBLOCKCONTROLS.C_HIDDEN, 是否隐藏
     */
    public String getcHidden() {
        return cHidden;
    }

    /**
     * 设置 是否隐藏 字段:TBLOCKCONTROLS.C_HIDDEN
     *
     * @param cHidden the value for TBLOCKCONTROLS.C_HIDDEN, 是否隐藏
     */
    public void setcHidden(String cHidden) {
        this.cHidden = cHidden == null ? null : cHidden.trim();
    }

    /**
     * 获取 输入框模糊查询sql脚本（Biz_Search） 字段:TBLOCKCONTROLS.C_SQL
     *
     * @return TBLOCKCONTROLS.C_SQL, 输入框模糊查询sql脚本（Biz_Search）
     */
    public String getcSql() {
        return cSql;
    }

    /**
     * 设置 输入框模糊查询sql脚本（Biz_Search） 字段:TBLOCKCONTROLS.C_SQL
     *
     * @param cSql the value for TBLOCKCONTROLS.C_SQL, 输入框模糊查询sql脚本（Biz_Search）
     */
    public void setcSql(String cSql) {
        this.cSql = cSql == null ? null : cSql.trim();
    }

    /**
     * 获取 弹出框清空值后需要callback的事件配置 字段:TBLOCKCONTROLS.C_AFTERCLEAR
     *
     * @return TBLOCKCONTROLS.C_AFTERCLEAR, 弹出框清空值后需要callback的事件配置
     */
    public String getcAfterclear() {
        return cAfterclear;
    }

    /**
     * 设置 弹出框清空值后需要callback的事件配置 字段:TBLOCKCONTROLS.C_AFTERCLEAR
     *
     * @param cAfterclear the value for TBLOCKCONTROLS.C_AFTERCLEAR, 弹出框清空值后需要callback的事件配置
     */
    public void setcAfterclear(String cAfterclear) {
        this.cAfterclear = cAfterclear == null ? null : cAfterclear.trim();
    }

    /**
     * 获取 用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名） 字段:TBLOCKCONTROLS.C_MOSAICCOLUMN
     *
     * @return TBLOCKCONTROLS.C_MOSAICCOLUMN, 用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
     */
    public String getcMosaiccolumn() {
        return cMosaiccolumn;
    }

    /**
     * 设置 用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名） 字段:TBLOCKCONTROLS.C_MOSAICCOLUMN
     *
     * @param cMosaiccolumn the value for TBLOCKCONTROLS.C_MOSAICCOLUMN, 用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
     */
    public void setcMosaiccolumn(String cMosaiccolumn) {
        this.cMosaiccolumn = cMosaiccolumn == null ? null : cMosaiccolumn.trim();
    }

    /**
     * 获取 用于关联数据库表（信保基金需求，方便添加字段，插入表名） 字段:TBLOCKCONTROLS.C_TABLENAME
     *
     * @return TBLOCKCONTROLS.C_TABLENAME, 用于关联数据库表（信保基金需求，方便添加字段，插入表名）
     */
    public String getcTablename() {
        return cTablename;
    }

    /**
     * 设置 用于关联数据库表（信保基金需求，方便添加字段，插入表名） 字段:TBLOCKCONTROLS.C_TABLENAME
     *
     * @param cTablename the value for TBLOCKCONTROLS.C_TABLENAME, 用于关联数据库表（信保基金需求，方便添加字段，插入表名）
     */
    public void setcTablename(String cTablename) {
        this.cTablename = cTablename == null ? null : cTablename.trim();
    }

    /**
     * 获取 字段描述 字段:TBLOCKCONTROLS.C_TIPS
     *
     * @return TBLOCKCONTROLS.C_TIPS, 字段描述
     */
    public String getcTips() {
        return cTips;
    }

    /**
     * 设置 字段描述 字段:TBLOCKCONTROLS.C_TIPS
     *
     * @param cTips the value for TBLOCKCONTROLS.C_TIPS, 字段描述
     */
    public void setcTips(String cTips) {
        this.cTips = cTips == null ? null : cTips.trim();
    }

    /**
     * 获取 null 字段:TBLOCKCONTROLS.C_FILTERDICTS
     *
     * @return TBLOCKCONTROLS.C_FILTERDICTS, null
     */
    public String getcFilterdicts() {
        return cFilterdicts;
    }

    /**
     * 设置 null 字段:TBLOCKCONTROLS.C_FILTERDICTS
     *
     * @param cFilterdicts the value for TBLOCKCONTROLS.C_FILTERDICTS, null
     */
    public void setcFilterdicts(String cFilterdicts) {
        this.cFilterdicts = cFilterdicts == null ? null : cFilterdicts.trim();
    }

    /**
     * 获取 null 字段:TBLOCKCONTROLS.C_SHOWDICTS
     *
     * @return TBLOCKCONTROLS.C_SHOWDICTS, null
     */
    public String getcShowdicts() {
        return cShowdicts;
    }

    /**
     * 设置 null 字段:TBLOCKCONTROLS.C_SHOWDICTS
     *
     * @param cShowdicts the value for TBLOCKCONTROLS.C_SHOWDICTS, null
     */
    public void setcShowdicts(String cShowdicts) {
        this.cShowdicts = cShowdicts == null ? null : cShowdicts.trim();
    }

    /**
     * 获取 null 字段:TBLOCKCONTROLS.C_FORMAT
     *
     * @return TBLOCKCONTROLS.C_FORMAT, null
     */
    public String getcFormat() {
        return cFormat;
    }

    /**
     * 设置 null 字段:TBLOCKCONTROLS.C_FORMAT
     *
     * @param cFormat the value for TBLOCKCONTROLS.C_FORMAT, null
     */
    public void setcFormat(String cFormat) {
        this.cFormat = cFormat == null ? null : cFormat.trim();
    }

    /**
     * 获取 对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()） 字段:TBLOCKCONTROLS.C_COMPARECOLUMN
     *
     * @return TBLOCKCONTROLS.C_COMPARECOLUMN, 对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
     */
    public String getcComparecolumn() {
        return cComparecolumn;
    }

    /**
     * 设置 对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()） 字段:TBLOCKCONTROLS.C_COMPARECOLUMN
     *
     * @param cComparecolumn the value for TBLOCKCONTROLS.C_COMPARECOLUMN, 对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
     */
    public void setcComparecolumn(String cComparecolumn) {
        this.cComparecolumn = cComparecolumn == null ? null : cComparecolumn.trim();
    }

    /**
     * 获取 整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效） 字段:TBLOCKCONTROLS.L_INTEGERNUM
     *
     * @return TBLOCKCONTROLS.L_INTEGERNUM, 整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
     */
    public BigDecimal getlIntegernum() {
        return lIntegernum;
    }

    /**
     * 设置 整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效） 字段:TBLOCKCONTROLS.L_INTEGERNUM
     *
     * @param lIntegernum the value for TBLOCKCONTROLS.L_INTEGERNUM, 整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
     */
    public void setlIntegernum(BigDecimal lIntegernum) {
        this.lIntegernum = lIntegernum;
    }

    /**
     * 获取 小数点后缀保留几位数，默认保留两位（对金额类型有效） 字段:TBLOCKCONTROLS.L_SUFFIXNUM
     *
     * @return TBLOCKCONTROLS.L_SUFFIXNUM, 小数点后缀保留几位数，默认保留两位（对金额类型有效）
     */
    public BigDecimal getlSuffixnum() {
        return lSuffixnum;
    }

    /**
     * 设置 小数点后缀保留几位数，默认保留两位（对金额类型有效） 字段:TBLOCKCONTROLS.L_SUFFIXNUM
     *
     * @param lSuffixnum the value for TBLOCKCONTROLS.L_SUFFIXNUM, 小数点后缀保留几位数，默认保留两位（对金额类型有效）
     */
    public void setlSuffixnum(BigDecimal lSuffixnum) {
        this.lSuffixnum = lSuffixnum;
    }

    /**
     * 获取 字段值变化相应事件 字段:TBLOCKCONTROLS.C_CHGEVENTID
     *
     * @return TBLOCKCONTROLS.C_CHGEVENTID, 字段值变化相应事件
     */
    public String getcChgeventid() {
        return cChgeventid;
    }

    /**
     * 设置 字段值变化相应事件 字段:TBLOCKCONTROLS.C_CHGEVENTID
     *
     * @param cChgeventid the value for TBLOCKCONTROLS.C_CHGEVENTID, 字段值变化相应事件
     */
    public void setcChgeventid(String cChgeventid) {
        this.cChgeventid = cChgeventid == null ? null : cChgeventid.trim();
    }

    /**
     * 获取 是否在查看页面展示（1，不展示；2，展示） 字段:TBLOCKCONTROLS.C_VIEWFLAG
     *
     * @return TBLOCKCONTROLS.C_VIEWFLAG, 是否在查看页面展示（1，不展示；2，展示）
     */
    public String getcViewflag() {
        return cViewflag;
    }

    /**
     * 设置 是否在查看页面展示（1，不展示；2，展示） 字段:TBLOCKCONTROLS.C_VIEWFLAG
     *
     * @param cViewflag the value for TBLOCKCONTROLS.C_VIEWFLAG, 是否在查看页面展示（1，不展示；2，展示）
     */
    public void setcViewflag(String cViewflag) {
        this.cViewflag = cViewflag == null ? null : cViewflag.trim();
    }

    /**
     * 获取 targetselect组件弹出框事件 字段:TBLOCKCONTROLS.C_SELECTONCHANGE
     *
     * @return TBLOCKCONTROLS.C_SELECTONCHANGE, targetselect组件弹出框事件
     */
    public String getcSelectonchange() {
        return cSelectonchange;
    }

    /**
     * 设置 targetselect组件弹出框事件 字段:TBLOCKCONTROLS.C_SELECTONCHANGE
     *
     * @param cSelectonchange the value for TBLOCKCONTROLS.C_SELECTONCHANGE, targetselect组件弹出框事件
     */
    public void setcSelectonchange(String cSelectonchange) {
        this.cSelectonchange = cSelectonchange == null ? null : cSelectonchange.trim();
    }
}