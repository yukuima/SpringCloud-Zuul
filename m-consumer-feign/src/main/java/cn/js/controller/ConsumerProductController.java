package cn.js.controller;

import cn.js.service.IProductClientService;
import cn.js.vo.Product;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerProductController {

    @Resource
    private IProductClientService iProductClientService;

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/product/get")
    public Object getProduct(int id) {
        return  iProductClientService.getProduct(id);
    }

    @RequestMapping("/product/list")
    public  Object listProduct() {
        return iProductClientService.listProduct();
    }



    /*public static final String PRODUCT_GET_URL = "http://M-PROVIDER-PRODUCT/product/get/";
    public static final String PRODUCT_LIST_URL="http://M-PROVIDER-PRODUCT/product/list/";
    public static final String PRODUCT_ADD_URL = "http://localhost:8080/product/add/";
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HttpHeaders httpHeaders;
    @Resource
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/product/get")
    public Object getProduct(int id) {
        //Product product = restTemplate.getForObject(PRODUCT_GET_URL + id, Product.class);
        Product product = restTemplate.exchange(PRODUCT_GET_URL + id, HttpMethod.GET, new HttpEntity<Object>(httpHeaders), Product.class).getBody();
        return  product;
    }

    @RequestMapping("/product/list")
    public  Object listProduct() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("M-PROVIDER-PRODUCT");
        System.out.println(
                "【*** ServiceInstance ***】host = " + serviceInstance.getHost()
                        + "、port = " + serviceInstance.getPort()
                        + "、serviceId = " + serviceInstance.getServiceId());
        System.out.println("【*** ServiceInstanceAll ***】 = "+serviceInstance);

        //List<Product> list = restTemplate.getForObject(PRODUCT_LIST_URL, List.class);
        List<Product> list = restTemplate.exchange(PRODUCT_LIST_URL, HttpMethod.GET, new HttpEntity<Object>(httpHeaders), List.class).getBody();
        return  list;
    }

    @RequestMapping("/product/add")
    public Object addPorduct(Product product) {
        Boolean result = true;
        return  result;
    }*/
}
