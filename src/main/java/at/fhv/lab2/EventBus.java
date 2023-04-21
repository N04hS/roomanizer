package at.fhv.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("at.fhv.lab2.eventbus")
public class EventBus {

    // für openapi docs:
    // localhost:8080/v3/api-docs/

    // für swagger ui:
    // localhost:8080/swagger-ui/index.html

    // alternative zum testen der apis: postman

    public static void main(String[] args) {
        SpringApplication.run(EventBus.class, args);
    }


}
