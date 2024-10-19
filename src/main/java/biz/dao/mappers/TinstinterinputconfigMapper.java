/*
 * TinstinterinputconfigMapper.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers;

import biz.dao.mappers.entity.Tinstinterinputconfig;
import biz.dao.mappers.entity.TinstinterinputconfigExample;
import com.github.pagehelper.Page;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

/**
 * @Title TINSTINTERINPUTCONFIG表的Mapper类
 * 
 * @Date 2023-08-18 11:17:44
 * @Description null
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
@Mapper
public interface TinstinterinputconfigMapper {
    /**
     * 根据指定的条件获取数据库记录数:TINSTINTERINPUTCONFIG
     *
     * @param example Example对象
     * @return long 符合条件的记录数
     */
    long countByExample(TinstinterinputconfigExample example);

    /**
     * 根据指定的条件删除数据库符合条件的记录:TINSTINTERINPUTCONFIG
     *
     * @param example Example对象
     * @return int 删除影响的记录数
     */
    int deleteByExample(TinstinterinputconfigExample example);

    /**
     * 新写入数据库记录:TINSTINTERINPUTCONFIG
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insert(Tinstinterinputconfig record);

    /**
     * 动态字段,写入数据库记录:TINSTINTERINPUTCONFIG
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insertSelective(Tinstinterinputconfig record);

    /**
     * 批量写入数据库记录:TINSTINTERINPUTCONFIG
     *
     * @param records 记录集
     * @return int 写入影响的记录数
     */
    int insertBatch(@Param("records") List<Tinstinterinputconfig> records);

    /**
     * 根据指定的条件查询符合条件的数据库记录:TINSTINTERINPUTCONFIG
     *
     * @param example Example对象
     * @return List<Tinstinterinputconfig> 符合条件的记录
     */
    List<Tinstinterinputconfig> selectByExample(TinstinterinputconfigExample example);

    /**
     * 根据指定的条件分页查询符合条件的数据库记录:TINSTINTERINPUTCONFIG
     *
     * @param example   Example对象
     * @param rowBounds 分页对象
     * @return Page<Tinstinterinputconfig> 符合条件的记录
     */
    Page<Tinstinterinputconfig> selectByExampleWithPage(@Param("example") TinstinterinputconfigExample example, @Param("rowBounds") RowBounds rowBounds);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录:TINSTINTERINPUTCONFIG
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExampleSelective(@Param("record") Tinstinterinputconfig record, @Param("example") TinstinterinputconfigExample example);

    /**
     * 根据指定的条件来更新符合条件的数据库记录:TINSTINTERINPUTCONFIG
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExample(@Param("record") Tinstinterinputconfig record, @Param("example") TinstinterinputconfigExample example);
}