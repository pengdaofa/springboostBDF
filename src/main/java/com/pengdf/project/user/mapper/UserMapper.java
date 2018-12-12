package com.pengdf.project.user.mapper;

import com.pengdf.project.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserEntity> findAll();
}
