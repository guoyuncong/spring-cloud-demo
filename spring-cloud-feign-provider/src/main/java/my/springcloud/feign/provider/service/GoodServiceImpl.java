package my.springcloud.feign.provider.service;

import my.springcloud.feign.model.Good;
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
    public List<Good> goods() {
        Good good = new Good();
        good.setId(1);
        good.setName("gyc");
        return Arrays.asList(good);
    }
}
