package com.controller;

import com.entity.PropertiesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenwq
 * @date 2020/11/6
 */
@RestController
public class TestController {

    @Value("${config}")
    private String config;

    @Autowired
    private PropertiesEntity propertiesEntity;

    @RequestMapping("/getConfig")
    public String getConfig(){
        return config;
    }

    @RequestMapping("/getP")
    public String getP(){
        return propertiesEntity.toString();
    }

}
