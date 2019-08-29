package cn.js.service.fallback;

import cn.js.service.IProductClientService;
import cn.js.vo.Product;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName IProductClientServiceFallbackFactory
 * @Description TODO
 * @createTime 2019年08月24日 23:44:00
 */
@Component
public class IProductClientServiceFallbackFactory implements FallbackFactory<IProductClientService> {
    @Override
    public IProductClientService create(Throwable throwable) {
        return new IProductClientService() {
            @Override
            public Product getProduct(int id) {
                Product product = new Product();
                product.setProductId(999L);
                product.setProductName("feign-HystrixName");
                product.setProductDesc("feign-HystrixDesc");
                return product;
            }

            @Override
            public List<Product> listProduct() {
                return null;
            }
        };
    }
}
