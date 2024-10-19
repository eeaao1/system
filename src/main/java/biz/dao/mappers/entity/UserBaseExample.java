/*
 * UserBaseExample.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @Date 2023-08-10 13:56:08
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
public class UserBaseExample {
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
     * 构造查询条件:USER_BASE
     */
    public UserBaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 设置排序字段:USER_BASE
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 获取排序字段:USER_BASE
     * 
     * @return String 排序规则
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置过滤重复数据:USER_BASE
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 是否过滤重复数据:USER_BASE
     * 
     * @return boolean 是否过滤重复
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获取当前的查询条件实例:USER_BASE
     * 
     * @return List<Criteria> 获取标准集
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 根据主键来更新符合条件的数据库记录:USER_BASE
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 根据主键来更新符合条件的数据库记录:USER_BASE
     * 
     * @return Criteria 标准条件式
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 创建一个查询条件:USER_BASE
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
     * 内部构建查询条件对象:USER_BASE
     * 
     * @return Criteria 标准条件式
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除查询条件:USER_BASE
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @Title USER_BASE表的创建标准内部类
     * @Description null
     */
    protected abstract static class GeneratedCriteria {
        /**
         * criteria 标准集
         */
        protected List<Criterion> criteria;

        /**
         * 构造查询条件:USER_BASE
         */
        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        /**
         * 是否验证:USER_BASE
         * 
         * @return boolean 是否有效
         */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
         * 获取所有条件集:USER_BASE
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
         * 获取条件集:USER_BASE
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
         * 增加条件:USER_BASE
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
         * 增加条件:USER_BASE
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
         * 增加条件:USER_BASE
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
        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andUserPasswordIsNull() {
            addCriterion("USER_PASSWORD is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andUserPasswordIsNotNull() {
            addCriterion("USER_PASSWORD is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("USER_PASSWORD =", value, "userPassword");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("USER_PASSWORD <>", value, "userPassword");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("USER_PASSWORD >", value, "userPassword");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD >=", value, "userPassword");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("USER_PASSWORD <", value, "userPassword");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD <=", value, "userPassword");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserPasswordLike(String value) {
            addCriterion("USER_PASSWORD like", value, "userPassword");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("USER_PASSWORD not like", value, "userPassword");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("USER_PASSWORD in", values, "userPassword");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("USER_PASSWORD not in", values, "userPassword");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andLastTokenIsNull() {
            addCriterion("LAST_TOKEN is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andLastTokenIsNotNull() {
            addCriterion("LAST_TOKEN is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastTokenEqualTo(String value) {
            addCriterion("LAST_TOKEN =", value, "lastToken");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastTokenNotEqualTo(String value) {
            addCriterion("LAST_TOKEN <>", value, "lastToken");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastTokenGreaterThan(String value) {
            addCriterion("LAST_TOKEN >", value, "lastToken");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastTokenGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_TOKEN >=", value, "lastToken");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastTokenLessThan(String value) {
            addCriterion("LAST_TOKEN <", value, "lastToken");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastTokenLessThanOrEqualTo(String value) {
            addCriterion("LAST_TOKEN <=", value, "lastToken");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastTokenLike(String value) {
            addCriterion("LAST_TOKEN like", value, "lastToken");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastTokenNotLike(String value) {
            addCriterion("LAST_TOKEN not like", value, "lastToken");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLastTokenIn(List<String> values) {
            addCriterion("LAST_TOKEN in", values, "lastToken");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLastTokenNotIn(List<String> values) {
            addCriterion("LAST_TOKEN not in", values, "lastToken");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLastTokenBetween(String value1, String value2) {
            addCriterion("LAST_TOKEN between", value1, value2, "lastToken");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLastTokenNotBetween(String value1, String value2) {
            addCriterion("LAST_TOKEN not between", value1, value2, "lastToken");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andLastAccessTiemIsNull() {
            addCriterion("LAST_ACCESS_TIEM is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andLastAccessTiemIsNotNull() {
            addCriterion("LAST_ACCESS_TIEM is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastAccessTiemEqualTo(Date value) {
            addCriterion("LAST_ACCESS_TIEM =", value, "lastAccessTiem");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastAccessTiemNotEqualTo(Date value) {
            addCriterion("LAST_ACCESS_TIEM <>", value, "lastAccessTiem");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastAccessTiemGreaterThan(Date value) {
            addCriterion("LAST_ACCESS_TIEM >", value, "lastAccessTiem");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastAccessTiemGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_ACCESS_TIEM >=", value, "lastAccessTiem");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastAccessTiemLessThan(Date value) {
            addCriterion("LAST_ACCESS_TIEM <", value, "lastAccessTiem");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLastAccessTiemLessThanOrEqualTo(Date value) {
            addCriterion("LAST_ACCESS_TIEM <=", value, "lastAccessTiem");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLastAccessTiemIn(List<Date> values) {
            addCriterion("LAST_ACCESS_TIEM in", values, "lastAccessTiem");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andLastAccessTiemNotIn(List<Date> values) {
            addCriterion("LAST_ACCESS_TIEM not in", values, "lastAccessTiem");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLastAccessTiemBetween(Date value1, Date value2) {
            addCriterion("LAST_ACCESS_TIEM between", value1, value2, "lastAccessTiem");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andLastAccessTiemNotBetween(Date value1, Date value2) {
            addCriterion("LAST_ACCESS_TIEM not between", value1, value2, "lastAccessTiem");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andProvideTokenTiemIsNull() {
            addCriterion("PROVIDE_TOKEN_TIEM is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andProvideTokenTiemIsNotNull() {
            addCriterion("PROVIDE_TOKEN_TIEM is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andProvideTokenTiemEqualTo(Date value) {
            addCriterion("PROVIDE_TOKEN_TIEM =", value, "provideTokenTiem");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andProvideTokenTiemNotEqualTo(Date value) {
            addCriterion("PROVIDE_TOKEN_TIEM <>", value, "provideTokenTiem");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andProvideTokenTiemGreaterThan(Date value) {
            addCriterion("PROVIDE_TOKEN_TIEM >", value, "provideTokenTiem");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andProvideTokenTiemGreaterThanOrEqualTo(Date value) {
            addCriterion("PROVIDE_TOKEN_TIEM >=", value, "provideTokenTiem");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andProvideTokenTiemLessThan(Date value) {
            addCriterion("PROVIDE_TOKEN_TIEM <", value, "provideTokenTiem");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andProvideTokenTiemLessThanOrEqualTo(Date value) {
            addCriterion("PROVIDE_TOKEN_TIEM <=", value, "provideTokenTiem");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andProvideTokenTiemIn(List<Date> values) {
            addCriterion("PROVIDE_TOKEN_TIEM in", values, "provideTokenTiem");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andProvideTokenTiemNotIn(List<Date> values) {
            addCriterion("PROVIDE_TOKEN_TIEM not in", values, "provideTokenTiem");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andProvideTokenTiemBetween(Date value1, Date value2) {
            addCriterion("PROVIDE_TOKEN_TIEM between", value1, value2, "provideTokenTiem");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andProvideTokenTiemNotBetween(Date value1, Date value2) {
            addCriterion("PROVIDE_TOKEN_TIEM not between", value1, value2, "provideTokenTiem");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * @Title USER_BASE表的创建标准内部类
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
     * @Title USER_BASE表的内部标准类
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