/*
 * TapiqueryconfigExample.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @Date 2023-08-19 12:36:52
 * Database Table Remarks:
 * 查询接口配置
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
public class TapiqueryconfigExample {
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
     * 构造查询条件:TAPIQUERYCONFIG
     */
    public TapiqueryconfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 设置排序字段:TAPIQUERYCONFIG
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 获取排序字段:TAPIQUERYCONFIG
     * 
     * @return String 排序规则
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置过滤重复数据:TAPIQUERYCONFIG
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 是否过滤重复数据:TAPIQUERYCONFIG
     * 
     * @return boolean 是否过滤重复
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获取当前的查询条件实例:TAPIQUERYCONFIG
     * 
     * @return List<Criteria> 获取标准集
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 根据主键来更新符合条件的数据库记录:TAPIQUERYCONFIG
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 根据主键来更新符合条件的数据库记录:TAPIQUERYCONFIG
     * 
     * @return Criteria 标准条件式
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 创建一个查询条件:TAPIQUERYCONFIG
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
     * 内部构建查询条件对象:TAPIQUERYCONFIG
     * 
     * @return Criteria 标准条件式
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除查询条件:TAPIQUERYCONFIG
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @Title TAPIQUERYCONFIG表的创建标准内部类
     * @Description 查询接口配置
     */
    protected abstract static class GeneratedCriteria {
        /**
         * criteria 标准集
         */
        protected List<Criterion> criteria;

        /**
         * 构造查询条件:TAPIQUERYCONFIG
         */
        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        /**
         * 是否验证:TAPIQUERYCONFIG
         * 
         * @return boolean 是否有效
         */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
         * 获取所有条件集:TAPIQUERYCONFIG
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
         * 获取条件集:TAPIQUERYCONFIG
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
         * 增加条件:TAPIQUERYCONFIG
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
         * 增加条件:TAPIQUERYCONFIG
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
         * 增加条件:TAPIQUERYCONFIG
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
        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
         * 条件为空:接口ID
         * 
         * @return 标准
         */
        public Criteria andInterfaceIdIsNull() {
            addCriterion("INTERFACE_ID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:接口ID
         * 
         * @return 标准
         */
        public Criteria andInterfaceIdIsNotNull() {
            addCriterion("INTERFACE_ID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:接口ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andInterfaceIdEqualTo(String value) {
            addCriterion("INTERFACE_ID =", value, "interfaceId");
            return (Criteria) this;
        }

        /**
         * 条件不相等:接口ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andInterfaceIdNotEqualTo(String value) {
            addCriterion("INTERFACE_ID <>", value, "interfaceId");
            return (Criteria) this;
        }

        /**
         * 条件大于:接口ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andInterfaceIdGreaterThan(String value) {
            addCriterion("INTERFACE_ID >", value, "interfaceId");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:接口ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andInterfaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("INTERFACE_ID >=", value, "interfaceId");
            return (Criteria) this;
        }

        /**
         * 条件小于:接口ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andInterfaceIdLessThan(String value) {
            addCriterion("INTERFACE_ID <", value, "interfaceId");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:接口ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andInterfaceIdLessThanOrEqualTo(String value) {
            addCriterion("INTERFACE_ID <=", value, "interfaceId");
            return (Criteria) this;
        }

        /**
         * 条件相似:接口ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andInterfaceIdLike(String value) {
            addCriterion("INTERFACE_ID like", value, "interfaceId");
            return (Criteria) this;
        }

        /**
         * 条件不相似:接口ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andInterfaceIdNotLike(String value) {
            addCriterion("INTERFACE_ID not like", value, "interfaceId");
            return (Criteria) this;
        }

        /**
         * 条件在范围:接口ID
         *
         * @param values 接口ID
         * @return 标准
         */
        public Criteria andInterfaceIdIn(List<String> values) {
            addCriterion("INTERFACE_ID in", values, "interfaceId");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:接口ID
         *
         * @param values 接口ID
         * @return 标准
         */
        public Criteria andInterfaceIdNotIn(List<String> values) {
            addCriterion("INTERFACE_ID not in", values, "interfaceId");
            return (Criteria) this;
        }

        /**
         * 条件在区间:接口ID
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andInterfaceIdBetween(String value1, String value2) {
            addCriterion("INTERFACE_ID between", value1, value2, "interfaceId");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:接口ID
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andInterfaceIdNotBetween(String value1, String value2) {
            addCriterion("INTERFACE_ID not between", value1, value2, "interfaceId");
            return (Criteria) this;
        }

        /**
         * 条件为空:是否重加载
         * 
         * @return 标准
         */
        public Criteria andReloadIsNull() {
            addCriterion("RELOAD is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:是否重加载
         * 
         * @return 标准
         */
        public Criteria andReloadIsNotNull() {
            addCriterion("RELOAD is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:是否重加载
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andReloadEqualTo(String value) {
            addCriterion("RELOAD =", value, "reload");
            return (Criteria) this;
        }

        /**
         * 条件不相等:是否重加载
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andReloadNotEqualTo(String value) {
            addCriterion("RELOAD <>", value, "reload");
            return (Criteria) this;
        }

        /**
         * 条件大于:是否重加载
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andReloadGreaterThan(String value) {
            addCriterion("RELOAD >", value, "reload");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:是否重加载
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andReloadGreaterThanOrEqualTo(String value) {
            addCriterion("RELOAD >=", value, "reload");
            return (Criteria) this;
        }

        /**
         * 条件小于:是否重加载
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andReloadLessThan(String value) {
            addCriterion("RELOAD <", value, "reload");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:是否重加载
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andReloadLessThanOrEqualTo(String value) {
            addCriterion("RELOAD <=", value, "reload");
            return (Criteria) this;
        }

        /**
         * 条件相似:是否重加载
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andReloadLike(String value) {
            addCriterion("RELOAD like", value, "reload");
            return (Criteria) this;
        }

        /**
         * 条件不相似:是否重加载
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andReloadNotLike(String value) {
            addCriterion("RELOAD not like", value, "reload");
            return (Criteria) this;
        }

        /**
         * 条件在范围:是否重加载
         *
         * @param values 是否重加载
         * @return 标准
         */
        public Criteria andReloadIn(List<String> values) {
            addCriterion("RELOAD in", values, "reload");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:是否重加载
         *
         * @param values 是否重加载
         * @return 标准
         */
        public Criteria andReloadNotIn(List<String> values) {
            addCriterion("RELOAD not in", values, "reload");
            return (Criteria) this;
        }

        /**
         * 条件在区间:是否重加载
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andReloadBetween(String value1, String value2) {
            addCriterion("RELOAD between", value1, value2, "reload");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:是否重加载
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andReloadNotBetween(String value1, String value2) {
            addCriterion("RELOAD not between", value1, value2, "reload");
            return (Criteria) this;
        }

        /**
         * 条件为空:是否分页
         * 
         * @return 标准
         */
        public Criteria andPaginationIsNull() {
            addCriterion("PAGINATION is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:是否分页
         * 
         * @return 标准
         */
        public Criteria andPaginationIsNotNull() {
            addCriterion("PAGINATION is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:是否分页
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andPaginationEqualTo(String value) {
            addCriterion("PAGINATION =", value, "pagination");
            return (Criteria) this;
        }

        /**
         * 条件不相等:是否分页
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andPaginationNotEqualTo(String value) {
            addCriterion("PAGINATION <>", value, "pagination");
            return (Criteria) this;
        }

        /**
         * 条件大于:是否分页
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andPaginationGreaterThan(String value) {
            addCriterion("PAGINATION >", value, "pagination");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:是否分页
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andPaginationGreaterThanOrEqualTo(String value) {
            addCriterion("PAGINATION >=", value, "pagination");
            return (Criteria) this;
        }

        /**
         * 条件小于:是否分页
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andPaginationLessThan(String value) {
            addCriterion("PAGINATION <", value, "pagination");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:是否分页
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andPaginationLessThanOrEqualTo(String value) {
            addCriterion("PAGINATION <=", value, "pagination");
            return (Criteria) this;
        }

        /**
         * 条件相似:是否分页
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andPaginationLike(String value) {
            addCriterion("PAGINATION like", value, "pagination");
            return (Criteria) this;
        }

        /**
         * 条件不相似:是否分页
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andPaginationNotLike(String value) {
            addCriterion("PAGINATION not like", value, "pagination");
            return (Criteria) this;
        }

        /**
         * 条件在范围:是否分页
         *
         * @param values 是否分页
         * @return 标准
         */
        public Criteria andPaginationIn(List<String> values) {
            addCriterion("PAGINATION in", values, "pagination");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:是否分页
         *
         * @param values 是否分页
         * @return 标准
         */
        public Criteria andPaginationNotIn(List<String> values) {
            addCriterion("PAGINATION not in", values, "pagination");
            return (Criteria) this;
        }

        /**
         * 条件在区间:是否分页
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andPaginationBetween(String value1, String value2) {
            addCriterion("PAGINATION between", value1, value2, "pagination");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:是否分页
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andPaginationNotBetween(String value1, String value2) {
            addCriterion("PAGINATION not between", value1, value2, "pagination");
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
        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andVersionEqualTo(BigDecimal value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andVersionNotEqualTo(BigDecimal value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andVersionGreaterThan(BigDecimal value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andVersionLessThan(BigDecimal value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andVersionIn(List<BigDecimal> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andVersionNotIn(List<BigDecimal> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }
    }

    /**
     * @Title TAPIQUERYCONFIG表的创建标准内部类
     * @Description 查询接口配置
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
     * @Title TAPIQUERYCONFIG表的内部标准类
     * @Description 查询接口配置
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