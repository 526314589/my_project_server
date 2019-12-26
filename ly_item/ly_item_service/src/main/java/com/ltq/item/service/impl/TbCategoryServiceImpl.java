package com.ltq.item.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ltq.common.enums.ExceptionEnum;
import com.ltq.common.exception.LyException;
import com.ltq.common.utils.BeanHelper;
import com.ltq.item.entity.TbCategory;
import com.ltq.item.mapper.TbCategoryMapper;
import com.ltq.item.pojo.TbCategoryDTO;
import com.ltq.item.service.TbCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 服务实现类
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
@Service
public class TbCategoryServiceImpl extends ServiceImpl<TbCategoryMapper, TbCategory> implements TbCategoryService {
    /**
     *@description 传递商品分类的父id,获取属于这个父id的所有分类信息
     *@params   [pid]
     *@return   void
     *@author  liutieqiang
     *@date  2019-12-26 09:56
     */
    @Override
    public List<TbCategoryDTO> findCategoryByParentId(Long pid) {
        QueryWrapper<TbCategory> queryWrapper = new QueryWrapper<>();
//        必须知道数据库表的字段
//        queryWrapper.eq("parentId",pid);
        queryWrapper.lambda().eq(TbCategory::getParentId,pid);
        List<TbCategory> tbCategoryList = list(queryWrapper);
        if (CollectionUtils.isEmpty(tbCategoryList)){
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        List<TbCategoryDTO> tbCategoryDTOS = BeanHelper.copyWithCollection(tbCategoryList,TbCategoryDTO.class);

        return tbCategoryDTOS;
    }
}
