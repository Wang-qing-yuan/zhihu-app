package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.ColumnsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName ColumnsController
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/19 &19:41
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/columns")
public class ColumnsController {
    @Resource
    private ColumnsService columnsService;

    @GetMapping
    public Result getRecentColumns(){
        return Result.success(columnsService.selectRecentColumns());
    }

    @GetMapping(value = "/all")
    public Result getAllColumns(){
        return Result.success(columnsService.selectAllColumns());
    }
}
