/*
 * UserBaseMapper.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers;

import biz.dao.mappers.entity.UserBase;
import biz.dao.mappers.entity.UserBaseExample;
import com.github.pagehelper.Page;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

/**
 * @Title USER_BASE表的Mapper类
 * 
 * @Date 2023-08-10 13:56:08
 * @Description null
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
@Mapper
public interface UserBaseMapper {
    /**
     * 根据指定的条件获取数据库记录数:USER_BASE
     *
     * @param example Example对象
     * @return long 符合条件的记录数
     */
    long countByExample(UserBaseExample example);

    /**
     * 根据指定的条件删除数据库符合条件的记录:USER_BASE
     *
     * @param example Example对象
     * @return int 删除影响的记录数
     */
    int deleteByExample(UserBaseExample example);

    /**
     * 新写入数据库记录:USER_BASE
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insert(UserBase record);

    /**
     * 动态字段,写入数据库记录:USER_BASE
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insertSelective(UserBase record);

    /**
     * 批量写入数据库记录:USER_BASE
     *
     * @param records 记录集
     * @return int 写入影响的记录数
     */
    int insertBatch(@Param("records") List<UserBase> records);

    /**
     * 根据指定的条件查询符合条件的数据库记录:USER_BASE
     *
     * @param example Example对象
     * @return List<UserBase> 符合条件的记录
     */
    List<UserBase> selectByExample(UserBaseExample example);

    /**
     * 根据指定的条件分页查询符合条件的数据库记录:USER_BASE
     *
     * @param example   Example对象
     * @param rowBounds 分页对象
     * @return Page<UserBase> 符合条件的记录
     */
    Page<UserBase> selectByExampleWithPage(@Param("example") UserBaseExample example, @Param("rowBounds") RowBounds rowBounds);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录:USER_BASE
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExampleSelective(@Param("record") UserBase record, @Param("example") UserBaseExample example);

    /**
     * 根据指定的条件来更新符合条件的数据库记录:USER_BASE
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExample(@Param("record") UserBase record, @Param("example") UserBaseExample example);
}