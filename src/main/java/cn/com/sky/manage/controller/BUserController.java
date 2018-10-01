package cn.com.sky.manage.controller;

import cn.com.sky.manage.pojo.BUser;
import cn.com.sky.manage.service.BUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: BUserController
 * @Description:
 * @Auther: 49092
 * @CreateDate: 2018/10/1 18:21
 * @Version: 1.0
 * @UpdateDate:
 */
@RestController
public class BUserController {

    @Resource
    BUserService bUserService;

    @RequestMapping(value = "/testTransition/{id}",method = RequestMethod.GET,
            produces = "application/json;charset=utf-8")
    public List<BUser> testTransition(@PathVariable(value = "id") String id){
        return bUserService.testTransition(id);
    }

}
