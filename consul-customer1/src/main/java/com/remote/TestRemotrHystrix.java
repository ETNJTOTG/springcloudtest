package com.remote;

import org.springframework.stereotype.Component;

/**
 * @author chenwq
 * @date 2020/11/3
 */
@Component
public class TestRemotrHystrix implements TestRemote {

    @Override
    public String hello(String name) {
        return "hystrix:" + name;
    }
}
