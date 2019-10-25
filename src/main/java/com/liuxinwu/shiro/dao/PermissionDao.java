package com.liuxinwu.shiro.dao;

import com.liuxinwu.shiro.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PermissionDao {

    @Select("SELECT * FROM t_permission a,t_role b,t_role_permission c where c.role_id = b.id and c.permission_id = a.id and c.role_id in (select role_id from t_user_role u inner join t_user r on u.user_id=r.id and r.user_name=#{userName})")
    @Results(id="permission" ,value = {
            @Result(column="id", property="id", id=true),
            @Result(column="permission_name", property="permissionName",javaType = String.class,jdbcType = JdbcType.VARCHAR)
    })
    List<Permission> getPermissionsByUserName(String userName);

}
