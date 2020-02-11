package com.scs.soft.zhihu.api.domain.dto;

import com.scs.soft.zhihu.api.domain.entity.User;
import lombok.Builder;
import lombok.Data;

/**
 * @ClassName UserDto
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/2/11 &19:35
 * @Version 1.0
 **/
@Data
@Builder
public class UserDto {
    private String mobile;
    private String password;

    public UserDto(String mobile, String password) {
        this.mobile = mobile;
        this.password = password;
    }

}

