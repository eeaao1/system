/*
 * TbapiqueryconfigExample.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @Date 2023-08-19 11:06:21
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
public class TbapiqueryconfigExample {
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
     * 构造查询条件:TBAPIQUERYCONFIG
     */
    public TbapiqueryconfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 设置排序字段:TBAPIQUERYCONFIG
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 获取排序字段:TBAPIQUERYCONFIG
     * 
     * @return String 排序规则
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置过滤重复数据:TBAPIQUERYCONFIG
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 是否过滤重复数据:TBAPIQUERYCONFIG
     * 
     * @return boolean 是否过滤重复
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获取当前的查询条件实例:TBAPIQUERYCONFIG
     * 
     * @return List<Criteria> 获取标准集
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 根据主键来更新符合条件的数据库记录:TBAPIQUERYCONFIG
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 根据主键来更新符合条件的数据库记录:TBAPIQUERYCONFIG
     * 
     * @return Criteria 标准条件式
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 创建一个查询条件:TBAPIQUERYCONFIG
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
     * 内部构建查询条件对象:TBAPIQUERYCONFIG
     * 
     * @return Criteria 标准条件式
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除查询条件:TBAPIQUERYCONFIG
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @Title TBAPIQUERYCONFIG表的创建标准内部类
     * @Description null
     */
    protected abstract static class GeneratedCriteria {
        /**
         * criteria 标准集
         */
        protected List<Criterion> criteria;

        /**
         * 构造查询条件:TBAPIQUERYCONFIG
         */
        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        /**
         * 是否验证:TBAPIQUERYCONFIG
         * 
         * @return boolean 是否有效
         */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
         * 获取所有条件集:TBAPIQUERYCONFIG
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
         * 获取条件集:TBAPIQUERYCONFIG
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
         * 增加条件:TBAPIQUERYCONFIG
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
         * 增加条件:TBAPIQUERYCONFIG
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
         * 增加条件:TBAPIQUERYCONFIG
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
        public Criteria andCFunctionidIsNull() {
            addCriterion("C_FUNCTIONID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCFunctionidIsNotNull() {
            addCriterion("C_FUNCTIONID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidEqualTo(String value) {
            addCriterion("C_FUNCTIONID =", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidNotEqualTo(String value) {
            addCriterion("C_FUNCTIONID <>", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidGreaterThan(String value) {
            addCriterion("C_FUNCTIONID >", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidGreaterThanOrEqualTo(String value) {
            addCriterion("C_FUNCTIONID >=", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidLessThan(String value) {
            addCriterion("C_FUNCTIONID <", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidLessThanOrEqualTo(String value) {
            addCriterion("C_FUNCTIONID <=", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidLike(String value) {
            addCriterion("C_FUNCTIONID like", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFunctionidNotLike(String value) {
            addCriterion("C_FUNCTIONID not like", value, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCFunctionidIn(List<String> values) {
            addCriterion("C_FUNCTIONID in", values, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCFunctionidNotIn(List<String> values) {
            addCriterion("C_FUNCTIONID not in", values, "cFunctionid");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
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
         * 条件不在区间:null
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
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCTitleIsNull() {
            addCriterion("C_TITLE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCTitleIsNotNull() {
            addCriterion("C_TITLE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTitleEqualTo(String value) {
            addCriterion("C_TITLE =", value, "cTitle");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTitleNotEqualTo(String value) {
            addCriterion("C_TITLE <>", value, "cTitle");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTitleGreaterThan(String value) {
            addCriterion("C_TITLE >", value, "cTitle");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTitleGreaterThanOrEqualTo(String value) {
            addCriterion("C_TITLE >=", value, "cTitle");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTitleLessThan(String value) {
            addCriterion("C_TITLE <", value, "cTitle");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTitleLessThanOrEqualTo(String value) {
            addCriterion("C_TITLE <=", value, "cTitle");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTitleLike(String value) {
            addCriterion("C_TITLE like", value, "cTitle");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTitleNotLike(String value) {
            addCriterion("C_TITLE not like", value, "cTitle");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCTitleIn(List<String> values) {
            addCriterion("C_TITLE in", values, "cTitle");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCTitleNotIn(List<String> values) {
            addCriterion("C_TITLE not in", values, "cTitle");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCTitleBetween(String value1, String value2) {
            addCriterion("C_TITLE between", value1, value2, "cTitle");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCTitleNotBetween(String value1, String value2) {
            addCriterion("C_TITLE not between", value1, value2, "cTitle");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCEnableIsNull() {
            addCriterion("C_ENABLE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCEnableIsNotNull() {
            addCriterion("C_ENABLE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnableEqualTo(String value) {
            addCriterion("C_ENABLE =", value, "cEnable");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnableNotEqualTo(String value) {
            addCriterion("C_ENABLE <>", value, "cEnable");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnableGreaterThan(String value) {
            addCriterion("C_ENABLE >", value, "cEnable");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnableGreaterThanOrEqualTo(String value) {
            addCriterion("C_ENABLE >=", value, "cEnable");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnableLessThan(String value) {
            addCriterion("C_ENABLE <", value, "cEnable");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnableLessThanOrEqualTo(String value) {
            addCriterion("C_ENABLE <=", value, "cEnable");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnableLike(String value) {
            addCriterion("C_ENABLE like", value, "cEnable");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEnableNotLike(String value) {
            addCriterion("C_ENABLE not like", value, "cEnable");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCEnableIn(List<String> values) {
            addCriterion("C_ENABLE in", values, "cEnable");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCEnableNotIn(List<String> values) {
            addCriterion("C_ENABLE not in", values, "cEnable");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCEnableBetween(String value1, String value2) {
            addCriterion("C_ENABLE between", value1, value2, "cEnable");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCEnableNotBetween(String value1, String value2) {
            addCriterion("C_ENABLE not between", value1, value2, "cEnable");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCReloadIsNull() {
            addCriterion("C_RELOAD is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCReloadIsNotNull() {
            addCriterion("C_RELOAD is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReloadEqualTo(String value) {
            addCriterion("C_RELOAD =", value, "cReload");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReloadNotEqualTo(String value) {
            addCriterion("C_RELOAD <>", value, "cReload");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReloadGreaterThan(String value) {
            addCriterion("C_RELOAD >", value, "cReload");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReloadGreaterThanOrEqualTo(String value) {
            addCriterion("C_RELOAD >=", value, "cReload");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReloadLessThan(String value) {
            addCriterion("C_RELOAD <", value, "cReload");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReloadLessThanOrEqualTo(String value) {
            addCriterion("C_RELOAD <=", value, "cReload");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReloadLike(String value) {
            addCriterion("C_RELOAD like", value, "cReload");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReloadNotLike(String value) {
            addCriterion("C_RELOAD not like", value, "cReload");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCReloadIn(List<String> values) {
            addCriterion("C_RELOAD in", values, "cReload");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCReloadNotIn(List<String> values) {
            addCriterion("C_RELOAD not in", values, "cReload");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCReloadBetween(String value1, String value2) {
            addCriterion("C_RELOAD between", value1, value2, "cReload");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCReloadNotBetween(String value1, String value2) {
            addCriterion("C_RELOAD not between", value1, value2, "cReload");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCPaginationIsNull() {
            addCriterion("C_PAGINATION is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCPaginationIsNotNull() {
            addCriterion("C_PAGINATION is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPaginationEqualTo(String value) {
            addCriterion("C_PAGINATION =", value, "cPagination");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPaginationNotEqualTo(String value) {
            addCriterion("C_PAGINATION <>", value, "cPagination");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPaginationGreaterThan(String value) {
            addCriterion("C_PAGINATION >", value, "cPagination");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPaginationGreaterThanOrEqualTo(String value) {
            addCriterion("C_PAGINATION >=", value, "cPagination");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPaginationLessThan(String value) {
            addCriterion("C_PAGINATION <", value, "cPagination");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPaginationLessThanOrEqualTo(String value) {
            addCriterion("C_PAGINATION <=", value, "cPagination");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPaginationLike(String value) {
            addCriterion("C_PAGINATION like", value, "cPagination");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCPaginationNotLike(String value) {
            addCriterion("C_PAGINATION not like", value, "cPagination");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCPaginationIn(List<String> values) {
            addCriterion("C_PAGINATION in", values, "cPagination");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCPaginationNotIn(List<String> values) {
            addCriterion("C_PAGINATION not in", values, "cPagination");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCPaginationBetween(String value1, String value2) {
            addCriterion("C_PAGINATION between", value1, value2, "cPagination");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCPaginationNotBetween(String value1, String value2) {
            addCriterion("C_PAGINATION not between", value1, value2, "cPagination");
            return (Criteria) this;
        }
    }

    /**
     * @Title TBAPIQUERYCONFIG表的创建标准内部类
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
     * @Title TBAPIQUERYCONFIG表的内部标准类
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