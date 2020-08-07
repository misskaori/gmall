package com.gmall.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.bean.UmsMember;
import com.gmall.service.UserService;

import java.util.List;

@Service
public class IndexServiceImpl implements UserService {

    @Override
    public List<UmsMember> getAllUser() {
        return null;
    }
}
