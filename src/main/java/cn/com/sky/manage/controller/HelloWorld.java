package cn.com.sky.manage.controller;

import cn.com.sky.interceptor.SkyInterceptor;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloWorld
 * @Description:
 * @Auther: 49092
 * @CreateDate: 2018/10/1 16:56
 * @Version: 1.0
 * @UpdateDate:
 */
@RestController
public class HelloWorld {

    Logger logger = Logger.getLogger(HelloWorld.class);

    @RequestMapping(value = "/hello",method = RequestMethod.GET,
            produces = "application/json;charset=utf-8")
    public String hello(){
        logger.info("进入hello方法了。。。");
        return "Hello World";
    }

}
