package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @ClassName RoundTableMapper
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/17 &16:39
 * @Version 1.0
 **/
public interface RoundTableMapper {
    /**
     * 查询最新圆桌
     * @return list<RoundTable>
     */
    @Select("SELECT * FROM t_round_table ORDER BY id ASC LIMIT 0,4")
    List<RoundTable> selectRecentRoundTable();


    /**
     * 查询所有圆桌
     * @return list<Map>
     */
    @Select("SELECT * FROM t_round_table")
    @Results({
            @Result(property = "id",column = "id",javaType = Integer.class),
            @Result(property = "name",column = "name",javaType = String.class),
            @Result(property = "banner",column = "banner",javaType = String.class),
            @Result(property = "tinyBanner",column = "tiny_banner",javaType = String.class),
            @Result(property = "urlToken",column = "url_token",javaType = String.class),
            @Result(property = "visitsCount",column = "visits_count",javaType = Integer.class),
            @Result(property = "includeCount",column = "include_count",javaType = Integer.class)
    })
    List<Map> selectAllRoundTable();
}
