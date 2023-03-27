package com.springcloud.feign.consumer.provider.base.dto;

import lombok.Data;

/**
 * @author: gyc
 * @date: 2023/03/27 17:16
 * @description:
 */
@Data
public class GoodDTO {

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 名称
     */
    private  String name;
}
