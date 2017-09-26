package com.hand.serviceImpl;

import com.hand.service.IRead;

/**
 * @author Created by liaoliao.ma@hand-china.com
 * @description description.
 * @date Created on 2017/9/26.
 */
public class ReadBookService implements IRead{
    public String getRead() {
        return "书！";
    }
}