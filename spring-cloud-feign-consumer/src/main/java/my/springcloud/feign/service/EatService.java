package my.springcloud.feign.service;

import my.springcloud.feign.model.Good;

import java.util.List;

/**
 * @author: gyc
 * @date: 2022/06/27 16:53
 * @description:
 */
public interface EatService {

    List<Good> eat();
}
