package com.example.downloadjpg;

import com.example.downloadjpg.Service.BafaCloud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DownloadJpgApplicationTests {

    @Autowired
    BafaCloud bafaCloud;

    /*@Test
    void contextLoads() {
        String url = bafaCloud.getUrl();
        System.out.println(url);
    }*/

}
