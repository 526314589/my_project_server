package com.ltq.item.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系
 * </p>
 *
 * @author LTQ
 * @since 2019-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TbBrandDTO {

private static final long serialVersionUID=1L;

    /**
     * 品牌id
     */
    private Long id;

    /**
     * 品牌名称
     */
    private String name;

    /**
     * 品牌图片地址
     */
    private String image;

    /**
     * 品牌的首字母
     */
    private String letter;

    private Date createTime;

    private Date updateTime;




}
