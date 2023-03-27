package com.springcloud.feign.consumer.provider.base.api;

import com.springcloud.feign.consumer.provider.base.dto.GoodDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: gyc
 * @date: 2023/03/27 17:15
 * @description:
 */
@FeignClient("feign-provider")
public interface GoodsApiClient {

    @RequestMapping("/api/goods/list")
    List<GoodDTO> goods();
}
