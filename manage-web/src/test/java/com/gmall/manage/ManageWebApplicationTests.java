package com.gmall.manage;


import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageWebApplicationTests {

    @Test
    public void contextLoads() throws IOException, MyException {
        String tracker = ManageWebApplicationTests.class.getResource("/tracker.conf").getPath();
        ClientGlobal.init(tracker);
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageClient storageClient = new StorageClient(trackerServer, null);
        String[] uploadInfos = storageClient.upload_file("D:/Application/SourceCode/谷粒商城开发工具/picture/kaori.jpg", "jpg", null);
        String url = "http://192.168.100.128";
        for (String uploadInfo : uploadInfos) {
            url += "/" + uploadInfo;
        }
        System.out.println(url);
    }
}
