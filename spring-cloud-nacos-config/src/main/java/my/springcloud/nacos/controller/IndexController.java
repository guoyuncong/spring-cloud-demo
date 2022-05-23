package my.springcloud.nacos.controller;

import my.springcloud.nacos.config.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: gyc
 * @date: 2022/05/23 18:15
 * @description:
 */
@RestController
public class IndexController {

    @Autowired
    private Person person;

    @GetMapping("/")
    public String index() {
        System.out.println(person.toString());
        return person.toString();
    }
}
