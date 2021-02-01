package com.yqx.common.service;

import com.yqx.common.domain.User;

import java.util.List;

/**
 * UserService对象  业务逻辑层
 */
public interface UserService {

    /**
     * 查询所有User对象
     * @return
     * @Auther 于清晰
     */
    List<User> queryUserAll();

    /**
     * 根据ID查询User对象
     * @param id
     * @return
     */
    User getOne( Long id );


}
