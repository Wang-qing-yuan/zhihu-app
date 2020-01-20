package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Columns
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/19 &19:30
 * @Version 1.0
 **/
@Data
@Builder
public class Columns {
    private Integer id;
    private String  title;
    private String  description;
    private String  url;
    private String  imageUrl;
    private Integer followers;
    private Integer articlesCount;
}
