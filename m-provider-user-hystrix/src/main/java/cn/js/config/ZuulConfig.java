package cn.js.config;

import cn.js.filter.AuthorizedRequestFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName ZuulConfig
 * @Description TODO
 * @createTime 2019年08月26日 16:59:00
 */
@Configuration
public class ZuulConfig {
    @Bean
    public AuthorizedRequestFilter getAuthorizedRequestFilter(){
        return new AuthorizedRequestFilter();
    }
}
