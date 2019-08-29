package cn.js.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName ProductApp
 * @Description TODO
 * @createTime 2019年08月19日 13:51:00
 */
@SpringBootApplication
@MapperScan("cn.js.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ProductHystrixApp {
    public static void main(String[] args) {
        SpringApplication.run(ProductHystrixApp.class,args);
    }
}
