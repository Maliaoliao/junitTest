package com.hand.util;

import com.hand.dto.UserDto;
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
public class Calcula4Test extends Calcula {

    public UserDto dto;
    String name ="";
    String expectedName ="";

    @Parameterized.Parameters
    public static Collection<Object[]> t(){
        return Arrays.asList(new Object[][]{
                {new UserDto(1,"maliao"),"maliao","maliao"},
                {new UserDto(1,"weij"),"weij","weij"},
                {new UserDto(1,"gx"),"weij","gx"}
        });
    }
    public Calcula4Test(UserDto dto, String expectedName, String name) throws Exception{
        this.dto = dto;
        this.expectedName = expectedName;
        this.name = name;
    }
    @Test
    public void testSelectUser() {
        assertEquals(this.expectedName,selectUser(this.dto,this.name));

    }

}