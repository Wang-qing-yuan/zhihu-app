package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.domain.dto.UserDto;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/2/11 &19:29
 * @Version 1.0
 **/
public interface UserService {
    /**
     * 用户登录功能
     * @param userDto
     * @return
     */
    Result login(UserDto userDto);
}
