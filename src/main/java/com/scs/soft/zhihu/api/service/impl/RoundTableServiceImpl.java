package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.mapper.RoundTableMapper;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName RoundTableServiceImpl
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/17 &16:46
 * @Version 1.0
 **/
@Service
public class RoundTableServiceImpl implements RoundTableService {
    @Resource
    private RoundTableMapper roundTableMapper;

    @Override
    public List<RoundTable> selectRecentRoundTable() {
        return roundTableMapper.selectRecentRoundTable();
    }

    @Override
    public List<Map> selectAllRoundTable() {
        return roundTableMapper.selectAllRoundTable();
    }
}
