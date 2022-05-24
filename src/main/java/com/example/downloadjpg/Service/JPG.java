package com.example.downloadjpg.Service;

import com.example.downloadjpg.Service.BafaCloud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

@Service
public class JPG {

    @Autowired
    BafaCloud bafaCloud;

    public void downloadImage() throws IOException {
//        String url = "https://bimg.bemfa.com//f2b45e980c04dfab837bc1ec06884eb9-b51a41f124ba4adb21abe6ff17f94f13-1642745065.jpg";
        String url = bafaCloud.getUrl();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<byte[]> forEntity = restTemplate.getForEntity(url, byte[].class);
        Files.write(Paths.get("/root/image/1.jpg"), Objects.requireNonNull(forEntity.getBody(), "未获取到下载文件"));
//        Files.write(Paths.get("C:\\Users\\86157\\Desktop\\htmltest\\1.jpg"), Objects.requireNonNull(forEntity.getBody(), "未获取到下载文件"));
    }

}
