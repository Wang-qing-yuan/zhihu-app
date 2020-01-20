package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Favorite
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/19 &19:30
 * @Version 1.0
 **/
@Data
@Builder
public class Favorite {
    private Integer id;
    private String title;
    private String creatorName;
    private String creatorAvatar;
    private Integer followers;
    private Integer totalCount;
    private String questionTitle;
    private String answerAuthorName;
    private String answerContent;
    private Integer voteupCount;
    private Integer commentCount;
}
