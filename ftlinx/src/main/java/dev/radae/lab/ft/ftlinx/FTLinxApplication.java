package dev.radae.lab.ft.ftlinx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FTLinxApplication {

    public static void main(String[] args) {
        SpringApplication.run(FTLinxApplication.class, args);
    }

}
