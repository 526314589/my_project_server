package com.ltq.item.mapper;

import com.ltq.item.entity.TbCategoryBrand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 商品分类和品牌的中间表，两者是多对多关系 Mapper 接口
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
public interface TbCategoryBrandMapper extends BaseMapper<TbCategoryBrand> {

}
