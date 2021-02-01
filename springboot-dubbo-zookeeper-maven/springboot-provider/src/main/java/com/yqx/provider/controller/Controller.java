package com.yqx.provider.controller;

import com.yqx.common.domain.User;
import com.yqx.provider.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping( "/user/queryAll" )
    public String queryAll(){
        List<User> users = userServiceImpl.queryUserAll();
        System.out.println( users );
        return Arrays.toString(new List[]{users});
    }




}
