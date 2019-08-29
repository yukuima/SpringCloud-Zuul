package cn.js.feign;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName FeignClientConfig
 * @Description TODO
 * @createTime 2019年08月23日 15:21:00
 */
public class FeignClientConfig {
    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("admin","js");
    }
}
