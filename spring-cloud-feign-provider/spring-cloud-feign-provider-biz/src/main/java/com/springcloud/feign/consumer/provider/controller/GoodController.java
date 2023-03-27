package com.springcloud.feign.consumer.provider.controller;

import com.springcloud.feign.consumer.provider.service.GoodService;
import my.springcloud.common.model.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: gyc
 * @date: 2022/06/27 16:52
 * @description:
 */
@RestController
@RequestMapping("goods")
public class GoodController {

    @Autowired
    private GoodService goodService;

    @GetMapping("/list")
    public ResultDTO goods() {
        return ResultDTO.ofSuccess(goodService.goods());
    }
}
