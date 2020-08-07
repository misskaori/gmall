package com.gmall.user.mapper;

import com.gmall.bean.UmsMember;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends tk.mybatis.mapper.common.Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
    List<UmsMember> selectUserById(String id);
    void insertUser(UmsMember umsMember);
    void deleteUserById(String id);
    void updateUserPasswordById(@Param("id") String id, @Param("password") String password);
}
