package com.ltq.item.service.impl;

import com.ltq.item.entity.TbSpu;
import com.ltq.item.mapper.TbSpuMapper;
import com.ltq.item.service.TbSpuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * spu表，该表描述的是一个抽象性的商品，比如 iphone8 服务实现类
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
@Service
public class TbSpuServiceImpl extends ServiceImpl<TbSpuMapper, TbSpu> implements TbSpuService {

}
