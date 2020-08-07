package com.gmall.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.bean.UmsMember;
import com.gmall.service.UserService;
import com.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAll();
        return umsMemberList;
    }
}
