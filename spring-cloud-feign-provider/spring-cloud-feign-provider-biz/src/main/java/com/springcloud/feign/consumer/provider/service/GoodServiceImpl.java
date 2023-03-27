package com.springcloud.feign.consumer.provider.service;

import com.springcloud.feign.consumer.provider.base.dto.GoodDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author: gyc
 * @date: 2022/06/27 16:46
 * @description:
 */
@Service
public class GoodServiceImpl implements GoodService {

    @Override
    public List<GoodDTO> goods() {
        GoodDTO good = new GoodDTO();
        good.setId(1);
        good.setName("gyc");
        return Arrays.asList(good);
    }
}
