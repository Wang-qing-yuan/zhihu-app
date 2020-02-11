package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.domain.dto.UserDto;

import com.scs.soft.zhihu.api.domain.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/2/11 &19:28
 * @Version 1.0
 **/
public interface UserMapper {
    /**
     * 登录
     * @param userDto
     * @return
     * @throws SQLException
     */
    @Select("SELECT mobile,password FROM t_user WHERE mobile=#{mobile} and password=#{password}")
    User login(UserDto userDto) throws SQLException;

    @Select("SELECT * FROM t_user WHERE mobile = #{mobile}")
    User findUserByMobile(@Param("mobile") String mobile) throws SQLException;
}
