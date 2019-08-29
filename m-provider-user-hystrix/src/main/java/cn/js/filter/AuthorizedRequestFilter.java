package cn.js.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName AuthorizedRequestFilter
 * @Description TODO
 * @createTime 2019年08月26日 16:52:00
 */
public class AuthorizedRequestFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        String auth="admin:js";
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("UTF-8")));
        String authHeader = "Basic" + new String(encodedAuth);
        context.addZuulRequestHeader("authorization",authHeader);
        return null;
    }
}
