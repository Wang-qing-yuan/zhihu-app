package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.mapper.ColumnsMapper;
import com.scs.soft.zhihu.api.service.ColumnsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ColumnsServiceImpl
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/19 &19:37
 * @Version 1.0
 **/
@Service
public class ColumnsServiceImpl implements ColumnsService {
    @Resource
    private ColumnsMapper columnsMapper;

    @Override
    public List<Columns> selectRecentColumns() {
        return columnsMapper.selectRecentColumns();
    }

    @Override
    public List<Map> selectAllColumns() {
        return columnsMapper.selectAllColumns();
    }
}
