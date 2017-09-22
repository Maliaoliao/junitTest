package com.hand.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * @author Created by liaoliao.ma@hand-china.com
 * @description description.
 * @date Created on 2017/9/22.
 */
@RunWith(Parameterized.class)
public class CalculaTest extends Calcula {
    int expected = 0;
    int inputa = 0;
    int inputb  = 0;

    @Parameterized.Parameters
    public static Collection<Object[]> t(){
        return Arrays.asList(new Object[][]{
                {4,2,2},
                {4,1,3},
                {9,5,4}
        });
    }
    public CalculaTest(int expected, int inputa, int inputb) throws Exception{
        this.expected = expected;
        this.inputa = inputa;
        this.inputb = inputb;
    }
    @Test
    public void testAdd() {
        assertEquals(this.expected,this.add(this.inputa,this.inputb));

    }

}