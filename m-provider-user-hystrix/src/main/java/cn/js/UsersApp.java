package cn.js;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName UsersApp
 * @Description TODO
 * @createTime 2019年08月25日 22:37:00
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
public class UsersApp {
    public static void main(String[] args) {
        SpringApplication.run(UsersApp.class,args);
    }
}
