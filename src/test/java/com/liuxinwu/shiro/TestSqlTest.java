package com.liuxinwu.shiro;

import com.liuxinwu.shiro.dao.TestSqlDao;
import com.liuxinwu.shiro.dao.UserDao;
import com.liuxinwu.shiro.entity.TestSqlDTO;
import com.liuxinwu.shiro.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSqlTest {

    @Autowired
    private TestSqlDao testSqlDao;

    @Test
    public void getList(){
        List<TestSqlDTO> objects = testSqlDao.getList();
        for(Object o:objects){
            TestSqlDTO dto = (TestSqlDTO)o;
            System.out.println(dto.getName());
        }
    }

    @Autowired
    private UserDao userDao;
    @Test
    public void getUserList(){

        User wteam = userDao.getUserByUserName("wteam");
        System.out.println(wteam.getUserName());
    }


}
