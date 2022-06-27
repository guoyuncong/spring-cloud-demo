package my.springcloud.feign.service;

import my.springcloud.feign.client.GoodClient;
import my.springcloud.feign.model.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: gyc
 * @date: 2022/06/27 16:53
 * @description:
 */
@Service
public class EatServiceImpl implements EatService{

    @Autowired
    private GoodClient goodClient;

    @Override
    public List<Good> eat() {
        List<Good> goods = goodClient.goods();
        System.out.println(goods);
        return goods;
    }
}
