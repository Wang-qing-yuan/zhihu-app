package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Columns;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ColumnsService
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/19 &19:36
 * @Version 1.0
 **/
public interface ColumnsService {
    /**
     * 查询最新专栏
     * @return
     */
    List<Columns> selectRecentColumns();

    /**
     * 查询所有专栏
     * @return
     */
    List<Map> selectAllColumns();
}
