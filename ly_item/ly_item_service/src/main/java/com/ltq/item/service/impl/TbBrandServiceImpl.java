package com.ltq.item.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ltq.common.enums.ExceptionEnum;
import com.ltq.common.exception.LyException;
import com.ltq.common.utils.BeanHelper;
import com.ltq.common.vo.PageResult;
import com.ltq.item.entity.TbBrand;
import com.ltq.item.mapper.TbBrandMapper;
import com.ltq.item.pojo.TbBrandDTO;
import com.ltq.item.service.TbBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 服务实现类
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
@Service
public class TbBrandServiceImpl extends ServiceImpl<TbBrandMapper, TbBrand> implements TbBrandService {

    @Override
    public PageResult<TbBrandDTO> findBrandByPage(String key, Integer page, Integer rows, String sortBy, Boolean desc) {
        //分页查询条件
        QueryWrapper<TbBrand> queryWrapper = new QueryWrapper<>();
        //搜索条件不为空 可搜索品牌名称和品牌首字母
        if (StringUtils.isNotBlank(key)){
            queryWrapper.lambda().like(TbBrand::getName,key).or().like(TbBrand::getLetter,key);
        }
        //排序
        if (StringUtils.isNotBlank(sortBy)) {
            if (desc){
                queryWrapper.orderByDesc(sortBy);
            }else {
                queryWrapper.orderByAsc(sortBy);
            }
        }
        //分页参数
        Page<TbBrand> tbBrandPage = new Page<>(page, rows);
        //分页结果
        IPage<TbBrand> tbBrandIPage = page(tbBrandPage, queryWrapper);
        if (tbBrandIPage==null|| CollectionUtils.isEmpty(tbBrandIPage.getRecords())){
            throw new LyException(ExceptionEnum.BRAND_NOT_FOUND);
        }
        //封装返回结果
        //总条数
        long total = tbBrandIPage.getTotal();
        //总页数
        Integer  totalPage= Integer.valueOf(String.valueOf(tbBrandIPage.getPages()));
        //查询结果
        List<TbBrandDTO> tbBrandDTOList = BeanHelper.copyWithCollection(tbBrandIPage.getRecords(), TbBrandDTO.class);
        PageResult<TbBrandDTO> pageResult = new PageResult<>(total, totalPage, tbBrandDTOList);
        return pageResult;
    }
}
