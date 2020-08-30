package com.szw.dream;

import com.szw.dream.config.study.Person;
import com.szw.dream.po.UserBase;
import com.szw.dream.service.UserBaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DreamApplicationTests {
    @Autowired
    private UserBaseService userBaseService;
    @Autowired
    Person person;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void userBaseTest() {
        UserBase userBase1 = userBaseService.queryUser(1L);
        System.out.println(userBase1);
    }
}
