/*
 * TapiqueryconfigMapper.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers;

import biz.dao.mappers.entity.Tapiqueryconfig;
import biz.dao.mappers.entity.TapiqueryconfigExample;
import com.github.pagehelper.Page;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

/**
 * @Title TAPIQUERYCONFIG表的Mapper类
 * 
 * @Date 2023-08-19 12:36:52
 * @Description 查询接口配置
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
@Mapper
public interface TapiqueryconfigMapper {
    /**
     * 根据指定的条件获取数据库记录数:TAPIQUERYCONFIG
     *
     * @param example Example对象
     * @return long 符合条件的记录数
     */
    long countByExample(TapiqueryconfigExample example);

    /**
     * 根据指定的条件删除数据库符合条件的记录:TAPIQUERYCONFIG
     *
     * @param example Example对象
     * @return int 删除影响的记录数
     */
    int deleteByExample(TapiqueryconfigExample example);

    /**
     * 根据主键删除数据库的记录:TAPIQUERYCONFIG
     *
     * @param id null
     * @return int 删除影响的记录数
     */
    int deleteByPrimaryKey(String id);

    /**
     * 新写入数据库记录:TAPIQUERYCONFIG
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insert(Tapiqueryconfig record);

    /**
     * 动态字段,写入数据库记录:TAPIQUERYCONFIG
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insertSelective(Tapiqueryconfig record);

    /**
     * 批量写入数据库记录:TAPIQUERYCONFIG
     *
     * @param records 记录集
     * @return int 写入影响的记录数
     */
    int insertBatch(@Param("records") List<Tapiqueryconfig> records);

    /**
     * :TAPIQUERYCONFIG
     *
     * @param example Example对象
     * @return List<Tapiqueryconfig>
     */
    List<Tapiqueryconfig> selectByExampleWithBLOBs(TapiqueryconfigExample example);

    /**
     * 根据指定的条件查询符合条件的数据库记录:TAPIQUERYCONFIG
     *
     * @param example Example对象
     * @return List<Tapiqueryconfig> 符合条件的记录
     */
    List<Tapiqueryconfig> selectByExample(TapiqueryconfigExample example);

    /**
     * 根据指定的条件分页查询符合条件的数据库记录:TAPIQUERYCONFIG
     *
     * @param example   Example对象
     * @param rowBounds 分页对象
     * @return Page<Tapiqueryconfig> 符合条件的记录
     */
    Page<Tapiqueryconfig> selectByExampleWithPage(@Param("example") TapiqueryconfigExample example, @Param("rowBounds") RowBounds rowBounds);

    /**
     * 根据指定主键获取一条数据库记录:TAPIQUERYCONFIG
     *
     * @param id null
     * @return TapiqueryconfigTAPIQUERYCONFIG 实体对象
     */
    Tapiqueryconfig selectByPrimaryKey(String id);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录:TAPIQUERYCONFIG
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExampleSelective(@Param("record") Tapiqueryconfig record, @Param("example") TapiqueryconfigExample example);

    /**
     * :TAPIQUERYCONFIG
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int
     */
    int updateByExampleWithBLOBs(@Param("record") Tapiqueryconfig record, @Param("example") TapiqueryconfigExample example);

    /**
     * 根据指定的条件来更新符合条件的数据库记录:TAPIQUERYCONFIG
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExample(@Param("record") Tapiqueryconfig record, @Param("example") TapiqueryconfigExample example);

    /**
     * 动态字段,根据主键来更新符合条件的数据库记录:TAPIQUERYCONFIG
     *
     * @param record 实体对象
     * @return int 更新影响的记录数
     */
    int updateByPrimaryKeySelective(Tapiqueryconfig record);

    /**
     * :TAPIQUERYCONFIG
     *
     * @param record 实体对象
     * @return int
     */
    int updateByPrimaryKeyWithBLOBs(Tapiqueryconfig record);

    /**
     * 根据主键来更新符合条件的数据库记录:TAPIQUERYCONFIG
     *
     * @param record 实体对象
     * @return int 更新影响的记录数
     */
    int updateByPrimaryKey(Tapiqueryconfig record);
}