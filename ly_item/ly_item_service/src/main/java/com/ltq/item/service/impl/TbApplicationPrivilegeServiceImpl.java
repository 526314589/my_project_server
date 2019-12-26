package com.ltq.item.service.impl;

import com.ltq.item.entity.TbApplicationPrivilege;
import com.ltq.item.mapper.TbApplicationPrivilegeMapper;
import com.ltq.item.service.TbApplicationPrivilegeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务中间表，记录服务id以及服务能访问的目标服务的id 服务实现类
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
@Service
public class TbApplicationPrivilegeServiceImpl extends ServiceImpl<TbApplicationPrivilegeMapper, TbApplicationPrivilege> implements TbApplicationPrivilegeService {

}
