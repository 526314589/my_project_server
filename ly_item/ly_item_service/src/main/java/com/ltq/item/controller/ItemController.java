package com.ltq.item.controller;

import com.ltq.common.enums.ExceptionEnum;
import com.ltq.common.exception.LyException;
import com.ltq.item.entity.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: liutieqiang
 * @Date: 2019-12-23 10:16
 * @Description:    商品controller
 */
@RestController
public class ItemController {

    /**
     *@description  保存商品功能
     *@params   [item, response]
     *@return   org.springframework.http.ResponseEntity<com.ltq.item.entity.Item>
     *@author  liutieqiang
     *@date  2019-12-26 09:26
     */
    @PostMapping("/saveItem")
    public ResponseEntity<Item> saveItem(Item item, HttpServletResponse response) {

        if (item.getName() == null||item.getPrice() == null) {
            /** // 状态码无法改变 不是服务端的问题 返回的状态码还是500
            response.setStatus(400);
            throw new RuntimeException("商品名称为空");
             */
            /** //使用org.springframework.http的ResponseEntity类返回,虽然可以设置状态码,但是状态码没有显示,而且返回体无法合理设置
             * body里为null 返回值不显示任何内容, body里为空参的实例化对象,返回的各个属性值皆为null
             return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Item());
             */
            /** //使用自定义异常 状态码依然还是500
             throw new LyException(ExceptionEnum.BAN_PARAM);
             */
            //ResponseEntity结合自定义异常 返回
            throw  new LyException(ExceptionEnum.BAN_PARAM);
        }
        return ResponseEntity.ok(item);
    }
}
