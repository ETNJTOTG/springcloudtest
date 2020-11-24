package com.controller;

import com.remote.TestRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenwq
 * @date 2020/11/3
 */
@RestController
public class FeignController {
    @Autowired
    private TestRemote testRemote;

    @RequestMapping("/getByFeign/{name}")
    public String get(@PathVariable String name){
        return testRemote.hello2(name);
    }
}
