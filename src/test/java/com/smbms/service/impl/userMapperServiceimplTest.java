package com.smbms.service.impl;

import com.smbms.until.Page;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class userMapperServiceimplTest {

    @Test
    public void pageSize() {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        userMapperServiceimpl userMapperServiceimpl = context.getBean("userMapperServiceimpl", userMapperServiceimpl.class);
        Page page = userMapperServiceimpl.PageSize("张", 3, 1, 2);
        List<Object> newsList = page.getNewsList();
        System.out.println("总页数："+page.getTotalPageCount());
        for (Object user : newsList) {
            System.out.println(user);
        }
    }
}