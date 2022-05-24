package com.example.downloadjpg.Controller;

import com.example.downloadjpg.Service.JPG;
import com.example.downloadjpg.Service.BafaCloud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class BafaClound {

    @Autowired
    BafaCloud bafaCloud;

    @Autowired
    JPG jpg;

    @GetMapping("getUrl")
    public String getUrl(){
        return bafaCloud.getUrl();
    }

    @GetMapping("download")
    public void download() throws IOException {
        jpg.downloadImage();
    }
}
