package com.hand.service;

import com.hand.dto.UserDto;

import java.util.List;

/**
 * @author Created by liaoliao.ma@hand-china.com
 * @description description.
 * @date Created on 2017/9/22.
 */
public interface IUserService {

    public List<UserDto> queryUser(UserDto dto);
}
