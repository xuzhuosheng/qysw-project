package com.qysw.qysweureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QyswEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(QyswEurekaApplication.class, args);
    }

}
