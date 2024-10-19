/*
 * TquerycolumnExample.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @Date 2023-08-16 16:32:08
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
public class TquerycolumnExample {
    /**
     * orderByClause 排序字段
     */
    protected String orderByClause;

    /**
     * distinct 是否过滤重复数据
     */
    protected boolean distinct;

    /**
     * oredCriteria 过滤条件实例
     */
    protected List<Criteria> oredCriteria;

    /**
     * 构造查询条件:TQUERYCOLUMN
     */
    public TquerycolumnExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 设置排序字段:TQUERYCOLUMN
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 获取排序字段:TQUERYCOLUMN
     * 
     * @return String 排序规则
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置过滤重复数据:TQUERYCOLUMN
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 是否过滤重复数据:TQUERYCOLUMN
     * 
     * @return boolean 是否过滤重复
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获取当前的查询条件实例:TQUERYCOLUMN
     * 
     * @return List<Criteria> 获取标准集
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 根据主键来更新符合条件的数据库记录:TQUERYCOLUMN
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 根据主键来更新符合条件的数据库记录:TQUERYCOLUMN
     * 
     * @return Criteria 标准条件式
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 创建一个查询条件:TQUERYCOLUMN
     * 
     * @return Criteria 标准条件式
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 内部构建查询条件对象:TQUERYCOLUMN
     * 
     * @return Criteria 标准条件式
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除查询条件:TQUERYCOLUMN
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @Title TQUERYCOLUMN表的创建标准内部类
     * @Description null
     */
    protected abstract static class GeneratedCriteria {
        /**
         * criteria 标准集
         */
        protected List<Criterion> criteria;

        /**
         * 构造查询条件:TQUERYCOLUMN
         */
        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        /**
         * 是否验证:TQUERYCOLUMN
         * 
         * @return boolean 是否有效
         */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
         * 获取所有条件集:TQUERYCOLUMN
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
         * 获取条件集:TQUERYCOLUMN
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
         * 增加条件:TQUERYCOLUMN
         *
         * @param condition 条件
         */
        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        /**
         * 增加条件:TQUERYCOLUMN
         *
         * @param condition 条件
         * @param value     值
         * @param property  属性
         */
        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        /**
         * 增加条件:TQUERYCOLUMN
         *
         * @param condition 条件
         * @param value1    起始值
         * @param value2    结束值
         * @param property  属性
         */
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        /**
         * 条件为空:主键
         * 
         * @return 标准
         */
        public Criteria andLSerialnoIsNull() {
            addCriterion("L_SERIALNO is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:主键
         * 
         * @return 标准
         */
        public Criteria andLSerialnoIsNotNull() {
            addCriterion("L_SERIALNO is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSerialnoEqualTo(BigDecimal value) {
            addCriterion("L_SERIALNO =", value, "lSerialno");
            return (Criteria) this;
        }

        /**
         * 条件不相等:主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSerialnoNotEqualTo(BigDecimal value) {
            addCriterion("L_SERIALNO <>", value, "lSerialno");
            return (Criteria) this;
        }

        /**
         * 条件大于:主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSerialnoGreaterThan(BigDecimal value) {
            addCriterion("L_SERIALNO >", value, "lSerialno");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSerialnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_SERIALNO >=", value, "lSerialno");
            return (Criteria) this;
        }

        /**
         * 条件小于:主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSerialnoLessThan(BigDecimal value) {
            addCriterion("L_SERIALNO <", value, "lSerialno");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSerialnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_SERIALNO <=", value, "lSerialno");
            return (Criteria) this;
        }

        /**
         * 条件在范围:主键
         *
         * @param values 主键
         * @return 标准
         */
        public Criteria andLSerialnoIn(List<BigDecimal> values) {
            addCriterion("L_SERIALNO in", values, "lSerialno");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:主键
         *
         * @param values 主键
         * @return 标准
         */
        public Criteria andLSerialnoNotIn(List<BigDecimal> values) {
            addCriterion("L_SERIALNO not in", values, "lSerialno");
            return (Criteria) this;
        }

        /**
         * 条件在区间:主键
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLSerialnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_SERIALNO between", value1, value2, "lSerialno");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:主键
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLSerialnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_SERIALNO not between", value1, value2, "lSerialno");
            return (Criteria) this;
        }

        /**
         * 条件为空:关联与tquerycondition l_serialno字段
         * 
         * @return 标准
         */
        public Criteria andLPagesnoIsNull() {
            addCriterion("L_PAGESNO is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:关联与tquerycondition l_serialno字段
         * 
         * @return 标准
         */
        public Criteria andLPagesnoIsNotNull() {
            addCriterion("L_PAGESNO is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:关联与tquerycondition l_serialno字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLPagesnoEqualTo(BigDecimal value) {
            addCriterion("L_PAGESNO =", value, "lPagesno");
            return (Criteria) this;
        }

        /**
         * 条件不相等:关联与tquerycondition l_serialno字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLPagesnoNotEqualTo(BigDecimal value) {
            addCriterion("L_PAGESNO <>", value, "lPagesno");
            return (Criteria) this;
        }

        /**
         * 条件大于:关联与tquerycondition l_serialno字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLPagesnoGreaterThan(BigDecimal value) {
            addCriterion("L_PAGESNO >", value, "lPagesno");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:关联与tquerycondition l_serialno字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLPagesnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_PAGESNO >=", value, "lPagesno");
            return (Criteria) this;
        }

        /**
         * 条件小于:关联与tquerycondition l_serialno字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLPagesnoLessThan(BigDecimal value) {
            addCriterion("L_PAGESNO <", value, "lPagesno");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:关联与tquerycondition l_serialno字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLPagesnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_PAGESNO <=", value, "lPagesno");
            return (Criteria) this;
        }

        /**
         * 条件在范围:关联与tquerycondition l_serialno字段
         *
         * @param values 关联与tquerycondition l_serialno字段
         * @return 标准
         */
        public Criteria andLPagesnoIn(List<BigDecimal> values) {
            addCriterion("L_PAGESNO in", values, "lPagesno");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:关联与tquerycondition l_serialno字段
         *
         * @param values 关联与tquerycondition l_serialno字段
         * @return 标准
         */
        public Criteria andLPagesnoNotIn(List<BigDecimal> values) {
            addCriterion("L_PAGESNO not in", values, "lPagesno");
            return (Criteria) this;
        }

        /**
         * 条件在区间:关联与tquerycondition l_serialno字段
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLPagesnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_PAGESNO between", value1, value2, "lPagesno");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:关联与tquerycondition l_serialno字段
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLPagesnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_PAGESNO not between", value1, value2, "lPagesno");
            return (Criteria) this;
        }

        /**
         * 条件为空:数据列属性字段
         * 
         * @return 标准
         */
        public Criteria andCNameIsNull() {
            addCriterion("C_NAME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:数据列属性字段
         * 
         * @return 标准
         */
        public Criteria andCNameIsNotNull() {
            addCriterion("C_NAME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:数据列属性字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameEqualTo(String value) {
            addCriterion("C_NAME =", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件不相等:数据列属性字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("C_NAME <>", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件大于:数据列属性字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameGreaterThan(String value) {
            addCriterion("C_NAME >", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:数据列属性字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME >=", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件小于:数据列属性字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameLessThan(String value) {
            addCriterion("C_NAME <", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:数据列属性字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("C_NAME <=", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件相似:数据列属性字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameLike(String value) {
            addCriterion("C_NAME like", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件不相似:数据列属性字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameNotLike(String value) {
            addCriterion("C_NAME not like", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件在范围:数据列属性字段
         *
         * @param values 数据列属性字段
         * @return 标准
         */
        public Criteria andCNameIn(List<String> values) {
            addCriterion("C_NAME in", values, "cName");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:数据列属性字段
         *
         * @param values 数据列属性字段
         * @return 标准
         */
        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("C_NAME not in", values, "cName");
            return (Criteria) this;
        }

        /**
         * 条件在区间:数据列属性字段
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("C_NAME between", value1, value2, "cName");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:数据列属性字段
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("C_NAME not between", value1, value2, "cName");
            return (Criteria) this;
        }

        /**
         * 条件为空:字段显示名称
         * 
         * @return 标准
         */
        public Criteria andCLabelIsNull() {
            addCriterion("C_LABEL is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:字段显示名称
         * 
         * @return 标准
         */
        public Criteria andCLabelIsNotNull() {
            addCriterion("C_LABEL is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:字段显示名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelEqualTo(String value) {
            addCriterion("C_LABEL =", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件不相等:字段显示名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelNotEqualTo(String value) {
            addCriterion("C_LABEL <>", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件大于:字段显示名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelGreaterThan(String value) {
            addCriterion("C_LABEL >", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:字段显示名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelGreaterThanOrEqualTo(String value) {
            addCriterion("C_LABEL >=", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件小于:字段显示名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelLessThan(String value) {
            addCriterion("C_LABEL <", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:字段显示名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelLessThanOrEqualTo(String value) {
            addCriterion("C_LABEL <=", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件相似:字段显示名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelLike(String value) {
            addCriterion("C_LABEL like", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件不相似:字段显示名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelNotLike(String value) {
            addCriterion("C_LABEL not like", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件在范围:字段显示名称
         *
         * @param values 字段显示名称
         * @return 标准
         */
        public Criteria andCLabelIn(List<String> values) {
            addCriterion("C_LABEL in", values, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:字段显示名称
         *
         * @param values 字段显示名称
         * @return 标准
         */
        public Criteria andCLabelNotIn(List<String> values) {
            addCriterion("C_LABEL not in", values, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件在区间:字段显示名称
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCLabelBetween(String value1, String value2) {
            addCriterion("C_LABEL between", value1, value2, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:字段显示名称
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCLabelNotBetween(String value1, String value2) {
            addCriterion("C_LABEL not between", value1, value2, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件为空:数据类型（text，textfield）以后支持更多类型
         * 
         * @return 标准
         */
        public Criteria andCDatatypeIsNull() {
            addCriterion("C_DATATYPE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:数据类型（text，textfield）以后支持更多类型
         * 
         * @return 标准
         */
        public Criteria andCDatatypeIsNotNull() {
            addCriterion("C_DATATYPE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:数据类型（text，textfield）以后支持更多类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeEqualTo(String value) {
            addCriterion("C_DATATYPE =", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件不相等:数据类型（text，textfield）以后支持更多类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeNotEqualTo(String value) {
            addCriterion("C_DATATYPE <>", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件大于:数据类型（text，textfield）以后支持更多类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeGreaterThan(String value) {
            addCriterion("C_DATATYPE >", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:数据类型（text，textfield）以后支持更多类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_DATATYPE >=", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件小于:数据类型（text，textfield）以后支持更多类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeLessThan(String value) {
            addCriterion("C_DATATYPE <", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:数据类型（text，textfield）以后支持更多类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeLessThanOrEqualTo(String value) {
            addCriterion("C_DATATYPE <=", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件相似:数据类型（text，textfield）以后支持更多类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeLike(String value) {
            addCriterion("C_DATATYPE like", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件不相似:数据类型（text，textfield）以后支持更多类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeNotLike(String value) {
            addCriterion("C_DATATYPE not like", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件在范围:数据类型（text，textfield）以后支持更多类型
         *
         * @param values 数据类型（text，textfield）以后支持更多类型
         * @return 标准
         */
        public Criteria andCDatatypeIn(List<String> values) {
            addCriterion("C_DATATYPE in", values, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:数据类型（text，textfield）以后支持更多类型
         *
         * @param values 数据类型（text，textfield）以后支持更多类型
         * @return 标准
         */
        public Criteria andCDatatypeNotIn(List<String> values) {
            addCriterion("C_DATATYPE not in", values, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件在区间:数据类型（text，textfield）以后支持更多类型
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDatatypeBetween(String value1, String value2) {
            addCriterion("C_DATATYPE between", value1, value2, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:数据类型（text，textfield）以后支持更多类型
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDatatypeNotBetween(String value1, String value2) {
            addCriterion("C_DATATYPE not between", value1, value2, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件为空:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         * 
         * @return 标准
         */
        public Criteria andCShowtypeIsNull() {
            addCriterion("C_SHOWTYPE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         * 
         * @return 标准
         */
        public Criteria andCShowtypeIsNotNull() {
            addCriterion("C_SHOWTYPE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowtypeEqualTo(String value) {
            addCriterion("C_SHOWTYPE =", value, "cShowtype");
            return (Criteria) this;
        }

        /**
         * 条件不相等:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowtypeNotEqualTo(String value) {
            addCriterion("C_SHOWTYPE <>", value, "cShowtype");
            return (Criteria) this;
        }

        /**
         * 条件大于:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowtypeGreaterThan(String value) {
            addCriterion("C_SHOWTYPE >", value, "cShowtype");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowtypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_SHOWTYPE >=", value, "cShowtype");
            return (Criteria) this;
        }

        /**
         * 条件小于:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowtypeLessThan(String value) {
            addCriterion("C_SHOWTYPE <", value, "cShowtype");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowtypeLessThanOrEqualTo(String value) {
            addCriterion("C_SHOWTYPE <=", value, "cShowtype");
            return (Criteria) this;
        }

        /**
         * 条件相似:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowtypeLike(String value) {
            addCriterion("C_SHOWTYPE like", value, "cShowtype");
            return (Criteria) this;
        }

        /**
         * 条件不相似:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowtypeNotLike(String value) {
            addCriterion("C_SHOWTYPE not like", value, "cShowtype");
            return (Criteria) this;
        }

        /**
         * 条件在范围:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         *
         * @param values 文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         * @return 标准
         */
        public Criteria andCShowtypeIn(List<String> values) {
            addCriterion("C_SHOWTYPE in", values, "cShowtype");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         *
         * @param values 文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         * @return 标准
         */
        public Criteria andCShowtypeNotIn(List<String> values) {
            addCriterion("C_SHOWTYPE not in", values, "cShowtype");
            return (Criteria) this;
        }

        /**
         * 条件在区间:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCShowtypeBetween(String value1, String value2) {
            addCriterion("C_SHOWTYPE between", value1, value2, "cShowtype");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:文本显示类型（0:原始文本; 1:金额; 2:日期时间; 3:数据字典; 4:DataMapUtil。getMapValue进行转义 
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCShowtypeNotBetween(String value1, String value2) {
            addCriterion("C_SHOWTYPE not between", value1, value2, "cShowtype");
            return (Criteria) this;
        }

        /**
         * 条件为空:事件
         * 
         * @return 标准
         */
        public Criteria andCEventIsNull() {
            addCriterion("C_EVENT is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:事件
         * 
         * @return 标准
         */
        public Criteria andCEventIsNotNull() {
            addCriterion("C_EVENT is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventEqualTo(String value) {
            addCriterion("C_EVENT =", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件不相等:事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventNotEqualTo(String value) {
            addCriterion("C_EVENT <>", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件大于:事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventGreaterThan(String value) {
            addCriterion("C_EVENT >", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventGreaterThanOrEqualTo(String value) {
            addCriterion("C_EVENT >=", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件小于:事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventLessThan(String value) {
            addCriterion("C_EVENT <", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventLessThanOrEqualTo(String value) {
            addCriterion("C_EVENT <=", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件相似:事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventLike(String value) {
            addCriterion("C_EVENT like", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件不相似:事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventNotLike(String value) {
            addCriterion("C_EVENT not like", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件在范围:事件
         *
         * @param values 事件
         * @return 标准
         */
        public Criteria andCEventIn(List<String> values) {
            addCriterion("C_EVENT in", values, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:事件
         *
         * @param values 事件
         * @return 标准
         */
        public Criteria andCEventNotIn(List<String> values) {
            addCriterion("C_EVENT not in", values, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件在区间:事件
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCEventBetween(String value1, String value2) {
            addCriterion("C_EVENT between", value1, value2, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:事件
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCEventNotBetween(String value1, String value2) {
            addCriterion("C_EVENT not between", value1, value2, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件为空:校验
         * 
         * @return 标准
         */
        public Criteria andCCheckIsNull() {
            addCriterion("C_CHECK is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:校验
         * 
         * @return 标准
         */
        public Criteria andCCheckIsNotNull() {
            addCriterion("C_CHECK is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckEqualTo(String value) {
            addCriterion("C_CHECK =", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件不相等:校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckNotEqualTo(String value) {
            addCriterion("C_CHECK <>", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件大于:校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckGreaterThan(String value) {
            addCriterion("C_CHECK >", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHECK >=", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件小于:校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckLessThan(String value) {
            addCriterion("C_CHECK <", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckLessThanOrEqualTo(String value) {
            addCriterion("C_CHECK <=", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件相似:校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckLike(String value) {
            addCriterion("C_CHECK like", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件不相似:校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckNotLike(String value) {
            addCriterion("C_CHECK not like", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件在范围:校验
         *
         * @param values 校验
         * @return 标准
         */
        public Criteria andCCheckIn(List<String> values) {
            addCriterion("C_CHECK in", values, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:校验
         *
         * @param values 校验
         * @return 标准
         */
        public Criteria andCCheckNotIn(List<String> values) {
            addCriterion("C_CHECK not in", values, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件在区间:校验
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCCheckBetween(String value1, String value2) {
            addCriterion("C_CHECK between", value1, value2, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:校验
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCCheckNotBetween(String value1, String value2) {
            addCriterion("C_CHECK not between", value1, value2, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件为空:文本显示样式（left center right）
         * 
         * @return 标准
         */
        public Criteria andCAlignIsNull() {
            addCriterion("C_ALIGN is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:文本显示样式（left center right）
         * 
         * @return 标准
         */
        public Criteria andCAlignIsNotNull() {
            addCriterion("C_ALIGN is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:文本显示样式（left center right）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAlignEqualTo(String value) {
            addCriterion("C_ALIGN =", value, "cAlign");
            return (Criteria) this;
        }

        /**
         * 条件不相等:文本显示样式（left center right）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAlignNotEqualTo(String value) {
            addCriterion("C_ALIGN <>", value, "cAlign");
            return (Criteria) this;
        }

        /**
         * 条件大于:文本显示样式（left center right）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAlignGreaterThan(String value) {
            addCriterion("C_ALIGN >", value, "cAlign");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:文本显示样式（left center right）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAlignGreaterThanOrEqualTo(String value) {
            addCriterion("C_ALIGN >=", value, "cAlign");
            return (Criteria) this;
        }

        /**
         * 条件小于:文本显示样式（left center right）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAlignLessThan(String value) {
            addCriterion("C_ALIGN <", value, "cAlign");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:文本显示样式（left center right）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAlignLessThanOrEqualTo(String value) {
            addCriterion("C_ALIGN <=", value, "cAlign");
            return (Criteria) this;
        }

        /**
         * 条件相似:文本显示样式（left center right）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAlignLike(String value) {
            addCriterion("C_ALIGN like", value, "cAlign");
            return (Criteria) this;
        }

        /**
         * 条件不相似:文本显示样式（left center right）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAlignNotLike(String value) {
            addCriterion("C_ALIGN not like", value, "cAlign");
            return (Criteria) this;
        }

        /**
         * 条件在范围:文本显示样式（left center right）
         *
         * @param values 文本显示样式（left center right）
         * @return 标准
         */
        public Criteria andCAlignIn(List<String> values) {
            addCriterion("C_ALIGN in", values, "cAlign");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:文本显示样式（left center right）
         *
         * @param values 文本显示样式（left center right）
         * @return 标准
         */
        public Criteria andCAlignNotIn(List<String> values) {
            addCriterion("C_ALIGN not in", values, "cAlign");
            return (Criteria) this;
        }

        /**
         * 条件在区间:文本显示样式（left center right）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCAlignBetween(String value1, String value2) {
            addCriterion("C_ALIGN between", value1, value2, "cAlign");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:文本显示样式（left center right）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCAlignNotBetween(String value1, String value2) {
            addCriterion("C_ALIGN not between", value1, value2, "cAlign");
            return (Criteria) this;
        }

        /**
         * 条件为空:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         * 
         * @return 标准
         */
        public Criteria andCFormatIsNull() {
            addCriterion("C_FORMAT is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         * 
         * @return 标准
         */
        public Criteria andCFormatIsNotNull() {
            addCriterion("C_FORMAT is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatEqualTo(String value) {
            addCriterion("C_FORMAT =", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件不相等:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatNotEqualTo(String value) {
            addCriterion("C_FORMAT <>", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件大于:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatGreaterThan(String value) {
            addCriterion("C_FORMAT >", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatGreaterThanOrEqualTo(String value) {
            addCriterion("C_FORMAT >=", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件小于:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatLessThan(String value) {
            addCriterion("C_FORMAT <", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatLessThanOrEqualTo(String value) {
            addCriterion("C_FORMAT <=", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件相似:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatLike(String value) {
            addCriterion("C_FORMAT like", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件不相似:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatNotLike(String value) {
            addCriterion("C_FORMAT not like", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件在范围:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         *
         * @param values 格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         * @return 标准
         */
        public Criteria andCFormatIn(List<String> values) {
            addCriterion("C_FORMAT in", values, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         *
         * @param values 格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         * @return 标准
         */
        public Criteria andCFormatNotIn(List<String> values) {
            addCriterion("C_FORMAT not in", values, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件在区间:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCFormatBetween(String value1, String value2) {
            addCriterion("C_FORMAT between", value1, value2, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:格式化注 c_showtype为4时 tuser:用户 ，tbroker:客户经理，（更多类型查看tdatamapconfig表）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCFormatNotBetween(String value1, String value2) {
            addCriterion("C_FORMAT not between", value1, value2, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件为空:关联字段
         * 
         * @return 标准
         */
        public Criteria andCRelatenameIsNull() {
            addCriterion("C_RELATENAME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:关联字段
         * 
         * @return 标准
         */
        public Criteria andCRelatenameIsNotNull() {
            addCriterion("C_RELATENAME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:关联字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatenameEqualTo(String value) {
            addCriterion("C_RELATENAME =", value, "cRelatename");
            return (Criteria) this;
        }

        /**
         * 条件不相等:关联字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatenameNotEqualTo(String value) {
            addCriterion("C_RELATENAME <>", value, "cRelatename");
            return (Criteria) this;
        }

        /**
         * 条件大于:关联字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatenameGreaterThan(String value) {
            addCriterion("C_RELATENAME >", value, "cRelatename");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:关联字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatenameGreaterThanOrEqualTo(String value) {
            addCriterion("C_RELATENAME >=", value, "cRelatename");
            return (Criteria) this;
        }

        /**
         * 条件小于:关联字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatenameLessThan(String value) {
            addCriterion("C_RELATENAME <", value, "cRelatename");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:关联字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatenameLessThanOrEqualTo(String value) {
            addCriterion("C_RELATENAME <=", value, "cRelatename");
            return (Criteria) this;
        }

        /**
         * 条件相似:关联字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatenameLike(String value) {
            addCriterion("C_RELATENAME like", value, "cRelatename");
            return (Criteria) this;
        }

        /**
         * 条件不相似:关联字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatenameNotLike(String value) {
            addCriterion("C_RELATENAME not like", value, "cRelatename");
            return (Criteria) this;
        }

        /**
         * 条件在范围:关联字段
         *
         * @param values 关联字段
         * @return 标准
         */
        public Criteria andCRelatenameIn(List<String> values) {
            addCriterion("C_RELATENAME in", values, "cRelatename");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:关联字段
         *
         * @param values 关联字段
         * @return 标准
         */
        public Criteria andCRelatenameNotIn(List<String> values) {
            addCriterion("C_RELATENAME not in", values, "cRelatename");
            return (Criteria) this;
        }

        /**
         * 条件在区间:关联字段
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCRelatenameBetween(String value1, String value2) {
            addCriterion("C_RELATENAME between", value1, value2, "cRelatename");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:关联字段
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCRelatenameNotBetween(String value1, String value2) {
            addCriterion("C_RELATENAME not between", value1, value2, "cRelatename");
            return (Criteria) this;
        }

        /**
         * 条件为空:数据字典 多数据字典时 采用json对应
         * 
         * @return 标准
         */
        public Criteria andCDictnameIsNull() {
            addCriterion("C_DICTNAME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:数据字典 多数据字典时 采用json对应
         * 
         * @return 标准
         */
        public Criteria andCDictnameIsNotNull() {
            addCriterion("C_DICTNAME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:数据字典 多数据字典时 采用json对应
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameEqualTo(String value) {
            addCriterion("C_DICTNAME =", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件不相等:数据字典 多数据字典时 采用json对应
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameNotEqualTo(String value) {
            addCriterion("C_DICTNAME <>", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件大于:数据字典 多数据字典时 采用json对应
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameGreaterThan(String value) {
            addCriterion("C_DICTNAME >", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:数据字典 多数据字典时 采用json对应
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameGreaterThanOrEqualTo(String value) {
            addCriterion("C_DICTNAME >=", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件小于:数据字典 多数据字典时 采用json对应
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameLessThan(String value) {
            addCriterion("C_DICTNAME <", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:数据字典 多数据字典时 采用json对应
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameLessThanOrEqualTo(String value) {
            addCriterion("C_DICTNAME <=", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件相似:数据字典 多数据字典时 采用json对应
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameLike(String value) {
            addCriterion("C_DICTNAME like", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件不相似:数据字典 多数据字典时 采用json对应
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameNotLike(String value) {
            addCriterion("C_DICTNAME not like", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件在范围:数据字典 多数据字典时 采用json对应
         *
         * @param values 数据字典 多数据字典时 采用json对应
         * @return 标准
         */
        public Criteria andCDictnameIn(List<String> values) {
            addCriterion("C_DICTNAME in", values, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:数据字典 多数据字典时 采用json对应
         *
         * @param values 数据字典 多数据字典时 采用json对应
         * @return 标准
         */
        public Criteria andCDictnameNotIn(List<String> values) {
            addCriterion("C_DICTNAME not in", values, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件在区间:数据字典 多数据字典时 采用json对应
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDictnameBetween(String value1, String value2) {
            addCriterion("C_DICTNAME between", value1, value2, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:数据字典 多数据字典时 采用json对应
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDictnameNotBetween(String value1, String value2) {
            addCriterion("C_DICTNAME not between", value1, value2, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件为空:长度
         * 
         * @return 标准
         */
        public Criteria andLWidthIsNull() {
            addCriterion("L_WIDTH is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:长度
         * 
         * @return 标准
         */
        public Criteria andLWidthIsNotNull() {
            addCriterion("L_WIDTH is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:长度
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLWidthEqualTo(BigDecimal value) {
            addCriterion("L_WIDTH =", value, "lWidth");
            return (Criteria) this;
        }

        /**
         * 条件不相等:长度
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLWidthNotEqualTo(BigDecimal value) {
            addCriterion("L_WIDTH <>", value, "lWidth");
            return (Criteria) this;
        }

        /**
         * 条件大于:长度
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLWidthGreaterThan(BigDecimal value) {
            addCriterion("L_WIDTH >", value, "lWidth");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:长度
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_WIDTH >=", value, "lWidth");
            return (Criteria) this;
        }

        /**
         * 条件小于:长度
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLWidthLessThan(BigDecimal value) {
            addCriterion("L_WIDTH <", value, "lWidth");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:长度
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_WIDTH <=", value, "lWidth");
            return (Criteria) this;
        }

        /**
         * 条件在范围:长度
         *
         * @param values 长度
         * @return 标准
         */
        public Criteria andLWidthIn(List<BigDecimal> values) {
            addCriterion("L_WIDTH in", values, "lWidth");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:长度
         *
         * @param values 长度
         * @return 标准
         */
        public Criteria andLWidthNotIn(List<BigDecimal> values) {
            addCriterion("L_WIDTH not in", values, "lWidth");
            return (Criteria) this;
        }

        /**
         * 条件在区间:长度
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_WIDTH between", value1, value2, "lWidth");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:长度
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_WIDTH not between", value1, value2, "lWidth");
            return (Criteria) this;
        }

        /**
         * 条件为空:禁用0 启用1 
         * 
         * @return 标准
         */
        public Criteria andCEnbelIsNull() {
            addCriterion("C_ENBEL is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:禁用0 启用1 
         * 
         * @return 标准
         */
        public Criteria andCEnbelIsNotNull() {
            addCriterion("C_ENBEL is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:禁用0 启用1 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnbelEqualTo(String value) {
            addCriterion("C_ENBEL =", value, "cEnbel");
            return (Criteria) this;
        }

        /**
         * 条件不相等:禁用0 启用1 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnbelNotEqualTo(String value) {
            addCriterion("C_ENBEL <>", value, "cEnbel");
            return (Criteria) this;
        }

        /**
         * 条件大于:禁用0 启用1 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnbelGreaterThan(String value) {
            addCriterion("C_ENBEL >", value, "cEnbel");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:禁用0 启用1 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnbelGreaterThanOrEqualTo(String value) {
            addCriterion("C_ENBEL >=", value, "cEnbel");
            return (Criteria) this;
        }

        /**
         * 条件小于:禁用0 启用1 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnbelLessThan(String value) {
            addCriterion("C_ENBEL <", value, "cEnbel");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:禁用0 启用1 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnbelLessThanOrEqualTo(String value) {
            addCriterion("C_ENBEL <=", value, "cEnbel");
            return (Criteria) this;
        }

        /**
         * 条件相似:禁用0 启用1 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnbelLike(String value) {
            addCriterion("C_ENBEL like", value, "cEnbel");
            return (Criteria) this;
        }

        /**
         * 条件不相似:禁用0 启用1 
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnbelNotLike(String value) {
            addCriterion("C_ENBEL not like", value, "cEnbel");
            return (Criteria) this;
        }

        /**
         * 条件在范围:禁用0 启用1 
         *
         * @param values 禁用0 启用1 
         * @return 标准
         */
        public Criteria andCEnbelIn(List<String> values) {
            addCriterion("C_ENBEL in", values, "cEnbel");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:禁用0 启用1 
         *
         * @param values 禁用0 启用1 
         * @return 标准
         */
        public Criteria andCEnbelNotIn(List<String> values) {
            addCriterion("C_ENBEL not in", values, "cEnbel");
            return (Criteria) this;
        }

        /**
         * 条件在区间:禁用0 启用1 
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCEnbelBetween(String value1, String value2) {
            addCriterion("C_ENBEL between", value1, value2, "cEnbel");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:禁用0 启用1 
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCEnbelNotBetween(String value1, String value2) {
            addCriterion("C_ENBEL not between", value1, value2, "cEnbel");
            return (Criteria) this;
        }

        /**
         * 条件为空:排序
         * 
         * @return 标准
         */
        public Criteria andLOrderIsNull() {
            addCriterion("L_ORDER is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:排序
         * 
         * @return 标准
         */
        public Criteria andLOrderIsNotNull() {
            addCriterion("L_ORDER is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:排序
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLOrderEqualTo(BigDecimal value) {
            addCriterion("L_ORDER =", value, "lOrder");
            return (Criteria) this;
        }

        /**
         * 条件不相等:排序
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLOrderNotEqualTo(BigDecimal value) {
            addCriterion("L_ORDER <>", value, "lOrder");
            return (Criteria) this;
        }

        /**
         * 条件大于:排序
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLOrderGreaterThan(BigDecimal value) {
            addCriterion("L_ORDER >", value, "lOrder");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:排序
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLOrderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_ORDER >=", value, "lOrder");
            return (Criteria) this;
        }

        /**
         * 条件小于:排序
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLOrderLessThan(BigDecimal value) {
            addCriterion("L_ORDER <", value, "lOrder");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:排序
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLOrderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_ORDER <=", value, "lOrder");
            return (Criteria) this;
        }

        /**
         * 条件在范围:排序
         *
         * @param values 排序
         * @return 标准
         */
        public Criteria andLOrderIn(List<BigDecimal> values) {
            addCriterion("L_ORDER in", values, "lOrder");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:排序
         *
         * @param values 排序
         * @return 标准
         */
        public Criteria andLOrderNotIn(List<BigDecimal> values) {
            addCriterion("L_ORDER not in", values, "lOrder");
            return (Criteria) this;
        }

        /**
         * 条件在区间:排序
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLOrderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_ORDER between", value1, value2, "lOrder");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:排序
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLOrderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_ORDER not between", value1, value2, "lOrder");
            return (Criteria) this;
        }

        /**
         * 条件为空:冻结列
         * 
         * @return 标准
         */
        public Criteria andCIsfrozenIsNull() {
            addCriterion("C_ISFROZEN is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:冻结列
         * 
         * @return 标准
         */
        public Criteria andCIsfrozenIsNotNull() {
            addCriterion("C_ISFROZEN is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:冻结列
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsfrozenEqualTo(String value) {
            addCriterion("C_ISFROZEN =", value, "cIsfrozen");
            return (Criteria) this;
        }

        /**
         * 条件不相等:冻结列
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsfrozenNotEqualTo(String value) {
            addCriterion("C_ISFROZEN <>", value, "cIsfrozen");
            return (Criteria) this;
        }

        /**
         * 条件大于:冻结列
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsfrozenGreaterThan(String value) {
            addCriterion("C_ISFROZEN >", value, "cIsfrozen");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:冻结列
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsfrozenGreaterThanOrEqualTo(String value) {
            addCriterion("C_ISFROZEN >=", value, "cIsfrozen");
            return (Criteria) this;
        }

        /**
         * 条件小于:冻结列
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsfrozenLessThan(String value) {
            addCriterion("C_ISFROZEN <", value, "cIsfrozen");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:冻结列
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsfrozenLessThanOrEqualTo(String value) {
            addCriterion("C_ISFROZEN <=", value, "cIsfrozen");
            return (Criteria) this;
        }

        /**
         * 条件相似:冻结列
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsfrozenLike(String value) {
            addCriterion("C_ISFROZEN like", value, "cIsfrozen");
            return (Criteria) this;
        }

        /**
         * 条件不相似:冻结列
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsfrozenNotLike(String value) {
            addCriterion("C_ISFROZEN not like", value, "cIsfrozen");
            return (Criteria) this;
        }

        /**
         * 条件在范围:冻结列
         *
         * @param values 冻结列
         * @return 标准
         */
        public Criteria andCIsfrozenIn(List<String> values) {
            addCriterion("C_ISFROZEN in", values, "cIsfrozen");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:冻结列
         *
         * @param values 冻结列
         * @return 标准
         */
        public Criteria andCIsfrozenNotIn(List<String> values) {
            addCriterion("C_ISFROZEN not in", values, "cIsfrozen");
            return (Criteria) this;
        }

        /**
         * 条件在区间:冻结列
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCIsfrozenBetween(String value1, String value2) {
            addCriterion("C_ISFROZEN between", value1, value2, "cIsfrozen");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:冻结列
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCIsfrozenNotBetween(String value1, String value2) {
            addCriterion("C_ISFROZEN not between", value1, value2, "cIsfrozen");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCOrderfieldnameIsNull() {
            addCriterion("C_ORDERFIELDNAME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCOrderfieldnameIsNotNull() {
            addCriterion("C_ORDERFIELDNAME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOrderfieldnameEqualTo(String value) {
            addCriterion("C_ORDERFIELDNAME =", value, "cOrderfieldname");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOrderfieldnameNotEqualTo(String value) {
            addCriterion("C_ORDERFIELDNAME <>", value, "cOrderfieldname");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOrderfieldnameGreaterThan(String value) {
            addCriterion("C_ORDERFIELDNAME >", value, "cOrderfieldname");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOrderfieldnameGreaterThanOrEqualTo(String value) {
            addCriterion("C_ORDERFIELDNAME >=", value, "cOrderfieldname");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOrderfieldnameLessThan(String value) {
            addCriterion("C_ORDERFIELDNAME <", value, "cOrderfieldname");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOrderfieldnameLessThanOrEqualTo(String value) {
            addCriterion("C_ORDERFIELDNAME <=", value, "cOrderfieldname");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOrderfieldnameLike(String value) {
            addCriterion("C_ORDERFIELDNAME like", value, "cOrderfieldname");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOrderfieldnameNotLike(String value) {
            addCriterion("C_ORDERFIELDNAME not like", value, "cOrderfieldname");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCOrderfieldnameIn(List<String> values) {
            addCriterion("C_ORDERFIELDNAME in", values, "cOrderfieldname");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCOrderfieldnameNotIn(List<String> values) {
            addCriterion("C_ORDERFIELDNAME not in", values, "cOrderfieldname");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCOrderfieldnameBetween(String value1, String value2) {
            addCriterion("C_ORDERFIELDNAME between", value1, value2, "cOrderfieldname");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCOrderfieldnameNotBetween(String value1, String value2) {
            addCriterion("C_ORDERFIELDNAME not between", value1, value2, "cOrderfieldname");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCIssummaryIsNull() {
            addCriterion("C_ISSUMMARY is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCIssummaryIsNotNull() {
            addCriterion("C_ISSUMMARY is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIssummaryEqualTo(String value) {
            addCriterion("C_ISSUMMARY =", value, "cIssummary");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIssummaryNotEqualTo(String value) {
            addCriterion("C_ISSUMMARY <>", value, "cIssummary");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIssummaryGreaterThan(String value) {
            addCriterion("C_ISSUMMARY >", value, "cIssummary");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIssummaryGreaterThanOrEqualTo(String value) {
            addCriterion("C_ISSUMMARY >=", value, "cIssummary");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIssummaryLessThan(String value) {
            addCriterion("C_ISSUMMARY <", value, "cIssummary");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIssummaryLessThanOrEqualTo(String value) {
            addCriterion("C_ISSUMMARY <=", value, "cIssummary");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIssummaryLike(String value) {
            addCriterion("C_ISSUMMARY like", value, "cIssummary");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIssummaryNotLike(String value) {
            addCriterion("C_ISSUMMARY not like", value, "cIssummary");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCIssummaryIn(List<String> values) {
            addCriterion("C_ISSUMMARY in", values, "cIssummary");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCIssummaryNotIn(List<String> values) {
            addCriterion("C_ISSUMMARY not in", values, "cIssummary");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCIssummaryBetween(String value1, String value2) {
            addCriterion("C_ISSUMMARY between", value1, value2, "cIssummary");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCIssummaryNotBetween(String value1, String value2) {
            addCriterion("C_ISSUMMARY not between", value1, value2, "cIssummary");
            return (Criteria) this;
        }

        /**
         * 条件为空:editgrid更多属性配置
         * 
         * @return 标准
         */
        public Criteria andCCompparamIsNull() {
            addCriterion("C_COMPPARAM is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:editgrid更多属性配置
         * 
         * @return 标准
         */
        public Criteria andCCompparamIsNotNull() {
            addCriterion("C_COMPPARAM is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:editgrid更多属性配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamEqualTo(String value) {
            addCriterion("C_COMPPARAM =", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件不相等:editgrid更多属性配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamNotEqualTo(String value) {
            addCriterion("C_COMPPARAM <>", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件大于:editgrid更多属性配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamGreaterThan(String value) {
            addCriterion("C_COMPPARAM >", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:editgrid更多属性配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamGreaterThanOrEqualTo(String value) {
            addCriterion("C_COMPPARAM >=", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件小于:editgrid更多属性配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamLessThan(String value) {
            addCriterion("C_COMPPARAM <", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:editgrid更多属性配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamLessThanOrEqualTo(String value) {
            addCriterion("C_COMPPARAM <=", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件相似:editgrid更多属性配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamLike(String value) {
            addCriterion("C_COMPPARAM like", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件不相似:editgrid更多属性配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamNotLike(String value) {
            addCriterion("C_COMPPARAM not like", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件在范围:editgrid更多属性配置
         *
         * @param values editgrid更多属性配置
         * @return 标准
         */
        public Criteria andCCompparamIn(List<String> values) {
            addCriterion("C_COMPPARAM in", values, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:editgrid更多属性配置
         *
         * @param values editgrid更多属性配置
         * @return 标准
         */
        public Criteria andCCompparamNotIn(List<String> values) {
            addCriterion("C_COMPPARAM not in", values, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件在区间:editgrid更多属性配置
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCCompparamBetween(String value1, String value2) {
            addCriterion("C_COMPPARAM between", value1, value2, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:editgrid更多属性配置
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCCompparamNotBetween(String value1, String value2) {
            addCriterion("C_COMPPARAM not between", value1, value2, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件为空:editgrid事件配置
         * 
         * @return 标准
         */
        public Criteria andCEventsIsNull() {
            addCriterion("C_EVENTS is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:editgrid事件配置
         * 
         * @return 标准
         */
        public Criteria andCEventsIsNotNull() {
            addCriterion("C_EVENTS is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:editgrid事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsEqualTo(String value) {
            addCriterion("C_EVENTS =", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件不相等:editgrid事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsNotEqualTo(String value) {
            addCriterion("C_EVENTS <>", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件大于:editgrid事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsGreaterThan(String value) {
            addCriterion("C_EVENTS >", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:editgrid事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsGreaterThanOrEqualTo(String value) {
            addCriterion("C_EVENTS >=", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件小于:editgrid事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsLessThan(String value) {
            addCriterion("C_EVENTS <", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:editgrid事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsLessThanOrEqualTo(String value) {
            addCriterion("C_EVENTS <=", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件相似:editgrid事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsLike(String value) {
            addCriterion("C_EVENTS like", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件不相似:editgrid事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsNotLike(String value) {
            addCriterion("C_EVENTS not like", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件在范围:editgrid事件配置
         *
         * @param values editgrid事件配置
         * @return 标准
         */
        public Criteria andCEventsIn(List<String> values) {
            addCriterion("C_EVENTS in", values, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:editgrid事件配置
         *
         * @param values editgrid事件配置
         * @return 标准
         */
        public Criteria andCEventsNotIn(List<String> values) {
            addCriterion("C_EVENTS not in", values, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件在区间:editgrid事件配置
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCEventsBetween(String value1, String value2) {
            addCriterion("C_EVENTS between", value1, value2, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:editgrid事件配置
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCEventsNotBetween(String value1, String value2) {
            addCriterion("C_EVENTS not between", value1, value2, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件为空:editgrid隐藏列配置
         * 
         * @return 标准
         */
        public Criteria andCHiddenIsNull() {
            addCriterion("C_HIDDEN is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:editgrid隐藏列配置
         * 
         * @return 标准
         */
        public Criteria andCHiddenIsNotNull() {
            addCriterion("C_HIDDEN is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:editgrid隐藏列配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenEqualTo(String value) {
            addCriterion("C_HIDDEN =", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件不相等:editgrid隐藏列配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenNotEqualTo(String value) {
            addCriterion("C_HIDDEN <>", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件大于:editgrid隐藏列配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenGreaterThan(String value) {
            addCriterion("C_HIDDEN >", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:editgrid隐藏列配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenGreaterThanOrEqualTo(String value) {
            addCriterion("C_HIDDEN >=", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件小于:editgrid隐藏列配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenLessThan(String value) {
            addCriterion("C_HIDDEN <", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:editgrid隐藏列配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenLessThanOrEqualTo(String value) {
            addCriterion("C_HIDDEN <=", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件相似:editgrid隐藏列配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenLike(String value) {
            addCriterion("C_HIDDEN like", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件不相似:editgrid隐藏列配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenNotLike(String value) {
            addCriterion("C_HIDDEN not like", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件在范围:editgrid隐藏列配置
         *
         * @param values editgrid隐藏列配置
         * @return 标准
         */
        public Criteria andCHiddenIn(List<String> values) {
            addCriterion("C_HIDDEN in", values, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:editgrid隐藏列配置
         *
         * @param values editgrid隐藏列配置
         * @return 标准
         */
        public Criteria andCHiddenNotIn(List<String> values) {
            addCriterion("C_HIDDEN not in", values, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件在区间:editgrid隐藏列配置
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCHiddenBetween(String value1, String value2) {
            addCriterion("C_HIDDEN between", value1, value2, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:editgrid隐藏列配置
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCHiddenNotBetween(String value1, String value2) {
            addCriterion("C_HIDDEN not between", value1, value2, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件为空:默认值（用于editgrid）
         * 
         * @return 标准
         */
        public Criteria andCDefaultvalueIsNull() {
            addCriterion("C_DEFAULTVALUE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:默认值（用于editgrid）
         * 
         * @return 标准
         */
        public Criteria andCDefaultvalueIsNotNull() {
            addCriterion("C_DEFAULTVALUE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:默认值（用于editgrid）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefaultvalueEqualTo(String value) {
            addCriterion("C_DEFAULTVALUE =", value, "cDefaultvalue");
            return (Criteria) this;
        }

        /**
         * 条件不相等:默认值（用于editgrid）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefaultvalueNotEqualTo(String value) {
            addCriterion("C_DEFAULTVALUE <>", value, "cDefaultvalue");
            return (Criteria) this;
        }

        /**
         * 条件大于:默认值（用于editgrid）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefaultvalueGreaterThan(String value) {
            addCriterion("C_DEFAULTVALUE >", value, "cDefaultvalue");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:默认值（用于editgrid）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefaultvalueGreaterThanOrEqualTo(String value) {
            addCriterion("C_DEFAULTVALUE >=", value, "cDefaultvalue");
            return (Criteria) this;
        }

        /**
         * 条件小于:默认值（用于editgrid）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefaultvalueLessThan(String value) {
            addCriterion("C_DEFAULTVALUE <", value, "cDefaultvalue");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:默认值（用于editgrid）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefaultvalueLessThanOrEqualTo(String value) {
            addCriterion("C_DEFAULTVALUE <=", value, "cDefaultvalue");
            return (Criteria) this;
        }

        /**
         * 条件相似:默认值（用于editgrid）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefaultvalueLike(String value) {
            addCriterion("C_DEFAULTVALUE like", value, "cDefaultvalue");
            return (Criteria) this;
        }

        /**
         * 条件不相似:默认值（用于editgrid）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefaultvalueNotLike(String value) {
            addCriterion("C_DEFAULTVALUE not like", value, "cDefaultvalue");
            return (Criteria) this;
        }

        /**
         * 条件在范围:默认值（用于editgrid）
         *
         * @param values 默认值（用于editgrid）
         * @return 标准
         */
        public Criteria andCDefaultvalueIn(List<String> values) {
            addCriterion("C_DEFAULTVALUE in", values, "cDefaultvalue");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:默认值（用于editgrid）
         *
         * @param values 默认值（用于editgrid）
         * @return 标准
         */
        public Criteria andCDefaultvalueNotIn(List<String> values) {
            addCriterion("C_DEFAULTVALUE not in", values, "cDefaultvalue");
            return (Criteria) this;
        }

        /**
         * 条件在区间:默认值（用于editgrid）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDefaultvalueBetween(String value1, String value2) {
            addCriterion("C_DEFAULTVALUE between", value1, value2, "cDefaultvalue");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:默认值（用于editgrid）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDefaultvalueNotBetween(String value1, String value2) {
            addCriterion("C_DEFAULTVALUE not between", value1, value2, "cDefaultvalue");
            return (Criteria) this;
        }

        /**
         * 条件为空:对比字段
         * 
         * @return 标准
         */
        public Criteria andCComparecolumnIsNull() {
            addCriterion("C_COMPARECOLUMN is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:对比字段
         * 
         * @return 标准
         */
        public Criteria andCComparecolumnIsNotNull() {
            addCriterion("C_COMPARECOLUMN is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:对比字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnEqualTo(String value) {
            addCriterion("C_COMPARECOLUMN =", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件不相等:对比字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnNotEqualTo(String value) {
            addCriterion("C_COMPARECOLUMN <>", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件大于:对比字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnGreaterThan(String value) {
            addCriterion("C_COMPARECOLUMN >", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:对比字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnGreaterThanOrEqualTo(String value) {
            addCriterion("C_COMPARECOLUMN >=", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件小于:对比字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnLessThan(String value) {
            addCriterion("C_COMPARECOLUMN <", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:对比字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnLessThanOrEqualTo(String value) {
            addCriterion("C_COMPARECOLUMN <=", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件相似:对比字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnLike(String value) {
            addCriterion("C_COMPARECOLUMN like", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件不相似:对比字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnNotLike(String value) {
            addCriterion("C_COMPARECOLUMN not like", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件在范围:对比字段
         *
         * @param values 对比字段
         * @return 标准
         */
        public Criteria andCComparecolumnIn(List<String> values) {
            addCriterion("C_COMPARECOLUMN in", values, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:对比字段
         *
         * @param values 对比字段
         * @return 标准
         */
        public Criteria andCComparecolumnNotIn(List<String> values) {
            addCriterion("C_COMPARECOLUMN not in", values, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件在区间:对比字段
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCComparecolumnBetween(String value1, String value2) {
            addCriterion("C_COMPARECOLUMN between", value1, value2, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:对比字段
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCComparecolumnNotBetween(String value1, String value2) {
            addCriterion("C_COMPARECOLUMN not between", value1, value2, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件为空:0或空:不可编辑； 1:可编辑
         * 
         * @return 标准
         */
        public Criteria andCEditIsNull() {
            addCriterion("C_EDIT is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:0或空:不可编辑； 1:可编辑
         * 
         * @return 标准
         */
        public Criteria andCEditIsNotNull() {
            addCriterion("C_EDIT is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:0或空:不可编辑； 1:可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditEqualTo(String value) {
            addCriterion("C_EDIT =", value, "cEdit");
            return (Criteria) this;
        }

        /**
         * 条件不相等:0或空:不可编辑； 1:可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditNotEqualTo(String value) {
            addCriterion("C_EDIT <>", value, "cEdit");
            return (Criteria) this;
        }

        /**
         * 条件大于:0或空:不可编辑； 1:可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditGreaterThan(String value) {
            addCriterion("C_EDIT >", value, "cEdit");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:0或空:不可编辑； 1:可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditGreaterThanOrEqualTo(String value) {
            addCriterion("C_EDIT >=", value, "cEdit");
            return (Criteria) this;
        }

        /**
         * 条件小于:0或空:不可编辑； 1:可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditLessThan(String value) {
            addCriterion("C_EDIT <", value, "cEdit");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:0或空:不可编辑； 1:可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditLessThanOrEqualTo(String value) {
            addCriterion("C_EDIT <=", value, "cEdit");
            return (Criteria) this;
        }

        /**
         * 条件相似:0或空:不可编辑； 1:可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditLike(String value) {
            addCriterion("C_EDIT like", value, "cEdit");
            return (Criteria) this;
        }

        /**
         * 条件不相似:0或空:不可编辑； 1:可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditNotLike(String value) {
            addCriterion("C_EDIT not like", value, "cEdit");
            return (Criteria) this;
        }

        /**
         * 条件在范围:0或空:不可编辑； 1:可编辑
         *
         * @param values 0或空:不可编辑； 1:可编辑
         * @return 标准
         */
        public Criteria andCEditIn(List<String> values) {
            addCriterion("C_EDIT in", values, "cEdit");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:0或空:不可编辑； 1:可编辑
         *
         * @param values 0或空:不可编辑； 1:可编辑
         * @return 标准
         */
        public Criteria andCEditNotIn(List<String> values) {
            addCriterion("C_EDIT not in", values, "cEdit");
            return (Criteria) this;
        }

        /**
         * 条件在区间:0或空:不可编辑； 1:可编辑
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCEditBetween(String value1, String value2) {
            addCriterion("C_EDIT between", value1, value2, "cEdit");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:0或空:不可编辑； 1:可编辑
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCEditNotBetween(String value1, String value2) {
            addCriterion("C_EDIT not between", value1, value2, "cEdit");
            return (Criteria) this;
        }

        /**
         * 条件为空:可控制显示隐藏,1可以，0不可控制
         * 
         * @return 标准
         */
        public Criteria andCCanshoworhideIsNull() {
            addCriterion("C_CANSHOWORHIDE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:可控制显示隐藏,1可以，0不可控制
         * 
         * @return 标准
         */
        public Criteria andCCanshoworhideIsNotNull() {
            addCriterion("C_CANSHOWORHIDE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:可控制显示隐藏,1可以，0不可控制
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCanshoworhideEqualTo(String value) {
            addCriterion("C_CANSHOWORHIDE =", value, "cCanshoworhide");
            return (Criteria) this;
        }

        /**
         * 条件不相等:可控制显示隐藏,1可以，0不可控制
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCanshoworhideNotEqualTo(String value) {
            addCriterion("C_CANSHOWORHIDE <>", value, "cCanshoworhide");
            return (Criteria) this;
        }

        /**
         * 条件大于:可控制显示隐藏,1可以，0不可控制
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCanshoworhideGreaterThan(String value) {
            addCriterion("C_CANSHOWORHIDE >", value, "cCanshoworhide");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:可控制显示隐藏,1可以，0不可控制
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCanshoworhideGreaterThanOrEqualTo(String value) {
            addCriterion("C_CANSHOWORHIDE >=", value, "cCanshoworhide");
            return (Criteria) this;
        }

        /**
         * 条件小于:可控制显示隐藏,1可以，0不可控制
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCanshoworhideLessThan(String value) {
            addCriterion("C_CANSHOWORHIDE <", value, "cCanshoworhide");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:可控制显示隐藏,1可以，0不可控制
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCanshoworhideLessThanOrEqualTo(String value) {
            addCriterion("C_CANSHOWORHIDE <=", value, "cCanshoworhide");
            return (Criteria) this;
        }

        /**
         * 条件相似:可控制显示隐藏,1可以，0不可控制
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCanshoworhideLike(String value) {
            addCriterion("C_CANSHOWORHIDE like", value, "cCanshoworhide");
            return (Criteria) this;
        }

        /**
         * 条件不相似:可控制显示隐藏,1可以，0不可控制
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCanshoworhideNotLike(String value) {
            addCriterion("C_CANSHOWORHIDE not like", value, "cCanshoworhide");
            return (Criteria) this;
        }

        /**
         * 条件在范围:可控制显示隐藏,1可以，0不可控制
         *
         * @param values 可控制显示隐藏,1可以，0不可控制
         * @return 标准
         */
        public Criteria andCCanshoworhideIn(List<String> values) {
            addCriterion("C_CANSHOWORHIDE in", values, "cCanshoworhide");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:可控制显示隐藏,1可以，0不可控制
         *
         * @param values 可控制显示隐藏,1可以，0不可控制
         * @return 标准
         */
        public Criteria andCCanshoworhideNotIn(List<String> values) {
            addCriterion("C_CANSHOWORHIDE not in", values, "cCanshoworhide");
            return (Criteria) this;
        }

        /**
         * 条件在区间:可控制显示隐藏,1可以，0不可控制
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCCanshoworhideBetween(String value1, String value2) {
            addCriterion("C_CANSHOWORHIDE between", value1, value2, "cCanshoworhide");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:可控制显示隐藏,1可以，0不可控制
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCCanshoworhideNotBetween(String value1, String value2) {
            addCriterion("C_CANSHOWORHIDE not between", value1, value2, "cCanshoworhide");
            return (Criteria) this;
        }
    }

    /**
     * @Title TQUERYCOLUMN表的创建标准内部类
     * @Description null
     */
    public static class Criteria extends GeneratedCriteria {

        /**
         * 
         */
        protected Criteria() {
            super();
        }
    }

    /**
     * @Title TQUERYCOLUMN表的内部标准类
     * @Description null
     */
    public static class Criterion {
        /**
         * condition 条件
         */
        private String condition;

        /**
         * value 值/起始值
         */
        private Object value;

        /**
         * secondValue 结束值
         */
        private Object secondValue;

        /**
         * noValue 空值
         */
        private boolean noValue;

        /**
         * singleValue 单一值
         */
        private boolean singleValue;

        /**
         * betweenValue 区间比较符
         */
        private boolean betweenValue;

        /**
         * listValue 数组值
         */
        private boolean listValue;

        /**
         * typeHandler 类型处理器
         */
        private String typeHandler;

        /**
         * 获取条件
         * 
         * @return String 条件
         */
        public String getCondition() {
            return condition;
        }

        /**
         * 获取值/起始值
         * 
         * @return Object 值/起始值
         */
        public Object getValue() {
            return value;
        }

        /**
         * 获取结束值
         * 
         * @return Object 结束值
         */
        public Object getSecondValue() {
            return secondValue;
        }

        /**
         * 是否空值
         * 
         * @return boolean 是否空值
         */
        public boolean isNoValue() {
            return noValue;
        }

        /**
         * 是否唯一值
         * 
         * @return boolean 是否唯一值
         */
        public boolean isSingleValue() {
            return singleValue;
        }

        /**
         * 是否区间值
         * 
         * @return boolean 是否区间值
         */
        public boolean isBetweenValue() {
            return betweenValue;
        }

        /**
         * 是否数组值
         * 
         * @return boolean 是否数组值
         */
        public boolean isListValue() {
            return listValue;
        }

        /**
         * 获取处理器
         * 
         * @return String 处理器
         */
        public String getTypeHandler() {
            return typeHandler;
        }

        /**
         * 标准条件类构造方法
         *
         * @param condition 条件
         */
        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        /**
         * 标准条件类构造方法
         *
         * @param condition   条件
         * @param value       值
         * @param typeHandler 处理器
         */
        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        /**
         * 标准条件类构造方法
         *
         * @param condition 条件
         * @param value     值
         */
        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        /**
         * 标准条件类构造方法
         *
         * @param condition   条件
         * @param value       值
         * @param secondValue 结束值
         * @param typeHandler 处理器
         */
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        /**
         * 标准条件类构造方法
         *
         * @param condition   条件
         * @param value       值
         * @param secondValue 结束值
         */
        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}