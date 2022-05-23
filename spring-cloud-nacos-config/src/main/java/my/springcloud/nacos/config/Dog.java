package my.springcloud.nacos.config;

import lombok.Data;

/**
 * @author: gyc
 * @date: 2022/05/23 17:37 
 * @description: 
 */
@Data
public class Dog {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
