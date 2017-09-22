package com.hand.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author Created by liaoliao.ma@hand-china.com
 * @description description.
 * @date Created on 2017/9/22.
 */

public class SpringTest {

    public ApplicationContext context = null;
    @Before
    public void setContext() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void getDateTase() {
        Date date = (Date) context.getBean("date");
        System.out.println(date);
    }
}
