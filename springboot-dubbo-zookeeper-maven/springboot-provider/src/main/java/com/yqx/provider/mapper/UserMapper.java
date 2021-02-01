package com.yqx.provider.mapper;

import com.yqx.common.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询所有的User信息
     * @return
     */
    @Results(id = "userMap",value = {
            @Result( column = "id",property = "id" ),
            @Result( column = "username",property = "username" ),
            @Result( column = "password",property = "password" ),
            @Result( column = "name",property = "name" )} )
    @Select( "SELECT * FROM user" )
    List<User> queryUserAll();

    /**
     * 根据ID进行查询User对象
     * @param id
     * @return
     */
    @Select( "SELECT * FROM u_user u WHERE u.id=#{id}" )
    @ResultMap( "userMap" )
    User getOne( Long id );


}
