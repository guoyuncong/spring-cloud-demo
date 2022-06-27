package my.springcloud.feign.provider.service;

import my.springcloud.feign.model.Good;

import java.util.List;

/**
 * @author: gyc
 * @date: 2022/06/27 16:46
 * @description:
 */
public interface GoodService {

    /**
     *
     * @return
     */
    List<Good> goods();
}
