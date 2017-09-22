package com.hand.spring;

import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;

import javax.transaction.Transactional;

/**
 * @author Created by liaoliao.ma@hand-china.com
 * @description description.
 * @date Created on 2017/9/22.
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Transactional
@Rollback
public class SpringTest2 {

}
