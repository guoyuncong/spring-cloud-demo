package my.springcloud.feign.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: gyc
 * @date: 2022/06/27 15:40
 * @description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class FeignProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignProviderApplication.class, args);
    }
}
