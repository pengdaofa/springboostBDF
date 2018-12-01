package com.pengdf.demo.mapper;

import com.pengdf.demo.entity.Yh;
import com.pengdf.demo.entity.YhExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YhMapper {
    int deleteByPrimaryKey(String yhid);

    int insert(Yh record);

    int insertSelective(Yh record);

    List<Yh> selectByExample(YhExample example);

    Yh selectByPrimaryKey(String yhid);

    int updateByPrimaryKeySelective(Yh record);

    int updateByPrimaryKey(Yh record);
}