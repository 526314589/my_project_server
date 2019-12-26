package com.ltq.item.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liutieqiang
 * @Date: 2019-12-26 14:40
 * @Description:品牌分页参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandPageArgs {
    /**
     * 搜索关键字
     */
    private String key;
    /**
     * 当前页码
     */
    private Integer page;
    /**
     * 每页显示条数
     */
    private Integer rows;
    /**
     * 排序
     */
    private String sortBy;
    /**
     * 是否降序
     */
    private Boolean desc;

}
