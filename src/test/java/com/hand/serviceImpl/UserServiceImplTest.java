package com.hand.serviceImpl;

import com.hand.dto.UserDto;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertEquals;

/**
 * @author Created by liaoliao.ma@hand-china.com
 * @description description.
 * @date Created on 2017/9/22.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)*/
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceImplTest extends UserServiceImpl {

    @Test
    public void testQueryUser() throws Exception {
        UserDto dto = new UserDto(1,"maliao");
        assertEquals(1,super.queryUser(dto).size());
    }

}
