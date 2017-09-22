package com.hand.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Created by liaoliao.ma@hand-china.com
 * @description description.
 * @date Created on 2017/9/22.
 */
public class Calcula3Test extends Calcula3 {
    @Test
    public void reduce() {
        assertEquals(5,super.reduce(10,2));
    }

}