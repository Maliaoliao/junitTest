package com.hand.mapper;

import com.hand.dto.UserDto;

import java.util.List;

/**
 * @author Created by liaoliao.ma@hand-china.com
 * @description description.
 * @date Created on 2017/9/22.
 */
public interface UserMapper {
    public List<UserDto> selectUser(UserDto dto);
}
