package com.rlja.mp.happyfamily.controller;


import com.rlja.mp.happyfamily.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: happyfamily
 * @description: Hello
 * @author: Vaskka
 * @create: 2019/4/29 9:57 AM
 **/
@RestController
@Api(description = "hello")
public class Hello {

    @Autowired
    private HelloService service;

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @ApiOperation(value = "insert")
    @RequestMapping(value = "/insert/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> insert(@PathVariable String name) {
        Map<String, Object> map = new HashMap<>();
        service.insert(name);
        map.put("code", 0);
        return map;
    }

    @ApiOperation(value = "getall")
    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getall() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("data", service.getAll());
        return map;
    }
}
