/*
 * TbapiqueryconfigMapper.java
 * 
 * All right reserved.
 * 
 */
package biz.dao.mappers;

import biz.dao.mappers.entity.Tbapiqueryconfig;
import biz.dao.mappers.entity.TbapiqueryconfigExample;
import com.github.pagehelper.Page;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

/**
 * @Title TBAPIQUERYCONFIG表的Mapper类
 * 
 * @Date 2023-08-19 11:06:21
 * @Description null
 * <p>
 * 这是工具生成代码，禁止手工修改
 */
@Mapper
public interface TbapiqueryconfigMapper {
    /**
     * 根据指定的条件获取数据库记录数:TBAPIQUERYCONFIG
     *
     * @param example Example对象
     * @return long 符合条件的记录数
     */
    long countByExample(TbapiqueryconfigExample example);

    /**
     * 根据指定的条件删除数据库符合条件的记录:TBAPIQUERYCONFIG
     *
     * @param example Example对象
     * @return int 删除影响的记录数
     */
    int deleteByExample(TbapiqueryconfigExample example);

    /**
     * 根据主键删除数据库的记录:TBAPIQUERYCONFIG
     *
     * @param cFunctionid null
     * @return int 删除影响的记录数
     */
    int deleteByPrimaryKey(String cFunctionid);

    /**
     * 新写入数据库记录:TBAPIQUERYCONFIG
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insert(Tbapiqueryconfig record);

    /**
     * 动态字段,写入数据库记录:TBAPIQUERYCONFIG
     *
     * @param record 实体对象
     * @return int 写入影响的记录数
     */
    int insertSelective(Tbapiqueryconfig record);

    /**
     * 批量写入数据库记录:TBAPIQUERYCONFIG
     *
     * @param records 记录集
     * @return int 写入影响的记录数
     */
    int insertBatch(@Param("records") List<Tbapiqueryconfig> records);

    /**
     * :TBAPIQUERYCONFIG
     *
     * @param example Example对象
     * @return List<Tbapiqueryconfig>
     */
    List<Tbapiqueryconfig> selectByExampleWithBLOBs(TbapiqueryconfigExample example);

    /**
     * 根据指定的条件查询符合条件的数据库记录:TBAPIQUERYCONFIG
     *
     * @param example Example对象
     * @return List<Tbapiqueryconfig> 符合条件的记录
     */
    List<Tbapiqueryconfig> selectByExample(TbapiqueryconfigExample example);

    /**
     * 根据指定的条件分页查询符合条件的数据库记录:TBAPIQUERYCONFIG
     *
     * @param example   Example对象
     * @param rowBounds 分页对象
     * @return Page<Tbapiqueryconfig> 符合条件的记录
     */
    Page<Tbapiqueryconfig> selectByExampleWithPage(@Param("example") TbapiqueryconfigExample example, @Param("rowBounds") RowBounds rowBounds);

    /**
     * 根据指定主键获取一条数据库记录:TBAPIQUERYCONFIG
     *
     * @param cFunctionid null
     * @return TbapiqueryconfigTBAPIQUERYCONFIG 实体对象
     */
    Tbapiqueryconfig selectByPrimaryKey(String cFunctionid);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录:TBAPIQUERYCONFIG
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExampleSelective(@Param("record") Tbapiqueryconfig record, @Param("example") TbapiqueryconfigExample example);

    /**
     * :TBAPIQUERYCONFIG
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int
     */
    int updateByExampleWithBLOBs(@Param("record") Tbapiqueryconfig record, @Param("example") TbapiqueryconfigExample example);

    /**
     * 根据指定的条件来更新符合条件的数据库记录:TBAPIQUERYCONFIG
     *
     * @param record  实体对象
     * @param example Example对象
     * @return int 更新影响的记录数
     */
    int updateByExample(@Param("record") Tbapiqueryconfig record, @Param("example") TbapiqueryconfigExample example);

    /**
     * 动态字段,根据主键来更新符合条件的数据库记录:TBAPIQUERYCONFIG
     *
     * @param record 实体对象
     * @return int 更新影响的记录数
     */
    int updateByPrimaryKeySelective(Tbapiqueryconfig record);

    /**
     * :TBAPIQUERYCONFIG
     *
     * @param record 实体对象
     * @return int
     */
    int updateByPrimaryKeyWithBLOBs(Tbapiqueryconfig record);

    /**
     * 根据主键来更新符合条件的数据库记录:TBAPIQUERYCONFIG
     *
     * @param record 实体对象
     * @return int 更新影响的记录数
     */
    int updateByPrimaryKey(Tbapiqueryconfig record);
}