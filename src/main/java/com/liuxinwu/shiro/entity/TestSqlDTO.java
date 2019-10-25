package com.liuxinwu.shiro.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * 表test_sql传输对象
 */
@Data
public class TestSqlDTO {

    private int id;
    private String name;
    private int age;
    private Timestamp time;
}
