package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Section
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/15 &13:54
 * @Version 1.0
 **/
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
