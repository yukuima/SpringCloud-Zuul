package cn.js;

import cn.xiangxue.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName ConsumerApp
 * @Description TODO
 * @createTime 2019年08月19日 16:36:00
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "M-PROVIDER-PRODUCT",configuration = RibbonConfig.class)
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class,args);
    }
}
