package my.springcloud.feign.client;

import my.springcloud.feign.model.Good;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author: gyc
 * @date: 2022/06/27 16:27
 * @description:
 */
@FeignClient(name = "feign-provider")
public interface GoodClient {

    @GetMapping("/api/goods/list")
    List<Good> goods();
}
