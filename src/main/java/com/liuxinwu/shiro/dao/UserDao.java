package com.liuxinwu.shiro.dao;

import com.liuxinwu.shiro.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    @Select("select * from t_user where user_name = #{userName}")
    @Results(id="user" ,value = {
            @Result(column="id", property="id", id=true),
            @Result(column="user_name", property="userName",javaType = String.class,jdbcType = JdbcType.VARCHAR)
    })
    User getUserByUserName(String userName);

}
