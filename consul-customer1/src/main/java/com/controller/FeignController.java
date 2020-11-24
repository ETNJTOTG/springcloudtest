package com.controller;

import com.remote.TestRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenwq
 * @date 2020/11/3
 */
@RestController
public class FeignController {
    @Autowired
    private TestRemote testRemote;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/getServices")
    public List<String> getServices(){
        return discoveryClient.getServices();
    }

    @RequestMapping("/getInstances")
    public List<ServiceInstance> getInstances(){
        return discoveryClient.getInstances("consul-producer");
    }

    @RequestMapping("/getUri")
    public String getUri(){
        return loadBalancerClient.choose("consul-producer").getUri().toString();
    }

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return testRemote.hello(name);
    }
}
