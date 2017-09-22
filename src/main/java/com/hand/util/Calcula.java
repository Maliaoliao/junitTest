package com.hand.util;

import com.hand.dto.UserDto;

/**
 * @author Created by liaoliao.ma@hand-china.com
 * @description description.
 * @date Created on 2017/9/22.
 */
public class Calcula {
    public int add(int a, int b){
        return a + b;
    }

    public String selectUser(UserDto dto,String name){
        System.out.println(dto.toString());
        return name;
    }
}
