package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName RountTable
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/17 &16:37
 * @Version 1.0
 **/
@Data
@Builder
public class RoundTable {
    private Integer id;
    private String name;
    private String banner;
    private String tinyBanner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;
}
