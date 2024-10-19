/*
 * Tapiqueryconfig.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @Date 2023-08-19 12:36:52
 * Database Table Remarks:
 * 查询接口配置
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
public class Tapiqueryconfig {
    /**
     * id null
     */
    private String id;

    /**
     * interfaceId 接口ID
     */
    private String interfaceId;

    /**
     * reload 是否重加载
     */
    private String reload;

    /**
     * pagination 是否分页
     */
    private String pagination;

    /**
     * createTime null
     */
    private Date createTime;

    /**
     * updateTime null
     */
    private Date updateTime;

    /**
     * version null
     */
    private BigDecimal version;

    /**
     * dsql SQL语句
     */
    private String dsql;

    /**
     * 获取 null 字段:TAPIQUERYCONFIG.ID
     *
     * @return TAPIQUERYCONFIG.ID, null
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 null 字段:TAPIQUERYCONFIG.ID
     *
     * @param id the value for TAPIQUERYCONFIG.ID, null
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取 接口ID 字段:TAPIQUERYCONFIG.INTERFACE_ID
     *
     * @return TAPIQUERYCONFIG.INTERFACE_ID, 接口ID
     */
    public String getInterfaceId() {
        return interfaceId;
    }

    /**
     * 设置 接口ID 字段:TAPIQUERYCONFIG.INTERFACE_ID
     *
     * @param interfaceId the value for TAPIQUERYCONFIG.INTERFACE_ID, 接口ID
     */
    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId == null ? null : interfaceId.trim();
    }

    /**
     * 获取 是否重加载 字段:TAPIQUERYCONFIG.RELOAD
     *
     * @return TAPIQUERYCONFIG.RELOAD, 是否重加载
     */
    public String getReload() {
        return reload;
    }

    /**
     * 设置 是否重加载 字段:TAPIQUERYCONFIG.RELOAD
     *
     * @param reload the value for TAPIQUERYCONFIG.RELOAD, 是否重加载
     */
    public void setReload(String reload) {
        this.reload = reload == null ? null : reload.trim();
    }

    /**
     * 获取 是否分页 字段:TAPIQUERYCONFIG.PAGINATION
     *
     * @return TAPIQUERYCONFIG.PAGINATION, 是否分页
     */
    public String getPagination() {
        return pagination;
    }

    /**
     * 设置 是否分页 字段:TAPIQUERYCONFIG.PAGINATION
     *
     * @param pagination the value for TAPIQUERYCONFIG.PAGINATION, 是否分页
     */
    public void setPagination(String pagination) {
        this.pagination = pagination == null ? null : pagination.trim();
    }

    /**
     * 获取 null 字段:TAPIQUERYCONFIG.CREATE_TIME
     *
     * @return TAPIQUERYCONFIG.CREATE_TIME, null
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 null 字段:TAPIQUERYCONFIG.CREATE_TIME
     *
     * @param createTime the value for TAPIQUERYCONFIG.CREATE_TIME, null
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 null 字段:TAPIQUERYCONFIG.UPDATE_TIME
     *
     * @return TAPIQUERYCONFIG.UPDATE_TIME, null
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 null 字段:TAPIQUERYCONFIG.UPDATE_TIME
     *
     * @param updateTime the value for TAPIQUERYCONFIG.UPDATE_TIME, null
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 null 字段:TAPIQUERYCONFIG.VERSION
     *
     * @return TAPIQUERYCONFIG.VERSION, null
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * 设置 null 字段:TAPIQUERYCONFIG.VERSION
     *
     * @param version the value for TAPIQUERYCONFIG.VERSION, null
     */
    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    /**
     * 获取 SQL语句 字段:TAPIQUERYCONFIG.DSQL
     *
     * @return TAPIQUERYCONFIG.DSQL, SQL语句
     */
    public String getDsql() {
        return dsql;
    }

    /**
     * 设置 SQL语句 字段:TAPIQUERYCONFIG.DSQL
     *
     * @param dsql the value for TAPIQUERYCONFIG.DSQL, SQL语句
     */
    public void setDsql(String dsql) {
        this.dsql = dsql == null ? null : dsql.trim();
    }
}