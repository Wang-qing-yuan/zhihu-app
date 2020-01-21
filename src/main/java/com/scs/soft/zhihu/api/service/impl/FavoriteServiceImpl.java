package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.mapper.FavoriteMapper;
import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName FavoriteServiceImpl
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/19 &19:36
 * @Version 1.0
 **/
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;

    @Override
    public List<Favorite> selectRecentFavorite() {
        return favoriteMapper.selectRecentFavorite();
    }

    @Override
    public List<Map> selectAllFavorite() {
        return favoriteMapper.selectAllFavorite();
    }

    @Override
    public List<Favorite> selectFavoriteByPage(int currentPage, int count) {
        int dealCount = (currentPage -1) * count;
        return favoriteMapper.selectByPage(dealCount,count);
    }
}
