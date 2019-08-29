package cn.js.controller;

import cn.js.vo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName UserController
 * @Description TODO
 * @createTime 2019年08月25日 22:32:00
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @RequestMapping("/get/{name}")
    @HystrixCommand
    public Object get(@PathVariable("name") String name){
        User user = new User();
        user.setName("Mike");
        user.setAge(19);
        user.setSex("男");
        return user;
    }
}
