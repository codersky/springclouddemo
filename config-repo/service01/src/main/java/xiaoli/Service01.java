package xiaoli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Service01 {
    public static void main(String[] args) {
        SpringApplication.run(Service01.class, args);
    }
}
