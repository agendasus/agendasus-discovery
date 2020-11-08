package br.com.agendasus.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AgendaSUSApp {

    public static void main(String[] args) {
        SpringApplication.run(AgendaSUSApp.class, args);
    }

}
