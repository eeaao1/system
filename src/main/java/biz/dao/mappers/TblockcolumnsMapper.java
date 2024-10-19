/*
 * TblockcolumnsMapper.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers;

import biz.dao.mappers.entity.Tblockcolumns;
import biz.dao.mappers.entity.TblockcolumnsExample;
import com.github.pagehelper.Page;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

/**
 * @Title TBLOCKCOLUMNS表的Mapper类
 * 
 * @Date 2023-08-15 15:10:39
 * @Description null
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
@Mapper
public interface TblockcolumnsMapper {
    /**
     * 根据指定的条件获取数据库记录数:TBLOCKCOLUMNS
     *
     * @param example Example对象
     * @return long 符合条件的记录数
     */
    long countByExample(TblockcolumnsExample example);

    /**
     * 根据指定的条件删除数据库符合条件的记录:TBLOCKCOLUMNS
     *
     * @param example Example对象
     * @return int 删除影响的记录数
     */
    int deleteByExample(TblockcolumnsExample example);

    /**
     * 新写入数据库记录:TBLOCKCOLUMNS
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insert(Tblockcolumns record);

    /**
     * 动态字段,写入数据库记录:TBLOCKCOLUMNS
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insertSelective(Tblockcolumns record);

    /**
     * 批量写入数据库记录:TBLOCKCOLUMNS
     *
     * @param records 记录集
     * @return int 写入影响的记录数
     */
    int insertBatch(@Param("records") List<Tblockcolumns> records);

    /**
     * 根据指定的条件查询符合条件的数据库记录:TBLOCKCOLUMNS
     *
     * @param example Example对象
     * @return List<Tblockcolumns> 符合条件的记录
     */
    List<Tblockcolumns> selectByExample(TblockcolumnsExample example);

    /**
     * 根据指定的条件分页查询符合条件的数据库记录:TBLOCKCOLUMNS
     *
     * @param example   Example对象
     * @param rowBounds 分页对象
     * @return Page<Tblockcolumns> 符合条件的记录
     */
    Page<Tblockcolumns> selectByExampleWithPage(@Param("example") TblockcolumnsExample example, @Param("rowBounds") RowBounds rowBounds);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录:TBLOCKCOLUMNS
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExampleSelective(@Param("record") Tblockcolumns record, @Param("example") TblockcolumnsExample example);

    /**
     * 根据指定的条件来更新符合条件的数据库记录:TBLOCKCOLUMNS
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExample(@Param("record") Tblockcolumns record, @Param("example") TblockcolumnsExample example);
}