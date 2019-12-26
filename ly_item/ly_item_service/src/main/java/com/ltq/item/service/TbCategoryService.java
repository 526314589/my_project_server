package com.ltq.item.service;

import com.ltq.item.entity.TbCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ltq.item.pojo.TbCategoryDTO;

import java.util.List;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 服务类
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
public interface TbCategoryService extends IService<TbCategory> {
    /**
     * 传递商品分类的父id,获取属于这个父id的所有分类信息
     *@param   pid
     *@return   void
     *@author  liutieqiang
     *@date  2019-12-26 09:56
     */
    List<TbCategoryDTO> findCategoryByParentId(Long pid);

}
