package com.gmall.service;

import com.gmall.bean.UmsMember;
import com.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();
    UmsMember login(UmsMember umsMember);
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
    void addUserToken(String token, String memberId);
}
