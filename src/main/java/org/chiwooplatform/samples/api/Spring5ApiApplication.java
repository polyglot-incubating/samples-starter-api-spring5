package org.chiwooplatform.samples.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5ApiApplication.class, args);
        // System.out.println(System.getenv().get("JAVA_HOME")); 
    }

}
