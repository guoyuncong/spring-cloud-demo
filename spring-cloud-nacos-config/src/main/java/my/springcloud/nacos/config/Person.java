package my.springcloud.nacos.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: gyc
 * @date: 2022/05/23 17:31
 * @description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;
    private Map<String, Object> maps;
    private Map<String, Dog> dogMaps;
    // private Object[] lists;
    private List<Object> lists;
    // private Dog[] dogs;
    private List<Dog> dogs;
    private Dog dog;
}
