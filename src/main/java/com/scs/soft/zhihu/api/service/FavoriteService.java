package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Favorite;

import java.util.List;
import java.util.Map;

/**
 * @ClassName FavoriteService
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/19 &19:35
 * @Version 1.0
 **/
public interface FavoriteService {
    /**
     * 查询最新收藏
     * @return
     */
    List<Favorite> selectRecentFavorite();

    /**
     * 查询所有收藏
     * @return
     */
    List<Map> selectAllFavorite();
}
