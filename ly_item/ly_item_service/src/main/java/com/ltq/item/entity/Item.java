package com.ltq.item.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liutieqiang
 * @Date: 2019-12-23 10:18
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Long id;
    private String name;
    private Long price;
}
