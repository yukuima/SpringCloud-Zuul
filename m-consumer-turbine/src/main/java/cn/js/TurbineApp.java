package cn.js;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName TurbineApp
 * @Description TODO
 * @createTime 2019年08月25日 23:00:00
 */
@SpringBootApplication
@EnableTurbine
public class TurbineApp {
    public static void main(String[] args) {
        SpringApplication.run(TurbineApp.class,args);
    }
}
