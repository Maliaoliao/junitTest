package com.hand.Mybatis;

import com.hand.dto.UserDto;
import com.hand.mapper.UserMapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by liaoliao.ma@hand-china.com
 * @description description.
 * @date Created on 2017/9/22.
 */
public class UserMapperImpl implements UserMapper {
    public List<UserDto> selectUser(UserDto dto) {
        String sql ="select * from sys_user t where t.user_name = " + dto.getName();
        ResultSet res = initContent(sql);
        List<UserDto> list = new ArrayList<UserDto>();
        try {
            while (res.next()){
                UserDto userdto = new UserDto(res.getInt("user_id"),res.getString("user_name"));
                list.add(userdto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public ResultSet initContent(String sql) {
        ResultSet res = null;
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try {
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:orcl","ml","ml");
                Statement t = con.createStatement();
                res = t.executeQuery(sql);
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
        }
        return res;
    }
}
