package com.gmall.user.mapper;

import com.gmall.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UmsMember> selectAllUser();
}
