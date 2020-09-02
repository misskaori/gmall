package com.gmall.manage;

import com.gmall.manage.mapper.PmsProductSaleAttrMapper;
import com.gmall.service.SkuService;
import com.gmall.util.RedisUtil;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import javax.xml.ws.Service;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageServiceApplicationTests {
    @Autowired
    SkuService skuService;


    @Test
    public void contextLoads() {
        skuService.getAllSku();
    }

}
