package cn.js.controller.controller;

import cn.js.controller.service.IProductService;
import cn.js.vo.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName ProductController
 * @Description TODO
 * @createTime 2019年08月19日 14:52:00
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private IProductService iProductService;
    @Resource
    private DiscoveryClient client;

    @RequestMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "getFallback")
    public Object get(@PathVariable("id") int id) throws Exception {

        Product product = this.iProductService.get(id);
        if (product == null) {
            System.out.println("==============product back null===============");
            throw new Exception("该商品已经下架！");
        }
        return product;
    }

    public Object getFallback(@PathVariable("id") int id) {
        Product product = new Product();
        product.setProductId(0L);
        product.setProductName("Hystrix name");
        product.setProductDesc("Hystrix desc");
        return product;
    }

    @RequestMapping("/add")
    public Object create() {
        Product product = new Product();
        product.setProductId(103L);
        product.setProductName("PRODUCTNAME");
        product.setProductDesc("PRODUCTDESC");
        return this.iProductService.add(product);
    }

    @RequestMapping("/list")
    public Object get() {
        return this.iProductService.list();
    }

    @RequestMapping("/discover")
    public Object discover() {
        return this.client;
    }
}
