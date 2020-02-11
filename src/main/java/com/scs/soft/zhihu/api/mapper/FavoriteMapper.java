package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.domain.entity.Favorite;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @ClassName FavoriteMapper
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/19 &19:32
 * @Version 1.0
 **/
public interface FavoriteMapper {
    /**
     * 查询最新收藏
     * @return list<Favorite>
     */
    @Select("SELECT * FROM t_favorite ORDER BY id ASC LIMIT 0,4")
    List<Favorite> selectRecentFavorite();


    /**
     * 查询所有收藏
     * @return list<Map>
     */
    @Select("SELECT * FROM t_favorite")
    @Results({
            @Result(property = "id",column = "id",javaType = Integer.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "creatorName",column = "creator_name",javaType = String.class),
            @Result(property = "creatorAvatar",column = "creator_avatar",javaType = String.class),
            @Result(property = "followers",column = "followers",javaType = Integer.class),
            @Result(property = "totalCount",column = "total_count",javaType = Integer.class),
            @Result(property = "questionTitle",column = "question_title",javaType = String.class),
            @Result(property = "answerAuthorName",column = "answer_author_name",javaType = String.class),
            @Result(property = "answerContent",column = "answer_content",javaType = String.class),
            @Result(property = "voteupCount",column = "voteup_count",javaType = Integer.class),
            @Result(property = "commentCount",column = "comment_count",javaType = Integer.class)
    })
    List<Map> selectAllFavorite();

    /**
     *
     * @param dealCount
     * @param count
     * @return
     */
    @Select("SELECT id , title ,creator_name, creator_avatar ,followers ,total_count ,question_title ,answer_author_name ,answer_content ,voteup_count, comment_count FROM t_favorite ORDER BY id LIMIT #{dealCount} , #{count}")
    List<Favorite> selectByPage(int dealCount, int count);
}
