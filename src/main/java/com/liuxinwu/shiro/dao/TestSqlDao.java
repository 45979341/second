package com.liuxinwu.shiro.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liuxinwu.shiro.entity.TestSqlDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * test_sql表的dao层
 */
@Mapper
@Repository
public interface TestSqlDao extends BaseMapper<TestSqlDTO> {
    @Select("select * from test_sql")
    List<TestSqlDTO> getList();


}
