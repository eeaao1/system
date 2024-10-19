/*
 * TblockcontrolsMapper.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers;

import biz.dao.mappers.entity.Tblockcontrols;
import biz.dao.mappers.entity.TblockcontrolsExample;
import com.github.pagehelper.Page;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

/**
 * @Title TBLOCKCONTROLS表的Mapper类
 * 
 * @Date 2023-08-15 16:32:21
 * @Description null
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
@Mapper
public interface TblockcontrolsMapper {
    /**
     * 根据指定的条件获取数据库记录数:TBLOCKCONTROLS
     *
     * @param example Example对象
     * @return long 符合条件的记录数
     */
    long countByExample(TblockcontrolsExample example);

    /**
     * 根据指定的条件删除数据库符合条件的记录:TBLOCKCONTROLS
     *
     * @param example Example对象
     * @return int 删除影响的记录数
     */
    int deleteByExample(TblockcontrolsExample example);

    /**
     * 根据主键删除数据库的记录:TBLOCKCONTROLS
     *
     * @param cBlockcontrolid 该表主键
     * @return int 删除影响的记录数
     */
    int deleteByPrimaryKey(String cBlockcontrolid);

    /**
     * 新写入数据库记录:TBLOCKCONTROLS
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insert(Tblockcontrols record);

    /**
     * 动态字段,写入数据库记录:TBLOCKCONTROLS
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insertSelective(Tblockcontrols record);

    /**
     * 批量写入数据库记录:TBLOCKCONTROLS
     *
     * @param records 记录集
     * @return int 写入影响的记录数
     */
    int insertBatch(@Param("records") List<Tblockcontrols> records);

    /**
     * 根据指定的条件查询符合条件的数据库记录:TBLOCKCONTROLS
     *
     * @param example Example对象
     * @return List<Tblockcontrols> 符合条件的记录
     */
    List<Tblockcontrols> selectByExample(TblockcontrolsExample example);

    /**
     * 根据指定的条件分页查询符合条件的数据库记录:TBLOCKCONTROLS
     *
     * @param example   Example对象
     * @param rowBounds 分页对象
     * @return Page<Tblockcontrols> 符合条件的记录
     */
    Page<Tblockcontrols> selectByExampleWithPage(@Param("example") TblockcontrolsExample example, @Param("rowBounds") RowBounds rowBounds);

    /**
     * 根据指定主键获取一条数据库记录:TBLOCKCONTROLS
     *
     * @param cBlockcontrolid 该表主键
     * @return TblockcontrolsTBLOCKCONTROLS 实体对象
     */
    Tblockcontrols selectByPrimaryKey(String cBlockcontrolid);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录:TBLOCKCONTROLS
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExampleSelective(@Param("record") Tblockcontrols record, @Param("example") TblockcontrolsExample example);

    /**
     * 根据指定的条件来更新符合条件的数据库记录:TBLOCKCONTROLS
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExample(@Param("record") Tblockcontrols record, @Param("example") TblockcontrolsExample example);

    /**
     * 动态字段,根据主键来更新符合条件的数据库记录:TBLOCKCONTROLS
     *
     * @param record 实体对象
     * @return int 更新影响的记录数
     */
    int updateByPrimaryKeySelective(Tblockcontrols record);

    /**
     * 根据主键来更新符合条件的数据库记录:TBLOCKCONTROLS
     *
     * @param record 实体对象
     * @return int 更新影响的记录数
     */
    int updateByPrimaryKey(Tblockcontrols record);
}