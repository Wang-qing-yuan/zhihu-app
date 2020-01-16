package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName SectionMapper
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/15 &15:12
 * @Version 1.0
 **/
public interface SectionMapper {
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId} ")
    List<Section> getSectionBySpecialId(String specialId);

}
