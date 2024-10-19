/*
 * UserBase.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers.entity;

import java.util.Date;

/**
 * 
 * @Date 2023-08-10 13:56:08
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
public class UserBase {
    /**
     * userId null
     */
    private String userId;

    /**
     * userName null
     */
    private String userName;

    /**
     * userPassword null
     */
    private String userPassword;

    /**
     * lastToken null
     */
    private String lastToken;

    /**
     * lastAccessTiem null
     */
    private Date lastAccessTiem;

    /**
     * provideTokenTiem null
     */
    private Date provideTokenTiem;

    /**
     * updateTime null
     */
    private Date updateTime;

    /**
     * createTime null
     */
    private Date createTime;

    /**
     * 获取 null 字段:USER_BASE.USER_ID
     *
     * @return USER_BASE.USER_ID, null
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置 null 字段:USER_BASE.USER_ID
     *
     * @param userId the value for USER_BASE.USER_ID, null
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取 null 字段:USER_BASE.USER_NAME
     *
     * @return USER_BASE.USER_NAME, null
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 null 字段:USER_BASE.USER_NAME
     *
     * @param userName the value for USER_BASE.USER_NAME, null
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取 null 字段:USER_BASE.USER_PASSWORD
     *
     * @return USER_BASE.USER_PASSWORD, null
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置 null 字段:USER_BASE.USER_PASSWORD
     *
     * @param userPassword the value for USER_BASE.USER_PASSWORD, null
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * 获取 null 字段:USER_BASE.LAST_TOKEN
     *
     * @return USER_BASE.LAST_TOKEN, null
     */
    public String getLastToken() {
        return lastToken;
    }

    /**
     * 设置 null 字段:USER_BASE.LAST_TOKEN
     *
     * @param lastToken the value for USER_BASE.LAST_TOKEN, null
     */
    public void setLastToken(String lastToken) {
        this.lastToken = lastToken == null ? null : lastToken.trim();
    }

    /**
     * 获取 null 字段:USER_BASE.LAST_ACCESS_TIEM
     *
     * @return USER_BASE.LAST_ACCESS_TIEM, null
     */
    public Date getLastAccessTiem() {
        return lastAccessTiem;
    }

    /**
     * 设置 null 字段:USER_BASE.LAST_ACCESS_TIEM
     *
     * @param lastAccessTiem the value for USER_BASE.LAST_ACCESS_TIEM, null
     */
    public void setLastAccessTiem(Date lastAccessTiem) {
        this.lastAccessTiem = lastAccessTiem;
    }

    /**
     * 获取 null 字段:USER_BASE.PROVIDE_TOKEN_TIEM
     *
     * @return USER_BASE.PROVIDE_TOKEN_TIEM, null
     */
    public Date getProvideTokenTiem() {
        return provideTokenTiem;
    }

    /**
     * 设置 null 字段:USER_BASE.PROVIDE_TOKEN_TIEM
     *
     * @param provideTokenTiem the value for USER_BASE.PROVIDE_TOKEN_TIEM, null
     */
    public void setProvideTokenTiem(Date provideTokenTiem) {
        this.provideTokenTiem = provideTokenTiem;
    }

    /**
     * 获取 null 字段:USER_BASE.UPDATE_TIME
     *
     * @return USER_BASE.UPDATE_TIME, null
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 null 字段:USER_BASE.UPDATE_TIME
     *
     * @param updateTime the value for USER_BASE.UPDATE_TIME, null
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 null 字段:USER_BASE.CREATE_TIME
     *
     * @return USER_BASE.CREATE_TIME, null
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 null 字段:USER_BASE.CREATE_TIME
     *
     * @param createTime the value for USER_BASE.CREATE_TIME, null
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}