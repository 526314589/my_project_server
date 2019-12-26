package com.ltq.item.service.impl;

import com.ltq.item.entity.TbSpecGroup;
import com.ltq.item.mapper.TbSpecGroupMapper;
import com.ltq.item.service.TbSpecGroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 规格参数的分组表，每个商品分类下有多个规格参数组 服务实现类
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
@Service
public class TbSpecGroupServiceImpl extends ServiceImpl<TbSpecGroupMapper, TbSpecGroup> implements TbSpecGroupService {

}
