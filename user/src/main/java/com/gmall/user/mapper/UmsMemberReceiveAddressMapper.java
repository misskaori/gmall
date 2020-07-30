package com.gmall.user.mapper;

import com.gmall.user.bean.UmsMember;
import com.gmall.user.bean.UmsMemberReceiveAddress;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UmsMemberReceiveAddressMapper extends Mapper<UmsMemberReceiveAddress> {
    List<UmsMemberReceiveAddress> selectAllUserAddress();
    List<UmsMemberReceiveAddress> selectUserAddressById(String id);
    void insertUserAddress(UmsMemberReceiveAddress umsMemberReceiveAddress);
    void deleteUserAddressById(String id);
    void updateUserAddressById(@Param("id") String id, @Param("umsMemberReceiveAddress") UmsMemberReceiveAddress umsMemberReceiveAddress);
}
