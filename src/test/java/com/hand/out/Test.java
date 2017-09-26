package com.hand.out;

import com.hand.serviceImpl.Mother;
import com.hand.serviceImpl.ReadBookService;
import com.hand.serviceImpl.ReadNewspaperService;
/**
 * @author Created by liaoliao.ma@hand-china.com
 * @description description.
 * @date Created on 2017/9/26.
 */
public class Test {
    @org.junit.Test
    public void test() {
        Mother mother = new Mother();
        mother.read(new ReadNewspaperService());
        mother.read(new ReadBookService());
    }
}
