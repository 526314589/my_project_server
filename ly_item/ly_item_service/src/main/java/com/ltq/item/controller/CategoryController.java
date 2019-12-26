package com.ltq.item.controller;

import com.ltq.common.enums.ExceptionEnum;
import com.ltq.common.exception.LyException;
import com.ltq.item.pojo.TbCategoryDTO;
import com.ltq.item.service.TbCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liutieqiang
 * @Date: 2019-12-26 09:44
 * @Description: 商品分类相关controller
 */
@RestController
@RequestMapping("/category/of")
public class CategoryController {

    @Autowired
    private TbCategoryService tbCategoryService;
    /**
     *@description 传递商品分类的父id,获取属于这个父id的所有分类信息
     *@params   [pid]
     *@return   void
     *@author  liutieqiang
     *@date  2019-12-26 09:56
     */
    @GetMapping("/parent")
    public ResponseEntity<List<TbCategoryDTO>> findCategoryByParentId(@RequestParam(name = "pid")Long pid){
        if (pid == null){
            throw new LyException(ExceptionEnum.INVALID_PARAM_ERROR);
        }
        List<TbCategoryDTO> tbCategoryDTOS = tbCategoryService.findCategoryByParentId(pid);
        if (!CollectionUtils.isEmpty(tbCategoryDTOS)){
            return ResponseEntity.ok(tbCategoryDTOS);
        }
        return ResponseEntity.ok(new ArrayList<>());
    }
}
