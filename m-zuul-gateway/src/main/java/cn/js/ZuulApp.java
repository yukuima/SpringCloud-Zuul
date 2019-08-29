package cn.js;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName ZuulApp
 * @Description TODO
 * @createTime 2019年08月26日 15:47:00
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class,args);
    }
}
