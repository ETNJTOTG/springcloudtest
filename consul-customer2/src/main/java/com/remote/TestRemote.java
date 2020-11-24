package com.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenwq
 * @date 2020/11/3
 */
@FeignClient(value = "consul-producer2", fallback = TestRemotrHystrix.class)
public interface TestRemote {

    @RequestMapping("/hello/{name}")
    public String hello2(@PathVariable String name);


}
