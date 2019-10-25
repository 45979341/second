package com.liuxinwu.shiro.dao;

import com.liuxinwu.shiro.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoleDao {

    @Select("select a.* from t_role a,t_user b,t_user_role c where c.user_id = b.id and c.role_id = a.id and b.user_name = #{userName}")
    @Results(id="role" ,value = {
            @Result(column="id", property="id", id=true),
            @Result(column="role_name", property="roleName",javaType = String.class,jdbcType = JdbcType.VARCHAR)
    })
    List<Role> getRolesByUserName(String userName);


}
