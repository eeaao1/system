/*
 * TinstinterinputconfigExample.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @Date 2023-08-18 11:17:44
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
public class TinstinterinputconfigExample {
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
     * 构造查询条件:TINSTINTERINPUTCONFIG
     */
    public TinstinterinputconfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 设置排序字段:TINSTINTERINPUTCONFIG
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 获取排序字段:TINSTINTERINPUTCONFIG
     * 
     * @return String 排序规则
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置过滤重复数据:TINSTINTERINPUTCONFIG
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 是否过滤重复数据:TINSTINTERINPUTCONFIG
     * 
     * @return boolean 是否过滤重复
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获取当前的查询条件实例:TINSTINTERINPUTCONFIG
     * 
     * @return List<Criteria> 获取标准集
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 根据主键来更新符合条件的数据库记录:TINSTINTERINPUTCONFIG
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 根据主键来更新符合条件的数据库记录:TINSTINTERINPUTCONFIG
     * 
     * @return Criteria 标准条件式
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 创建一个查询条件:TINSTINTERINPUTCONFIG
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
     * 内部构建查询条件对象:TINSTINTERINPUTCONFIG
     * 
     * @return Criteria 标准条件式
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除查询条件:TINSTINTERINPUTCONFIG
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @Title TINSTINTERINPUTCONFIG表的创建标准内部类
     * @Description null
     */
    protected abstract static class GeneratedCriteria {
        /**
         * criteria 标准集
         */
        protected List<Criterion> criteria;

        /**
         * 构造查询条件:TINSTINTERINPUTCONFIG
         */
        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        /**
         * 是否验证:TINSTINTERINPUTCONFIG
         * 
         * @return boolean 是否有效
         */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
         * 获取所有条件集:TINSTINTERINPUTCONFIG
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
         * 获取条件集:TINSTINTERINPUTCONFIG
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
         * 增加条件:TINSTINTERINPUTCONFIG
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
         * 增加条件:TINSTINTERINPUTCONFIG
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
         * 增加条件:TINSTINTERINPUTCONFIG
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
         * 条件为空:对接系统
         * 
         * @return 标准
         */
        public Criteria andCSystemIsNull() {
            addCriterion("C_SYSTEM is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:对接系统
         * 
         * @return 标准
         */
        public Criteria andCSystemIsNotNull() {
            addCriterion("C_SYSTEM is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:对接系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSystemEqualTo(String value) {
            addCriterion("C_SYSTEM =", value, "cSystem");
            return (Criteria) this;
        }

        /**
         * 条件不相等:对接系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSystemNotEqualTo(String value) {
            addCriterion("C_SYSTEM <>", value, "cSystem");
            return (Criteria) this;
        }

        /**
         * 条件大于:对接系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSystemGreaterThan(String value) {
            addCriterion("C_SYSTEM >", value, "cSystem");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:对接系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSystemGreaterThanOrEqualTo(String value) {
            addCriterion("C_SYSTEM >=", value, "cSystem");
            return (Criteria) this;
        }

        /**
         * 条件小于:对接系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSystemLessThan(String value) {
            addCriterion("C_SYSTEM <", value, "cSystem");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:对接系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSystemLessThanOrEqualTo(String value) {
            addCriterion("C_SYSTEM <=", value, "cSystem");
            return (Criteria) this;
        }

        /**
         * 条件相似:对接系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSystemLike(String value) {
            addCriterion("C_SYSTEM like", value, "cSystem");
            return (Criteria) this;
        }

        /**
         * 条件不相似:对接系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSystemNotLike(String value) {
            addCriterion("C_SYSTEM not like", value, "cSystem");
            return (Criteria) this;
        }

        /**
         * 条件在范围:对接系统
         *
         * @param values 对接系统
         * @return 标准
         */
        public Criteria andCSystemIn(List<String> values) {
            addCriterion("C_SYSTEM in", values, "cSystem");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:对接系统
         *
         * @param values 对接系统
         * @return 标准
         */
        public Criteria andCSystemNotIn(List<String> values) {
            addCriterion("C_SYSTEM not in", values, "cSystem");
            return (Criteria) this;
        }

        /**
         * 条件在区间:对接系统
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCSystemBetween(String value1, String value2) {
            addCriterion("C_SYSTEM between", value1, value2, "cSystem");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:对接系统
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCSystemNotBetween(String value1, String value2) {
            addCriterion("C_SYSTEM not between", value1, value2, "cSystem");
            return (Criteria) this;
        }

        /**
         * 条件为空:接口功能号
         * 
         * @return 标准
         */
        public Criteria andCFunctionidIsNull() {
            addCriterion("C_FUNCTIONID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:接口功能号
         * 
         * @return 标准
         */
        public Criteria andCFunctionidIsNotNull() {
            addCriterion("C_FUNCTIONID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:接口功能号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidEqualTo(String value) {
            addCriterion("C_FUNCTIONID =", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件不相等:接口功能号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidNotEqualTo(String value) {
            addCriterion("C_FUNCTIONID <>", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件大于:接口功能号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidGreaterThan(String value) {
            addCriterion("C_FUNCTIONID >", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:接口功能号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidGreaterThanOrEqualTo(String value) {
            addCriterion("C_FUNCTIONID >=", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件小于:接口功能号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidLessThan(String value) {
            addCriterion("C_FUNCTIONID <", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:接口功能号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidLessThanOrEqualTo(String value) {
            addCriterion("C_FUNCTIONID <=", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件相似:接口功能号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidLike(String value) {
            addCriterion("C_FUNCTIONID like", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件不相似:接口功能号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidNotLike(String value) {
            addCriterion("C_FUNCTIONID not like", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件在范围:接口功能号
         *
         * @param values 接口功能号
         * @return 标准
         */
        public Criteria andCFunctionidIn(List<String> values) {
            addCriterion("C_FUNCTIONID in", values, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:接口功能号
         *
         * @param values 接口功能号
         * @return 标准
         */
        public Criteria andCFunctionidNotIn(List<String> values) {
            addCriterion("C_FUNCTIONID not in", values, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件在区间:接口功能号
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCFunctionidBetween(String value1, String value2) {
            addCriterion("C_FUNCTIONID between", value1, value2, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:接口功能号
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCFunctionidNotBetween(String value1, String value2) {
            addCriterion("C_FUNCTIONID not between", value1, value2, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件为空:接口号
         * 
         * @return 标准
         */
        public Criteria andCInterfaceidIsNull() {
            addCriterion("C_INTERFACEID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:接口号
         * 
         * @return 标准
         */
        public Criteria andCInterfaceidIsNotNull() {
            addCriterion("C_INTERFACEID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:接口号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInterfaceidEqualTo(String value) {
            addCriterion("C_INTERFACEID =", value, "cInterfaceid");
            return (Criteria) this;
        }

        /**
         * 条件不相等:接口号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInterfaceidNotEqualTo(String value) {
            addCriterion("C_INTERFACEID <>", value, "cInterfaceid");
            return (Criteria) this;
        }

        /**
         * 条件大于:接口号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInterfaceidGreaterThan(String value) {
            addCriterion("C_INTERFACEID >", value, "cInterfaceid");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:接口号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInterfaceidGreaterThanOrEqualTo(String value) {
            addCriterion("C_INTERFACEID >=", value, "cInterfaceid");
            return (Criteria) this;
        }

        /**
         * 条件小于:接口号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInterfaceidLessThan(String value) {
            addCriterion("C_INTERFACEID <", value, "cInterfaceid");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:接口号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInterfaceidLessThanOrEqualTo(String value) {
            addCriterion("C_INTERFACEID <=", value, "cInterfaceid");
            return (Criteria) this;
        }

        /**
         * 条件相似:接口号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInterfaceidLike(String value) {
            addCriterion("C_INTERFACEID like", value, "cInterfaceid");
            return (Criteria) this;
        }

        /**
         * 条件不相似:接口号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInterfaceidNotLike(String value) {
            addCriterion("C_INTERFACEID not like", value, "cInterfaceid");
            return (Criteria) this;
        }

        /**
         * 条件在范围:接口号
         *
         * @param values 接口号
         * @return 标准
         */
        public Criteria andCInterfaceidIn(List<String> values) {
            addCriterion("C_INTERFACEID in", values, "cInterfaceid");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:接口号
         *
         * @param values 接口号
         * @return 标准
         */
        public Criteria andCInterfaceidNotIn(List<String> values) {
            addCriterion("C_INTERFACEID not in", values, "cInterfaceid");
            return (Criteria) this;
        }

        /**
         * 条件在区间:接口号
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCInterfaceidBetween(String value1, String value2) {
            addCriterion("C_INTERFACEID between", value1, value2, "cInterfaceid");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:接口号
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCInterfaceidNotBetween(String value1, String value2) {
            addCriterion("C_INTERFACEID not between", value1, value2, "cInterfaceid");
            return (Criteria) this;
        }

        /**
         * 条件为空:java处理端的字段
         * 
         * @return 标准
         */
        public Criteria andCFieldcodeIsNull() {
            addCriterion("C_FIELDCODE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:java处理端的字段
         * 
         * @return 标准
         */
        public Criteria andCFieldcodeIsNotNull() {
            addCriterion("C_FIELDCODE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:java处理端的字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldcodeEqualTo(String value) {
            addCriterion("C_FIELDCODE =", value, "cFieldcode");
            return (Criteria) this;
        }

        /**
         * 条件不相等:java处理端的字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldcodeNotEqualTo(String value) {
            addCriterion("C_FIELDCODE <>", value, "cFieldcode");
            return (Criteria) this;
        }

        /**
         * 条件大于:java处理端的字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldcodeGreaterThan(String value) {
            addCriterion("C_FIELDCODE >", value, "cFieldcode");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:java处理端的字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldcodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_FIELDCODE >=", value, "cFieldcode");
            return (Criteria) this;
        }

        /**
         * 条件小于:java处理端的字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldcodeLessThan(String value) {
            addCriterion("C_FIELDCODE <", value, "cFieldcode");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:java处理端的字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldcodeLessThanOrEqualTo(String value) {
            addCriterion("C_FIELDCODE <=", value, "cFieldcode");
            return (Criteria) this;
        }

        /**
         * 条件相似:java处理端的字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldcodeLike(String value) {
            addCriterion("C_FIELDCODE like", value, "cFieldcode");
            return (Criteria) this;
        }

        /**
         * 条件不相似:java处理端的字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldcodeNotLike(String value) {
            addCriterion("C_FIELDCODE not like", value, "cFieldcode");
            return (Criteria) this;
        }

        /**
         * 条件在范围:java处理端的字段
         *
         * @param values java处理端的字段
         * @return 标准
         */
        public Criteria andCFieldcodeIn(List<String> values) {
            addCriterion("C_FIELDCODE in", values, "cFieldcode");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:java处理端的字段
         *
         * @param values java处理端的字段
         * @return 标准
         */
        public Criteria andCFieldcodeNotIn(List<String> values) {
            addCriterion("C_FIELDCODE not in", values, "cFieldcode");
            return (Criteria) this;
        }

        /**
         * 条件在区间:java处理端的字段
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCFieldcodeBetween(String value1, String value2) {
            addCriterion("C_FIELDCODE between", value1, value2, "cFieldcode");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:java处理端的字段
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCFieldcodeNotBetween(String value1, String value2) {
            addCriterion("C_FIELDCODE not between", value1, value2, "cFieldcode");
            return (Criteria) this;
        }

        /**
         * 条件为空:dataset字段
         * 
         * @return 标准
         */
        public Criteria andCOtherfieldcodeIsNull() {
            addCriterion("C_OTHERFIELDCODE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:dataset字段
         * 
         * @return 标准
         */
        public Criteria andCOtherfieldcodeIsNotNull() {
            addCriterion("C_OTHERFIELDCODE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:dataset字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOtherfieldcodeEqualTo(String value) {
            addCriterion("C_OTHERFIELDCODE =", value, "cOtherfieldcode");
            return (Criteria) this;
        }

        /**
         * 条件不相等:dataset字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOtherfieldcodeNotEqualTo(String value) {
            addCriterion("C_OTHERFIELDCODE <>", value, "cOtherfieldcode");
            return (Criteria) this;
        }

        /**
         * 条件大于:dataset字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOtherfieldcodeGreaterThan(String value) {
            addCriterion("C_OTHERFIELDCODE >", value, "cOtherfieldcode");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:dataset字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOtherfieldcodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_OTHERFIELDCODE >=", value, "cOtherfieldcode");
            return (Criteria) this;
        }

        /**
         * 条件小于:dataset字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOtherfieldcodeLessThan(String value) {
            addCriterion("C_OTHERFIELDCODE <", value, "cOtherfieldcode");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:dataset字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOtherfieldcodeLessThanOrEqualTo(String value) {
            addCriterion("C_OTHERFIELDCODE <=", value, "cOtherfieldcode");
            return (Criteria) this;
        }

        /**
         * 条件相似:dataset字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOtherfieldcodeLike(String value) {
            addCriterion("C_OTHERFIELDCODE like", value, "cOtherfieldcode");
            return (Criteria) this;
        }

        /**
         * 条件不相似:dataset字段
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCOtherfieldcodeNotLike(String value) {
            addCriterion("C_OTHERFIELDCODE not like", value, "cOtherfieldcode");
            return (Criteria) this;
        }

        /**
         * 条件在范围:dataset字段
         *
         * @param values dataset字段
         * @return 标准
         */
        public Criteria andCOtherfieldcodeIn(List<String> values) {
            addCriterion("C_OTHERFIELDCODE in", values, "cOtherfieldcode");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:dataset字段
         *
         * @param values dataset字段
         * @return 标准
         */
        public Criteria andCOtherfieldcodeNotIn(List<String> values) {
            addCriterion("C_OTHERFIELDCODE not in", values, "cOtherfieldcode");
            return (Criteria) this;
        }

        /**
         * 条件在区间:dataset字段
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCOtherfieldcodeBetween(String value1, String value2) {
            addCriterion("C_OTHERFIELDCODE between", value1, value2, "cOtherfieldcode");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:dataset字段
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCOtherfieldcodeNotBetween(String value1, String value2) {
            addCriterion("C_OTHERFIELDCODE not between", value1, value2, "cOtherfieldcode");
            return (Criteria) this;
        }

        /**
         * 条件为空:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         * 
         * @return 标准
         */
        public Criteria andCTypeIsNull() {
            addCriterion("C_TYPE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         * 
         * @return 标准
         */
        public Criteria andCTypeIsNotNull() {
            addCriterion("C_TYPE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTypeEqualTo(String value) {
            addCriterion("C_TYPE =", value, "cType");
            return (Criteria) this;
        }

        /**
         * 条件不相等:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTypeNotEqualTo(String value) {
            addCriterion("C_TYPE <>", value, "cType");
            return (Criteria) this;
        }

        /**
         * 条件大于:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTypeGreaterThan(String value) {
            addCriterion("C_TYPE >", value, "cType");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_TYPE >=", value, "cType");
            return (Criteria) this;
        }

        /**
         * 条件小于:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTypeLessThan(String value) {
            addCriterion("C_TYPE <", value, "cType");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTypeLessThanOrEqualTo(String value) {
            addCriterion("C_TYPE <=", value, "cType");
            return (Criteria) this;
        }

        /**
         * 条件相似:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTypeLike(String value) {
            addCriterion("C_TYPE like", value, "cType");
            return (Criteria) this;
        }

        /**
         * 条件不相似:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTypeNotLike(String value) {
            addCriterion("C_TYPE not like", value, "cType");
            return (Criteria) this;
        }

        /**
         * 条件在范围:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         *
         * @param values 数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         * @return 标准
         */
        public Criteria andCTypeIn(List<String> values) {
            addCriterion("C_TYPE in", values, "cType");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         *
         * @param values 数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         * @return 标准
         */
        public Criteria andCTypeNotIn(List<String> values) {
            addCriterion("C_TYPE not in", values, "cType");
            return (Criteria) this;
        }

        /**
         * 条件在区间:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCTypeBetween(String value1, String value2) {
            addCriterion("C_TYPE between", value1, value2, "cType");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:数据类型，T:yyyy-MM-dd HH24:mi:ss ； D：yyyy-MM-dd ； S：字符串 ；DV：yyyyMMdd或者yyyyMMdd HH24:mi:ss
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCTypeNotBetween(String value1, String value2) {
            addCriterion("C_TYPE not between", value1, value2, "cType");
            return (Criteria) this;
        }

        /**
         * 条件为空:是否必填
         * 
         * @return 标准
         */
        public Criteria andCIsmustIsNull() {
            addCriterion("C_ISMUST is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:是否必填
         * 
         * @return 标准
         */
        public Criteria andCIsmustIsNotNull() {
            addCriterion("C_ISMUST is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:是否必填
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsmustEqualTo(String value) {
            addCriterion("C_ISMUST =", value, "cIsmust");
            return (Criteria) this;
        }

        /**
         * 条件不相等:是否必填
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsmustNotEqualTo(String value) {
            addCriterion("C_ISMUST <>", value, "cIsmust");
            return (Criteria) this;
        }

        /**
         * 条件大于:是否必填
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsmustGreaterThan(String value) {
            addCriterion("C_ISMUST >", value, "cIsmust");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:是否必填
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsmustGreaterThanOrEqualTo(String value) {
            addCriterion("C_ISMUST >=", value, "cIsmust");
            return (Criteria) this;
        }

        /**
         * 条件小于:是否必填
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsmustLessThan(String value) {
            addCriterion("C_ISMUST <", value, "cIsmust");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:是否必填
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsmustLessThanOrEqualTo(String value) {
            addCriterion("C_ISMUST <=", value, "cIsmust");
            return (Criteria) this;
        }

        /**
         * 条件相似:是否必填
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsmustLike(String value) {
            addCriterion("C_ISMUST like", value, "cIsmust");
            return (Criteria) this;
        }

        /**
         * 条件不相似:是否必填
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsmustNotLike(String value) {
            addCriterion("C_ISMUST not like", value, "cIsmust");
            return (Criteria) this;
        }

        /**
         * 条件在范围:是否必填
         *
         * @param values 是否必填
         * @return 标准
         */
        public Criteria andCIsmustIn(List<String> values) {
            addCriterion("C_ISMUST in", values, "cIsmust");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:是否必填
         *
         * @param values 是否必填
         * @return 标准
         */
        public Criteria andCIsmustNotIn(List<String> values) {
            addCriterion("C_ISMUST not in", values, "cIsmust");
            return (Criteria) this;
        }

        /**
         * 条件在区间:是否必填
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCIsmustBetween(String value1, String value2) {
            addCriterion("C_ISMUST between", value1, value2, "cIsmust");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:是否必填
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCIsmustNotBetween(String value1, String value2) {
            addCriterion("C_ISMUST not between", value1, value2, "cIsmust");
            return (Criteria) this;
        }

        /**
         * 条件为空:输入数据格式，正则表达式
         * 
         * @return 标准
         */
        public Criteria andCFormatIsNull() {
            addCriterion("C_FORMAT is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:输入数据格式，正则表达式
         * 
         * @return 标准
         */
        public Criteria andCFormatIsNotNull() {
            addCriterion("C_FORMAT is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:输入数据格式，正则表达式
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatEqualTo(String value) {
            addCriterion("C_FORMAT =", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件不相等:输入数据格式，正则表达式
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatNotEqualTo(String value) {
            addCriterion("C_FORMAT <>", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件大于:输入数据格式，正则表达式
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatGreaterThan(String value) {
            addCriterion("C_FORMAT >", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:输入数据格式，正则表达式
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatGreaterThanOrEqualTo(String value) {
            addCriterion("C_FORMAT >=", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件小于:输入数据格式，正则表达式
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatLessThan(String value) {
            addCriterion("C_FORMAT <", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:输入数据格式，正则表达式
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatLessThanOrEqualTo(String value) {
            addCriterion("C_FORMAT <=", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件相似:输入数据格式，正则表达式
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatLike(String value) {
            addCriterion("C_FORMAT like", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件不相似:输入数据格式，正则表达式
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatNotLike(String value) {
            addCriterion("C_FORMAT not like", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件在范围:输入数据格式，正则表达式
         *
         * @param values 输入数据格式，正则表达式
         * @return 标准
         */
        public Criteria andCFormatIn(List<String> values) {
            addCriterion("C_FORMAT in", values, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:输入数据格式，正则表达式
         *
         * @param values 输入数据格式，正则表达式
         * @return 标准
         */
        public Criteria andCFormatNotIn(List<String> values) {
            addCriterion("C_FORMAT not in", values, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件在区间:输入数据格式，正则表达式
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
         * 条件不在区间:输入数据格式，正则表达式
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
         * 条件为空:datasetid
         * 
         * @return 标准
         */
        public Criteria andCDatasetidIsNull() {
            addCriterion("C_DATASETID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:datasetid
         * 
         * @return 标准
         */
        public Criteria andCDatasetidIsNotNull() {
            addCriterion("C_DATASETID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:datasetid
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatasetidEqualTo(String value) {
            addCriterion("C_DATASETID =", value, "cDatasetid");
            return (Criteria) this;
        }

        /**
         * 条件不相等:datasetid
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatasetidNotEqualTo(String value) {
            addCriterion("C_DATASETID <>", value, "cDatasetid");
            return (Criteria) this;
        }

        /**
         * 条件大于:datasetid
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatasetidGreaterThan(String value) {
            addCriterion("C_DATASETID >", value, "cDatasetid");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:datasetid
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatasetidGreaterThanOrEqualTo(String value) {
            addCriterion("C_DATASETID >=", value, "cDatasetid");
            return (Criteria) this;
        }

        /**
         * 条件小于:datasetid
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatasetidLessThan(String value) {
            addCriterion("C_DATASETID <", value, "cDatasetid");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:datasetid
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatasetidLessThanOrEqualTo(String value) {
            addCriterion("C_DATASETID <=", value, "cDatasetid");
            return (Criteria) this;
        }

        /**
         * 条件相似:datasetid
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatasetidLike(String value) {
            addCriterion("C_DATASETID like", value, "cDatasetid");
            return (Criteria) this;
        }

        /**
         * 条件不相似:datasetid
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatasetidNotLike(String value) {
            addCriterion("C_DATASETID not like", value, "cDatasetid");
            return (Criteria) this;
        }

        /**
         * 条件在范围:datasetid
         *
         * @param values datasetid
         * @return 标准
         */
        public Criteria andCDatasetidIn(List<String> values) {
            addCriterion("C_DATASETID in", values, "cDatasetid");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:datasetid
         *
         * @param values datasetid
         * @return 标准
         */
        public Criteria andCDatasetidNotIn(List<String> values) {
            addCriterion("C_DATASETID not in", values, "cDatasetid");
            return (Criteria) this;
        }

        /**
         * 条件在区间:datasetid
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDatasetidBetween(String value1, String value2) {
            addCriterion("C_DATASETID between", value1, value2, "cDatasetid");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:datasetid
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDatasetidNotBetween(String value1, String value2) {
            addCriterion("C_DATASETID not between", value1, value2, "cDatasetid");
            return (Criteria) this;
        }

        /**
         * 条件为空:数据类型 0或空:字段;1:DataSet
         * 
         * @return 标准
         */
        public Criteria andCDatatypeIsNull() {
            addCriterion("C_DATATYPE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:数据类型 0或空:字段;1:DataSet
         * 
         * @return 标准
         */
        public Criteria andCDatatypeIsNotNull() {
            addCriterion("C_DATATYPE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:数据类型 0或空:字段;1:DataSet
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeEqualTo(String value) {
            addCriterion("C_DATATYPE =", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件不相等:数据类型 0或空:字段;1:DataSet
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeNotEqualTo(String value) {
            addCriterion("C_DATATYPE <>", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件大于:数据类型 0或空:字段;1:DataSet
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeGreaterThan(String value) {
            addCriterion("C_DATATYPE >", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:数据类型 0或空:字段;1:DataSet
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_DATATYPE >=", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件小于:数据类型 0或空:字段;1:DataSet
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeLessThan(String value) {
            addCriterion("C_DATATYPE <", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:数据类型 0或空:字段;1:DataSet
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeLessThanOrEqualTo(String value) {
            addCriterion("C_DATATYPE <=", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件相似:数据类型 0或空:字段;1:DataSet
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeLike(String value) {
            addCriterion("C_DATATYPE like", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件不相似:数据类型 0或空:字段;1:DataSet
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDatatypeNotLike(String value) {
            addCriterion("C_DATATYPE not like", value, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件在范围:数据类型 0或空:字段;1:DataSet
         *
         * @param values 数据类型 0或空:字段;1:DataSet
         * @return 标准
         */
        public Criteria andCDatatypeIn(List<String> values) {
            addCriterion("C_DATATYPE in", values, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:数据类型 0或空:字段;1:DataSet
         *
         * @param values 数据类型 0或空:字段;1:DataSet
         * @return 标准
         */
        public Criteria andCDatatypeNotIn(List<String> values) {
            addCriterion("C_DATATYPE not in", values, "cDatatype");
            return (Criteria) this;
        }

        /**
         * 条件在区间:数据类型 0或空:字段;1:DataSet
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
         * 条件不在区间:数据类型 0或空:字段;1:DataSet
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
         * 条件为空:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         * 
         * @return 标准
         */
        public Criteria andCParammapIsNull() {
            addCriterion("C_PARAMMAP is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         * 
         * @return 标准
         */
        public Criteria andCParammapIsNotNull() {
            addCriterion("C_PARAMMAP is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCParammapEqualTo(String value) {
            addCriterion("C_PARAMMAP =", value, "cParammap");
            return (Criteria) this;
        }

        /**
         * 条件不相等:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCParammapNotEqualTo(String value) {
            addCriterion("C_PARAMMAP <>", value, "cParammap");
            return (Criteria) this;
        }

        /**
         * 条件大于:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCParammapGreaterThan(String value) {
            addCriterion("C_PARAMMAP >", value, "cParammap");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCParammapGreaterThanOrEqualTo(String value) {
            addCriterion("C_PARAMMAP >=", value, "cParammap");
            return (Criteria) this;
        }

        /**
         * 条件小于:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCParammapLessThan(String value) {
            addCriterion("C_PARAMMAP <", value, "cParammap");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCParammapLessThanOrEqualTo(String value) {
            addCriterion("C_PARAMMAP <=", value, "cParammap");
            return (Criteria) this;
        }

        /**
         * 条件相似:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCParammapLike(String value) {
            addCriterion("C_PARAMMAP like", value, "cParammap");
            return (Criteria) this;
        }

        /**
         * 条件不相似:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCParammapNotLike(String value) {
            addCriterion("C_PARAMMAP not like", value, "cParammap");
            return (Criteria) this;
        }

        /**
         * 条件在范围:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         *
         * @param values 参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         * @return 标准
         */
        public Criteria andCParammapIn(List<String> values) {
            addCriterion("C_PARAMMAP in", values, "cParammap");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         *
         * @param values 参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         * @return 标准
         */
        public Criteria andCParammapNotIn(List<String> values) {
            addCriterion("C_PARAMMAP not in", values, "cParammap");
            return (Criteria) this;
        }

        /**
         * 条件在区间:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCParammapBetween(String value1, String value2) {
            addCriterion("C_PARAMMAP between", value1, value2, "cParammap");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:参数字段,多个参数以分号隔开,参数名与取数字段用冒号隔开
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCParammapNotBetween(String value1, String value2) {
            addCriterion("C_PARAMMAP not between", value1, value2, "cParammap");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCRelatcolumnIsNull() {
            addCriterion("C_RELATCOLUMN is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCRelatcolumnIsNotNull() {
            addCriterion("C_RELATCOLUMN is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatcolumnEqualTo(String value) {
            addCriterion("C_RELATCOLUMN =", value, "cRelatcolumn");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatcolumnNotEqualTo(String value) {
            addCriterion("C_RELATCOLUMN <>", value, "cRelatcolumn");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatcolumnGreaterThan(String value) {
            addCriterion("C_RELATCOLUMN >", value, "cRelatcolumn");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatcolumnGreaterThanOrEqualTo(String value) {
            addCriterion("C_RELATCOLUMN >=", value, "cRelatcolumn");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatcolumnLessThan(String value) {
            addCriterion("C_RELATCOLUMN <", value, "cRelatcolumn");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatcolumnLessThanOrEqualTo(String value) {
            addCriterion("C_RELATCOLUMN <=", value, "cRelatcolumn");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatcolumnLike(String value) {
            addCriterion("C_RELATCOLUMN like", value, "cRelatcolumn");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCRelatcolumnNotLike(String value) {
            addCriterion("C_RELATCOLUMN not like", value, "cRelatcolumn");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCRelatcolumnIn(List<String> values) {
            addCriterion("C_RELATCOLUMN in", values, "cRelatcolumn");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCRelatcolumnNotIn(List<String> values) {
            addCriterion("C_RELATCOLUMN not in", values, "cRelatcolumn");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCRelatcolumnBetween(String value1, String value2) {
            addCriterion("C_RELATCOLUMN between", value1, value2, "cRelatcolumn");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCRelatcolumnNotBetween(String value1, String value2) {
            addCriterion("C_RELATCOLUMN not between", value1, value2, "cRelatcolumn");
            return (Criteria) this;
        }

        /**
         * 条件为空:接口版本
         * 
         * @return 标准
         */
        public Criteria andCVersionIsNull() {
            addCriterion("C_VERSION is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:接口版本
         * 
         * @return 标准
         */
        public Criteria andCVersionIsNotNull() {
            addCriterion("C_VERSION is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:接口版本
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCVersionEqualTo(String value) {
            addCriterion("C_VERSION =", value, "cVersion");
            return (Criteria) this;
        }

        /**
         * 条件不相等:接口版本
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCVersionNotEqualTo(String value) {
            addCriterion("C_VERSION <>", value, "cVersion");
            return (Criteria) this;
        }

        /**
         * 条件大于:接口版本
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCVersionGreaterThan(String value) {
            addCriterion("C_VERSION >", value, "cVersion");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:接口版本
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCVersionGreaterThanOrEqualTo(String value) {
            addCriterion("C_VERSION >=", value, "cVersion");
            return (Criteria) this;
        }

        /**
         * 条件小于:接口版本
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCVersionLessThan(String value) {
            addCriterion("C_VERSION <", value, "cVersion");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:接口版本
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCVersionLessThanOrEqualTo(String value) {
            addCriterion("C_VERSION <=", value, "cVersion");
            return (Criteria) this;
        }

        /**
         * 条件相似:接口版本
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCVersionLike(String value) {
            addCriterion("C_VERSION like", value, "cVersion");
            return (Criteria) this;
        }

        /**
         * 条件不相似:接口版本
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCVersionNotLike(String value) {
            addCriterion("C_VERSION not like", value, "cVersion");
            return (Criteria) this;
        }

        /**
         * 条件在范围:接口版本
         *
         * @param values 接口版本
         * @return 标准
         */
        public Criteria andCVersionIn(List<String> values) {
            addCriterion("C_VERSION in", values, "cVersion");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:接口版本
         *
         * @param values 接口版本
         * @return 标准
         */
        public Criteria andCVersionNotIn(List<String> values) {
            addCriterion("C_VERSION not in", values, "cVersion");
            return (Criteria) this;
        }

        /**
         * 条件在区间:接口版本
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCVersionBetween(String value1, String value2) {
            addCriterion("C_VERSION between", value1, value2, "cVersion");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:接口版本
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCVersionNotBetween(String value1, String value2) {
            addCriterion("C_VERSION not between", value1, value2, "cVersion");
            return (Criteria) this;
        }

        /**
         * 条件为空:配置所属系统
         * 
         * @return 标准
         */
        public Criteria andCPartyIsNull() {
            addCriterion("C_PARTY is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:配置所属系统
         * 
         * @return 标准
         */
        public Criteria andCPartyIsNotNull() {
            addCriterion("C_PARTY is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:配置所属系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPartyEqualTo(String value) {
            addCriterion("C_PARTY =", value, "cParty");
            return (Criteria) this;
        }

        /**
         * 条件不相等:配置所属系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPartyNotEqualTo(String value) {
            addCriterion("C_PARTY <>", value, "cParty");
            return (Criteria) this;
        }

        /**
         * 条件大于:配置所属系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPartyGreaterThan(String value) {
            addCriterion("C_PARTY >", value, "cParty");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:配置所属系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPartyGreaterThanOrEqualTo(String value) {
            addCriterion("C_PARTY >=", value, "cParty");
            return (Criteria) this;
        }

        /**
         * 条件小于:配置所属系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPartyLessThan(String value) {
            addCriterion("C_PARTY <", value, "cParty");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:配置所属系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPartyLessThanOrEqualTo(String value) {
            addCriterion("C_PARTY <=", value, "cParty");
            return (Criteria) this;
        }

        /**
         * 条件相似:配置所属系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPartyLike(String value) {
            addCriterion("C_PARTY like", value, "cParty");
            return (Criteria) this;
        }

        /**
         * 条件不相似:配置所属系统
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPartyNotLike(String value) {
            addCriterion("C_PARTY not like", value, "cParty");
            return (Criteria) this;
        }

        /**
         * 条件在范围:配置所属系统
         *
         * @param values 配置所属系统
         * @return 标准
         */
        public Criteria andCPartyIn(List<String> values) {
            addCriterion("C_PARTY in", values, "cParty");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:配置所属系统
         *
         * @param values 配置所属系统
         * @return 标准
         */
        public Criteria andCPartyNotIn(List<String> values) {
            addCriterion("C_PARTY not in", values, "cParty");
            return (Criteria) this;
        }

        /**
         * 条件在区间:配置所属系统
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCPartyBetween(String value1, String value2) {
            addCriterion("C_PARTY between", value1, value2, "cParty");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:配置所属系统
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCPartyNotBetween(String value1, String value2) {
            addCriterion("C_PARTY not between", value1, value2, "cParty");
            return (Criteria) this;
        }

        /**
         * 条件为空:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         * 
         * @return 标准
         */
        public Criteria andCTransfermapIsNull() {
            addCriterion("C_TRANSFERMAP is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         * 
         * @return 标准
         */
        public Criteria andCTransfermapIsNotNull() {
            addCriterion("C_TRANSFERMAP is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTransfermapEqualTo(String value) {
            addCriterion("C_TRANSFERMAP =", value, "cTransfermap");
            return (Criteria) this;
        }

        /**
         * 条件不相等:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTransfermapNotEqualTo(String value) {
            addCriterion("C_TRANSFERMAP <>", value, "cTransfermap");
            return (Criteria) this;
        }

        /**
         * 条件大于:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTransfermapGreaterThan(String value) {
            addCriterion("C_TRANSFERMAP >", value, "cTransfermap");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTransfermapGreaterThanOrEqualTo(String value) {
            addCriterion("C_TRANSFERMAP >=", value, "cTransfermap");
            return (Criteria) this;
        }

        /**
         * 条件小于:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTransfermapLessThan(String value) {
            addCriterion("C_TRANSFERMAP <", value, "cTransfermap");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTransfermapLessThanOrEqualTo(String value) {
            addCriterion("C_TRANSFERMAP <=", value, "cTransfermap");
            return (Criteria) this;
        }

        /**
         * 条件相似:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTransfermapLike(String value) {
            addCriterion("C_TRANSFERMAP like", value, "cTransfermap");
            return (Criteria) this;
        }

        /**
         * 条件不相似:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTransfermapNotLike(String value) {
            addCriterion("C_TRANSFERMAP not like", value, "cTransfermap");
            return (Criteria) this;
        }

        /**
         * 条件在范围:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         *
         * @param values 接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         * @return 标准
         */
        public Criteria andCTransfermapIn(List<String> values) {
            addCriterion("C_TRANSFERMAP in", values, "cTransfermap");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         *
         * @param values 接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         * @return 标准
         */
        public Criteria andCTransfermapNotIn(List<String> values) {
            addCriterion("C_TRANSFERMAP not in", values, "cTransfermap");
            return (Criteria) this;
        }

        /**
         * 条件在区间:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCTransfermapBetween(String value1, String value2) {
            addCriterion("C_TRANSFERMAP between", value1, value2, "cTransfermap");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:接口映射转换，mode 0:map映射;1:内部映射表;2:模式值，如：{"mode":"0","map":{"1":"0";"2":"1"},"other":"x"}
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCTransfermapNotBetween(String value1, String value2) {
            addCriterion("C_TRANSFERMAP not between", value1, value2, "cTransfermap");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCLengthIsNull() {
            addCriterion("C_LENGTH is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCLengthIsNotNull() {
            addCriterion("C_LENGTH is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLengthEqualTo(String value) {
            addCriterion("C_LENGTH =", value, "cLength");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLengthNotEqualTo(String value) {
            addCriterion("C_LENGTH <>", value, "cLength");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLengthGreaterThan(String value) {
            addCriterion("C_LENGTH >", value, "cLength");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLengthGreaterThanOrEqualTo(String value) {
            addCriterion("C_LENGTH >=", value, "cLength");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLengthLessThan(String value) {
            addCriterion("C_LENGTH <", value, "cLength");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLengthLessThanOrEqualTo(String value) {
            addCriterion("C_LENGTH <=", value, "cLength");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLengthLike(String value) {
            addCriterion("C_LENGTH like", value, "cLength");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLengthNotLike(String value) {
            addCriterion("C_LENGTH not like", value, "cLength");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCLengthIn(List<String> values) {
            addCriterion("C_LENGTH in", values, "cLength");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCLengthNotIn(List<String> values) {
            addCriterion("C_LENGTH not in", values, "cLength");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCLengthBetween(String value1, String value2) {
            addCriterion("C_LENGTH between", value1, value2, "cLength");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCLengthNotBetween(String value1, String value2) {
            addCriterion("C_LENGTH not between", value1, value2, "cLength");
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
        public Criteria andCFieldnameIsNull() {
            addCriterion("C_FIELDNAME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCFieldnameIsNotNull() {
            addCriterion("C_FIELDNAME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldnameEqualTo(String value) {
            addCriterion("C_FIELDNAME =", value, "cFieldname");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldnameNotEqualTo(String value) {
            addCriterion("C_FIELDNAME <>", value, "cFieldname");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldnameGreaterThan(String value) {
            addCriterion("C_FIELDNAME >", value, "cFieldname");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldnameGreaterThanOrEqualTo(String value) {
            addCriterion("C_FIELDNAME >=", value, "cFieldname");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldnameLessThan(String value) {
            addCriterion("C_FIELDNAME <", value, "cFieldname");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldnameLessThanOrEqualTo(String value) {
            addCriterion("C_FIELDNAME <=", value, "cFieldname");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldnameLike(String value) {
            addCriterion("C_FIELDNAME like", value, "cFieldname");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFieldnameNotLike(String value) {
            addCriterion("C_FIELDNAME not like", value, "cFieldname");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCFieldnameIn(List<String> values) {
            addCriterion("C_FIELDNAME in", values, "cFieldname");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCFieldnameNotIn(List<String> values) {
            addCriterion("C_FIELDNAME not in", values, "cFieldname");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCFieldnameBetween(String value1, String value2) {
            addCriterion("C_FIELDNAME between", value1, value2, "cFieldname");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCFieldnameNotBetween(String value1, String value2) {
            addCriterion("C_FIELDNAME not between", value1, value2, "cFieldname");
            return (Criteria) this;
        }
    }

    /**
     * @Title TINSTINTERINPUTCONFIG表的创建标准内部类
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
     * @Title TINSTINTERINPUTCONFIG表的内部标准类
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