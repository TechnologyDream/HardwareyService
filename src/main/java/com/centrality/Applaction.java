package com.centrality;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author yangsen
 * @date 2017/12/14
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class Applaction {
    @RequestMapping("/")
    public String index(){
        return "Spring Boot Application...";
    }
    public static void main(String[] args) {
        SpringApplication.run(Applaction.class, args);
    }
}
