/*
 * Tquerycolumn.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers.entity;

import java.math.BigDecimal;

/**
 * 
 * @Date 2023-08-16 16:32:08
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
public class Tquerycolumn {
    /**
     * lSerialno 主键
     */
    private BigDecimal lSerialno;

    /**
     * lPagesno 关联与tquerycondition l_serialno字段
     */
    private BigDecimal lPagesno;

    /**
     * cName 数据列属性字段
     */
    private String cName;

    /**
     * cLabel 字段显示名称
     */
    private String cLabel;

    /**
     * cDatatype 数据类型（text，textfield）以后支持更多类型
     */
    private String cDatatype;

    /**
     * cShowtype 文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
     */
    private String cShowtype;

    /**
     * cEvent 事件
     */
    private String cEvent;

    /**
     * cCheck 校验
     */
    private String cCheck;

    /**
     * cAlign 文本显示样式（left center right）
     */
    private String cAlign;

    /**
     * cFormat 格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
     */
    private String cFormat;

    /**
     * cRelatename 关联字段
     */
    private String cRelatename;

    /**
     * cDictname 数据字典 多数据字典时 采用json对应
     */
    private String cDictname;

    /**
     * lWidth 长度
     */
    private BigDecimal lWidth;

    /**
     * cEnbel 禁用0 启用1 
     */
    private String cEnbel;

    /**
     * lOrder 排序
     */
    private BigDecimal lOrder;

    /**
     * cIsfrozen 冻结列
     */
    private String cIsfrozen;

    /**
     * cOrderfieldname null
     */
    private String cOrderfieldname;

    /**
     * cIssummary null
     */
    private String cIssummary;

    /**
     * cCompparam editgrid更多属性配置
     */
    private String cCompparam;

    /**
     * cEvents editgrid事件配置
     */
    private String cEvents;

    /**
     * cHidden editgrid隐藏列配置
     */
    private String cHidden;

    /**
     * cDefaultvalue 默认值（用于editgrid）
     */
    private String cDefaultvalue;

    /**
     * cComparecolumn 对比字段
     */
    private String cComparecolumn;

    /**
     * cEdit 0或空:不可编辑； 1:可编辑
     */
    private String cEdit;

    /**
     * cCanshoworhide 可控制显示隐藏,1可以，0不可控制
     */
    private String cCanshoworhide;

    /**
     * 获取 主键 字段:TQUERYCOLUMN.L_SERIALNO
     *
     * @return TQUERYCOLUMN.L_SERIALNO, 主键
     */
    public BigDecimal getlSerialno() {
        return lSerialno;
    }

    /**
     * 设置 主键 字段:TQUERYCOLUMN.L_SERIALNO
     *
     * @param lSerialno the value for TQUERYCOLUMN.L_SERIALNO, 主键
     */
    public void setlSerialno(BigDecimal lSerialno) {
        this.lSerialno = lSerialno;
    }

    /**
     * 获取 关联与tquerycondition l_serialno字段 字段:TQUERYCOLUMN.L_PAGESNO
     *
     * @return TQUERYCOLUMN.L_PAGESNO, 关联与tquerycondition l_serialno字段
     */
    public BigDecimal getlPagesno() {
        return lPagesno;
    }

    /**
     * 设置 关联与tquerycondition l_serialno字段 字段:TQUERYCOLUMN.L_PAGESNO
     *
     * @param lPagesno the value for TQUERYCOLUMN.L_PAGESNO, 关联与tquerycondition l_serialno字段
     */
    public void setlPagesno(BigDecimal lPagesno) {
        this.lPagesno = lPagesno;
    }

    /**
     * 获取 数据列属性字段 字段:TQUERYCOLUMN.C_NAME
     *
     * @return TQUERYCOLUMN.C_NAME, 数据列属性字段
     */
    public String getcName() {
        return cName;
    }

    /**
     * 设置 数据列属性字段 字段:TQUERYCOLUMN.C_NAME
     *
     * @param cName the value for TQUERYCOLUMN.C_NAME, 数据列属性字段
     */
    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    /**
     * 获取 字段显示名称 字段:TQUERYCOLUMN.C_LABEL
     *
     * @return TQUERYCOLUMN.C_LABEL, 字段显示名称
     */
    public String getcLabel() {
        return cLabel;
    }

    /**
     * 设置 字段显示名称 字段:TQUERYCOLUMN.C_LABEL
     *
     * @param cLabel the value for TQUERYCOLUMN.C_LABEL, 字段显示名称
     */
    public void setcLabel(String cLabel) {
        this.cLabel = cLabel == null ? null : cLabel.trim();
    }

    /**
     * 获取 数据类型（text，textfield）以后支持更多类型 字段:TQUERYCOLUMN.C_DATATYPE
     *
     * @return TQUERYCOLUMN.C_DATATYPE, 数据类型（text，textfield）以后支持更多类型
     */
    public String getcDatatype() {
        return cDatatype;
    }

    /**
     * 设置 数据类型（text，textfield）以后支持更多类型 字段:TQUERYCOLUMN.C_DATATYPE
     *
     * @param cDatatype the value for TQUERYCOLUMN.C_DATATYPE, 数据类型（text，textfield）以后支持更多类型
     */
    public void setcDatatype(String cDatatype) {
        this.cDatatype = cDatatype == null ? null : cDatatype.trim();
    }

    /**
     * 获取 文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义  字段:TQUERYCOLUMN.C_SHOWTYPE
     *
     * @return TQUERYCOLUMN.C_SHOWTYPE, 文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
     */
    public String getcShowtype() {
        return cShowtype;
    }

    /**
     * 设置 文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义  字段:TQUERYCOLUMN.C_SHOWTYPE
     *
     * @param cShowtype the value for TQUERYCOLUMN.C_SHOWTYPE, 文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
     */
    public void setcShowtype(String cShowtype) {
        this.cShowtype = cShowtype == null ? null : cShowtype.trim();
    }

    /**
     * 获取 事件 字段:TQUERYCOLUMN.C_EVENT
     *
     * @return TQUERYCOLUMN.C_EVENT, 事件
     */
    public String getcEvent() {
        return cEvent;
    }

    /**
     * 设置 事件 字段:TQUERYCOLUMN.C_EVENT
     *
     * @param cEvent the value for TQUERYCOLUMN.C_EVENT, 事件
     */
    public void setcEvent(String cEvent) {
        this.cEvent = cEvent == null ? null : cEvent.trim();
    }

    /**
     * 获取 校验 字段:TQUERYCOLUMN.C_CHECK
     *
     * @return TQUERYCOLUMN.C_CHECK, 校验
     */
    public String getcCheck() {
        return cCheck;
    }

    /**
     * 设置 校验 字段:TQUERYCOLUMN.C_CHECK
     *
     * @param cCheck the value for TQUERYCOLUMN.C_CHECK, 校验
     */
    public void setcCheck(String cCheck) {
        this.cCheck = cCheck == null ? null : cCheck.trim();
    }

    /**
     * 获取 文本显示样式（left center right） 字段:TQUERYCOLUMN.C_ALIGN
     *
     * @return TQUERYCOLUMN.C_ALIGN, 文本显示样式（left center right）
     */
    public String getcAlign() {
        return cAlign;
    }

    /**
     * 设置 文本显示样式（left center right） 字段:TQUERYCOLUMN.C_ALIGN
     *
     * @param cAlign the value for TQUERYCOLUMN.C_ALIGN, 文本显示样式（left center right）
     */
    public void setcAlign(String cAlign) {
        this.cAlign = cAlign == null ? null : cAlign.trim();
    }

    /**
     * 获取 格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表） 字段:TQUERYCOLUMN.C_FORMAT
     *
     * @return TQUERYCOLUMN.C_FORMAT, 格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
     */
    public String getcFormat() {
        return cFormat;
    }

    /**
     * 设置 格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表） 字段:TQUERYCOLUMN.C_FORMAT
     *
     * @param cFormat the value for TQUERYCOLUMN.C_FORMAT, 格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
     */
    public void setcFormat(String cFormat) {
        this.cFormat = cFormat == null ? null : cFormat.trim();
    }

    /**
     * 获取 关联字段 字段:TQUERYCOLUMN.C_RELATENAME
     *
     * @return TQUERYCOLUMN.C_RELATENAME, 关联字段
     */
    public String getcRelatename() {
        return cRelatename;
    }

    /**
     * 设置 关联字段 字段:TQUERYCOLUMN.C_RELATENAME
     *
     * @param cRelatename the value for TQUERYCOLUMN.C_RELATENAME, 关联字段
     */
    public void setcRelatename(String cRelatename) {
        this.cRelatename = cRelatename == null ? null : cRelatename.trim();
    }

    /**
     * 获取 数据字典 多数据字典时 采用json对应 字段:TQUERYCOLUMN.C_DICTNAME
     *
     * @return TQUERYCOLUMN.C_DICTNAME, 数据字典 多数据字典时 采用json对应
     */
    public String getcDictname() {
        return cDictname;
    }

    /**
     * 设置 数据字典 多数据字典时 采用json对应 字段:TQUERYCOLUMN.C_DICTNAME
     *
     * @param cDictname the value for TQUERYCOLUMN.C_DICTNAME, 数据字典 多数据字典时 采用json对应
     */
    public void setcDictname(String cDictname) {
        this.cDictname = cDictname == null ? null : cDictname.trim();
    }

    /**
     * 获取 长度 字段:TQUERYCOLUMN.L_WIDTH
     *
     * @return TQUERYCOLUMN.L_WIDTH, 长度
     */
    public BigDecimal getlWidth() {
        return lWidth;
    }

    /**
     * 设置 长度 字段:TQUERYCOLUMN.L_WIDTH
     *
     * @param lWidth the value for TQUERYCOLUMN.L_WIDTH, 长度
     */
    public void setlWidth(BigDecimal lWidth) {
        this.lWidth = lWidth;
    }

    /**
     * 获取 禁用0 启用1  字段:TQUERYCOLUMN.C_ENBEL
     *
     * @return TQUERYCOLUMN.C_ENBEL, 禁用0 启用1 
     */
    public String getcEnbel() {
        return cEnbel;
    }

    /**
     * 设置 禁用0 启用1  字段:TQUERYCOLUMN.C_ENBEL
     *
     * @param cEnbel the value for TQUERYCOLUMN.C_ENBEL, 禁用0 启用1 
     */
    public void setcEnbel(String cEnbel) {
        this.cEnbel = cEnbel == null ? null : cEnbel.trim();
    }

    /**
     * 获取 排序 字段:TQUERYCOLUMN.L_ORDER
     *
     * @return TQUERYCOLUMN.L_ORDER, 排序
     */
    public BigDecimal getlOrder() {
        return lOrder;
    }

    /**
     * 设置 排序 字段:TQUERYCOLUMN.L_ORDER
     *
     * @param lOrder the value for TQUERYCOLUMN.L_ORDER, 排序
     */
    public void setlOrder(BigDecimal lOrder) {
        this.lOrder = lOrder;
    }

    /**
     * 获取 冻结列 字段:TQUERYCOLUMN.C_ISFROZEN
     *
     * @return TQUERYCOLUMN.C_ISFROZEN, 冻结列
     */
    public String getcIsfrozen() {
        return cIsfrozen;
    }

    /**
     * 设置 冻结列 字段:TQUERYCOLUMN.C_ISFROZEN
     *
     * @param cIsfrozen the value for TQUERYCOLUMN.C_ISFROZEN, 冻结列
     */
    public void setcIsfrozen(String cIsfrozen) {
        this.cIsfrozen = cIsfrozen == null ? null : cIsfrozen.trim();
    }

    /**
     * 获取 null 字段:TQUERYCOLUMN.C_ORDERFIELDNAME
     *
     * @return TQUERYCOLUMN.C_ORDERFIELDNAME, null
     */
    public String getcOrderfieldname() {
        return cOrderfieldname;
    }

    /**
     * 设置 null 字段:TQUERYCOLUMN.C_ORDERFIELDNAME
     *
     * @param cOrderfieldname the value for TQUERYCOLUMN.C_ORDERFIELDNAME, null
     */
    public void setcOrderfieldname(String cOrderfieldname) {
        this.cOrderfieldname = cOrderfieldname == null ? null : cOrderfieldname.trim();
    }

    /**
     * 获取 null 字段:TQUERYCOLUMN.C_ISSUMMARY
     *
     * @return TQUERYCOLUMN.C_ISSUMMARY, null
     */
    public String getcIssummary() {
        return cIssummary;
    }

    /**
     * 设置 null 字段:TQUERYCOLUMN.C_ISSUMMARY
     *
     * @param cIssummary the value for TQUERYCOLUMN.C_ISSUMMARY, null
     */
    public void setcIssummary(String cIssummary) {
        this.cIssummary = cIssummary == null ? null : cIssummary.trim();
    }

    /**
     * 获取 editgrid更多属性配置 字段:TQUERYCOLUMN.C_COMPPARAM
     *
     * @return TQUERYCOLUMN.C_COMPPARAM, editgrid更多属性配置
     */
    public String getcCompparam() {
        return cCompparam;
    }

    /**
     * 设置 editgrid更多属性配置 字段:TQUERYCOLUMN.C_COMPPARAM
     *
     * @param cCompparam the value for TQUERYCOLUMN.C_COMPPARAM, editgrid更多属性配置
     */
    public void setcCompparam(String cCompparam) {
        this.cCompparam = cCompparam == null ? null : cCompparam.trim();
    }

    /**
     * 获取 editgrid事件配置 字段:TQUERYCOLUMN.C_EVENTS
     *
     * @return TQUERYCOLUMN.C_EVENTS, editgrid事件配置
     */
    public String getcEvents() {
        return cEvents;
    }

    /**
     * 设置 editgrid事件配置 字段:TQUERYCOLUMN.C_EVENTS
     *
     * @param cEvents the value for TQUERYCOLUMN.C_EVENTS, editgrid事件配置
     */
    public void setcEvents(String cEvents) {
        this.cEvents = cEvents == null ? null : cEvents.trim();
    }

    /**
     * 获取 editgrid隐藏列配置 字段:TQUERYCOLUMN.C_HIDDEN
     *
     * @return TQUERYCOLUMN.C_HIDDEN, editgrid隐藏列配置
     */
    public String getcHidden() {
        return cHidden;
    }

    /**
     * 设置 editgrid隐藏列配置 字段:TQUERYCOLUMN.C_HIDDEN
     *
     * @param cHidden the value for TQUERYCOLUMN.C_HIDDEN, editgrid隐藏列配置
     */
    public void setcHidden(String cHidden) {
        this.cHidden = cHidden == null ? null : cHidden.trim();
    }

    /**
     * 获取 默认值（用于editgrid） 字段:TQUERYCOLUMN.C_DEFAULTVALUE
     *
     * @return TQUERYCOLUMN.C_DEFAULTVALUE, 默认值（用于editgrid）
     */
    public String getcDefaultvalue() {
        return cDefaultvalue;
    }

    /**
     * 设置 默认值（用于editgrid） 字段:TQUERYCOLUMN.C_DEFAULTVALUE
     *
     * @param cDefaultvalue the value for TQUERYCOLUMN.C_DEFAULTVALUE, 默认值（用于editgrid）
     */
    public void setcDefaultvalue(String cDefaultvalue) {
        this.cDefaultvalue = cDefaultvalue == null ? null : cDefaultvalue.trim();
    }

    /**
     * 获取 对比字段 字段:TQUERYCOLUMN.C_COMPARECOLUMN
     *
     * @return TQUERYCOLUMN.C_COMPARECOLUMN, 对比字段
     */
    public String getcComparecolumn() {
        return cComparecolumn;
    }

    /**
     * 设置 对比字段 字段:TQUERYCOLUMN.C_COMPARECOLUMN
     *
     * @param cComparecolumn the value for TQUERYCOLUMN.C_COMPARECOLUMN, 对比字段
     */
    public void setcComparecolumn(String cComparecolumn) {
        this.cComparecolumn = cComparecolumn == null ? null : cComparecolumn.trim();
    }

    /**
     * 获取 0或空:不可编辑； 1:可编辑 字段:TQUERYCOLUMN.C_EDIT
     *
     * @return TQUERYCOLUMN.C_EDIT, 0或空:不可编辑； 1:可编辑
     */
    public String getcEdit() {
        return cEdit;
    }

    /**
     * 设置 0或空:不可编辑； 1:可编辑 字段:TQUERYCOLUMN.C_EDIT
     *
     * @param cEdit the value for TQUERYCOLUMN.C_EDIT, 0或空:不可编辑； 1:可编辑
     */
    public void setcEdit(String cEdit) {
        this.cEdit = cEdit == null ? null : cEdit.trim();
    }

    /**
     * 获取 可控制显示隐藏,1可以，0不可控制 字段:TQUERYCOLUMN.C_CANSHOWORHIDE
     *
     * @return TQUERYCOLUMN.C_CANSHOWORHIDE, 可控制显示隐藏,1可以，0不可控制
     */
    public String getcCanshoworhide() {
        return cCanshoworhide;
    }

    /**
     * 设置 可控制显示隐藏,1可以，0不可控制 字段:TQUERYCOLUMN.C_CANSHOWORHIDE
     *
     * @param cCanshoworhide the value for TQUERYCOLUMN.C_CANSHOWORHIDE, 可控制显示隐藏,1可以，0不可控制
     */
    public void setcCanshoworhide(String cCanshoworhide) {
        this.cCanshoworhide = cCanshoworhide == null ? null : cCanshoworhide.trim();
    }
}