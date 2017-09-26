package com.hand.serviceImpl;

import com.hand.dto.UserDto;
import com.hand.mapper.UserMapper;
import com.hand.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Created by liaoliao.ma@hand-china.com
 * @description description.
 * @date Created on 2017/9/22.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    public UserMapper mapper;
    public List<UserDto> queryUser(UserDto dto) {

        return mapper.selectUser(dto);
    }
}
