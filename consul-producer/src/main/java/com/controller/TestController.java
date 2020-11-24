package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenwq
 * @date 2020/11/3
 */
@RestController
public class TestController {

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello:1" + name;
    }
}
