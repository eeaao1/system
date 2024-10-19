/*
 * TblockcontrolsExample.java
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
 * @Date 2023-08-15 16:32:21
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
public class TblockcontrolsExample {
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
     * 构造查询条件:TBLOCKCONTROLS
     */
    public TblockcontrolsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 设置排序字段:TBLOCKCONTROLS
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 获取排序字段:TBLOCKCONTROLS
     * 
     * @return String 排序规则
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置过滤重复数据:TBLOCKCONTROLS
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 是否过滤重复数据:TBLOCKCONTROLS
     * 
     * @return boolean 是否过滤重复
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获取当前的查询条件实例:TBLOCKCONTROLS
     * 
     * @return List<Criteria> 获取标准集
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 根据主键来更新符合条件的数据库记录:TBLOCKCONTROLS
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 根据主键来更新符合条件的数据库记录:TBLOCKCONTROLS
     * 
     * @return Criteria 标准条件式
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 创建一个查询条件:TBLOCKCONTROLS
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
     * 内部构建查询条件对象:TBLOCKCONTROLS
     * 
     * @return Criteria 标准条件式
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除查询条件:TBLOCKCONTROLS
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @Title TBLOCKCONTROLS表的创建标准内部类
     * @Description null
     */
    protected abstract static class GeneratedCriteria {
        /**
         * criteria 标准集
         */
        protected List<Criterion> criteria;

        /**
         * 构造查询条件:TBLOCKCONTROLS
         */
        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        /**
         * 是否验证:TBLOCKCONTROLS
         * 
         * @return boolean 是否有效
         */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
         * 获取所有条件集:TBLOCKCONTROLS
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
         * 获取条件集:TBLOCKCONTROLS
         * 
         * @return List<Criterion> 标准集
         */
        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
         * 增加条件:TBLOCKCONTROLS
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
         * 增加条件:TBLOCKCONTROLS
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
         * 增加条件:TBLOCKCONTROLS
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
         * 条件为空:该表主键
         * 
         * @return 标准
         */
        public Criteria andCBlockcontrolidIsNull() {
            addCriterion("C_BLOCKCONTROLID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:该表主键
         * 
         * @return 标准
         */
        public Criteria andCBlockcontrolidIsNotNull() {
            addCriterion("C_BLOCKCONTROLID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:该表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockcontrolidEqualTo(String value) {
            addCriterion("C_BLOCKCONTROLID =", value, "cBlockcontrolid");
            return (Criteria) this;
        }

        /**
         * 条件不相等:该表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockcontrolidNotEqualTo(String value) {
            addCriterion("C_BLOCKCONTROLID <>", value, "cBlockcontrolid");
            return (Criteria) this;
        }

        /**
         * 条件大于:该表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockcontrolidGreaterThan(String value) {
            addCriterion("C_BLOCKCONTROLID >", value, "cBlockcontrolid");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:该表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockcontrolidGreaterThanOrEqualTo(String value) {
            addCriterion("C_BLOCKCONTROLID >=", value, "cBlockcontrolid");
            return (Criteria) this;
        }

        /**
         * 条件小于:该表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockcontrolidLessThan(String value) {
            addCriterion("C_BLOCKCONTROLID <", value, "cBlockcontrolid");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:该表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockcontrolidLessThanOrEqualTo(String value) {
            addCriterion("C_BLOCKCONTROLID <=", value, "cBlockcontrolid");
            return (Criteria) this;
        }

        /**
         * 条件相似:该表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockcontrolidLike(String value) {
            addCriterion("C_BLOCKCONTROLID like", value, "cBlockcontrolid");
            return (Criteria) this;
        }

        /**
         * 条件不相似:该表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockcontrolidNotLike(String value) {
            addCriterion("C_BLOCKCONTROLID not like", value, "cBlockcontrolid");
            return (Criteria) this;
        }

        /**
         * 条件在范围:该表主键
         *
         * @param values 该表主键
         * @return 标准
         */
        public Criteria andCBlockcontrolidIn(List<String> values) {
            addCriterion("C_BLOCKCONTROLID in", values, "cBlockcontrolid");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:该表主键
         *
         * @param values 该表主键
         * @return 标准
         */
        public Criteria andCBlockcontrolidNotIn(List<String> values) {
            addCriterion("C_BLOCKCONTROLID not in", values, "cBlockcontrolid");
            return (Criteria) this;
        }

        /**
         * 条件在区间:该表主键
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCBlockcontrolidBetween(String value1, String value2) {
            addCriterion("C_BLOCKCONTROLID between", value1, value2, "cBlockcontrolid");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:该表主键
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCBlockcontrolidNotBetween(String value1, String value2) {
            addCriterion("C_BLOCKCONTROLID not between", value1, value2, "cBlockcontrolid");
            return (Criteria) this;
        }

        /**
         * 条件为空:关联区块配置表主键
         * 
         * @return 标准
         */
        public Criteria andCBlockidIsNull() {
            addCriterion("C_BLOCKID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:关联区块配置表主键
         * 
         * @return 标准
         */
        public Criteria andCBlockidIsNotNull() {
            addCriterion("C_BLOCKID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:关联区块配置表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidEqualTo(String value) {
            addCriterion("C_BLOCKID =", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件不相等:关联区块配置表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidNotEqualTo(String value) {
            addCriterion("C_BLOCKID <>", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件大于:关联区块配置表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidGreaterThan(String value) {
            addCriterion("C_BLOCKID >", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:关联区块配置表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidGreaterThanOrEqualTo(String value) {
            addCriterion("C_BLOCKID >=", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件小于:关联区块配置表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidLessThan(String value) {
            addCriterion("C_BLOCKID <", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:关联区块配置表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidLessThanOrEqualTo(String value) {
            addCriterion("C_BLOCKID <=", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件相似:关联区块配置表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidLike(String value) {
            addCriterion("C_BLOCKID like", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件不相似:关联区块配置表主键
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBlockidNotLike(String value) {
            addCriterion("C_BLOCKID not like", value, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件在范围:关联区块配置表主键
         *
         * @param values 关联区块配置表主键
         * @return 标准
         */
        public Criteria andCBlockidIn(List<String> values) {
            addCriterion("C_BLOCKID in", values, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:关联区块配置表主键
         *
         * @param values 关联区块配置表主键
         * @return 标准
         */
        public Criteria andCBlockidNotIn(List<String> values) {
            addCriterion("C_BLOCKID not in", values, "cBlockid");
            return (Criteria) this;
        }

        /**
         * 条件在区间:关联区块配置表主键
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
         * 条件不在区间:关联区块配置表主键
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
         * 条件为空:顺序号
         * 
         * @return 标准
         */
        public Criteria andLNumIsNull() {
            addCriterion("L_NUM is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:顺序号
         * 
         * @return 标准
         */
        public Criteria andLNumIsNotNull() {
            addCriterion("L_NUM is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:顺序号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLNumEqualTo(BigDecimal value) {
            addCriterion("L_NUM =", value, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件不相等:顺序号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLNumNotEqualTo(BigDecimal value) {
            addCriterion("L_NUM <>", value, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件大于:顺序号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLNumGreaterThan(BigDecimal value) {
            addCriterion("L_NUM >", value, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:顺序号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_NUM >=", value, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件小于:顺序号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLNumLessThan(BigDecimal value) {
            addCriterion("L_NUM <", value, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:顺序号
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_NUM <=", value, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件在范围:顺序号
         *
         * @param values 顺序号
         * @return 标准
         */
        public Criteria andLNumIn(List<BigDecimal> values) {
            addCriterion("L_NUM in", values, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:顺序号
         *
         * @param values 顺序号
         * @return 标准
         */
        public Criteria andLNumNotIn(List<BigDecimal> values) {
            addCriterion("L_NUM not in", values, "lNum");
            return (Criteria) this;
        }

        /**
         * 条件在区间:顺序号
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
         * 条件不在区间:顺序号
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
         * 条件为空:组件所占列数
         * 
         * @return 标准
         */
        public Criteria andLColsIsNull() {
            addCriterion("L_COLS is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:组件所占列数
         * 
         * @return 标准
         */
        public Criteria andLColsIsNotNull() {
            addCriterion("L_COLS is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:组件所占列数
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLColsEqualTo(BigDecimal value) {
            addCriterion("L_COLS =", value, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件不相等:组件所占列数
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLColsNotEqualTo(BigDecimal value) {
            addCriterion("L_COLS <>", value, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件大于:组件所占列数
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLColsGreaterThan(BigDecimal value) {
            addCriterion("L_COLS >", value, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:组件所占列数
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLColsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_COLS >=", value, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件小于:组件所占列数
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLColsLessThan(BigDecimal value) {
            addCriterion("L_COLS <", value, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:组件所占列数
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLColsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_COLS <=", value, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件在范围:组件所占列数
         *
         * @param values 组件所占列数
         * @return 标准
         */
        public Criteria andLColsIn(List<BigDecimal> values) {
            addCriterion("L_COLS in", values, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:组件所占列数
         *
         * @param values 组件所占列数
         * @return 标准
         */
        public Criteria andLColsNotIn(List<BigDecimal> values) {
            addCriterion("L_COLS not in", values, "lCols");
            return (Criteria) this;
        }

        /**
         * 条件在区间:组件所占列数
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
         * 条件不在区间:组件所占列数
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
         * 条件为空:是否研发中心组件
         * 
         * @return 标准
         */
        public Criteria andCIsjrescomponentIsNull() {
            addCriterion("C_ISJRESCOMPONENT is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:是否研发中心组件
         * 
         * @return 标准
         */
        public Criteria andCIsjrescomponentIsNotNull() {
            addCriterion("C_ISJRESCOMPONENT is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:是否研发中心组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentEqualTo(String value) {
            addCriterion("C_ISJRESCOMPONENT =", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件不相等:是否研发中心组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentNotEqualTo(String value) {
            addCriterion("C_ISJRESCOMPONENT <>", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件大于:是否研发中心组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentGreaterThan(String value) {
            addCriterion("C_ISJRESCOMPONENT >", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:是否研发中心组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentGreaterThanOrEqualTo(String value) {
            addCriterion("C_ISJRESCOMPONENT >=", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件小于:是否研发中心组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentLessThan(String value) {
            addCriterion("C_ISJRESCOMPONENT <", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:是否研发中心组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentLessThanOrEqualTo(String value) {
            addCriterion("C_ISJRESCOMPONENT <=", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件相似:是否研发中心组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentLike(String value) {
            addCriterion("C_ISJRESCOMPONENT like", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件不相似:是否研发中心组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCIsjrescomponentNotLike(String value) {
            addCriterion("C_ISJRESCOMPONENT not like", value, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件在范围:是否研发中心组件
         *
         * @param values 是否研发中心组件
         * @return 标准
         */
        public Criteria andCIsjrescomponentIn(List<String> values) {
            addCriterion("C_ISJRESCOMPONENT in", values, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:是否研发中心组件
         *
         * @param values 是否研发中心组件
         * @return 标准
         */
        public Criteria andCIsjrescomponentNotIn(List<String> values) {
            addCriterion("C_ISJRESCOMPONENT not in", values, "cIsjrescomponent");
            return (Criteria) this;
        }

        /**
         * 条件在区间:是否研发中心组件
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
         * 条件不在区间:是否研发中心组件
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
         * 条件为空:组件类型
         * 
         * @return 标准
         */
        public Criteria andCComponenttypeIsNull() {
            addCriterion("C_COMPONENTTYPE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:组件类型
         * 
         * @return 标准
         */
        public Criteria andCComponenttypeIsNotNull() {
            addCriterion("C_COMPONENTTYPE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:组件类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeEqualTo(String value) {
            addCriterion("C_COMPONENTTYPE =", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件不相等:组件类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeNotEqualTo(String value) {
            addCriterion("C_COMPONENTTYPE <>", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件大于:组件类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeGreaterThan(String value) {
            addCriterion("C_COMPONENTTYPE >", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:组件类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_COMPONENTTYPE >=", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件小于:组件类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeLessThan(String value) {
            addCriterion("C_COMPONENTTYPE <", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:组件类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeLessThanOrEqualTo(String value) {
            addCriterion("C_COMPONENTTYPE <=", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件相似:组件类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeLike(String value) {
            addCriterion("C_COMPONENTTYPE like", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件不相似:组件类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponenttypeNotLike(String value) {
            addCriterion("C_COMPONENTTYPE not like", value, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件在范围:组件类型
         *
         * @param values 组件类型
         * @return 标准
         */
        public Criteria andCComponenttypeIn(List<String> values) {
            addCriterion("C_COMPONENTTYPE in", values, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:组件类型
         *
         * @param values 组件类型
         * @return 标准
         */
        public Criteria andCComponenttypeNotIn(List<String> values) {
            addCriterion("C_COMPONENTTYPE not in", values, "cComponenttype");
            return (Criteria) this;
        }

        /**
         * 条件在区间:组件类型
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
         * 条件不在区间:组件类型
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
         * 条件为空:是否启用
         * 
         * @return 标准
         */
        public Criteria andCInvisibleIsNull() {
            addCriterion("C_INVISIBLE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:是否启用
         * 
         * @return 标准
         */
        public Criteria andCInvisibleIsNotNull() {
            addCriterion("C_INVISIBLE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:是否启用
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleEqualTo(String value) {
            addCriterion("C_INVISIBLE =", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件不相等:是否启用
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleNotEqualTo(String value) {
            addCriterion("C_INVISIBLE <>", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件大于:是否启用
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleGreaterThan(String value) {
            addCriterion("C_INVISIBLE >", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:是否启用
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleGreaterThanOrEqualTo(String value) {
            addCriterion("C_INVISIBLE >=", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件小于:是否启用
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleLessThan(String value) {
            addCriterion("C_INVISIBLE <", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:是否启用
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleLessThanOrEqualTo(String value) {
            addCriterion("C_INVISIBLE <=", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件相似:是否启用
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleLike(String value) {
            addCriterion("C_INVISIBLE like", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件不相似:是否启用
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInvisibleNotLike(String value) {
            addCriterion("C_INVISIBLE not like", value, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件在范围:是否启用
         *
         * @param values 是否启用
         * @return 标准
         */
        public Criteria andCInvisibleIn(List<String> values) {
            addCriterion("C_INVISIBLE in", values, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:是否启用
         *
         * @param values 是否启用
         * @return 标准
         */
        public Criteria andCInvisibleNotIn(List<String> values) {
            addCriterion("C_INVISIBLE not in", values, "cInvisible");
            return (Criteria) this;
        }

        /**
         * 条件在区间:是否启用
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
         * 条件不在区间:是否启用
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
         * 条件为空:组件标签名称
         * 
         * @return 标准
         */
        public Criteria andCLabelIsNull() {
            addCriterion("C_LABEL is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:组件标签名称
         * 
         * @return 标准
         */
        public Criteria andCLabelIsNotNull() {
            addCriterion("C_LABEL is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:组件标签名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelEqualTo(String value) {
            addCriterion("C_LABEL =", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件不相等:组件标签名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelNotEqualTo(String value) {
            addCriterion("C_LABEL <>", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件大于:组件标签名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelGreaterThan(String value) {
            addCriterion("C_LABEL >", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:组件标签名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelGreaterThanOrEqualTo(String value) {
            addCriterion("C_LABEL >=", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件小于:组件标签名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelLessThan(String value) {
            addCriterion("C_LABEL <", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:组件标签名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelLessThanOrEqualTo(String value) {
            addCriterion("C_LABEL <=", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件相似:组件标签名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelLike(String value) {
            addCriterion("C_LABEL like", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件不相似:组件标签名称
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCLabelNotLike(String value) {
            addCriterion("C_LABEL not like", value, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件在范围:组件标签名称
         *
         * @param values 组件标签名称
         * @return 标准
         */
        public Criteria andCLabelIn(List<String> values) {
            addCriterion("C_LABEL in", values, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:组件标签名称
         *
         * @param values 组件标签名称
         * @return 标准
         */
        public Criteria andCLabelNotIn(List<String> values) {
            addCriterion("C_LABEL not in", values, "cLabel");
            return (Criteria) this;
        }

        /**
         * 条件在区间:组件标签名称
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
         * 条件不在区间:组件标签名称
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
         * 条件为空:组件数据校验
         * 
         * @return 标准
         */
        public Criteria andCCheckIsNull() {
            addCriterion("C_CHECK is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:组件数据校验
         * 
         * @return 标准
         */
        public Criteria andCCheckIsNotNull() {
            addCriterion("C_CHECK is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:组件数据校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckEqualTo(String value) {
            addCriterion("C_CHECK =", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件不相等:组件数据校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckNotEqualTo(String value) {
            addCriterion("C_CHECK <>", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件大于:组件数据校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckGreaterThan(String value) {
            addCriterion("C_CHECK >", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:组件数据校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHECK >=", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件小于:组件数据校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckLessThan(String value) {
            addCriterion("C_CHECK <", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:组件数据校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckLessThanOrEqualTo(String value) {
            addCriterion("C_CHECK <=", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件相似:组件数据校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckLike(String value) {
            addCriterion("C_CHECK like", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件不相似:组件数据校验
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCCheckNotLike(String value) {
            addCriterion("C_CHECK not like", value, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件在范围:组件数据校验
         *
         * @param values 组件数据校验
         * @return 标准
         */
        public Criteria andCCheckIn(List<String> values) {
            addCriterion("C_CHECK in", values, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:组件数据校验
         *
         * @param values 组件数据校验
         * @return 标准
         */
        public Criteria andCCheckNotIn(List<String> values) {
            addCriterion("C_CHECK not in", values, "cCheck");
            return (Criteria) this;
        }

        /**
         * 条件在区间:组件数据校验
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
         * 条件不在区间:组件数据校验
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
         * 条件为空:组件值
         * 
         * @return 标准
         */
        public Criteria andCValueIsNull() {
            addCriterion("C_VALUE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:组件值
         * 
         * @return 标准
         */
        public Criteria andCValueIsNotNull() {
            addCriterion("C_VALUE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:组件值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueEqualTo(String value) {
            addCriterion("C_VALUE =", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件不相等:组件值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueNotEqualTo(String value) {
            addCriterion("C_VALUE <>", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件大于:组件值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueGreaterThan(String value) {
            addCriterion("C_VALUE >", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:组件值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueGreaterThanOrEqualTo(String value) {
            addCriterion("C_VALUE >=", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件小于:组件值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueLessThan(String value) {
            addCriterion("C_VALUE <", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:组件值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueLessThanOrEqualTo(String value) {
            addCriterion("C_VALUE <=", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件相似:组件值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueLike(String value) {
            addCriterion("C_VALUE like", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件不相似:组件值
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValueNotLike(String value) {
            addCriterion("C_VALUE not like", value, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件在范围:组件值
         *
         * @param values 组件值
         * @return 标准
         */
        public Criteria andCValueIn(List<String> values) {
            addCriterion("C_VALUE in", values, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:组件值
         *
         * @param values 组件值
         * @return 标准
         */
        public Criteria andCValueNotIn(List<String> values) {
            addCriterion("C_VALUE not in", values, "cValue");
            return (Criteria) this;
        }

        /**
         * 条件在区间:组件值
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
         * 条件不在区间:组件值
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
         * 条件为空:用于日期组等存在两个value的组件
         * 
         * @return 标准
         */
        public Criteria andCValue2IsNull() {
            addCriterion("C_VALUE2 is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:用于日期组等存在两个value的组件
         * 
         * @return 标准
         */
        public Criteria andCValue2IsNotNull() {
            addCriterion("C_VALUE2 is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:用于日期组等存在两个value的组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValue2EqualTo(String value) {
            addCriterion("C_VALUE2 =", value, "cValue2");
            return (Criteria) this;
        }

        /**
         * 条件不相等:用于日期组等存在两个value的组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValue2NotEqualTo(String value) {
            addCriterion("C_VALUE2 <>", value, "cValue2");
            return (Criteria) this;
        }

        /**
         * 条件大于:用于日期组等存在两个value的组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValue2GreaterThan(String value) {
            addCriterion("C_VALUE2 >", value, "cValue2");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:用于日期组等存在两个value的组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValue2GreaterThanOrEqualTo(String value) {
            addCriterion("C_VALUE2 >=", value, "cValue2");
            return (Criteria) this;
        }

        /**
         * 条件小于:用于日期组等存在两个value的组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValue2LessThan(String value) {
            addCriterion("C_VALUE2 <", value, "cValue2");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:用于日期组等存在两个value的组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValue2LessThanOrEqualTo(String value) {
            addCriterion("C_VALUE2 <=", value, "cValue2");
            return (Criteria) this;
        }

        /**
         * 条件相似:用于日期组等存在两个value的组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValue2Like(String value) {
            addCriterion("C_VALUE2 like", value, "cValue2");
            return (Criteria) this;
        }

        /**
         * 条件不相似:用于日期组等存在两个value的组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCValue2NotLike(String value) {
            addCriterion("C_VALUE2 not like", value, "cValue2");
            return (Criteria) this;
        }

        /**
         * 条件在范围:用于日期组等存在两个value的组件
         *
         * @param values 用于日期组等存在两个value的组件
         * @return 标准
         */
        public Criteria andCValue2In(List<String> values) {
            addCriterion("C_VALUE2 in", values, "cValue2");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:用于日期组等存在两个value的组件
         *
         * @param values 用于日期组等存在两个value的组件
         * @return 标准
         */
        public Criteria andCValue2NotIn(List<String> values) {
            addCriterion("C_VALUE2 not in", values, "cValue2");
            return (Criteria) this;
        }

        /**
         * 条件在区间:用于日期组等存在两个value的组件
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCValue2Between(String value1, String value2) {
            addCriterion("C_VALUE2 between", value1, value2, "cValue2");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:用于日期组等存在两个value的组件
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCValue2NotBetween(String value1, String value2) {
            addCriterion("C_VALUE2 not between", value1, value2, "cValue2");
            return (Criteria) this;
        }

        /**
         * 条件为空:组件name属性
         * 
         * @return 标准
         */
        public Criteria andCNameIsNull() {
            addCriterion("C_NAME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:组件name属性
         * 
         * @return 标准
         */
        public Criteria andCNameIsNotNull() {
            addCriterion("C_NAME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:组件name属性
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameEqualTo(String value) {
            addCriterion("C_NAME =", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件不相等:组件name属性
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("C_NAME <>", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件大于:组件name属性
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameGreaterThan(String value) {
            addCriterion("C_NAME >", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:组件name属性
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME >=", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件小于:组件name属性
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameLessThan(String value) {
            addCriterion("C_NAME <", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:组件name属性
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("C_NAME <=", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件相似:组件name属性
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameLike(String value) {
            addCriterion("C_NAME like", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件不相似:组件name属性
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCNameNotLike(String value) {
            addCriterion("C_NAME not like", value, "cName");
            return (Criteria) this;
        }

        /**
         * 条件在范围:组件name属性
         *
         * @param values 组件name属性
         * @return 标准
         */
        public Criteria andCNameIn(List<String> values) {
            addCriterion("C_NAME in", values, "cName");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:组件name属性
         *
         * @param values 组件name属性
         * @return 标准
         */
        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("C_NAME not in", values, "cName");
            return (Criteria) this;
        }

        /**
         * 条件在区间:组件name属性
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
         * 条件不在区间:组件name属性
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
         * 条件为空:组件name（用于日期组等需要两个name的组件）
         * 
         * @return 标准
         */
        public Criteria andCName2IsNull() {
            addCriterion("C_NAME2 is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:组件name（用于日期组等需要两个name的组件）
         * 
         * @return 标准
         */
        public Criteria andCName2IsNotNull() {
            addCriterion("C_NAME2 is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:组件name（用于日期组等需要两个name的组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCName2EqualTo(String value) {
            addCriterion("C_NAME2 =", value, "cName2");
            return (Criteria) this;
        }

        /**
         * 条件不相等:组件name（用于日期组等需要两个name的组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCName2NotEqualTo(String value) {
            addCriterion("C_NAME2 <>", value, "cName2");
            return (Criteria) this;
        }

        /**
         * 条件大于:组件name（用于日期组等需要两个name的组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCName2GreaterThan(String value) {
            addCriterion("C_NAME2 >", value, "cName2");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:组件name（用于日期组等需要两个name的组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCName2GreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME2 >=", value, "cName2");
            return (Criteria) this;
        }

        /**
         * 条件小于:组件name（用于日期组等需要两个name的组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCName2LessThan(String value) {
            addCriterion("C_NAME2 <", value, "cName2");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:组件name（用于日期组等需要两个name的组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCName2LessThanOrEqualTo(String value) {
            addCriterion("C_NAME2 <=", value, "cName2");
            return (Criteria) this;
        }

        /**
         * 条件相似:组件name（用于日期组等需要两个name的组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCName2Like(String value) {
            addCriterion("C_NAME2 like", value, "cName2");
            return (Criteria) this;
        }

        /**
         * 条件不相似:组件name（用于日期组等需要两个name的组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCName2NotLike(String value) {
            addCriterion("C_NAME2 not like", value, "cName2");
            return (Criteria) this;
        }

        /**
         * 条件在范围:组件name（用于日期组等需要两个name的组件）
         *
         * @param values 组件name（用于日期组等需要两个name的组件）
         * @return 标准
         */
        public Criteria andCName2In(List<String> values) {
            addCriterion("C_NAME2 in", values, "cName2");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:组件name（用于日期组等需要两个name的组件）
         *
         * @param values 组件name（用于日期组等需要两个name的组件）
         * @return 标准
         */
        public Criteria andCName2NotIn(List<String> values) {
            addCriterion("C_NAME2 not in", values, "cName2");
            return (Criteria) this;
        }

        /**
         * 条件在区间:组件name（用于日期组等需要两个name的组件）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCName2Between(String value1, String value2) {
            addCriterion("C_NAME2 between", value1, value2, "cName2");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:组件name（用于日期组等需要两个name的组件）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCName2NotBetween(String value1, String value2) {
            addCriterion("C_NAME2 not between", value1, value2, "cName2");
            return (Criteria) this;
        }

        /**
         * 条件为空:数据字典
         * 
         * @return 标准
         */
        public Criteria andCDictnameIsNull() {
            addCriterion("C_DICTNAME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:数据字典
         * 
         * @return 标准
         */
        public Criteria andCDictnameIsNotNull() {
            addCriterion("C_DICTNAME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:数据字典
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameEqualTo(String value) {
            addCriterion("C_DICTNAME =", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件不相等:数据字典
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameNotEqualTo(String value) {
            addCriterion("C_DICTNAME <>", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件大于:数据字典
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameGreaterThan(String value) {
            addCriterion("C_DICTNAME >", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:数据字典
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameGreaterThanOrEqualTo(String value) {
            addCriterion("C_DICTNAME >=", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件小于:数据字典
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameLessThan(String value) {
            addCriterion("C_DICTNAME <", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:数据字典
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameLessThanOrEqualTo(String value) {
            addCriterion("C_DICTNAME <=", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件相似:数据字典
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameLike(String value) {
            addCriterion("C_DICTNAME like", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件不相似:数据字典
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDictnameNotLike(String value) {
            addCriterion("C_DICTNAME not like", value, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件在范围:数据字典
         *
         * @param values 数据字典
         * @return 标准
         */
        public Criteria andCDictnameIn(List<String> values) {
            addCriterion("C_DICTNAME in", values, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:数据字典
         *
         * @param values 数据字典
         * @return 标准
         */
        public Criteria andCDictnameNotIn(List<String> values) {
            addCriterion("C_DICTNAME not in", values, "cDictname");
            return (Criteria) this;
        }

        /**
         * 条件在区间:数据字典
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
         * 条件不在区间:数据字典
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
         * 条件为空:值域（用于手动配置数据字典）
         * 
         * @return 标准
         */
        public Criteria andCItemsIsNull() {
            addCriterion("C_ITEMS is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:值域（用于手动配置数据字典）
         * 
         * @return 标准
         */
        public Criteria andCItemsIsNotNull() {
            addCriterion("C_ITEMS is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:值域（用于手动配置数据字典）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsEqualTo(String value) {
            addCriterion("C_ITEMS =", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件不相等:值域（用于手动配置数据字典）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsNotEqualTo(String value) {
            addCriterion("C_ITEMS <>", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件大于:值域（用于手动配置数据字典）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsGreaterThan(String value) {
            addCriterion("C_ITEMS >", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:值域（用于手动配置数据字典）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsGreaterThanOrEqualTo(String value) {
            addCriterion("C_ITEMS >=", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件小于:值域（用于手动配置数据字典）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsLessThan(String value) {
            addCriterion("C_ITEMS <", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:值域（用于手动配置数据字典）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsLessThanOrEqualTo(String value) {
            addCriterion("C_ITEMS <=", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件相似:值域（用于手动配置数据字典）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsLike(String value) {
            addCriterion("C_ITEMS like", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件不相似:值域（用于手动配置数据字典）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCItemsNotLike(String value) {
            addCriterion("C_ITEMS not like", value, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件在范围:值域（用于手动配置数据字典）
         *
         * @param values 值域（用于手动配置数据字典）
         * @return 标准
         */
        public Criteria andCItemsIn(List<String> values) {
            addCriterion("C_ITEMS in", values, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:值域（用于手动配置数据字典）
         *
         * @param values 值域（用于手动配置数据字典）
         * @return 标准
         */
        public Criteria andCItemsNotIn(List<String> values) {
            addCriterion("C_ITEMS not in", values, "cItems");
            return (Criteria) this;
        }

        /**
         * 条件在区间:值域（用于手动配置数据字典）
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
         * 条件不在区间:值域（用于手动配置数据字典）
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
         * 条件为空:是否只读
         * 
         * @return 标准
         */
        public Criteria andCReadonlyIsNull() {
            addCriterion("C_READONLY is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:是否只读
         * 
         * @return 标准
         */
        public Criteria andCReadonlyIsNotNull() {
            addCriterion("C_READONLY is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:是否只读
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReadonlyEqualTo(String value) {
            addCriterion("C_READONLY =", value, "cReadonly");
            return (Criteria) this;
        }

        /**
         * 条件不相等:是否只读
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReadonlyNotEqualTo(String value) {
            addCriterion("C_READONLY <>", value, "cReadonly");
            return (Criteria) this;
        }

        /**
         * 条件大于:是否只读
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReadonlyGreaterThan(String value) {
            addCriterion("C_READONLY >", value, "cReadonly");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:是否只读
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReadonlyGreaterThanOrEqualTo(String value) {
            addCriterion("C_READONLY >=", value, "cReadonly");
            return (Criteria) this;
        }

        /**
         * 条件小于:是否只读
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReadonlyLessThan(String value) {
            addCriterion("C_READONLY <", value, "cReadonly");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:是否只读
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReadonlyLessThanOrEqualTo(String value) {
            addCriterion("C_READONLY <=", value, "cReadonly");
            return (Criteria) this;
        }

        /**
         * 条件相似:是否只读
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReadonlyLike(String value) {
            addCriterion("C_READONLY like", value, "cReadonly");
            return (Criteria) this;
        }

        /**
         * 条件不相似:是否只读
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCReadonlyNotLike(String value) {
            addCriterion("C_READONLY not like", value, "cReadonly");
            return (Criteria) this;
        }

        /**
         * 条件在范围:是否只读
         *
         * @param values 是否只读
         * @return 标准
         */
        public Criteria andCReadonlyIn(List<String> values) {
            addCriterion("C_READONLY in", values, "cReadonly");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:是否只读
         *
         * @param values 是否只读
         * @return 标准
         */
        public Criteria andCReadonlyNotIn(List<String> values) {
            addCriterion("C_READONLY not in", values, "cReadonly");
            return (Criteria) this;
        }

        /**
         * 条件在区间:是否只读
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCReadonlyBetween(String value1, String value2) {
            addCriterion("C_READONLY between", value1, value2, "cReadonly");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:是否只读
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCReadonlyNotBetween(String value1, String value2) {
            addCriterion("C_READONLY not between", value1, value2, "cReadonly");
            return (Criteria) this;
        }

        /**
         * 条件为空:触发事件
         * 
         * @return 标准
         */
        public Criteria andCEventIsNull() {
            addCriterion("C_EVENT is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:触发事件
         * 
         * @return 标准
         */
        public Criteria andCEventIsNotNull() {
            addCriterion("C_EVENT is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventEqualTo(String value) {
            addCriterion("C_EVENT =", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件不相等:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventNotEqualTo(String value) {
            addCriterion("C_EVENT <>", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件大于:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventGreaterThan(String value) {
            addCriterion("C_EVENT >", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventGreaterThanOrEqualTo(String value) {
            addCriterion("C_EVENT >=", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件小于:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventLessThan(String value) {
            addCriterion("C_EVENT <", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventLessThanOrEqualTo(String value) {
            addCriterion("C_EVENT <=", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件相似:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventLike(String value) {
            addCriterion("C_EVENT like", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件不相似:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventNotLike(String value) {
            addCriterion("C_EVENT not like", value, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件在范围:触发事件
         *
         * @param values 触发事件
         * @return 标准
         */
        public Criteria andCEventIn(List<String> values) {
            addCriterion("C_EVENT in", values, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:触发事件
         *
         * @param values 触发事件
         * @return 标准
         */
        public Criteria andCEventNotIn(List<String> values) {
            addCriterion("C_EVENT not in", values, "cEvent");
            return (Criteria) this;
        }

        /**
         * 条件在区间:触发事件
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
         * 条件不在区间:触发事件
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
         * 条件为空:触发事件
         * 
         * @return 标准
         */
        public Criteria andCEventsIsNull() {
            addCriterion("C_EVENTS is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:触发事件
         * 
         * @return 标准
         */
        public Criteria andCEventsIsNotNull() {
            addCriterion("C_EVENTS is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsEqualTo(String value) {
            addCriterion("C_EVENTS =", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件不相等:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsNotEqualTo(String value) {
            addCriterion("C_EVENTS <>", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件大于:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsGreaterThan(String value) {
            addCriterion("C_EVENTS >", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsGreaterThanOrEqualTo(String value) {
            addCriterion("C_EVENTS >=", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件小于:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsLessThan(String value) {
            addCriterion("C_EVENTS <", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsLessThanOrEqualTo(String value) {
            addCriterion("C_EVENTS <=", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件相似:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsLike(String value) {
            addCriterion("C_EVENTS like", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件不相似:触发事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEventsNotLike(String value) {
            addCriterion("C_EVENTS not like", value, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件在范围:触发事件
         *
         * @param values 触发事件
         * @return 标准
         */
        public Criteria andCEventsIn(List<String> values) {
            addCriterion("C_EVENTS in", values, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:触发事件
         *
         * @param values 触发事件
         * @return 标准
         */
        public Criteria andCEventsNotIn(List<String> values) {
            addCriterion("C_EVENTS not in", values, "cEvents");
            return (Criteria) this;
        }

        /**
         * 条件在区间:触发事件
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
         * 条件不在区间:触发事件
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
         * 条件为空:组件ID
         * 
         * @return 标准
         */
        public Criteria andCComponentidIsNull() {
            addCriterion("C_COMPONENTID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:组件ID
         * 
         * @return 标准
         */
        public Criteria andCComponentidIsNotNull() {
            addCriterion("C_COMPONENTID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:组件ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidEqualTo(String value) {
            addCriterion("C_COMPONENTID =", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件不相等:组件ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidNotEqualTo(String value) {
            addCriterion("C_COMPONENTID <>", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件大于:组件ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidGreaterThan(String value) {
            addCriterion("C_COMPONENTID >", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:组件ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidGreaterThanOrEqualTo(String value) {
            addCriterion("C_COMPONENTID >=", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件小于:组件ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidLessThan(String value) {
            addCriterion("C_COMPONENTID <", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:组件ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidLessThanOrEqualTo(String value) {
            addCriterion("C_COMPONENTID <=", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件相似:组件ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidLike(String value) {
            addCriterion("C_COMPONENTID like", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件不相似:组件ID
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComponentidNotLike(String value) {
            addCriterion("C_COMPONENTID not like", value, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件在范围:组件ID
         *
         * @param values 组件ID
         * @return 标准
         */
        public Criteria andCComponentidIn(List<String> values) {
            addCriterion("C_COMPONENTID in", values, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:组件ID
         *
         * @param values 组件ID
         * @return 标准
         */
        public Criteria andCComponentidNotIn(List<String> values) {
            addCriterion("C_COMPONENTID not in", values, "cComponentid");
            return (Criteria) this;
        }

        /**
         * 条件在区间:组件ID
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
         * 条件不在区间:组件ID
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
         * 条件为空:是否禁用（页面依旧显示）
         * 
         * @return 标准
         */
        public Criteria andCDisabledIsNull() {
            addCriterion("C_DISABLED is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:是否禁用（页面依旧显示）
         * 
         * @return 标准
         */
        public Criteria andCDisabledIsNotNull() {
            addCriterion("C_DISABLED is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:是否禁用（页面依旧显示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledEqualTo(String value) {
            addCriterion("C_DISABLED =", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件不相等:是否禁用（页面依旧显示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledNotEqualTo(String value) {
            addCriterion("C_DISABLED <>", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件大于:是否禁用（页面依旧显示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledGreaterThan(String value) {
            addCriterion("C_DISABLED >", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:是否禁用（页面依旧显示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledGreaterThanOrEqualTo(String value) {
            addCriterion("C_DISABLED >=", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件小于:是否禁用（页面依旧显示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledLessThan(String value) {
            addCriterion("C_DISABLED <", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:是否禁用（页面依旧显示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledLessThanOrEqualTo(String value) {
            addCriterion("C_DISABLED <=", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件相似:是否禁用（页面依旧显示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledLike(String value) {
            addCriterion("C_DISABLED like", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件不相似:是否禁用（页面依旧显示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDisabledNotLike(String value) {
            addCriterion("C_DISABLED not like", value, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件在范围:是否禁用（页面依旧显示）
         *
         * @param values 是否禁用（页面依旧显示）
         * @return 标准
         */
        public Criteria andCDisabledIn(List<String> values) {
            addCriterion("C_DISABLED in", values, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:是否禁用（页面依旧显示）
         *
         * @param values 是否禁用（页面依旧显示）
         * @return 标准
         */
        public Criteria andCDisabledNotIn(List<String> values) {
            addCriterion("C_DISABLED not in", values, "cDisabled");
            return (Criteria) this;
        }

        /**
         * 条件在区间:是否禁用（页面依旧显示）
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
         * 条件不在区间:是否禁用（页面依旧显示）
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
         * 条件为空:显示分隔符，用于金额组件
         * 
         * @return 标准
         */
        public Criteria andCSplitIsNull() {
            addCriterion("C_SPLIT is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:显示分隔符，用于金额组件
         * 
         * @return 标准
         */
        public Criteria andCSplitIsNotNull() {
            addCriterion("C_SPLIT is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:显示分隔符，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSplitEqualTo(String value) {
            addCriterion("C_SPLIT =", value, "cSplit");
            return (Criteria) this;
        }

        /**
         * 条件不相等:显示分隔符，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSplitNotEqualTo(String value) {
            addCriterion("C_SPLIT <>", value, "cSplit");
            return (Criteria) this;
        }

        /**
         * 条件大于:显示分隔符，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSplitGreaterThan(String value) {
            addCriterion("C_SPLIT >", value, "cSplit");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:显示分隔符，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSplitGreaterThanOrEqualTo(String value) {
            addCriterion("C_SPLIT >=", value, "cSplit");
            return (Criteria) this;
        }

        /**
         * 条件小于:显示分隔符，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSplitLessThan(String value) {
            addCriterion("C_SPLIT <", value, "cSplit");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:显示分隔符，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSplitLessThanOrEqualTo(String value) {
            addCriterion("C_SPLIT <=", value, "cSplit");
            return (Criteria) this;
        }

        /**
         * 条件相似:显示分隔符，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSplitLike(String value) {
            addCriterion("C_SPLIT like", value, "cSplit");
            return (Criteria) this;
        }

        /**
         * 条件不相似:显示分隔符，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSplitNotLike(String value) {
            addCriterion("C_SPLIT not like", value, "cSplit");
            return (Criteria) this;
        }

        /**
         * 条件在范围:显示分隔符，用于金额组件
         *
         * @param values 显示分隔符，用于金额组件
         * @return 标准
         */
        public Criteria andCSplitIn(List<String> values) {
            addCriterion("C_SPLIT in", values, "cSplit");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:显示分隔符，用于金额组件
         *
         * @param values 显示分隔符，用于金额组件
         * @return 标准
         */
        public Criteria andCSplitNotIn(List<String> values) {
            addCriterion("C_SPLIT not in", values, "cSplit");
            return (Criteria) this;
        }

        /**
         * 条件在区间:显示分隔符，用于金额组件
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCSplitBetween(String value1, String value2) {
            addCriterion("C_SPLIT between", value1, value2, "cSplit");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:显示分隔符，用于金额组件
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCSplitNotBetween(String value1, String value2) {
            addCriterion("C_SPLIT not between", value1, value2, "cSplit");
            return (Criteria) this;
        }

        /**
         * 条件为空:是否开启大tips展示，用于金额组件
         * 
         * @return 标准
         */
        public Criteria andCBigtipsIsNull() {
            addCriterion("C_BIGTIPS is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:是否开启大tips展示，用于金额组件
         * 
         * @return 标准
         */
        public Criteria andCBigtipsIsNotNull() {
            addCriterion("C_BIGTIPS is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:是否开启大tips展示，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBigtipsEqualTo(String value) {
            addCriterion("C_BIGTIPS =", value, "cBigtips");
            return (Criteria) this;
        }

        /**
         * 条件不相等:是否开启大tips展示，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBigtipsNotEqualTo(String value) {
            addCriterion("C_BIGTIPS <>", value, "cBigtips");
            return (Criteria) this;
        }

        /**
         * 条件大于:是否开启大tips展示，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBigtipsGreaterThan(String value) {
            addCriterion("C_BIGTIPS >", value, "cBigtips");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:是否开启大tips展示，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBigtipsGreaterThanOrEqualTo(String value) {
            addCriterion("C_BIGTIPS >=", value, "cBigtips");
            return (Criteria) this;
        }

        /**
         * 条件小于:是否开启大tips展示，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBigtipsLessThan(String value) {
            addCriterion("C_BIGTIPS <", value, "cBigtips");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:是否开启大tips展示，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBigtipsLessThanOrEqualTo(String value) {
            addCriterion("C_BIGTIPS <=", value, "cBigtips");
            return (Criteria) this;
        }

        /**
         * 条件相似:是否开启大tips展示，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBigtipsLike(String value) {
            addCriterion("C_BIGTIPS like", value, "cBigtips");
            return (Criteria) this;
        }

        /**
         * 条件不相似:是否开启大tips展示，用于金额组件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCBigtipsNotLike(String value) {
            addCriterion("C_BIGTIPS not like", value, "cBigtips");
            return (Criteria) this;
        }

        /**
         * 条件在范围:是否开启大tips展示，用于金额组件
         *
         * @param values 是否开启大tips展示，用于金额组件
         * @return 标准
         */
        public Criteria andCBigtipsIn(List<String> values) {
            addCriterion("C_BIGTIPS in", values, "cBigtips");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:是否开启大tips展示，用于金额组件
         *
         * @param values 是否开启大tips展示，用于金额组件
         * @return 标准
         */
        public Criteria andCBigtipsNotIn(List<String> values) {
            addCriterion("C_BIGTIPS not in", values, "cBigtips");
            return (Criteria) this;
        }

        /**
         * 条件在区间:是否开启大tips展示，用于金额组件
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCBigtipsBetween(String value1, String value2) {
            addCriterion("C_BIGTIPS between", value1, value2, "cBigtips");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:是否开启大tips展示，用于金额组件
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCBigtipsNotBetween(String value1, String value2) {
            addCriterion("C_BIGTIPS not between", value1, value2, "cBigtips");
            return (Criteria) this;
        }

        /**
         * 条件为空:typefield的输入数据的类型
         * 
         * @return 标准
         */
        public Criteria andCInputtypeIsNull() {
            addCriterion("C_INPUTTYPE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:typefield的输入数据的类型
         * 
         * @return 标准
         */
        public Criteria andCInputtypeIsNotNull() {
            addCriterion("C_INPUTTYPE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:typefield的输入数据的类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInputtypeEqualTo(String value) {
            addCriterion("C_INPUTTYPE =", value, "cInputtype");
            return (Criteria) this;
        }

        /**
         * 条件不相等:typefield的输入数据的类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInputtypeNotEqualTo(String value) {
            addCriterion("C_INPUTTYPE <>", value, "cInputtype");
            return (Criteria) this;
        }

        /**
         * 条件大于:typefield的输入数据的类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInputtypeGreaterThan(String value) {
            addCriterion("C_INPUTTYPE >", value, "cInputtype");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:typefield的输入数据的类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInputtypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_INPUTTYPE >=", value, "cInputtype");
            return (Criteria) this;
        }

        /**
         * 条件小于:typefield的输入数据的类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInputtypeLessThan(String value) {
            addCriterion("C_INPUTTYPE <", value, "cInputtype");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:typefield的输入数据的类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInputtypeLessThanOrEqualTo(String value) {
            addCriterion("C_INPUTTYPE <=", value, "cInputtype");
            return (Criteria) this;
        }

        /**
         * 条件相似:typefield的输入数据的类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInputtypeLike(String value) {
            addCriterion("C_INPUTTYPE like", value, "cInputtype");
            return (Criteria) this;
        }

        /**
         * 条件不相似:typefield的输入数据的类型
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCInputtypeNotLike(String value) {
            addCriterion("C_INPUTTYPE not like", value, "cInputtype");
            return (Criteria) this;
        }

        /**
         * 条件在范围:typefield的输入数据的类型
         *
         * @param values typefield的输入数据的类型
         * @return 标准
         */
        public Criteria andCInputtypeIn(List<String> values) {
            addCriterion("C_INPUTTYPE in", values, "cInputtype");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:typefield的输入数据的类型
         *
         * @param values typefield的输入数据的类型
         * @return 标准
         */
        public Criteria andCInputtypeNotIn(List<String> values) {
            addCriterion("C_INPUTTYPE not in", values, "cInputtype");
            return (Criteria) this;
        }

        /**
         * 条件在区间:typefield的输入数据的类型
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCInputtypeBetween(String value1, String value2) {
            addCriterion("C_INPUTTYPE between", value1, value2, "cInputtype");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:typefield的输入数据的类型
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCInputtypeNotBetween(String value1, String value2) {
            addCriterion("C_INPUTTYPE not between", value1, value2, "cInputtype");
            return (Criteria) this;
        }

        /**
         * 条件为空:整数位数需要保留几位数
         * 
         * @return 标准
         */
        public Criteria andLMaxlengthIsNull() {
            addCriterion("L_MAXLENGTH is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:整数位数需要保留几位数
         * 
         * @return 标准
         */
        public Criteria andLMaxlengthIsNotNull() {
            addCriterion("L_MAXLENGTH is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:整数位数需要保留几位数
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLMaxlengthEqualTo(BigDecimal value) {
            addCriterion("L_MAXLENGTH =", value, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件不相等:整数位数需要保留几位数
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLMaxlengthNotEqualTo(BigDecimal value) {
            addCriterion("L_MAXLENGTH <>", value, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件大于:整数位数需要保留几位数
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLMaxlengthGreaterThan(BigDecimal value) {
            addCriterion("L_MAXLENGTH >", value, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:整数位数需要保留几位数
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLMaxlengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_MAXLENGTH >=", value, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件小于:整数位数需要保留几位数
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLMaxlengthLessThan(BigDecimal value) {
            addCriterion("L_MAXLENGTH <", value, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:整数位数需要保留几位数
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLMaxlengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_MAXLENGTH <=", value, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件在范围:整数位数需要保留几位数
         *
         * @param values 整数位数需要保留几位数
         * @return 标准
         */
        public Criteria andLMaxlengthIn(List<BigDecimal> values) {
            addCriterion("L_MAXLENGTH in", values, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:整数位数需要保留几位数
         *
         * @param values 整数位数需要保留几位数
         * @return 标准
         */
        public Criteria andLMaxlengthNotIn(List<BigDecimal> values) {
            addCriterion("L_MAXLENGTH not in", values, "lMaxlength");
            return (Criteria) this;
        }

        /**
         * 条件在区间:整数位数需要保留几位数
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
         * 条件不在区间:整数位数需要保留几位数
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
         * 条件为空:下拉框默认显示
         * 
         * @return 标准
         */
        public Criteria andCHeaditemIsNull() {
            addCriterion("C_HEADITEM is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:下拉框默认显示
         * 
         * @return 标准
         */
        public Criteria andCHeaditemIsNotNull() {
            addCriterion("C_HEADITEM is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:下拉框默认显示
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHeaditemEqualTo(String value) {
            addCriterion("C_HEADITEM =", value, "cHeaditem");
            return (Criteria) this;
        }

        /**
         * 条件不相等:下拉框默认显示
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHeaditemNotEqualTo(String value) {
            addCriterion("C_HEADITEM <>", value, "cHeaditem");
            return (Criteria) this;
        }

        /**
         * 条件大于:下拉框默认显示
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHeaditemGreaterThan(String value) {
            addCriterion("C_HEADITEM >", value, "cHeaditem");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:下拉框默认显示
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHeaditemGreaterThanOrEqualTo(String value) {
            addCriterion("C_HEADITEM >=", value, "cHeaditem");
            return (Criteria) this;
        }

        /**
         * 条件小于:下拉框默认显示
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHeaditemLessThan(String value) {
            addCriterion("C_HEADITEM <", value, "cHeaditem");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:下拉框默认显示
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHeaditemLessThanOrEqualTo(String value) {
            addCriterion("C_HEADITEM <=", value, "cHeaditem");
            return (Criteria) this;
        }

        /**
         * 条件相似:下拉框默认显示
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHeaditemLike(String value) {
            addCriterion("C_HEADITEM like", value, "cHeaditem");
            return (Criteria) this;
        }

        /**
         * 条件不相似:下拉框默认显示
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHeaditemNotLike(String value) {
            addCriterion("C_HEADITEM not like", value, "cHeaditem");
            return (Criteria) this;
        }

        /**
         * 条件在范围:下拉框默认显示
         *
         * @param values 下拉框默认显示
         * @return 标准
         */
        public Criteria andCHeaditemIn(List<String> values) {
            addCriterion("C_HEADITEM in", values, "cHeaditem");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:下拉框默认显示
         *
         * @param values 下拉框默认显示
         * @return 标准
         */
        public Criteria andCHeaditemNotIn(List<String> values) {
            addCriterion("C_HEADITEM not in", values, "cHeaditem");
            return (Criteria) this;
        }

        /**
         * 条件在区间:下拉框默认显示
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCHeaditemBetween(String value1, String value2) {
            addCriterion("C_HEADITEM between", value1, value2, "cHeaditem");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:下拉框默认显示
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCHeaditemNotBetween(String value1, String value2) {
            addCriterion("C_HEADITEM not between", value1, value2, "cHeaditem");
            return (Criteria) this;
        }

        /**
         * 条件为空:格式化格式（日期组件）
         * 
         * @return 标准
         */
        public Criteria andCConfigIsNull() {
            addCriterion("C_CONFIG is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:格式化格式（日期组件）
         * 
         * @return 标准
         */
        public Criteria andCConfigIsNotNull() {
            addCriterion("C_CONFIG is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:格式化格式（日期组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCConfigEqualTo(String value) {
            addCriterion("C_CONFIG =", value, "cConfig");
            return (Criteria) this;
        }

        /**
         * 条件不相等:格式化格式（日期组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCConfigNotEqualTo(String value) {
            addCriterion("C_CONFIG <>", value, "cConfig");
            return (Criteria) this;
        }

        /**
         * 条件大于:格式化格式（日期组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCConfigGreaterThan(String value) {
            addCriterion("C_CONFIG >", value, "cConfig");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:格式化格式（日期组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCConfigGreaterThanOrEqualTo(String value) {
            addCriterion("C_CONFIG >=", value, "cConfig");
            return (Criteria) this;
        }

        /**
         * 条件小于:格式化格式（日期组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCConfigLessThan(String value) {
            addCriterion("C_CONFIG <", value, "cConfig");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:格式化格式（日期组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCConfigLessThanOrEqualTo(String value) {
            addCriterion("C_CONFIG <=", value, "cConfig");
            return (Criteria) this;
        }

        /**
         * 条件相似:格式化格式（日期组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCConfigLike(String value) {
            addCriterion("C_CONFIG like", value, "cConfig");
            return (Criteria) this;
        }

        /**
         * 条件不相似:格式化格式（日期组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCConfigNotLike(String value) {
            addCriterion("C_CONFIG not like", value, "cConfig");
            return (Criteria) this;
        }

        /**
         * 条件在范围:格式化格式（日期组件）
         *
         * @param values 格式化格式（日期组件）
         * @return 标准
         */
        public Criteria andCConfigIn(List<String> values) {
            addCriterion("C_CONFIG in", values, "cConfig");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:格式化格式（日期组件）
         *
         * @param values 格式化格式（日期组件）
         * @return 标准
         */
        public Criteria andCConfigNotIn(List<String> values) {
            addCriterion("C_CONFIG not in", values, "cConfig");
            return (Criteria) this;
        }

        /**
         * 条件在区间:格式化格式（日期组件）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCConfigBetween(String value1, String value2) {
            addCriterion("C_CONFIG between", value1, value2, "cConfig");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:格式化格式（日期组件）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCConfigNotBetween(String value1, String value2) {
            addCriterion("C_CONFIG not between", value1, value2, "cConfig");
            return (Criteria) this;
        }

        /**
         * 条件为空:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         * 
         * @return 标准
         */
        public Criteria andCDefvalueIsNull() {
            addCriterion("C_DEFVALUE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         * 
         * @return 标准
         */
        public Criteria andCDefvalueIsNotNull() {
            addCriterion("C_DEFVALUE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalueEqualTo(String value) {
            addCriterion("C_DEFVALUE =", value, "cDefvalue");
            return (Criteria) this;
        }

        /**
         * 条件不相等:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalueNotEqualTo(String value) {
            addCriterion("C_DEFVALUE <>", value, "cDefvalue");
            return (Criteria) this;
        }

        /**
         * 条件大于:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalueGreaterThan(String value) {
            addCriterion("C_DEFVALUE >", value, "cDefvalue");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalueGreaterThanOrEqualTo(String value) {
            addCriterion("C_DEFVALUE >=", value, "cDefvalue");
            return (Criteria) this;
        }

        /**
         * 条件小于:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalueLessThan(String value) {
            addCriterion("C_DEFVALUE <", value, "cDefvalue");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalueLessThanOrEqualTo(String value) {
            addCriterion("C_DEFVALUE <=", value, "cDefvalue");
            return (Criteria) this;
        }

        /**
         * 条件相似:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalueLike(String value) {
            addCriterion("C_DEFVALUE like", value, "cDefvalue");
            return (Criteria) this;
        }

        /**
         * 条件不相似:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalueNotLike(String value) {
            addCriterion("C_DEFVALUE not like", value, "cDefvalue");
            return (Criteria) this;
        }

        /**
         * 条件在范围:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         *
         * @param values 默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         * @return 标准
         */
        public Criteria andCDefvalueIn(List<String> values) {
            addCriterion("C_DEFVALUE in", values, "cDefvalue");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         *
         * @param values 默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         * @return 标准
         */
        public Criteria andCDefvalueNotIn(List<String> values) {
            addCriterion("C_DEFVALUE not in", values, "cDefvalue");
            return (Criteria) this;
        }

        /**
         * 条件在区间:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDefvalueBetween(String value1, String value2) {
            addCriterion("C_DEFVALUE between", value1, value2, "cDefvalue");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:默认值（调用组件reset方法时，如果有该值则重置为该值，否则重置为value值）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDefvalueNotBetween(String value1, String value2) {
            addCriterion("C_DEFVALUE not between", value1, value2, "cDefvalue");
            return (Criteria) this;
        }

        /**
         * 条件为空:默认值2（日期组需要两个默认值）
         * 
         * @return 标准
         */
        public Criteria andCDefvalue2IsNull() {
            addCriterion("C_DEFVALUE2 is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:默认值2（日期组需要两个默认值）
         * 
         * @return 标准
         */
        public Criteria andCDefvalue2IsNotNull() {
            addCriterion("C_DEFVALUE2 is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:默认值2（日期组需要两个默认值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalue2EqualTo(String value) {
            addCriterion("C_DEFVALUE2 =", value, "cDefvalue2");
            return (Criteria) this;
        }

        /**
         * 条件不相等:默认值2（日期组需要两个默认值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalue2NotEqualTo(String value) {
            addCriterion("C_DEFVALUE2 <>", value, "cDefvalue2");
            return (Criteria) this;
        }

        /**
         * 条件大于:默认值2（日期组需要两个默认值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalue2GreaterThan(String value) {
            addCriterion("C_DEFVALUE2 >", value, "cDefvalue2");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:默认值2（日期组需要两个默认值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalue2GreaterThanOrEqualTo(String value) {
            addCriterion("C_DEFVALUE2 >=", value, "cDefvalue2");
            return (Criteria) this;
        }

        /**
         * 条件小于:默认值2（日期组需要两个默认值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalue2LessThan(String value) {
            addCriterion("C_DEFVALUE2 <", value, "cDefvalue2");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:默认值2（日期组需要两个默认值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalue2LessThanOrEqualTo(String value) {
            addCriterion("C_DEFVALUE2 <=", value, "cDefvalue2");
            return (Criteria) this;
        }

        /**
         * 条件相似:默认值2（日期组需要两个默认值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalue2Like(String value) {
            addCriterion("C_DEFVALUE2 like", value, "cDefvalue2");
            return (Criteria) this;
        }

        /**
         * 条件不相似:默认值2（日期组需要两个默认值）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDefvalue2NotLike(String value) {
            addCriterion("C_DEFVALUE2 not like", value, "cDefvalue2");
            return (Criteria) this;
        }

        /**
         * 条件在范围:默认值2（日期组需要两个默认值）
         *
         * @param values 默认值2（日期组需要两个默认值）
         * @return 标准
         */
        public Criteria andCDefvalue2In(List<String> values) {
            addCriterion("C_DEFVALUE2 in", values, "cDefvalue2");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:默认值2（日期组需要两个默认值）
         *
         * @param values 默认值2（日期组需要两个默认值）
         * @return 标准
         */
        public Criteria andCDefvalue2NotIn(List<String> values) {
            addCriterion("C_DEFVALUE2 not in", values, "cDefvalue2");
            return (Criteria) this;
        }

        /**
         * 条件在区间:默认值2（日期组需要两个默认值）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDefvalue2Between(String value1, String value2) {
            addCriterion("C_DEFVALUE2 between", value1, value2, "cDefvalue2");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:默认值2（日期组需要两个默认值）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDefvalue2NotBetween(String value1, String value2) {
            addCriterion("C_DEFVALUE2 not between", value1, value2, "cDefvalue2");
            return (Criteria) this;
        }

        /**
         * 条件为空:组件别名
         * 
         * @return 标准
         */
        public Criteria andCAliasIsNull() {
            addCriterion("C_ALIAS is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:组件别名
         * 
         * @return 标准
         */
        public Criteria andCAliasIsNotNull() {
            addCriterion("C_ALIAS is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:组件别名
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAliasEqualTo(String value) {
            addCriterion("C_ALIAS =", value, "cAlias");
            return (Criteria) this;
        }

        /**
         * 条件不相等:组件别名
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAliasNotEqualTo(String value) {
            addCriterion("C_ALIAS <>", value, "cAlias");
            return (Criteria) this;
        }

        /**
         * 条件大于:组件别名
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAliasGreaterThan(String value) {
            addCriterion("C_ALIAS >", value, "cAlias");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:组件别名
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAliasGreaterThanOrEqualTo(String value) {
            addCriterion("C_ALIAS >=", value, "cAlias");
            return (Criteria) this;
        }

        /**
         * 条件小于:组件别名
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAliasLessThan(String value) {
            addCriterion("C_ALIAS <", value, "cAlias");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:组件别名
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAliasLessThanOrEqualTo(String value) {
            addCriterion("C_ALIAS <=", value, "cAlias");
            return (Criteria) this;
        }

        /**
         * 条件相似:组件别名
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAliasLike(String value) {
            addCriterion("C_ALIAS like", value, "cAlias");
            return (Criteria) this;
        }

        /**
         * 条件不相似:组件别名
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAliasNotLike(String value) {
            addCriterion("C_ALIAS not like", value, "cAlias");
            return (Criteria) this;
        }

        /**
         * 条件在范围:组件别名
         *
         * @param values 组件别名
         * @return 标准
         */
        public Criteria andCAliasIn(List<String> values) {
            addCriterion("C_ALIAS in", values, "cAlias");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:组件别名
         *
         * @param values 组件别名
         * @return 标准
         */
        public Criteria andCAliasNotIn(List<String> values) {
            addCriterion("C_ALIAS not in", values, "cAlias");
            return (Criteria) this;
        }

        /**
         * 条件在区间:组件别名
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCAliasBetween(String value1, String value2) {
            addCriterion("C_ALIAS between", value1, value2, "cAlias");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:组件别名
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCAliasNotBetween(String value1, String value2) {
            addCriterion("C_ALIAS not between", value1, value2, "cAlias");
            return (Criteria) this;
        }

        /**
         * 条件为空:是否开启多选（用于下拉组件）
         * 
         * @return 标准
         */
        public Criteria andCMultipleIsNull() {
            addCriterion("C_MULTIPLE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:是否开启多选（用于下拉组件）
         * 
         * @return 标准
         */
        public Criteria andCMultipleIsNotNull() {
            addCriterion("C_MULTIPLE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:是否开启多选（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMultipleEqualTo(String value) {
            addCriterion("C_MULTIPLE =", value, "cMultiple");
            return (Criteria) this;
        }

        /**
         * 条件不相等:是否开启多选（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMultipleNotEqualTo(String value) {
            addCriterion("C_MULTIPLE <>", value, "cMultiple");
            return (Criteria) this;
        }

        /**
         * 条件大于:是否开启多选（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMultipleGreaterThan(String value) {
            addCriterion("C_MULTIPLE >", value, "cMultiple");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:是否开启多选（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMultipleGreaterThanOrEqualTo(String value) {
            addCriterion("C_MULTIPLE >=", value, "cMultiple");
            return (Criteria) this;
        }

        /**
         * 条件小于:是否开启多选（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMultipleLessThan(String value) {
            addCriterion("C_MULTIPLE <", value, "cMultiple");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:是否开启多选（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMultipleLessThanOrEqualTo(String value) {
            addCriterion("C_MULTIPLE <=", value, "cMultiple");
            return (Criteria) this;
        }

        /**
         * 条件相似:是否开启多选（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMultipleLike(String value) {
            addCriterion("C_MULTIPLE like", value, "cMultiple");
            return (Criteria) this;
        }

        /**
         * 条件不相似:是否开启多选（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMultipleNotLike(String value) {
            addCriterion("C_MULTIPLE not like", value, "cMultiple");
            return (Criteria) this;
        }

        /**
         * 条件在范围:是否开启多选（用于下拉组件）
         *
         * @param values 是否开启多选（用于下拉组件）
         * @return 标准
         */
        public Criteria andCMultipleIn(List<String> values) {
            addCriterion("C_MULTIPLE in", values, "cMultiple");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:是否开启多选（用于下拉组件）
         *
         * @param values 是否开启多选（用于下拉组件）
         * @return 标准
         */
        public Criteria andCMultipleNotIn(List<String> values) {
            addCriterion("C_MULTIPLE not in", values, "cMultiple");
            return (Criteria) this;
        }

        /**
         * 条件在区间:是否开启多选（用于下拉组件）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCMultipleBetween(String value1, String value2) {
            addCriterion("C_MULTIPLE between", value1, value2, "cMultiple");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:是否开启多选（用于下拉组件）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCMultipleNotBetween(String value1, String value2) {
            addCriterion("C_MULTIPLE not between", value1, value2, "cMultiple");
            return (Criteria) this;
        }

        /**
         * 条件为空:多选时的显示分隔符（）
         * 
         * @return 标准
         */
        public Criteria andCDelimiterIsNull() {
            addCriterion("C_DELIMITER is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:多选时的显示分隔符（）
         * 
         * @return 标准
         */
        public Criteria andCDelimiterIsNotNull() {
            addCriterion("C_DELIMITER is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:多选时的显示分隔符（）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDelimiterEqualTo(String value) {
            addCriterion("C_DELIMITER =", value, "cDelimiter");
            return (Criteria) this;
        }

        /**
         * 条件不相等:多选时的显示分隔符（）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDelimiterNotEqualTo(String value) {
            addCriterion("C_DELIMITER <>", value, "cDelimiter");
            return (Criteria) this;
        }

        /**
         * 条件大于:多选时的显示分隔符（）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDelimiterGreaterThan(String value) {
            addCriterion("C_DELIMITER >", value, "cDelimiter");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:多选时的显示分隔符（）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDelimiterGreaterThanOrEqualTo(String value) {
            addCriterion("C_DELIMITER >=", value, "cDelimiter");
            return (Criteria) this;
        }

        /**
         * 条件小于:多选时的显示分隔符（）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDelimiterLessThan(String value) {
            addCriterion("C_DELIMITER <", value, "cDelimiter");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:多选时的显示分隔符（）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDelimiterLessThanOrEqualTo(String value) {
            addCriterion("C_DELIMITER <=", value, "cDelimiter");
            return (Criteria) this;
        }

        /**
         * 条件相似:多选时的显示分隔符（）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDelimiterLike(String value) {
            addCriterion("C_DELIMITER like", value, "cDelimiter");
            return (Criteria) this;
        }

        /**
         * 条件不相似:多选时的显示分隔符（）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCDelimiterNotLike(String value) {
            addCriterion("C_DELIMITER not like", value, "cDelimiter");
            return (Criteria) this;
        }

        /**
         * 条件在范围:多选时的显示分隔符（）
         *
         * @param values 多选时的显示分隔符（）
         * @return 标准
         */
        public Criteria andCDelimiterIn(List<String> values) {
            addCriterion("C_DELIMITER in", values, "cDelimiter");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:多选时的显示分隔符（）
         *
         * @param values 多选时的显示分隔符（）
         * @return 标准
         */
        public Criteria andCDelimiterNotIn(List<String> values) {
            addCriterion("C_DELIMITER not in", values, "cDelimiter");
            return (Criteria) this;
        }

        /**
         * 条件在区间:多选时的显示分隔符（）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDelimiterBetween(String value1, String value2) {
            addCriterion("C_DELIMITER between", value1, value2, "cDelimiter");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:多选时的显示分隔符（）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCDelimiterNotBetween(String value1, String value2) {
            addCriterion("C_DELIMITER not between", value1, value2, "cDelimiter");
            return (Criteria) this;
        }

        /**
         * 条件为空:全选框（用于下拉组件）
         * 
         * @return 标准
         */
        public Criteria andCSelectallIsNull() {
            addCriterion("C_SELECTALL is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:全选框（用于下拉组件）
         * 
         * @return 标准
         */
        public Criteria andCSelectallIsNotNull() {
            addCriterion("C_SELECTALL is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:全选框（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectallEqualTo(String value) {
            addCriterion("C_SELECTALL =", value, "cSelectall");
            return (Criteria) this;
        }

        /**
         * 条件不相等:全选框（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectallNotEqualTo(String value) {
            addCriterion("C_SELECTALL <>", value, "cSelectall");
            return (Criteria) this;
        }

        /**
         * 条件大于:全选框（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectallGreaterThan(String value) {
            addCriterion("C_SELECTALL >", value, "cSelectall");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:全选框（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectallGreaterThanOrEqualTo(String value) {
            addCriterion("C_SELECTALL >=", value, "cSelectall");
            return (Criteria) this;
        }

        /**
         * 条件小于:全选框（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectallLessThan(String value) {
            addCriterion("C_SELECTALL <", value, "cSelectall");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:全选框（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectallLessThanOrEqualTo(String value) {
            addCriterion("C_SELECTALL <=", value, "cSelectall");
            return (Criteria) this;
        }

        /**
         * 条件相似:全选框（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectallLike(String value) {
            addCriterion("C_SELECTALL like", value, "cSelectall");
            return (Criteria) this;
        }

        /**
         * 条件不相似:全选框（用于下拉组件）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectallNotLike(String value) {
            addCriterion("C_SELECTALL not like", value, "cSelectall");
            return (Criteria) this;
        }

        /**
         * 条件在范围:全选框（用于下拉组件）
         *
         * @param values 全选框（用于下拉组件）
         * @return 标准
         */
        public Criteria andCSelectallIn(List<String> values) {
            addCriterion("C_SELECTALL in", values, "cSelectall");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:全选框（用于下拉组件）
         *
         * @param values 全选框（用于下拉组件）
         * @return 标准
         */
        public Criteria andCSelectallNotIn(List<String> values) {
            addCriterion("C_SELECTALL not in", values, "cSelectall");
            return (Criteria) this;
        }

        /**
         * 条件在区间:全选框（用于下拉组件）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCSelectallBetween(String value1, String value2) {
            addCriterion("C_SELECTALL between", value1, value2, "cSelectall");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:全选框（用于下拉组件）
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCSelectallNotBetween(String value1, String value2) {
            addCriterion("C_SELECTALL not between", value1, value2, "cSelectall");
            return (Criteria) this;
        }

        /**
         * 条件为空:是否可编辑
         * 
         * @return 标准
         */
        public Criteria andCEditableIsNull() {
            addCriterion("C_EDITABLE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:是否可编辑
         * 
         * @return 标准
         */
        public Criteria andCEditableIsNotNull() {
            addCriterion("C_EDITABLE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:是否可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditableEqualTo(String value) {
            addCriterion("C_EDITABLE =", value, "cEditable");
            return (Criteria) this;
        }

        /**
         * 条件不相等:是否可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditableNotEqualTo(String value) {
            addCriterion("C_EDITABLE <>", value, "cEditable");
            return (Criteria) this;
        }

        /**
         * 条件大于:是否可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditableGreaterThan(String value) {
            addCriterion("C_EDITABLE >", value, "cEditable");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:是否可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditableGreaterThanOrEqualTo(String value) {
            addCriterion("C_EDITABLE >=", value, "cEditable");
            return (Criteria) this;
        }

        /**
         * 条件小于:是否可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditableLessThan(String value) {
            addCriterion("C_EDITABLE <", value, "cEditable");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:是否可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditableLessThanOrEqualTo(String value) {
            addCriterion("C_EDITABLE <=", value, "cEditable");
            return (Criteria) this;
        }

        /**
         * 条件相似:是否可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditableLike(String value) {
            addCriterion("C_EDITABLE like", value, "cEditable");
            return (Criteria) this;
        }

        /**
         * 条件不相似:是否可编辑
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCEditableNotLike(String value) {
            addCriterion("C_EDITABLE not like", value, "cEditable");
            return (Criteria) this;
        }

        /**
         * 条件在范围:是否可编辑
         *
         * @param values 是否可编辑
         * @return 标准
         */
        public Criteria andCEditableIn(List<String> values) {
            addCriterion("C_EDITABLE in", values, "cEditable");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:是否可编辑
         *
         * @param values 是否可编辑
         * @return 标准
         */
        public Criteria andCEditableNotIn(List<String> values) {
            addCriterion("C_EDITABLE not in", values, "cEditable");
            return (Criteria) this;
        }

        /**
         * 条件在区间:是否可编辑
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCEditableBetween(String value1, String value2) {
            addCriterion("C_EDITABLE between", value1, value2, "cEditable");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:是否可编辑
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCEditableNotBetween(String value1, String value2) {
            addCriterion("C_EDITABLE not between", value1, value2, "cEditable");
            return (Criteria) this;
        }

        /**
         * 条件为空:是否隐藏
         * 
         * @return 标准
         */
        public Criteria andCHiddenIsNull() {
            addCriterion("C_HIDDEN is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:是否隐藏
         * 
         * @return 标准
         */
        public Criteria andCHiddenIsNotNull() {
            addCriterion("C_HIDDEN is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:是否隐藏
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenEqualTo(String value) {
            addCriterion("C_HIDDEN =", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件不相等:是否隐藏
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenNotEqualTo(String value) {
            addCriterion("C_HIDDEN <>", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件大于:是否隐藏
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenGreaterThan(String value) {
            addCriterion("C_HIDDEN >", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:是否隐藏
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenGreaterThanOrEqualTo(String value) {
            addCriterion("C_HIDDEN >=", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件小于:是否隐藏
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenLessThan(String value) {
            addCriterion("C_HIDDEN <", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:是否隐藏
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenLessThanOrEqualTo(String value) {
            addCriterion("C_HIDDEN <=", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件相似:是否隐藏
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenLike(String value) {
            addCriterion("C_HIDDEN like", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件不相似:是否隐藏
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCHiddenNotLike(String value) {
            addCriterion("C_HIDDEN not like", value, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件在范围:是否隐藏
         *
         * @param values 是否隐藏
         * @return 标准
         */
        public Criteria andCHiddenIn(List<String> values) {
            addCriterion("C_HIDDEN in", values, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:是否隐藏
         *
         * @param values 是否隐藏
         * @return 标准
         */
        public Criteria andCHiddenNotIn(List<String> values) {
            addCriterion("C_HIDDEN not in", values, "cHidden");
            return (Criteria) this;
        }

        /**
         * 条件在区间:是否隐藏
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
         * 条件不在区间:是否隐藏
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
         * 条件为空:输入框模糊查询sql脚本（Biz_Search）
         * 
         * @return 标准
         */
        public Criteria andCSqlIsNull() {
            addCriterion("C_SQL is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:输入框模糊查询sql脚本（Biz_Search）
         * 
         * @return 标准
         */
        public Criteria andCSqlIsNotNull() {
            addCriterion("C_SQL is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:输入框模糊查询sql脚本（Biz_Search）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlEqualTo(String value) {
            addCriterion("C_SQL =", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件不相等:输入框模糊查询sql脚本（Biz_Search）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlNotEqualTo(String value) {
            addCriterion("C_SQL <>", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件大于:输入框模糊查询sql脚本（Biz_Search）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlGreaterThan(String value) {
            addCriterion("C_SQL >", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:输入框模糊查询sql脚本（Biz_Search）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlGreaterThanOrEqualTo(String value) {
            addCriterion("C_SQL >=", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件小于:输入框模糊查询sql脚本（Biz_Search）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlLessThan(String value) {
            addCriterion("C_SQL <", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:输入框模糊查询sql脚本（Biz_Search）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlLessThanOrEqualTo(String value) {
            addCriterion("C_SQL <=", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件相似:输入框模糊查询sql脚本（Biz_Search）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlLike(String value) {
            addCriterion("C_SQL like", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件不相似:输入框模糊查询sql脚本（Biz_Search）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSqlNotLike(String value) {
            addCriterion("C_SQL not like", value, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件在范围:输入框模糊查询sql脚本（Biz_Search）
         *
         * @param values 输入框模糊查询sql脚本（Biz_Search）
         * @return 标准
         */
        public Criteria andCSqlIn(List<String> values) {
            addCriterion("C_SQL in", values, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:输入框模糊查询sql脚本（Biz_Search）
         *
         * @param values 输入框模糊查询sql脚本（Biz_Search）
         * @return 标准
         */
        public Criteria andCSqlNotIn(List<String> values) {
            addCriterion("C_SQL not in", values, "cSql");
            return (Criteria) this;
        }

        /**
         * 条件在区间:输入框模糊查询sql脚本（Biz_Search）
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
         * 条件不在区间:输入框模糊查询sql脚本（Biz_Search）
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
         * 条件为空:弹出框清空值后需要callback的事件配置
         * 
         * @return 标准
         */
        public Criteria andCAfterclearIsNull() {
            addCriterion("C_AFTERCLEAR is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:弹出框清空值后需要callback的事件配置
         * 
         * @return 标准
         */
        public Criteria andCAfterclearIsNotNull() {
            addCriterion("C_AFTERCLEAR is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:弹出框清空值后需要callback的事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearEqualTo(String value) {
            addCriterion("C_AFTERCLEAR =", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件不相等:弹出框清空值后需要callback的事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearNotEqualTo(String value) {
            addCriterion("C_AFTERCLEAR <>", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件大于:弹出框清空值后需要callback的事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearGreaterThan(String value) {
            addCriterion("C_AFTERCLEAR >", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:弹出框清空值后需要callback的事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearGreaterThanOrEqualTo(String value) {
            addCriterion("C_AFTERCLEAR >=", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件小于:弹出框清空值后需要callback的事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearLessThan(String value) {
            addCriterion("C_AFTERCLEAR <", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:弹出框清空值后需要callback的事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearLessThanOrEqualTo(String value) {
            addCriterion("C_AFTERCLEAR <=", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件相似:弹出框清空值后需要callback的事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearLike(String value) {
            addCriterion("C_AFTERCLEAR like", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件不相似:弹出框清空值后需要callback的事件配置
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCAfterclearNotLike(String value) {
            addCriterion("C_AFTERCLEAR not like", value, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件在范围:弹出框清空值后需要callback的事件配置
         *
         * @param values 弹出框清空值后需要callback的事件配置
         * @return 标准
         */
        public Criteria andCAfterclearIn(List<String> values) {
            addCriterion("C_AFTERCLEAR in", values, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:弹出框清空值后需要callback的事件配置
         *
         * @param values 弹出框清空值后需要callback的事件配置
         * @return 标准
         */
        public Criteria andCAfterclearNotIn(List<String> values) {
            addCriterion("C_AFTERCLEAR not in", values, "cAfterclear");
            return (Criteria) this;
        }

        /**
         * 条件在区间:弹出框清空值后需要callback的事件配置
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
         * 条件不在区间:弹出框清空值后需要callback的事件配置
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
         * 条件为空:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         * 
         * @return 标准
         */
        public Criteria andCMosaiccolumnIsNull() {
            addCriterion("C_MOSAICCOLUMN is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         * 
         * @return 标准
         */
        public Criteria andCMosaiccolumnIsNotNull() {
            addCriterion("C_MOSAICCOLUMN is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnEqualTo(String value) {
            addCriterion("C_MOSAICCOLUMN =", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件不相等:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnNotEqualTo(String value) {
            addCriterion("C_MOSAICCOLUMN <>", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件大于:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnGreaterThan(String value) {
            addCriterion("C_MOSAICCOLUMN >", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnGreaterThanOrEqualTo(String value) {
            addCriterion("C_MOSAICCOLUMN >=", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件小于:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnLessThan(String value) {
            addCriterion("C_MOSAICCOLUMN <", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnLessThanOrEqualTo(String value) {
            addCriterion("C_MOSAICCOLUMN <=", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件相似:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnLike(String value) {
            addCriterion("C_MOSAICCOLUMN like", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件不相似:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCMosaiccolumnNotLike(String value) {
            addCriterion("C_MOSAICCOLUMN not like", value, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件在范围:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         *
         * @param values 用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         * @return 标准
         */
        public Criteria andCMosaiccolumnIn(List<String> values) {
            addCriterion("C_MOSAICCOLUMN in", values, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         *
         * @param values 用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
         * @return 标准
         */
        public Criteria andCMosaiccolumnNotIn(List<String> values) {
            addCriterion("C_MOSAICCOLUMN not in", values, "cMosaiccolumn");
            return (Criteria) this;
        }

        /**
         * 条件在区间:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
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
         * 条件不在区间:用于关联数据库表字段（信保基金需求，方便添加字段，插入字段名）
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
         * 条件为空:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         * 
         * @return 标准
         */
        public Criteria andCTablenameIsNull() {
            addCriterion("C_TABLENAME is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         * 
         * @return 标准
         */
        public Criteria andCTablenameIsNotNull() {
            addCriterion("C_TABLENAME is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameEqualTo(String value) {
            addCriterion("C_TABLENAME =", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件不相等:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameNotEqualTo(String value) {
            addCriterion("C_TABLENAME <>", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件大于:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameGreaterThan(String value) {
            addCriterion("C_TABLENAME >", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("C_TABLENAME >=", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件小于:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameLessThan(String value) {
            addCriterion("C_TABLENAME <", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameLessThanOrEqualTo(String value) {
            addCriterion("C_TABLENAME <=", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件相似:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameLike(String value) {
            addCriterion("C_TABLENAME like", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件不相似:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTablenameNotLike(String value) {
            addCriterion("C_TABLENAME not like", value, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件在范围:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         *
         * @param values 用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         * @return 标准
         */
        public Criteria andCTablenameIn(List<String> values) {
            addCriterion("C_TABLENAME in", values, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         *
         * @param values 用于关联数据库表（信保基金需求，方便添加字段，插入表名）
         * @return 标准
         */
        public Criteria andCTablenameNotIn(List<String> values) {
            addCriterion("C_TABLENAME not in", values, "cTablename");
            return (Criteria) this;
        }

        /**
         * 条件在区间:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
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
         * 条件不在区间:用于关联数据库表（信保基金需求，方便添加字段，插入表名）
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
         * 条件为空:字段描述
         * 
         * @return 标准
         */
        public Criteria andCTipsIsNull() {
            addCriterion("C_TIPS is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:字段描述
         * 
         * @return 标准
         */
        public Criteria andCTipsIsNotNull() {
            addCriterion("C_TIPS is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:字段描述
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsEqualTo(String value) {
            addCriterion("C_TIPS =", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件不相等:字段描述
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsNotEqualTo(String value) {
            addCriterion("C_TIPS <>", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件大于:字段描述
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsGreaterThan(String value) {
            addCriterion("C_TIPS >", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:字段描述
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsGreaterThanOrEqualTo(String value) {
            addCriterion("C_TIPS >=", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件小于:字段描述
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsLessThan(String value) {
            addCriterion("C_TIPS <", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:字段描述
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsLessThanOrEqualTo(String value) {
            addCriterion("C_TIPS <=", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件相似:字段描述
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsLike(String value) {
            addCriterion("C_TIPS like", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件不相似:字段描述
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCTipsNotLike(String value) {
            addCriterion("C_TIPS not like", value, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件在范围:字段描述
         *
         * @param values 字段描述
         * @return 标准
         */
        public Criteria andCTipsIn(List<String> values) {
            addCriterion("C_TIPS in", values, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:字段描述
         *
         * @param values 字段描述
         * @return 标准
         */
        public Criteria andCTipsNotIn(List<String> values) {
            addCriterion("C_TIPS not in", values, "cTips");
            return (Criteria) this;
        }

        /**
         * 条件在区间:字段描述
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
         * 条件不在区间:字段描述
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
        public Criteria andCFilterdictsIsNull() {
            addCriterion("C_FILTERDICTS is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCFilterdictsIsNotNull() {
            addCriterion("C_FILTERDICTS is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFilterdictsEqualTo(String value) {
            addCriterion("C_FILTERDICTS =", value, "cFilterdicts");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFilterdictsNotEqualTo(String value) {
            addCriterion("C_FILTERDICTS <>", value, "cFilterdicts");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFilterdictsGreaterThan(String value) {
            addCriterion("C_FILTERDICTS >", value, "cFilterdicts");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFilterdictsGreaterThanOrEqualTo(String value) {
            addCriterion("C_FILTERDICTS >=", value, "cFilterdicts");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFilterdictsLessThan(String value) {
            addCriterion("C_FILTERDICTS <", value, "cFilterdicts");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFilterdictsLessThanOrEqualTo(String value) {
            addCriterion("C_FILTERDICTS <=", value, "cFilterdicts");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFilterdictsLike(String value) {
            addCriterion("C_FILTERDICTS like", value, "cFilterdicts");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFilterdictsNotLike(String value) {
            addCriterion("C_FILTERDICTS not like", value, "cFilterdicts");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCFilterdictsIn(List<String> values) {
            addCriterion("C_FILTERDICTS in", values, "cFilterdicts");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCFilterdictsNotIn(List<String> values) {
            addCriterion("C_FILTERDICTS not in", values, "cFilterdicts");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCFilterdictsBetween(String value1, String value2) {
            addCriterion("C_FILTERDICTS between", value1, value2, "cFilterdicts");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCFilterdictsNotBetween(String value1, String value2) {
            addCriterion("C_FILTERDICTS not between", value1, value2, "cFilterdicts");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCShowdictsIsNull() {
            addCriterion("C_SHOWDICTS is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCShowdictsIsNotNull() {
            addCriterion("C_SHOWDICTS is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowdictsEqualTo(String value) {
            addCriterion("C_SHOWDICTS =", value, "cShowdicts");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowdictsNotEqualTo(String value) {
            addCriterion("C_SHOWDICTS <>", value, "cShowdicts");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowdictsGreaterThan(String value) {
            addCriterion("C_SHOWDICTS >", value, "cShowdicts");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowdictsGreaterThanOrEqualTo(String value) {
            addCriterion("C_SHOWDICTS >=", value, "cShowdicts");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowdictsLessThan(String value) {
            addCriterion("C_SHOWDICTS <", value, "cShowdicts");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowdictsLessThanOrEqualTo(String value) {
            addCriterion("C_SHOWDICTS <=", value, "cShowdicts");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowdictsLike(String value) {
            addCriterion("C_SHOWDICTS like", value, "cShowdicts");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCShowdictsNotLike(String value) {
            addCriterion("C_SHOWDICTS not like", value, "cShowdicts");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCShowdictsIn(List<String> values) {
            addCriterion("C_SHOWDICTS in", values, "cShowdicts");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCShowdictsNotIn(List<String> values) {
            addCriterion("C_SHOWDICTS not in", values, "cShowdicts");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCShowdictsBetween(String value1, String value2) {
            addCriterion("C_SHOWDICTS between", value1, value2, "cShowdicts");
            return (Criteria) this;
        }

        /**
         * 条件不在区间:null
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCShowdictsNotBetween(String value1, String value2) {
            addCriterion("C_SHOWDICTS not between", value1, value2, "cShowdicts");
            return (Criteria) this;
        }

        /**
         * 条件为空:null
         * 
         * @return 标准
         */
        public Criteria andCFormatIsNull() {
            addCriterion("C_FORMAT is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:null
         * 
         * @return 标准
         */
        public Criteria andCFormatIsNotNull() {
            addCriterion("C_FORMAT is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatEqualTo(String value) {
            addCriterion("C_FORMAT =", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件不相等:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatNotEqualTo(String value) {
            addCriterion("C_FORMAT <>", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件大于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatGreaterThan(String value) {
            addCriterion("C_FORMAT >", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatGreaterThanOrEqualTo(String value) {
            addCriterion("C_FORMAT >=", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件小于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatLessThan(String value) {
            addCriterion("C_FORMAT <", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatLessThanOrEqualTo(String value) {
            addCriterion("C_FORMAT <=", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatLike(String value) {
            addCriterion("C_FORMAT like", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件不相似:null
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCFormatNotLike(String value) {
            addCriterion("C_FORMAT not like", value, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCFormatIn(List<String> values) {
            addCriterion("C_FORMAT in", values, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:null
         *
         * @param values null
         * @return 标准
         */
        public Criteria andCFormatNotIn(List<String> values) {
            addCriterion("C_FORMAT not in", values, "cFormat");
            return (Criteria) this;
        }

        /**
         * 条件在区间:null
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
         * 条件不在区间:null
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
         * 条件为空:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         * 
         * @return 标准
         */
        public Criteria andCComparecolumnIsNull() {
            addCriterion("C_COMPARECOLUMN is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         * 
         * @return 标准
         */
        public Criteria andCComparecolumnIsNotNull() {
            addCriterion("C_COMPARECOLUMN is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnEqualTo(String value) {
            addCriterion("C_COMPARECOLUMN =", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件不相等:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnNotEqualTo(String value) {
            addCriterion("C_COMPARECOLUMN <>", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件大于:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnGreaterThan(String value) {
            addCriterion("C_COMPARECOLUMN >", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnGreaterThanOrEqualTo(String value) {
            addCriterion("C_COMPARECOLUMN >=", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件小于:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnLessThan(String value) {
            addCriterion("C_COMPARECOLUMN <", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnLessThanOrEqualTo(String value) {
            addCriterion("C_COMPARECOLUMN <=", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件相似:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnLike(String value) {
            addCriterion("C_COMPARECOLUMN like", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件不相似:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCComparecolumnNotLike(String value) {
            addCriterion("C_COMPARECOLUMN not like", value, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件在范围:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         *
         * @param values 对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         * @return 标准
         */
        public Criteria andCComparecolumnIn(List<String> values) {
            addCriterion("C_COMPARECOLUMN in", values, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         *
         * @param values 对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
         * @return 标准
         */
        public Criteria andCComparecolumnNotIn(List<String> values) {
            addCriterion("C_COMPARECOLUMN not in", values, "cComparecolumn");
            return (Criteria) this;
        }

        /**
         * 条件在区间:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
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
         * 条件不在区间:对比字段（多用于修改后复核页面对比，标黄，支持简单函数，如：to_date()）
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
         * 条件为空:整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
         * 
         * @return 标准
         */
        public Criteria andLIntegernumIsNull() {
            addCriterion("L_INTEGERNUM is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
         * 
         * @return 标准
         */
        public Criteria andLIntegernumIsNotNull() {
            addCriterion("L_INTEGERNUM is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLIntegernumEqualTo(BigDecimal value) {
            addCriterion("L_INTEGERNUM =", value, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件不相等:整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLIntegernumNotEqualTo(BigDecimal value) {
            addCriterion("L_INTEGERNUM <>", value, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件大于:整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLIntegernumGreaterThan(BigDecimal value) {
            addCriterion("L_INTEGERNUM >", value, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLIntegernumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_INTEGERNUM >=", value, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件小于:整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLIntegernumLessThan(BigDecimal value) {
            addCriterion("L_INTEGERNUM <", value, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLIntegernumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_INTEGERNUM <=", value, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件在范围:整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
         *
         * @param values 整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
         * @return 标准
         */
        public Criteria andLIntegernumIn(List<BigDecimal> values) {
            addCriterion("L_INTEGERNUM in", values, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
         *
         * @param values 整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
         * @return 标准
         */
        public Criteria andLIntegernumNotIn(List<BigDecimal> values) {
            addCriterion("L_INTEGERNUM not in", values, "lIntegernum");
            return (Criteria) this;
        }

        /**
         * 条件在区间:整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
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
         * 条件不在区间:整数位数需要保留几位数，默认对整数位数不做限制（对金额类型有效）
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
         * 条件为空:小数点后缀保留几位数，默认保留两位（对金额类型有效）
         * 
         * @return 标准
         */
        public Criteria andLSuffixnumIsNull() {
            addCriterion("L_SUFFIXNUM is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:小数点后缀保留几位数，默认保留两位（对金额类型有效）
         * 
         * @return 标准
         */
        public Criteria andLSuffixnumIsNotNull() {
            addCriterion("L_SUFFIXNUM is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:小数点后缀保留几位数，默认保留两位（对金额类型有效）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSuffixnumEqualTo(BigDecimal value) {
            addCriterion("L_SUFFIXNUM =", value, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件不相等:小数点后缀保留几位数，默认保留两位（对金额类型有效）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSuffixnumNotEqualTo(BigDecimal value) {
            addCriterion("L_SUFFIXNUM <>", value, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件大于:小数点后缀保留几位数，默认保留两位（对金额类型有效）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSuffixnumGreaterThan(BigDecimal value) {
            addCriterion("L_SUFFIXNUM >", value, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:小数点后缀保留几位数，默认保留两位（对金额类型有效）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSuffixnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_SUFFIXNUM >=", value, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件小于:小数点后缀保留几位数，默认保留两位（对金额类型有效）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSuffixnumLessThan(BigDecimal value) {
            addCriterion("L_SUFFIXNUM <", value, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:小数点后缀保留几位数，默认保留两位（对金额类型有效）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andLSuffixnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_SUFFIXNUM <=", value, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件在范围:小数点后缀保留几位数，默认保留两位（对金额类型有效）
         *
         * @param values 小数点后缀保留几位数，默认保留两位（对金额类型有效）
         * @return 标准
         */
        public Criteria andLSuffixnumIn(List<BigDecimal> values) {
            addCriterion("L_SUFFIXNUM in", values, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:小数点后缀保留几位数，默认保留两位（对金额类型有效）
         *
         * @param values 小数点后缀保留几位数，默认保留两位（对金额类型有效）
         * @return 标准
         */
        public Criteria andLSuffixnumNotIn(List<BigDecimal> values) {
            addCriterion("L_SUFFIXNUM not in", values, "lSuffixnum");
            return (Criteria) this;
        }

        /**
         * 条件在区间:小数点后缀保留几位数，默认保留两位（对金额类型有效）
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
         * 条件不在区间:小数点后缀保留几位数，默认保留两位（对金额类型有效）
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
         * 条件为空:字段值变化相应事件
         * 
         * @return 标准
         */
        public Criteria andCChgeventidIsNull() {
            addCriterion("C_CHGEVENTID is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:字段值变化相应事件
         * 
         * @return 标准
         */
        public Criteria andCChgeventidIsNotNull() {
            addCriterion("C_CHGEVENTID is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:字段值变化相应事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidEqualTo(String value) {
            addCriterion("C_CHGEVENTID =", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件不相等:字段值变化相应事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidNotEqualTo(String value) {
            addCriterion("C_CHGEVENTID <>", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件大于:字段值变化相应事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidGreaterThan(String value) {
            addCriterion("C_CHGEVENTID >", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:字段值变化相应事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHGEVENTID >=", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件小于:字段值变化相应事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidLessThan(String value) {
            addCriterion("C_CHGEVENTID <", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:字段值变化相应事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidLessThanOrEqualTo(String value) {
            addCriterion("C_CHGEVENTID <=", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件相似:字段值变化相应事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidLike(String value) {
            addCriterion("C_CHGEVENTID like", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件不相似:字段值变化相应事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCChgeventidNotLike(String value) {
            addCriterion("C_CHGEVENTID not like", value, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件在范围:字段值变化相应事件
         *
         * @param values 字段值变化相应事件
         * @return 标准
         */
        public Criteria andCChgeventidIn(List<String> values) {
            addCriterion("C_CHGEVENTID in", values, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:字段值变化相应事件
         *
         * @param values 字段值变化相应事件
         * @return 标准
         */
        public Criteria andCChgeventidNotIn(List<String> values) {
            addCriterion("C_CHGEVENTID not in", values, "cChgeventid");
            return (Criteria) this;
        }

        /**
         * 条件在区间:字段值变化相应事件
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
         * 条件不在区间:字段值变化相应事件
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
         * 条件为空:是否在查看页面展示（1，不展示；2，展示）
         * 
         * @return 标准
         */
        public Criteria andCViewflagIsNull() {
            addCriterion("C_VIEWFLAG is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:是否在查看页面展示（1，不展示；2，展示）
         * 
         * @return 标准
         */
        public Criteria andCViewflagIsNotNull() {
            addCriterion("C_VIEWFLAG is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:是否在查看页面展示（1，不展示；2，展示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagEqualTo(String value) {
            addCriterion("C_VIEWFLAG =", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件不相等:是否在查看页面展示（1，不展示；2，展示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagNotEqualTo(String value) {
            addCriterion("C_VIEWFLAG <>", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件大于:是否在查看页面展示（1，不展示；2，展示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagGreaterThan(String value) {
            addCriterion("C_VIEWFLAG >", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:是否在查看页面展示（1，不展示；2，展示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagGreaterThanOrEqualTo(String value) {
            addCriterion("C_VIEWFLAG >=", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件小于:是否在查看页面展示（1，不展示；2，展示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagLessThan(String value) {
            addCriterion("C_VIEWFLAG <", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:是否在查看页面展示（1，不展示；2，展示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagLessThanOrEqualTo(String value) {
            addCriterion("C_VIEWFLAG <=", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件相似:是否在查看页面展示（1，不展示；2，展示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagLike(String value) {
            addCriterion("C_VIEWFLAG like", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件不相似:是否在查看页面展示（1，不展示；2，展示）
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCViewflagNotLike(String value) {
            addCriterion("C_VIEWFLAG not like", value, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件在范围:是否在查看页面展示（1，不展示；2，展示）
         *
         * @param values 是否在查看页面展示（1，不展示；2，展示）
         * @return 标准
         */
        public Criteria andCViewflagIn(List<String> values) {
            addCriterion("C_VIEWFLAG in", values, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:是否在查看页面展示（1，不展示；2，展示）
         *
         * @param values 是否在查看页面展示（1，不展示；2，展示）
         * @return 标准
         */
        public Criteria andCViewflagNotIn(List<String> values) {
            addCriterion("C_VIEWFLAG not in", values, "cViewflag");
            return (Criteria) this;
        }

        /**
         * 条件在区间:是否在查看页面展示（1，不展示；2，展示）
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
         * 条件不在区间:是否在查看页面展示（1，不展示；2，展示）
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
         * 条件为空:targetselect组件弹出框事件
         * 
         * @return 标准
         */
        public Criteria andCSelectonchangeIsNull() {
            addCriterion("C_SELECTONCHANGE is null");
            return (Criteria) this;
        }

        /**
         * 条件不为空:targetselect组件弹出框事件
         * 
         * @return 标准
         */
        public Criteria andCSelectonchangeIsNotNull() {
            addCriterion("C_SELECTONCHANGE is not null");
            return (Criteria) this;
        }

        /**
         * 条件相等:targetselect组件弹出框事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeEqualTo(String value) {
            addCriterion("C_SELECTONCHANGE =", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件不相等:targetselect组件弹出框事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeNotEqualTo(String value) {
            addCriterion("C_SELECTONCHANGE <>", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件大于:targetselect组件弹出框事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeGreaterThan(String value) {
            addCriterion("C_SELECTONCHANGE >", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件大于等于:targetselect组件弹出框事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeGreaterThanOrEqualTo(String value) {
            addCriterion("C_SELECTONCHANGE >=", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件小于:targetselect组件弹出框事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeLessThan(String value) {
            addCriterion("C_SELECTONCHANGE <", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件小于等于:targetselect组件弹出框事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeLessThanOrEqualTo(String value) {
            addCriterion("C_SELECTONCHANGE <=", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件相似:targetselect组件弹出框事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeLike(String value) {
            addCriterion("C_SELECTONCHANGE like", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件不相似:targetselect组件弹出框事件
         *
         * @param value 值
         * @return 标准
         */
        public Criteria andCSelectonchangeNotLike(String value) {
            addCriterion("C_SELECTONCHANGE not like", value, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件在范围:targetselect组件弹出框事件
         *
         * @param values targetselect组件弹出框事件
         * @return 标准
         */
        public Criteria andCSelectonchangeIn(List<String> values) {
            addCriterion("C_SELECTONCHANGE in", values, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件不在范围:targetselect组件弹出框事件
         *
         * @param values targetselect组件弹出框事件
         * @return 标准
         */
        public Criteria andCSelectonchangeNotIn(List<String> values) {
            addCriterion("C_SELECTONCHANGE not in", values, "cSelectonchange");
            return (Criteria) this;
        }

        /**
         * 条件在区间:targetselect组件弹出框事件
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
         * 条件不在区间:targetselect组件弹出框事件
         *
         * @param value1 起始值
         * @param value2 结束值
         * @return 标准
         */
        public Criteria andCSelectonchangeNotBetween(String value1, String value2) {
            addCriterion("C_SELECTONCHANGE not between", value1, value2, "cSelectonchange");
            return (Criteria) this;
        }
    }

    /**
     * @Title TBLOCKCONTROLS表的创建标准内部类
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
     * @Title TBLOCKCONTROLS表的内部标准类
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