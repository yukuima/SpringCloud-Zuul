package cn.js;

import cn.xiangxue.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName ConsumerApp
 * @Description TODO
 * @createTime 2019年08月19日 16:36:00
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "M-PROVIDER-PRODUCT", configuration = RibbonConfig.class)
@EnableFeignClients("cn.js.service")
public class ConsumerFeignApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApp.class,args);
    }
}
