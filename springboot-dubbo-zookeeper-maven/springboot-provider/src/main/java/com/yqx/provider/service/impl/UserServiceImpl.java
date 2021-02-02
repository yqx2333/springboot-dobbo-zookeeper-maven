package com.yqx.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yqx.common.domain.User;
import com.yqx.common.service.UserService;
import com.yqx.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // 注入
    @Autowired
    private UserMapper userMapper;

    /**
     * 查找所有对象
     * @return
     */
    @Override
    public List<User> queryUserAll() {
        return userMapper.queryUserAll();
    }

    /**
     * 根据ID查询User对象
     * @return
     */
    @Override
    public User getOne(Long id) {
        return userMapper.getOne( id );
    }


}
