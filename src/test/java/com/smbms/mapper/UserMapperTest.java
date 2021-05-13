package com.smbms.mapper;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMapperTest {

    @Test
    public void sumCount() {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        Integer integer = userMapper.sumCount("", 0);
        System.out.println(integer);
    }
}