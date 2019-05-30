package com.metal.mapper;

import com.metal.pojo.TbWa;
import com.metal.pojo.TbWaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWaMapper {
    int countByExample(TbWaExample example);

    int deleteByExample(TbWaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbWa record);

    int insertSelective(TbWa record);

    List<TbWa> selectByExample(TbWaExample example);

    TbWa selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbWa record, @Param("example") TbWaExample example);

    int updateByExample(@Param("record") TbWa record, @Param("example") TbWaExample example);

    int updateByPrimaryKeySelective(TbWa record);

    int updateByPrimaryKey(TbWa record);
}