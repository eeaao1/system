/*
 * TbmsapimanagerMapper.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers;

import biz.dao.mappers.entity.Tbmsapimanager;
import biz.dao.mappers.entity.TbmsapimanagerExample;
import com.github.pagehelper.Page;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

/**
 * @Title TBMSAPIMANAGER表的Mapper类
 * 
 * @Date 2023-08-19 11:06:21
 * @Description null
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
@Mapper
public interface TbmsapimanagerMapper {
    /**
     * 根据指定的条件获取数据库记录数:TBMSAPIMANAGER
     *
     * @param example Example对象
     * @return long 符合条件的记录数
     */
    long countByExample(TbmsapimanagerExample example);

    /**
     * 根据指定的条件删除数据库符合条件的记录:TBMSAPIMANAGER
     *
     * @param example Example对象
     * @return int 删除影响的记录数
     */
    int deleteByExample(TbmsapimanagerExample example);

    /**
     * 根据主键删除数据库的记录:TBMSAPIMANAGER
     *
     * @param cFunctionid null
     * @param cPath       null
     * @return int 删除影响的记录数
     */
    int deleteByPrimaryKey(@Param("cFunctionid") String cFunctionid, @Param("cPath") String cPath);

    /**
     * 新写入数据库记录:TBMSAPIMANAGER
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insert(Tbmsapimanager record);

    /**
     * 动态字段,写入数据库记录:TBMSAPIMANAGER
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insertSelective(Tbmsapimanager record);

    /**
     * 批量写入数据库记录:TBMSAPIMANAGER
     *
     * @param records 记录集
     * @return int 写入影响的记录数
     */
    int insertBatch(@Param("records") List<Tbmsapimanager> records);

    /**
     * 根据指定的条件查询符合条件的数据库记录:TBMSAPIMANAGER
     *
     * @param example Example对象
     * @return List<Tbmsapimanager> 符合条件的记录
     */
    List<Tbmsapimanager> selectByExample(TbmsapimanagerExample example);

    /**
     * 根据指定的条件分页查询符合条件的数据库记录:TBMSAPIMANAGER
     *
     * @param example   Example对象
     * @param rowBounds 分页对象
     * @return Page<Tbmsapimanager> 符合条件的记录
     */
    Page<Tbmsapimanager> selectByExampleWithPage(@Param("example") TbmsapimanagerExample example, @Param("rowBounds") RowBounds rowBounds);

    /**
     * 根据指定主键获取一条数据库记录:TBMSAPIMANAGER
     *
     * @param cFunctionid null
     * @param cPath       null
     * @return TbmsapimanagerTBMSAPIMANAGER 实体对象
     */
    Tbmsapimanager selectByPrimaryKey(@Param("cFunctionid") String cFunctionid, @Param("cPath") String cPath);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录:TBMSAPIMANAGER
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExampleSelective(@Param("record") Tbmsapimanager record, @Param("example") TbmsapimanagerExample example);

    /**
     * 根据指定的条件来更新符合条件的数据库记录:TBMSAPIMANAGER
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExample(@Param("record") Tbmsapimanager record, @Param("example") TbmsapimanagerExample example);

    /**
     * 动态字段,根据主键来更新符合条件的数据库记录:TBMSAPIMANAGER
     *
     * @param record 实体对象
     * @return int 更新影响的记录数
     */
    int updateByPrimaryKeySelective(Tbmsapimanager record);

    /**
     * 根据主键来更新符合条件的数据库记录:TBMSAPIMANAGER
     *
     * @param record 实体对象
     * @return int 更新影响的记录数
     */
    int updateByPrimaryKey(Tbmsapimanager record);
}