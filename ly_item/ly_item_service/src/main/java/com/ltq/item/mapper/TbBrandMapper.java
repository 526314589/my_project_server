package com.ltq.item.mapper;

import com.ltq.item.entity.TbBrand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 Mapper 接口
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
public interface TbBrandMapper extends BaseMapper<TbBrand> {

}
