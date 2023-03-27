package com.springcloud.feign.consumer.provider.service;

import com.springcloud.feign.consumer.provider.base.dto.GoodDTO;

import java.util.List;

/**
 * @author: gyc
 * @date: 2022/06/27 16:46
 * @description:
 */
public interface GoodService {

    List<GoodDTO> goods();
}
