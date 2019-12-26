package com.ltq.item.controller;

import com.ltq.common.vo.PageResult;
import com.ltq.item.pojo.TbBrandDTO;
import com.ltq.item.service.TbBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liutieqiang
 * @Date: 2019-12-26 14:33
 * @Description: 商品品牌controller
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private TbBrandService tbBrandService;
    /**
     *@description 分页查询品牌
     *@params  [key, page, rows, sortBy, desc]
     *@return   org.springframework.http.ResponseEntity
     *@author  liutieqiang
     *@date  2019-12-26 14:54
     */
    @GetMapping("/page")
    public ResponseEntity<PageResult<TbBrandDTO>> findBrandByPage(@RequestParam(value = "key",required = false) String key,
                                                                  @RequestParam(value = "page",defaultValue = "1") Integer page,
                                                                  @RequestParam(value = "rows",defaultValue = "10") Integer rows,
                                                                  @RequestParam(value = "sortBy",required = false) String sortBy,
                                                                  @RequestParam(value = "desc",defaultValue = "false") Boolean desc) {


        return ResponseEntity.ok(tbBrandService.findBrandByPage(key,page,rows,sortBy,desc));
    }
}
