package com.hand.serviceImpl;

import com.hand.service.IRead;

/**
 * @author Created by liaoliao.ma@hand-china.com
 * @description description.
 * @date Created on 2017/9/26.
 */
public class Mother {
    public void read (IRead read) {
        System.out.println("开始！.......");
        System.out.println(read.getRead());
    }
}
