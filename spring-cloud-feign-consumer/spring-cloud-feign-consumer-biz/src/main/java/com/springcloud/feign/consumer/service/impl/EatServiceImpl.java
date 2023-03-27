package com.springcloud.feign.consumer.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.springcloud.feign.consumer.provider.base.api.GoodsApiClient;
import com.springcloud.feign.consumer.provider.base.dto.GoodDTO;
import com.springcloud.feign.consumer.service.EatService;
import com.springcloud.feign.consumer.base.dto.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: gyc
 * @date: 2022/06/27 16:53
 * @description:
 */
@Service
public class EatServiceImpl implements EatService {

    @Autowired
    private GoodsApiClient goodClient;

    @Override
    public List<Good> eat() {
        List<GoodDTO> goods = goodClient.goods();
        System.out.println(goods);
        return BeanUtil.copyToList(goods, Good.class);
    }
}
