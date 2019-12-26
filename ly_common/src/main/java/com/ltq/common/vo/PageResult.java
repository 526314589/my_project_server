package com.ltq.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author: liutieqiang
 * @Date: 2019-12-26 15:01
 * @Description: 分页查询结果工具
 */
@Data
public class PageResult<T> {
    /**
     * 总条数
     */
    private Long total;
    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 当期页数据
     */
    private List<T> items;

    public PageResult() {
    }

    public PageResult(Long total, List<T> items) {
        this.total = total;
        this.items = items;
    }

    public PageResult(Long total, Integer totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }

}
