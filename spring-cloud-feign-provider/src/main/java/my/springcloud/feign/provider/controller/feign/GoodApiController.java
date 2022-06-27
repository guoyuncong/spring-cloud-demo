package my.springcloud.feign.provider.controller.feign;

import my.springcloud.feign.model.Good;
import my.springcloud.feign.provider.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: gyc
 * @date: 2022/06/27 16:43
 * @description:
 */
@RestController
@RequestMapping("/api/goods")
public class GoodApiController {

    @Autowired
    private GoodService goodService;

    @GetMapping("/list")
    public List<Good> goods() {
        return goodService.goods();
    }
}
