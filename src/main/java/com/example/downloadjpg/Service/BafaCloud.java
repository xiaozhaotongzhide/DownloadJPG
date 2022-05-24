package com.example.downloadjpg.Service;

import com.example.downloadjpg.bafaCloud.BafaCloudBean;
import com.example.downloadjpg.bafaCloud.Data;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.jndi.toolkit.url.Uri;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class BafaCloud {

    RestTemplate restTemplate = new RestTemplate();

    public String getUrl() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("https://images.bemfa.com/cloud/v1/get/?uid=60163f906afb4a6098d54db6452daaf8&topic=lz6644", String.class);
        String body = forEntity.getBody();
//        Gson gson = new Gson();
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
        BafaCloudBean bafaCloudBean = gson.fromJson(body, BafaCloudBean.class);
        Data data = bafaCloudBean.getData().get(0);
        String url = data.getUrl();
        return url;
    }
}
