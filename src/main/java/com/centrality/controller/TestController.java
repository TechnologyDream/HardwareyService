package com.centrality.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author yangsen
 * @date 2017/12/14
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
