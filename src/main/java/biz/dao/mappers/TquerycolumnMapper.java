/*
 * TquerycolumnMapper.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers;

import biz.dao.mappers.entity.Tquerycolumn;
import biz.dao.mappers.entity.TquerycolumnExample;
import com.github.pagehelper.Page;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

/**
 * @Title TQUERYCOLUMN表的Mapper类
 * 
 * @Date 2023-08-16 16:32:08
 * @Description null
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
@Mapper
public interface TquerycolumnMapper {
    /**
     * 根据指定的条件获取数据库记录数:TQUERYCOLUMN
     *
     * @param example Example对象
     * @return long 符合条件的记录数
     */
    long countByExample(TquerycolumnExample example);

    /**
     * 根据指定的条件删除数据库符合条件的记录:TQUERYCOLUMN
     *
     * @param example Example对象
     * @return int 删除影响的记录数
     */
    int deleteByExample(TquerycolumnExample example);

    /**
     * 新写入数据库记录:TQUERYCOLUMN
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insert(Tquerycolumn record);

    /**
     * 动态字段,写入数据库记录:TQUERYCOLUMN
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insertSelective(Tquerycolumn record);

    /**
     * 批量写入数据库记录:TQUERYCOLUMN
     *
     * @param records 记录集
     * @return int 写入影响的记录数
     */
    int insertBatch(@Param("records") List<Tquerycolumn> records);

    /**
     * 根据指定的条件查询符合条件的数据库记录:TQUERYCOLUMN
     *
     * @param example Example对象
     * @return List<Tquerycolumn> 符合条件的记录
     */
    List<Tquerycolumn> selectByExample(TquerycolumnExample example);

    /**
     * 根据指定的条件分页查询符合条件的数据库记录:TQUERYCOLUMN
     *
     * @param example   Example对象
     * @param rowBounds 分页对象
     * @return Page<Tquerycolumn> 符合条件的记录
     */
    Page<Tquerycolumn> selectByExampleWithPage(@Param("example") TquerycolumnExample example, @Param("rowBounds") RowBounds rowBounds);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录:TQUERYCOLUMN
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExampleSelective(@Param("record") Tquerycolumn record, @Param("example") TquerycolumnExample example);

    /**
     * 根据指定的条件来更新符合条件的数据库记录:TQUERYCOLUMN
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExample(@Param("record") Tquerycolumn record, @Param("example") TquerycolumnExample example);
}