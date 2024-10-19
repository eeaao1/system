/*
 * CropMapper.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers;

import biz.dao.mappers.entity.Crop;
import biz.dao.mappers.entity.CropExample;
import com.github.pagehelper.Page;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

/**
 * @Title CROP表的Mapper类
 * 
 * @Date 2023-08-10 13:56:08
 * @Description null
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
@Mapper
public interface CropMapper {
    /**
     * 根据指定的条件获取数据库记录数:CROP
     *
     * @param example Example对象
     * @return long 符合条件的记录数
     */
    long countByExample(CropExample example);

    /**
     * 根据指定的条件删除数据库符合条件的记录:CROP
     *
     * @param example Example对象
     * @return int 删除影响的记录数
     */
    int deleteByExample(CropExample example);

    /**
     * 新写入数据库记录:CROP
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insert(Crop record);

    /**
     * 动态字段,写入数据库记录:CROP
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insertSelective(Crop record);

    /**
     * 批量写入数据库记录:CROP
     *
     * @param records 记录集
     * @return int 写入影响的记录数
     */
    int insertBatch(@Param("records") List<Crop> records);

    /**
     * 根据指定的条件查询符合条件的数据库记录:CROP
     *
     * @param example Example对象
     * @return List<Crop> 符合条件的记录
     */
    List<Crop> selectByExample(CropExample example);

    /**
     * 根据指定的条件分页查询符合条件的数据库记录:CROP
     *
     * @param example   Example对象
     * @param rowBounds 分页对象
     * @return Page<Crop> 符合条件的记录
     */
    Page<Crop> selectByExampleWithPage(@Param("example") CropExample example, @Param("rowBounds") RowBounds rowBounds);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录:CROP
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExampleSelective(@Param("record") Crop record, @Param("example") CropExample example);

    /**
     * 根据指定的条件来更新符合条件的数据库记录:CROP
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExample(@Param("record") Crop record, @Param("example") CropExample example);
    int numTest(@Param("val") String val);
}