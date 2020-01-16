package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @ClassName SpecialService
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/15 &14:40
 * @Version 1.0
 **/
public interface SpecialService {
    /**
     * 查询所有专题
     *
     * @return List<Map>
     */
    List<Map> selectAll();

    /**
     * 查询最新专题
     *
     * @return List<Special>
     */
    List<Special> selectRecent();
}
