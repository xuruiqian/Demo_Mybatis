package com.astor.mapper;

import com.astor.model.Profile;

public interface ProfileMapper {
    int deleteByPrimaryKey(String id);

    int insert(Profile record);

    int insertSelective(Profile record);

    Profile selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Profile record);

    int updateByPrimaryKey(Profile record);
}