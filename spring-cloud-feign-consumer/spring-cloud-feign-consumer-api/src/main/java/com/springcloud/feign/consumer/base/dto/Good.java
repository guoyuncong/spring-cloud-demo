package com.springcloud.feign.consumer.base.dto;

import lombok.Data;

/**
 * @author: gyc
 * @date: 2022/06/27 16:26
 * @description: 商品
 */
@Data
public class Good {

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;
}
