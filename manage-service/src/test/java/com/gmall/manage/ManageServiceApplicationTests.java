package com.gmall.manage;

import com.gmall.manage.mapper.PmsProductSaleAttrMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageServiceApplicationTests {

    @Autowired
    PmsProductSaleAttrMapper pmsProductSaleAttrMapper;
    @Test
    public void contextLoads() {
        System.out.println(pmsProductSaleAttrMapper.selectSpuSaleAttrListCheckBySku("25", "106"));
    }

}
