/*
 * TinterfaceMapper.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers;

import biz.dao.mappers.entity.Tinterface;
import biz.dao.mappers.entity.TinterfaceExample;
import com.github.pagehelper.Page;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

/**
 * @Title TINTERFACE表的Mapper类
 * 
 * @Date 2023-09-23 10:35:32
 * @Description null
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
@Mapper
public interface TinterfaceMapper {
    /**
     * 根据指定的条件获取数据库记录数:TINTERFACE
     *
     * @param example Example对象
     * @return long 符合条件的记录数
     */
    long countByExample(TinterfaceExample example);

    /**
     * 根据指定的条件删除数据库符合条件的记录:TINTERFACE
     *
     * @param example Example对象
     * @return int 删除影响的记录数
     */
    int deleteByExample(TinterfaceExample example);

    /**
     * 根据主键删除数据库的记录:TINTERFACE
     *
     * @param id null
     * @return int 删除影响的记录数
     */
    int deleteByPrimaryKey(String id);

    /**
     * 新写入数据库记录:TINTERFACE
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insert(Tinterface record);

    /**
     * 动态字段,写入数据库记录:TINTERFACE
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insertSelective(Tinterface record);

    /**
     * 批量写入数据库记录:TINTERFACE
     *
     * @param records 记录集
     * @return int 写入影响的记录数
     */
    int insertBatch(@Param("records") List<Tinterface> records);

    /**
     * 根据指定的条件查询符合条件的数据库记录:TINTERFACE
     *
     * @param example Example对象
     * @return List<Tinterface> 符合条件的记录
     */
    List<Tinterface> selectByExample(TinterfaceExample example);

    /**
     * 根据指定的条件分页查询符合条件的数据库记录:TINTERFACE
     *
     * @param example   Example对象
     * @param rowBounds 分页对象
     * @return Page<Tinterface> 符合条件的记录
     */
    Page<Tinterface> selectByExampleWithPage(@Param("example") TinterfaceExample example, @Param("rowBounds") RowBounds rowBounds);

    /**
     * 根据指定主键获取一条数据库记录:TINTERFACE
     *
     * @param id null
     * @return TinterfaceTINTERFACE 实体对象
     */
    Tinterface selectByPrimaryKey(String id);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录:TINTERFACE
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExampleSelective(@Param("record") Tinterface record, @Param("example") TinterfaceExample example);

    /**
     * 根据指定的条件来更新符合条件的数据库记录:TINTERFACE
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExample(@Param("record") Tinterface record, @Param("example") TinterfaceExample example);

    /**
     * 动态字段,根据主键来更新符合条件的数据库记录:TINTERFACE
     *
     * @param record 实体对象
     * @return int 更新影响的记录数
     */
    int updateByPrimaryKeySelective(Tinterface record);

    /**
     * 根据主键来更新符合条件的数据库记录:TINTERFACE
     *
     * @param record 实体对象
     * @return int 更新影响的记录数
     */
    int updateByPrimaryKey(Tinterface record);
}