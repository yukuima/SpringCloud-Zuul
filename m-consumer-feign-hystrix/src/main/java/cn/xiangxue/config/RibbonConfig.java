package cn.xiangxue.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName RibbonConfig
 * @Description TODO
 * @createTime 2019年08月23日 10:22:00
 */
public class RibbonConfig {
    @Bean
    public IRule ribbonRule(){ //IRule是所有规则的标准
        return new com.netflix.loadbalancer.RandomRule();//随机访问策略
    }
}
