package com.ltq.item.service.impl;

import com.ltq.item.entity.TbApplication;
import com.ltq.item.mapper.TbApplicationMapper;
import com.ltq.item.service.TbApplicationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务信息表，记录微服务的id，名称，密文，用来做服务认证 服务实现类
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
@Service
public class TbApplicationServiceImpl extends ServiceImpl<TbApplicationMapper, TbApplication> implements TbApplicationService {

}
