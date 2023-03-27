package com.springcloud.feign.consumer.service;

import com.springcloud.feign.consumer.base.dto.Good;

import java.util.List;

/**
 * @author: gyc
 * @date: 2022/06/27 16:53
 * @description:
 */
public interface EatService {

    List<Good> eat();
}
