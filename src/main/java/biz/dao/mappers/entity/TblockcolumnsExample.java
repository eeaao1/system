/*
 * TblockcolumnsExample.java
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
 * @Date 2023-08-15 15:10:39
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
public class TblockcolumnsExample {
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
     * 构造查询条件:TBLOCKCOLUMNS
     */
    public TblockcolumnsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 设置排序字段:TBLOCKCOLUMNS
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 获取排序字段:TBLOCKCOLUMNS
     * 
     * @return String 排序规则
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置过滤重复数据:TBLOCKCOLUMNS
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 是否过滤重复数据:TBLOCKCOLUMNS
     * 
     * @return boolean 是否过滤重复
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获取当前的查询条件实例:TBLOCKCOLUMNS
     * 
     * @return List<Criteria> 获取标准集
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 根据主键来更新符合条件的数据库记录:TBLOCKCOLUMNS
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 根据主键来更新符合条件的数据库记录:TBLOCKCOLUMNS
     * 
     * @return Criteria 标准条件式
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 创建一个查询条件:TBLOCKCOLUMNS
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
     * 内部构建查询条件对象:TBLOCKCOLUMNS
     * 
     * @return Criteria 标准条件式
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除查询条件:TBLOCKCOLUMNS
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @Title TBLOCKCOLUMNS表的创建标准内部类
     * @Description null
     */
    protected abstract static class GeneratedCriteria {
        /**
         * criteria 标准集
         */
        protected List<Criterion> criteria;

        /**
         * 构造查询条件:TBLOCKCOLUMNS
         */
        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        /**
         * 是否验证:TBLOCKCOLUMNS
         * 
         * @return boolean 是否有效
         */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
         * 获取所有条件集:TBLOCKCOLUMNS
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
         * 获取条件集:TBLOCKCOLUMNS
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
         * 增加条件:TBLOCKCOLUMNS
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
         * 增加条件:TBLOCKCOLUMNS
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
         * 增加条件:TBLOCKCOLUMNS
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
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCColumnidIsNull() {
            addCriterion("C_COLUMNID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCColumnidIsNotNull() {
            addCriterion("C_COLUMNID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCColumnidEqualTo(String value) {
            addCriterion("C_COLUMNID =", value, "cColumnid");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCColumnidNotEqualTo(String value) {
            addCriterion("C_COLUMNID <>", value, "cColumnid");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCColumnidGreaterThan(String value) {
            addCriterion("C_COLUMNID >", value, "cColumnid");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCColumnidGreaterThanOrEqualTo(String value) {
            addCriterion("C_COLUMNID >=", value, "cColumnid");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCColumnidLessThan(String value) {
            addCriterion("C_COLUMNID <", value, "cColumnid");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCColumnidLessThanOrEqualTo(String value) {
            addCriterion("C_COLUMNID <=", value, "cColumnid");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCColumnidLike(String value) {
            addCriterion("C_COLUMNID like", value, "cColumnid");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCColumnidNotLike(String value) {
            addCriterion("C_COLUMNID not like", value, "cColumnid");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCColumnidIn(List<String> values) {
            addCriterion("C_COLUMNID in", values, "cColumnid");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCColumnidNotIn(List<String> values) {
            addCriterion("C_COLUMNID not in", values, "cColumnid");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCColumnidBetween(String value1, String value2) {
            addCriterion("C_COLUMNID between", value1, value2, "cColumnid");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCColumnidNotBetween(String value1, String value2) {
            addCriterion("C_COLUMNID not between", value1, value2, "cColumnid");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCBlockidIsNull() {
            addCriterion("C_BLOCKID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCBlockidIsNotNull() {
            addCriterion("C_BLOCKID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidEqualTo(String value) {
            addCriterion("C_BLOCKID =", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidNotEqualTo(String value) {
            addCriterion("C_BLOCKID <>", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidGreaterThan(String value) {
            addCriterion("C_BLOCKID >", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidGreaterThanOrEqualTo(String value) {
            addCriterion("C_BLOCKID >=", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidLessThan(String value) {
            addCriterion("C_BLOCKID <", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidLessThanOrEqualTo(String value) {
            addCriterion("C_BLOCKID <=", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidLike(String value) {
            addCriterion("C_BLOCKID like", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidNotLike(String value) {
            addCriterion("C_BLOCKID not like", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCBlockidIn(List<String> values) {
            addCriterion("C_BLOCKID in", values, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCBlockidNotIn(List<String> values) {
            addCriterion("C_BLOCKID not in", values, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCBlockidBetween(String value1, String value2) {
            addCriterion("C_BLOCKID between", value1, value2, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCBlockidNotBetween(String value1, String value2) {
            addCriterion("C_BLOCKID not between", value1, value2, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andLNumIsNull() {
            addCriterion("L_NUM is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andLNumIsNotNull() {
            addCriterion("L_NUM is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLNumEqualTo(BigDecimal value) {
            addCriterion("L_NUM =", value, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLNumNotEqualTo(BigDecimal value) {
            addCriterion("L_NUM <>", value, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLNumGreaterThan(BigDecimal value) {
            addCriterion("L_NUM >", value, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_NUM >=", value, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLNumLessThan(BigDecimal value) {
            addCriterion("L_NUM <", value, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_NUM <=", value, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLNumIn(List<BigDecimal> values) {
            addCriterion("L_NUM in", values, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLNumNotIn(List<BigDecimal> values) {
            addCriterion("L_NUM not in", values, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_NUM between", value1, value2, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_NUM not between", value1, value2, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andLColsIsNull() {
            addCriterion("L_COLS is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andLColsIsNotNull() {
            addCriterion("L_COLS is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLColsEqualTo(BigDecimal value) {
            addCriterion("L_COLS =", value, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLColsNotEqualTo(BigDecimal value) {
            addCriterion("L_COLS <>", value, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLColsGreaterThan(BigDecimal value) {
            addCriterion("L_COLS >", value, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLColsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_COLS >=", value, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLColsLessThan(BigDecimal value) {
            addCriterion("L_COLS <", value, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLColsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_COLS <=", value, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLColsIn(List<BigDecimal> values) {
            addCriterion("L_COLS in", values, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLColsNotIn(List<BigDecimal> values) {
            addCriterion("L_COLS not in", values, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLColsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_COLS between", value1, value2, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLColsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_COLS not between", value1, value2, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCIsjrescomponentIsNull() {
            addCriterion("C_ISJRESCOMPONENT is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCIsjrescomponentIsNotNull() {
            addCriterion("C_ISJRESCOMPONENT is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentEqualTo(String value) {
            addCriterion("C_ISJRESCOMPONENT =", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentNotEqualTo(String value) {
            addCriterion("C_ISJRESCOMPONENT <>", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentGreaterThan(String value) {
            addCriterion("C_ISJRESCOMPONENT >", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentGreaterThanOrEqualTo(String value) {
            addCriterion("C_ISJRESCOMPONENT >=", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentLessThan(String value) {
            addCriterion("C_ISJRESCOMPONENT <", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentLessThanOrEqualTo(String value) {
            addCriterion("C_ISJRESCOMPONENT <=", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentLike(String value) {
            addCriterion("C_ISJRESCOMPONENT like", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentNotLike(String value) {
            addCriterion("C_ISJRESCOMPONENT not like", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCIsjrescomponentIn(List<String> values) {
            addCriterion("C_ISJRESCOMPONENT in", values, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCIsjrescomponentNotIn(List<String> values) {
            addCriterion("C_ISJRESCOMPONENT not in", values, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCIsjrescomponentBetween(String value1, String value2) {
            addCriterion("C_ISJRESCOMPONENT between", value1, value2, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCIsjrescomponentNotBetween(String value1, String value2) {
            addCriterion("C_ISJRESCOMPONENT not between", value1, value2, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCComponenttypeIsNull() {
            addCriterion("C_COMPONENTTYPE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCComponenttypeIsNotNull() {
            addCriterion("C_COMPONENTTYPE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeEqualTo(String value) {
            addCriterion("C_COMPONENTTYPE =", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeNotEqualTo(String value) {
            addCriterion("C_COMPONENTTYPE <>", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeGreaterThan(String value) {
            addCriterion("C_COMPONENTTYPE >", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_COMPONENTTYPE >=", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeLessThan(String value) {
            addCriterion("C_COMPONENTTYPE <", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeLessThanOrEqualTo(String value) {
            addCriterion("C_COMPONENTTYPE <=", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeLike(String value) {
            addCriterion("C_COMPONENTTYPE like", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeNotLike(String value) {
            addCriterion("C_COMPONENTTYPE not like", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCComponenttypeIn(List<String> values) {
            addCriterion("C_COMPONENTTYPE in", values, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCComponenttypeNotIn(List<String> values) {
            addCriterion("C_COMPONENTTYPE not in", values, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCComponenttypeBetween(String value1, String value2) {
            addCriterion("C_COMPONENTTYPE between", value1, value2, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCComponenttypeNotBetween(String value1, String value2) {
            addCriterion("C_COMPONENTTYPE not between", value1, value2, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCInvisibleIsNull() {
            addCriterion("C_INVISIBLE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCInvisibleIsNotNull() {
            addCriterion("C_INVISIBLE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleEqualTo(String value) {
            addCriterion("C_INVISIBLE =", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleNotEqualTo(String value) {
            addCriterion("C_INVISIBLE <>", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleGreaterThan(String value) {
            addCriterion("C_INVISIBLE >", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleGreaterThanOrEqualTo(String value) {
            addCriterion("C_INVISIBLE >=", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleLessThan(String value) {
            addCriterion("C_INVISIBLE <", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleLessThanOrEqualTo(String value) {
            addCriterion("C_INVISIBLE <=", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleLike(String value) {
            addCriterion("C_INVISIBLE like", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleNotLike(String value) {
            addCriterion("C_INVISIBLE not like", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCInvisibleIn(List<String> values) {
            addCriterion("C_INVISIBLE in", values, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCInvisibleNotIn(List<String> values) {
            addCriterion("C_INVISIBLE not in", values, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCInvisibleBetween(String value1, String value2) {
            addCriterion("C_INVISIBLE between", value1, value2, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCInvisibleNotBetween(String value1, String value2) {
            addCriterion("C_INVISIBLE not between", value1, value2, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCLabelIsNull() {
            addCriterion("C_LABEL is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCLabelIsNotNull() {
            addCriterion("C_LABEL is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelEqualTo(String value) {
            addCriterion("C_LABEL =", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelNotEqualTo(String value) {
            addCriterion("C_LABEL <>", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelGreaterThan(String value) {
            addCriterion("C_LABEL >", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelGreaterThanOrEqualTo(String value) {
            addCriterion("C_LABEL >=", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelLessThan(String value) {
            addCriterion("C_LABEL <", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelLessThanOrEqualTo(String value) {
            addCriterion("C_LABEL <=", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelLike(String value) {
            addCriterion("C_LABEL like", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelNotLike(String value) {
            addCriterion("C_LABEL not like", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCLabelIn(List<String> values) {
            addCriterion("C_LABEL in", values, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCLabelNotIn(List<String> values) {
            addCriterion("C_LABEL not in", values, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
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
         * 条件不在区间:null
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
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCCheckIsNull() {
            addCriterion("C_CHECK is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCCheckIsNotNull() {
            addCriterion("C_CHECK is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckEqualTo(String value) {
            addCriterion("C_CHECK =", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckNotEqualTo(String value) {
            addCriterion("C_CHECK <>", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckGreaterThan(String value) {
            addCriterion("C_CHECK >", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHECK >=", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckLessThan(String value) {
            addCriterion("C_CHECK <", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckLessThanOrEqualTo(String value) {
            addCriterion("C_CHECK <=", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckLike(String value) {
            addCriterion("C_CHECK like", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckNotLike(String value) {
            addCriterion("C_CHECK not like", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCCheckIn(List<String> values) {
            addCriterion("C_CHECK in", values, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCCheckNotIn(List<String> values) {
            addCriterion("C_CHECK not in", values, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
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
         * 条件不在区间:null
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
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCValueIsNull() {
            addCriterion("C_VALUE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCValueIsNotNull() {
            addCriterion("C_VALUE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueEqualTo(String value) {
            addCriterion("C_VALUE =", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueNotEqualTo(String value) {
            addCriterion("C_VALUE <>", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueGreaterThan(String value) {
            addCriterion("C_VALUE >", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueGreaterThanOrEqualTo(String value) {
            addCriterion("C_VALUE >=", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueLessThan(String value) {
            addCriterion("C_VALUE <", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueLessThanOrEqualTo(String value) {
            addCriterion("C_VALUE <=", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueLike(String value) {
            addCriterion("C_VALUE like", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueNotLike(String value) {
            addCriterion("C_VALUE not like", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCValueIn(List<String> values) {
            addCriterion("C_VALUE in", values, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCValueNotIn(List<String> values) {
            addCriterion("C_VALUE not in", values, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCValueBetween(String value1, String value2) {
            addCriterion("C_VALUE between", value1, value2, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCValueNotBetween(String value1, String value2) {
            addCriterion("C_VALUE not between", value1, value2, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCNameIsNull() {
            addCriterion("C_NAME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCNameIsNotNull() {
            addCriterion("C_NAME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameEqualTo(String value) {
            addCriterion("C_NAME =", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("C_NAME <>", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameGreaterThan(String value) {
            addCriterion("C_NAME >", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME >=", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameLessThan(String value) {
            addCriterion("C_NAME <", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("C_NAME <=", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameLike(String value) {
            addCriterion("C_NAME like", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameNotLike(String value) {
            addCriterion("C_NAME not like", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCNameIn(List<String> values) {
            addCriterion("C_NAME in", values, "cName");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("C_NAME not in", values, "cName");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
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
         * 条件不在区间:null
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
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCDictnameIsNull() {
            addCriterion("C_DICTNAME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCDictnameIsNotNull() {
            addCriterion("C_DICTNAME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameEqualTo(String value) {
            addCriterion("C_DICTNAME =", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameNotEqualTo(String value) {
            addCriterion("C_DICTNAME <>", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameGreaterThan(String value) {
            addCriterion("C_DICTNAME >", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameGreaterThanOrEqualTo(String value) {
            addCriterion("C_DICTNAME >=", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameLessThan(String value) {
            addCriterion("C_DICTNAME <", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameLessThanOrEqualTo(String value) {
            addCriterion("C_DICTNAME <=", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameLike(String value) {
            addCriterion("C_DICTNAME like", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameNotLike(String value) {
            addCriterion("C_DICTNAME not like", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCDictnameIn(List<String> values) {
            addCriterion("C_DICTNAME in", values, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCDictnameNotIn(List<String> values) {
            addCriterion("C_DICTNAME not in", values, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
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
         * 条件不在区间:null
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
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCItemsIsNull() {
            addCriterion("C_ITEMS is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCItemsIsNotNull() {
            addCriterion("C_ITEMS is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsEqualTo(String value) {
            addCriterion("C_ITEMS =", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsNotEqualTo(String value) {
            addCriterion("C_ITEMS <>", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsGreaterThan(String value) {
            addCriterion("C_ITEMS >", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsGreaterThanOrEqualTo(String value) {
            addCriterion("C_ITEMS >=", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsLessThan(String value) {
            addCriterion("C_ITEMS <", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsLessThanOrEqualTo(String value) {
            addCriterion("C_ITEMS <=", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsLike(String value) {
            addCriterion("C_ITEMS like", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsNotLike(String value) {
            addCriterion("C_ITEMS not like", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCItemsIn(List<String> values) {
            addCriterion("C_ITEMS in", values, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCItemsNotIn(List<String> values) {
            addCriterion("C_ITEMS not in", values, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCItemsBetween(String value1, String value2) {
            addCriterion("C_ITEMS between", value1, value2, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCItemsNotBetween(String value1, String value2) {
            addCriterion("C_ITEMS not between", value1, value2, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCEventIsNull() {
            addCriterion("C_EVENT is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCEventIsNotNull() {
            addCriterion("C_EVENT is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventEqualTo(String value) {
            addCriterion("C_EVENT =", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventNotEqualTo(String value) {
            addCriterion("C_EVENT <>", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventGreaterThan(String value) {
            addCriterion("C_EVENT >", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventGreaterThanOrEqualTo(String value) {
            addCriterion("C_EVENT >=", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventLessThan(String value) {
            addCriterion("C_EVENT <", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventLessThanOrEqualTo(String value) {
            addCriterion("C_EVENT <=", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventLike(String value) {
            addCriterion("C_EVENT like", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventNotLike(String value) {
            addCriterion("C_EVENT not like", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCEventIn(List<String> values) {
            addCriterion("C_EVENT in", values, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCEventNotIn(List<String> values) {
            addCriterion("C_EVENT not in", values, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
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
         * 条件不在区间:null
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
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCEventsIsNull() {
            addCriterion("C_EVENTS is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCEventsIsNotNull() {
            addCriterion("C_EVENTS is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsEqualTo(String value) {
            addCriterion("C_EVENTS =", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsNotEqualTo(String value) {
            addCriterion("C_EVENTS <>", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsGreaterThan(String value) {
            addCriterion("C_EVENTS >", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsGreaterThanOrEqualTo(String value) {
            addCriterion("C_EVENTS >=", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsLessThan(String value) {
            addCriterion("C_EVENTS <", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsLessThanOrEqualTo(String value) {
            addCriterion("C_EVENTS <=", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsLike(String value) {
            addCriterion("C_EVENTS like", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsNotLike(String value) {
            addCriterion("C_EVENTS not like", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCEventsIn(List<String> values) {
            addCriterion("C_EVENTS in", values, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCEventsNotIn(List<String> values) {
            addCriterion("C_EVENTS not in", values, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
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
         * 条件不在区间:null
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
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCComponentidIsNull() {
            addCriterion("C_COMPONENTID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCComponentidIsNotNull() {
            addCriterion("C_COMPONENTID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidEqualTo(String value) {
            addCriterion("C_COMPONENTID =", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidNotEqualTo(String value) {
            addCriterion("C_COMPONENTID <>", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidGreaterThan(String value) {
            addCriterion("C_COMPONENTID >", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidGreaterThanOrEqualTo(String value) {
            addCriterion("C_COMPONENTID >=", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidLessThan(String value) {
            addCriterion("C_COMPONENTID <", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidLessThanOrEqualTo(String value) {
            addCriterion("C_COMPONENTID <=", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidLike(String value) {
            addCriterion("C_COMPONENTID like", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidNotLike(String value) {
            addCriterion("C_COMPONENTID not like", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCComponentidIn(List<String> values) {
            addCriterion("C_COMPONENTID in", values, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCComponentidNotIn(List<String> values) {
            addCriterion("C_COMPONENTID not in", values, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCComponentidBetween(String value1, String value2) {
            addCriterion("C_COMPONENTID between", value1, value2, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCComponentidNotBetween(String value1, String value2) {
            addCriterion("C_COMPONENTID not between", value1, value2, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCDisabledIsNull() {
            addCriterion("C_DISABLED is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCDisabledIsNotNull() {
            addCriterion("C_DISABLED is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledEqualTo(String value) {
            addCriterion("C_DISABLED =", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledNotEqualTo(String value) {
            addCriterion("C_DISABLED <>", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledGreaterThan(String value) {
            addCriterion("C_DISABLED >", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledGreaterThanOrEqualTo(String value) {
            addCriterion("C_DISABLED >=", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledLessThan(String value) {
            addCriterion("C_DISABLED <", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledLessThanOrEqualTo(String value) {
            addCriterion("C_DISABLED <=", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledLike(String value) {
            addCriterion("C_DISABLED like", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledNotLike(String value) {
            addCriterion("C_DISABLED not like", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCDisabledIn(List<String> values) {
            addCriterion("C_DISABLED in", values, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCDisabledNotIn(List<String> values) {
            addCriterion("C_DISABLED not in", values, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDisabledBetween(String value1, String value2) {
            addCriterion("C_DISABLED between", value1, value2, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDisabledNotBetween(String value1, String value2) {
            addCriterion("C_DISABLED not between", value1, value2, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andLMaxlengthIsNull() {
            addCriterion("L_MAXLENGTH is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andLMaxlengthIsNotNull() {
            addCriterion("L_MAXLENGTH is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLMaxlengthEqualTo(BigDecimal value) {
            addCriterion("L_MAXLENGTH =", value, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLMaxlengthNotEqualTo(BigDecimal value) {
            addCriterion("L_MAXLENGTH <>", value, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLMaxlengthGreaterThan(BigDecimal value) {
            addCriterion("L_MAXLENGTH >", value, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLMaxlengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_MAXLENGTH >=", value, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLMaxlengthLessThan(BigDecimal value) {
            addCriterion("L_MAXLENGTH <", value, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLMaxlengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_MAXLENGTH <=", value, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLMaxlengthIn(List<BigDecimal> values) {
            addCriterion("L_MAXLENGTH in", values, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLMaxlengthNotIn(List<BigDecimal> values) {
            addCriterion("L_MAXLENGTH not in", values, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLMaxlengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_MAXLENGTH between", value1, value2, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLMaxlengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_MAXLENGTH not between", value1, value2, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCSqlIsNull() {
            addCriterion("C_SQL is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCSqlIsNotNull() {
            addCriterion("C_SQL is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlEqualTo(String value) {
            addCriterion("C_SQL =", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlNotEqualTo(String value) {
            addCriterion("C_SQL <>", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlGreaterThan(String value) {
            addCriterion("C_SQL >", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlGreaterThanOrEqualTo(String value) {
            addCriterion("C_SQL >=", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlLessThan(String value) {
            addCriterion("C_SQL <", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlLessThanOrEqualTo(String value) {
            addCriterion("C_SQL <=", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlLike(String value) {
            addCriterion("C_SQL like", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlNotLike(String value) {
            addCriterion("C_SQL not like", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCSqlIn(List<String> values) {
            addCriterion("C_SQL in", values, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCSqlNotIn(List<String> values) {
            addCriterion("C_SQL not in", values, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCSqlBetween(String value1, String value2) {
            addCriterion("C_SQL between", value1, value2, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCSqlNotBetween(String value1, String value2) {
            addCriterion("C_SQL not between", value1, value2, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCAfterclearIsNull() {
            addCriterion("C_AFTERCLEAR is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCAfterclearIsNotNull() {
            addCriterion("C_AFTERCLEAR is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearEqualTo(String value) {
            addCriterion("C_AFTERCLEAR =", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearNotEqualTo(String value) {
            addCriterion("C_AFTERCLEAR <>", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearGreaterThan(String value) {
            addCriterion("C_AFTERCLEAR >", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearGreaterThanOrEqualTo(String value) {
            addCriterion("C_AFTERCLEAR >=", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearLessThan(String value) {
            addCriterion("C_AFTERCLEAR <", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearLessThanOrEqualTo(String value) {
            addCriterion("C_AFTERCLEAR <=", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearLike(String value) {
            addCriterion("C_AFTERCLEAR like", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearNotLike(String value) {
            addCriterion("C_AFTERCLEAR not like", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCAfterclearIn(List<String> values) {
            addCriterion("C_AFTERCLEAR in", values, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCAfterclearNotIn(List<String> values) {
            addCriterion("C_AFTERCLEAR not in", values, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCAfterclearBetween(String value1, String value2) {
            addCriterion("C_AFTERCLEAR between", value1, value2, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCAfterclearNotBetween(String value1, String value2) {
            addCriterion("C_AFTERCLEAR not between", value1, value2, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCSelectonchangeIsNull() {
            addCriterion("C_SELECTONCHANGE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCSelectonchangeIsNotNull() {
            addCriterion("C_SELECTONCHANGE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeEqualTo(String value) {
            addCriterion("C_SELECTONCHANGE =", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeNotEqualTo(String value) {
            addCriterion("C_SELECTONCHANGE <>", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeGreaterThan(String value) {
            addCriterion("C_SELECTONCHANGE >", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeGreaterThanOrEqualTo(String value) {
            addCriterion("C_SELECTONCHANGE >=", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeLessThan(String value) {
            addCriterion("C_SELECTONCHANGE <", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeLessThanOrEqualTo(String value) {
            addCriterion("C_SELECTONCHANGE <=", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeLike(String value) {
            addCriterion("C_SELECTONCHANGE like", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeNotLike(String value) {
            addCriterion("C_SELECTONCHANGE not like", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCSelectonchangeIn(List<String> values) {
            addCriterion("C_SELECTONCHANGE in", values, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCSelectonchangeNotIn(List<String> values) {
            addCriterion("C_SELECTONCHANGE not in", values, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCSelectonchangeBetween(String value1, String value2) {
            addCriterion("C_SELECTONCHANGE between", value1, value2, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCSelectonchangeNotBetween(String value1, String value2) {
            addCriterion("C_SELECTONCHANGE not between", value1, value2, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCMosaiccolumnIsNull() {
            addCriterion("C_MOSAICCOLUMN is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCMosaiccolumnIsNotNull() {
            addCriterion("C_MOSAICCOLUMN is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnEqualTo(String value) {
            addCriterion("C_MOSAICCOLUMN =", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnNotEqualTo(String value) {
            addCriterion("C_MOSAICCOLUMN <>", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnGreaterThan(String value) {
            addCriterion("C_MOSAICCOLUMN >", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnGreaterThanOrEqualTo(String value) {
            addCriterion("C_MOSAICCOLUMN >=", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnLessThan(String value) {
            addCriterion("C_MOSAICCOLUMN <", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnLessThanOrEqualTo(String value) {
            addCriterion("C_MOSAICCOLUMN <=", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnLike(String value) {
            addCriterion("C_MOSAICCOLUMN like", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnNotLike(String value) {
            addCriterion("C_MOSAICCOLUMN not like", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCMosaiccolumnIn(List<String> values) {
            addCriterion("C_MOSAICCOLUMN in", values, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCMosaiccolumnNotIn(List<String> values) {
            addCriterion("C_MOSAICCOLUMN not in", values, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCMosaiccolumnBetween(String value1, String value2) {
            addCriterion("C_MOSAICCOLUMN between", value1, value2, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCMosaiccolumnNotBetween(String value1, String value2) {
            addCriterion("C_MOSAICCOLUMN not between", value1, value2, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCTablenameIsNull() {
            addCriterion("C_TABLENAME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCTablenameIsNotNull() {
            addCriterion("C_TABLENAME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameEqualTo(String value) {
            addCriterion("C_TABLENAME =", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameNotEqualTo(String value) {
            addCriterion("C_TABLENAME <>", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameGreaterThan(String value) {
            addCriterion("C_TABLENAME >", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("C_TABLENAME >=", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameLessThan(String value) {
            addCriterion("C_TABLENAME <", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameLessThanOrEqualTo(String value) {
            addCriterion("C_TABLENAME <=", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameLike(String value) {
            addCriterion("C_TABLENAME like", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameNotLike(String value) {
            addCriterion("C_TABLENAME not like", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCTablenameIn(List<String> values) {
            addCriterion("C_TABLENAME in", values, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCTablenameNotIn(List<String> values) {
            addCriterion("C_TABLENAME not in", values, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCTablenameBetween(String value1, String value2) {
            addCriterion("C_TABLENAME between", value1, value2, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCTablenameNotBetween(String value1, String value2) {
            addCriterion("C_TABLENAME not between", value1, value2, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCComparecolumnIsNull() {
            addCriterion("C_COMPARECOLUMN is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCComparecolumnIsNotNull() {
            addCriterion("C_COMPARECOLUMN is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnEqualTo(String value) {
            addCriterion("C_COMPARECOLUMN =", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnNotEqualTo(String value) {
            addCriterion("C_COMPARECOLUMN <>", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnGreaterThan(String value) {
            addCriterion("C_COMPARECOLUMN >", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnGreaterThanOrEqualTo(String value) {
            addCriterion("C_COMPARECOLUMN >=", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnLessThan(String value) {
            addCriterion("C_COMPARECOLUMN <", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnLessThanOrEqualTo(String value) {
            addCriterion("C_COMPARECOLUMN <=", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnLike(String value) {
            addCriterion("C_COMPARECOLUMN like", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnNotLike(String value) {
            addCriterion("C_COMPARECOLUMN not like", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCComparecolumnIn(List<String> values) {
            addCriterion("C_COMPARECOLUMN in", values, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCComparecolumnNotIn(List<String> values) {
            addCriterion("C_COMPARECOLUMN not in", values, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
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
         * 条件不在区间:null
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
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andLIntegernumIsNull() {
            addCriterion("L_INTEGERNUM is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andLIntegernumIsNotNull() {
            addCriterion("L_INTEGERNUM is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLIntegernumEqualTo(BigDecimal value) {
            addCriterion("L_INTEGERNUM =", value, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLIntegernumNotEqualTo(BigDecimal value) {
            addCriterion("L_INTEGERNUM <>", value, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLIntegernumGreaterThan(BigDecimal value) {
            addCriterion("L_INTEGERNUM >", value, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLIntegernumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_INTEGERNUM >=", value, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLIntegernumLessThan(BigDecimal value) {
            addCriterion("L_INTEGERNUM <", value, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLIntegernumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_INTEGERNUM <=", value, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLIntegernumIn(List<BigDecimal> values) {
            addCriterion("L_INTEGERNUM in", values, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLIntegernumNotIn(List<BigDecimal> values) {
            addCriterion("L_INTEGERNUM not in", values, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLIntegernumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_INTEGERNUM between", value1, value2, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLIntegernumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_INTEGERNUM not between", value1, value2, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andLSuffixnumIsNull() {
            addCriterion("L_SUFFIXNUM is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andLSuffixnumIsNotNull() {
            addCriterion("L_SUFFIXNUM is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSuffixnumEqualTo(BigDecimal value) {
            addCriterion("L_SUFFIXNUM =", value, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSuffixnumNotEqualTo(BigDecimal value) {
            addCriterion("L_SUFFIXNUM <>", value, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSuffixnumGreaterThan(BigDecimal value) {
            addCriterion("L_SUFFIXNUM >", value, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSuffixnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_SUFFIXNUM >=", value, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSuffixnumLessThan(BigDecimal value) {
            addCriterion("L_SUFFIXNUM <", value, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSuffixnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_SUFFIXNUM <=", value, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLSuffixnumIn(List<BigDecimal> values) {
            addCriterion("L_SUFFIXNUM in", values, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLSuffixnumNotIn(List<BigDecimal> values) {
            addCriterion("L_SUFFIXNUM not in", values, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLSuffixnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_SUFFIXNUM between", value1, value2, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLSuffixnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_SUFFIXNUM not between", value1, value2, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCChgeventidIsNull() {
            addCriterion("C_CHGEVENTID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCChgeventidIsNotNull() {
            addCriterion("C_CHGEVENTID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidEqualTo(String value) {
            addCriterion("C_CHGEVENTID =", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidNotEqualTo(String value) {
            addCriterion("C_CHGEVENTID <>", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidGreaterThan(String value) {
            addCriterion("C_CHGEVENTID >", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHGEVENTID >=", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidLessThan(String value) {
            addCriterion("C_CHGEVENTID <", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidLessThanOrEqualTo(String value) {
            addCriterion("C_CHGEVENTID <=", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidLike(String value) {
            addCriterion("C_CHGEVENTID like", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidNotLike(String value) {
            addCriterion("C_CHGEVENTID not like", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCChgeventidIn(List<String> values) {
            addCriterion("C_CHGEVENTID in", values, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCChgeventidNotIn(List<String> values) {
            addCriterion("C_CHGEVENTID not in", values, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCChgeventidBetween(String value1, String value2) {
            addCriterion("C_CHGEVENTID between", value1, value2, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCChgeventidNotBetween(String value1, String value2) {
            addCriterion("C_CHGEVENTID not between", value1, value2, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCViewflagIsNull() {
            addCriterion("C_VIEWFLAG is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCViewflagIsNotNull() {
            addCriterion("C_VIEWFLAG is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagEqualTo(String value) {
            addCriterion("C_VIEWFLAG =", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagNotEqualTo(String value) {
            addCriterion("C_VIEWFLAG <>", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagGreaterThan(String value) {
            addCriterion("C_VIEWFLAG >", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagGreaterThanOrEqualTo(String value) {
            addCriterion("C_VIEWFLAG >=", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagLessThan(String value) {
            addCriterion("C_VIEWFLAG <", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagLessThanOrEqualTo(String value) {
            addCriterion("C_VIEWFLAG <=", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagLike(String value) {
            addCriterion("C_VIEWFLAG like", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagNotLike(String value) {
            addCriterion("C_VIEWFLAG not like", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCViewflagIn(List<String> values) {
            addCriterion("C_VIEWFLAG in", values, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCViewflagNotIn(List<String> values) {
            addCriterion("C_VIEWFLAG not in", values, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCViewflagBetween(String value1, String value2) {
            addCriterion("C_VIEWFLAG between", value1, value2, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCViewflagNotBetween(String value1, String value2) {
            addCriterion("C_VIEWFLAG not between", value1, value2, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCTipsIsNull() {
            addCriterion("C_TIPS is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCTipsIsNotNull() {
            addCriterion("C_TIPS is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsEqualTo(String value) {
            addCriterion("C_TIPS =", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsNotEqualTo(String value) {
            addCriterion("C_TIPS <>", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsGreaterThan(String value) {
            addCriterion("C_TIPS >", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsGreaterThanOrEqualTo(String value) {
            addCriterion("C_TIPS >=", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsLessThan(String value) {
            addCriterion("C_TIPS <", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsLessThanOrEqualTo(String value) {
            addCriterion("C_TIPS <=", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsLike(String value) {
            addCriterion("C_TIPS like", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsNotLike(String value) {
            addCriterion("C_TIPS not like", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCTipsIn(List<String> values) {
            addCriterion("C_TIPS in", values, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCTipsNotIn(List<String> values) {
            addCriterion("C_TIPS not in", values, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCTipsBetween(String value1, String value2) {
            addCriterion("C_TIPS between", value1, value2, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCTipsNotBetween(String value1, String value2) {
            addCriterion("C_TIPS not between", value1, value2, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCHiddenIsNull() {
            addCriterion("C_HIDDEN is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCHiddenIsNotNull() {
            addCriterion("C_HIDDEN is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenEqualTo(String value) {
            addCriterion("C_HIDDEN =", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenNotEqualTo(String value) {
            addCriterion("C_HIDDEN <>", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenGreaterThan(String value) {
            addCriterion("C_HIDDEN >", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenGreaterThanOrEqualTo(String value) {
            addCriterion("C_HIDDEN >=", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenLessThan(String value) {
            addCriterion("C_HIDDEN <", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenLessThanOrEqualTo(String value) {
            addCriterion("C_HIDDEN <=", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenLike(String value) {
            addCriterion("C_HIDDEN like", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenNotLike(String value) {
            addCriterion("C_HIDDEN not like", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCHiddenIn(List<String> values) {
            addCriterion("C_HIDDEN in", values, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCHiddenNotIn(List<String> values) {
            addCriterion("C_HIDDEN not in", values, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
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
         * 条件不在区间:null
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
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCCompparamIsNull() {
            addCriterion("C_COMPPARAM is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCCompparamIsNotNull() {
            addCriterion("C_COMPPARAM is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamEqualTo(String value) {
            addCriterion("C_COMPPARAM =", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamNotEqualTo(String value) {
            addCriterion("C_COMPPARAM <>", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamGreaterThan(String value) {
            addCriterion("C_COMPPARAM >", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamGreaterThanOrEqualTo(String value) {
            addCriterion("C_COMPPARAM >=", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamLessThan(String value) {
            addCriterion("C_COMPPARAM <", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamLessThanOrEqualTo(String value) {
            addCriterion("C_COMPPARAM <=", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamLike(String value) {
            addCriterion("C_COMPPARAM like", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCompparamNotLike(String value) {
            addCriterion("C_COMPPARAM not like", value, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCCompparamIn(List<String> values) {
            addCriterion("C_COMPPARAM in", values, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCCompparamNotIn(List<String> values) {
            addCriterion("C_COMPPARAM not in", values, "cCompparam");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
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
         * 条件不在区间:null
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
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCMappingidIsNull() {
            addCriterion("C_MAPPINGID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCMappingidIsNotNull() {
            addCriterion("C_MAPPINGID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMappingidEqualTo(String value) {
            addCriterion("C_MAPPINGID =", value, "cMappingid");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMappingidNotEqualTo(String value) {
            addCriterion("C_MAPPINGID <>", value, "cMappingid");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMappingidGreaterThan(String value) {
            addCriterion("C_MAPPINGID >", value, "cMappingid");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMappingidGreaterThanOrEqualTo(String value) {
            addCriterion("C_MAPPINGID >=", value, "cMappingid");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMappingidLessThan(String value) {
            addCriterion("C_MAPPINGID <", value, "cMappingid");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMappingidLessThanOrEqualTo(String value) {
            addCriterion("C_MAPPINGID <=", value, "cMappingid");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMappingidLike(String value) {
            addCriterion("C_MAPPINGID like", value, "cMappingid");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMappingidNotLike(String value) {
            addCriterion("C_MAPPINGID not like", value, "cMappingid");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCMappingidIn(List<String> values) {
            addCriterion("C_MAPPINGID in", values, "cMappingid");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCMappingidNotIn(List<String> values) {
            addCriterion("C_MAPPINGID not in", values, "cMappingid");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCMappingidBetween(String value1, String value2) {
            addCriterion("C_MAPPINGID between", value1, value2, "cMappingid");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCMappingidNotBetween(String value1, String value2) {
            addCriterion("C_MAPPINGID not between", value1, value2, "cMappingid");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andLHelpcodeIsNull() {
            addCriterion("L_HELPCODE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andLHelpcodeIsNotNull() {
            addCriterion("L_HELPCODE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLHelpcodeEqualTo(BigDecimal value) {
            addCriterion("L_HELPCODE =", value, "lHelpcode");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLHelpcodeNotEqualTo(BigDecimal value) {
            addCriterion("L_HELPCODE <>", value, "lHelpcode");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLHelpcodeGreaterThan(BigDecimal value) {
            addCriterion("L_HELPCODE >", value, "lHelpcode");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLHelpcodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_HELPCODE >=", value, "lHelpcode");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLHelpcodeLessThan(BigDecimal value) {
            addCriterion("L_HELPCODE <", value, "lHelpcode");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLHelpcodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_HELPCODE <=", value, "lHelpcode");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLHelpcodeIn(List<BigDecimal> values) {
            addCriterion("L_HELPCODE in", values, "lHelpcode");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLHelpcodeNotIn(List<BigDecimal> values) {
            addCriterion("L_HELPCODE not in", values, "lHelpcode");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLHelpcodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_HELPCODE between", value1, value2, "lHelpcode");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLHelpcodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_HELPCODE not between", value1, value2, "lHelpcode");
            return (Criteria) this;
        }

        /**
         * 条件为空:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         * 
         * @return 标准
         */
        public Criteria andCHidecaneditIsNull() {
            addCriterion("C_HIDECANEDIT is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         * 
         * @return 标准
         */
        public Criteria andCHidecaneditIsNotNull() {
            addCriterion("C_HIDECANEDIT is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHidecaneditEqualTo(String value) {
            addCriterion("C_HIDECANEDIT =", value, "cHidecanedit");
            return (Criteria) this;
        }

        /**
         * 条件不相等:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHidecaneditNotEqualTo(String value) {
            addCriterion("C_HIDECANEDIT <>", value, "cHidecanedit");
            return (Criteria) this;
        }

        /**
         * 条件大于:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHidecaneditGreaterThan(String value) {
            addCriterion("C_HIDECANEDIT >", value, "cHidecanedit");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHidecaneditGreaterThanOrEqualTo(String value) {
            addCriterion("C_HIDECANEDIT >=", value, "cHidecanedit");
            return (Criteria) this;
        }

        /**
         * 条件小于:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHidecaneditLessThan(String value) {
            addCriterion("C_HIDECANEDIT <", value, "cHidecanedit");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHidecaneditLessThanOrEqualTo(String value) {
            addCriterion("C_HIDECANEDIT <=", value, "cHidecanedit");
            return (Criteria) this;
        }

        /**
         * 条件相似:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHidecaneditLike(String value) {
            addCriterion("C_HIDECANEDIT like", value, "cHidecanedit");
            return (Criteria) this;
        }

        /**
         * 条件不相似:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHidecaneditNotLike(String value) {
            addCriterion("C_HIDECANEDIT not like", value, "cHidecanedit");
            return (Criteria) this;
        }

        /**
         * 条件在范围:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         *
         * @param values 隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         * @return 标准
         */
        public Criteria andCHidecaneditIn(List<String> values) {
            addCriterion("C_HIDECANEDIT in", values, "cHidecanedit");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         *
         * @param values 隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         * @return 标准
         */
        public Criteria andCHidecaneditNotIn(List<String> values) {
            addCriterion("C_HIDECANEDIT not in", values, "cHidecanedit");
            return (Criteria) this;
        }

        /**
         * 条件在区间:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCHidecaneditBetween(String value1, String value2) {
            addCriterion("C_HIDECANEDIT between", value1, value2, "cHidecanedit");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:隐藏字段可编辑，即类型是隐藏或者设置了hidden的字段，并且label有值，该字段配置成1可前台配置默认值
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCHidecaneditNotBetween(String value1, String value2) {
            addCriterion("C_HIDECANEDIT not between", value1, value2, "cHidecanedit");
            return (Criteria) this;
        }

        /**
         * 条件为空:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         * 
         * @return 标准
         */
        public Criteria andCPagesetparamIsNull() {
            addCriterion("C_PAGESETPARAM is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         * 
         * @return 标准
         */
        public Criteria andCPagesetparamIsNotNull() {
            addCriterion("C_PAGESETPARAM is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPagesetparamEqualTo(String value) {
            addCriterion("C_PAGESETPARAM =", value, "cPagesetparam");
            return (Criteria) this;
        }

        /**
         * 条件不相等:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPagesetparamNotEqualTo(String value) {
            addCriterion("C_PAGESETPARAM <>", value, "cPagesetparam");
            return (Criteria) this;
        }

        /**
         * 条件大于:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPagesetparamGreaterThan(String value) {
            addCriterion("C_PAGESETPARAM >", value, "cPagesetparam");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPagesetparamGreaterThanOrEqualTo(String value) {
            addCriterion("C_PAGESETPARAM >=", value, "cPagesetparam");
            return (Criteria) this;
        }

        /**
         * 条件小于:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPagesetparamLessThan(String value) {
            addCriterion("C_PAGESETPARAM <", value, "cPagesetparam");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPagesetparamLessThanOrEqualTo(String value) {
            addCriterion("C_PAGESETPARAM <=", value, "cPagesetparam");
            return (Criteria) this;
        }

        /**
         * 条件相似:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPagesetparamLike(String value) {
            addCriterion("C_PAGESETPARAM like", value, "cPagesetparam");
            return (Criteria) this;
        }

        /**
         * 条件不相似:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPagesetparamNotLike(String value) {
            addCriterion("C_PAGESETPARAM not like", value, "cPagesetparam");
            return (Criteria) this;
        }

        /**
         * 条件在范围:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         *
         * @param values 页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         * @return 标准
         */
        public Criteria andCPagesetparamIn(List<String> values) {
            addCriterion("C_PAGESETPARAM in", values, "cPagesetparam");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         *
         * @param values 页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         * @return 标准
         */
        public Criteria andCPagesetparamNotIn(List<String> values) {
            addCriterion("C_PAGESETPARAM not in", values, "cPagesetparam");
            return (Criteria) this;
        }

        /**
         * 条件在区间:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCPagesetparamBetween(String value1, String value2) {
            addCriterion("C_PAGESETPARAM between", value1, value2, "cPagesetparam");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:页面字段配置额外属性，支持多个，用英文逗号分隔，注意不要加空格，范例cansethide:1,cansetvalue:0,cansetrequired:0
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCPagesetparamNotBetween(String value1, String value2) {
            addCriterion("C_PAGESETPARAM not between", value1, value2, "cPagesetparam");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCIscanselectparentIsNull() {
            addCriterion("C_ISCANSELECTPARENT is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCIscanselectparentIsNotNull() {
            addCriterion("C_ISCANSELECTPARENT is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIscanselectparentEqualTo(String value) {
            addCriterion("C_ISCANSELECTPARENT =", value, "cIscanselectparent");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIscanselectparentNotEqualTo(String value) {
            addCriterion("C_ISCANSELECTPARENT <>", value, "cIscanselectparent");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIscanselectparentGreaterThan(String value) {
            addCriterion("C_ISCANSELECTPARENT >", value, "cIscanselectparent");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIscanselectparentGreaterThanOrEqualTo(String value) {
            addCriterion("C_ISCANSELECTPARENT >=", value, "cIscanselectparent");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIscanselectparentLessThan(String value) {
            addCriterion("C_ISCANSELECTPARENT <", value, "cIscanselectparent");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIscanselectparentLessThanOrEqualTo(String value) {
            addCriterion("C_ISCANSELECTPARENT <=", value, "cIscanselectparent");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIscanselectparentLike(String value) {
            addCriterion("C_ISCANSELECTPARENT like", value, "cIscanselectparent");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIscanselectparentNotLike(String value) {
            addCriterion("C_ISCANSELECTPARENT not like", value, "cIscanselectparent");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCIscanselectparentIn(List<String> values) {
            addCriterion("C_ISCANSELECTPARENT in", values, "cIscanselectparent");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCIscanselectparentNotIn(List<String> values) {
            addCriterion("C_ISCANSELECTPARENT not in", values, "cIscanselectparent");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCIscanselectparentBetween(String value1, String value2) {
            addCriterion("C_ISCANSELECTPARENT between", value1, value2, "cIscanselectparent");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCIscanselectparentNotBetween(String value1, String value2) {
            addCriterion("C_ISCANSELECTPARENT not between", value1, value2, "cIscanselectparent");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCDoubleauditIsNull() {
            addCriterion("C_DOUBLEAUDIT is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCDoubleauditIsNotNull() {
            addCriterion("C_DOUBLEAUDIT is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDoubleauditEqualTo(String value) {
            addCriterion("C_DOUBLEAUDIT =", value, "cDoubleaudit");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDoubleauditNotEqualTo(String value) {
            addCriterion("C_DOUBLEAUDIT <>", value, "cDoubleaudit");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDoubleauditGreaterThan(String value) {
            addCriterion("C_DOUBLEAUDIT >", value, "cDoubleaudit");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDoubleauditGreaterThanOrEqualTo(String value) {
            addCriterion("C_DOUBLEAUDIT >=", value, "cDoubleaudit");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDoubleauditLessThan(String value) {
            addCriterion("C_DOUBLEAUDIT <", value, "cDoubleaudit");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDoubleauditLessThanOrEqualTo(String value) {
            addCriterion("C_DOUBLEAUDIT <=", value, "cDoubleaudit");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDoubleauditLike(String value) {
            addCriterion("C_DOUBLEAUDIT like", value, "cDoubleaudit");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDoubleauditNotLike(String value) {
            addCriterion("C_DOUBLEAUDIT not like", value, "cDoubleaudit");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCDoubleauditIn(List<String> values) {
            addCriterion("C_DOUBLEAUDIT in", values, "cDoubleaudit");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCDoubleauditNotIn(List<String> values) {
            addCriterion("C_DOUBLEAUDIT not in", values, "cDoubleaudit");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDoubleauditBetween(String value1, String value2) {
            addCriterion("C_DOUBLEAUDIT between", value1, value2, "cDoubleaudit");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDoubleauditNotBetween(String value1, String value2) {
            addCriterion("C_DOUBLEAUDIT not between", value1, value2, "cDoubleaudit");
            return (Criteria) this;
        }
    }

    /**
     * @Title TBLOCKCOLUMNS表的创建标准内部类
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
     * @Title TBLOCKCOLUMNS表的内部标准类
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