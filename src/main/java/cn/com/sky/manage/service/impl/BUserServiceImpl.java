package cn.com.sky.manage.service.impl;

import cn.com.sky.manage.dao.BUserMapper;
import cn.com.sky.manage.pojo.BUser;
import cn.com.sky.manage.pojo.BUserExample;
import cn.com.sky.manage.service.BUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: BUserServiceImpl
 * @Description:
 * @Auther: 49092
 * @CreateDate: 2018/10/1 18:01
 * @Version: 1.0
 * @UpdateDate:
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class BUserServiceImpl implements BUserService {

    @Resource
    BUserMapper bUserMapper;

    /**
     * 测试数据库的事务
     * @param id
     * @return
     */
    @Override
    public List<BUser> testTransition(String id) {
        BUserExample bUserExample = new BUserExample();
        bUserExample.createCriteria().andIdEqualTo(id);

//        boolean flag = true;
//
//        if (flag){
//            BUser bUser = bUserMapper.selectByExample(bUserExample).get(0);
//            bUser.setId("000");
//            bUser.setLoginName("sky");
//            bUserMapper.insert(bUser);
//            throw new RuntimeException();
//        }

        return bUserMapper.selectByExample(bUserExample);
    }

}
