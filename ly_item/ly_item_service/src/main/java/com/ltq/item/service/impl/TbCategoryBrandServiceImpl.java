package com.ltq.item.service.impl;

import com.ltq.item.entity.TbCategoryBrand;
import com.ltq.item.mapper.TbCategoryBrandMapper;
import com.ltq.item.service.TbCategoryBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品分类和品牌的中间表，两者是多对多关系 服务实现类
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
@Service
public class TbCategoryBrandServiceImpl extends ServiceImpl<TbCategoryBrandMapper, TbCategoryBrand> implements TbCategoryBrandService {

}
