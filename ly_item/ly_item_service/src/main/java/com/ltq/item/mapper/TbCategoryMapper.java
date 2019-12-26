package com.ltq.item.mapper;

import com.ltq.item.entity.TbCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 Mapper 接口
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
public interface TbCategoryMapper extends BaseMapper<TbCategory> {

}
