package com.springcloud.feign.consumer.controller;

import com.springcloud.feign.consumer.base.dto.Good;
import com.springcloud.feign.consumer.service.EatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: gyc
 * @date: 2022/06/27 16:52
 * @description:
 */
@RestController
@RequestMapping("eat")
public class EatController {

    @Autowired
    private EatService eatService;

    @GetMapping("/list")
    public List<Good> eat() {
        return eatService.eat();
    }
}
