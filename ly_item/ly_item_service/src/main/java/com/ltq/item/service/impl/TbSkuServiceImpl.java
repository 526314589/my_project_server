package com.ltq.item.service.impl;

import com.ltq.item.entity.TbSku;
import com.ltq.item.mapper.TbSkuMapper;
import com.ltq.item.service.TbSkuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * sku表,该表表示具体的商品实体,如黑色的 64g的iphone 8 服务实现类
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
@Service
public class TbSkuServiceImpl extends ServiceImpl<TbSkuMapper, TbSku> implements TbSkuService {

}
