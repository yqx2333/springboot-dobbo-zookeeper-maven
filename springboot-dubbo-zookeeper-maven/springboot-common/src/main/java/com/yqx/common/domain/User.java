package com.yqx.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

// 添加一个实体类对象    User
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor      // 并实现序列化
public class User implements Serializable {

    private Long id;         // 用户ID
    private String username;    // 用户名
    private Integer password;   // 用户密码
    private String name;        // 用户姓名



}
