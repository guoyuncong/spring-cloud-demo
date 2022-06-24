package my.springcloud.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: gyc
 * @date: 2022/05/23 18:15
 * @description:
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class IndexController {

    @Value("${heng}")
    private String heng;

    @RequestMapping("/get")
    public String get() {
        return heng;
    }


}
