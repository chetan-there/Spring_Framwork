package com.ct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
public class SpringBootDatajpaDemoApplication {

    public static void main(String[] args) {
        // Application starts here
        // Spring Boot auto-configures DataSource, JPA, and scans components
        SpringApplication.run(SpringBootDatajpaDemoApplication.class, args);

        // After the app starts, CommandLineRunner (TestRunner) runs automatically
    }
}
