package com.gmall.user;

import com.gmall.user.bean.UmsMember;
import com.gmall.user.bean.UmsMemberReceiveAddress;
import com.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.gmall.user.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Test
    public void contextLoads() {
        umsMemberReceiveAddressMapper.deleteUserAddressById("6");
    }

}
