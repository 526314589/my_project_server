package com.ltq.item.service;

import com.ltq.common.vo.PageResult;
import com.ltq.item.entity.TbBrand;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ltq.item.pojo.TbBrandDTO;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 服务类
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
public interface TbBrandService extends IService<TbBrand> {
    /**
     *分页查询品牌
     *@param key, 搜索关键字
     *@param page, 当前页码
     *@param rows, 每页显示条数
     *@param sortBy, 排序
     *@param desc, 是否降序
     *@return   org.springframework.http.ResponseEntity
     *@author  liutieqiang
     *@date  2019-12-26 14:54
     */
    PageResult<TbBrandDTO> findBrandByPage(String key, Integer page, Integer rows, String sortBy, Boolean desc);
}
