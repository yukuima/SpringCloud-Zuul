package cn.js.service;

import cn.js.feign.FeignClientConfig;
import cn.js.service.fallback.IProductClientServiceFallbackFactory;
import cn.js.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0.0
 * @InterfaceName IProductClientService
 * @Description TODO
 * @createTime 2019年08月23日 15:27:00
 */
@FeignClient(name = "M-PROVIDER-PRODUCT",configuration = FeignClientConfig.class, fallbackFactory =
        IProductClientServiceFallbackFactory.class)

public interface IProductClientService {
    @RequestMapping("/product/get/{id}")
    public Product getProduct(@PathVariable("id") int id);

    @RequestMapping("/product/list")
    public List<Product> listProduct();
}
