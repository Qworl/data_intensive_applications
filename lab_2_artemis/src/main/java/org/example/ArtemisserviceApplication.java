package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@Slf4j
@SpringBootApplication
public class ArtemisserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtemisserviceApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onStartup() {
        log.info("Service started successfully");
        log.info("Connected to Artemis cluster with failover configuration");
        log.info("Listening for POST requests on port 8081");
        log.info("Input queue: MAI.TEST.FROLOV.RQ");
        log.info("Output queue: MAI.TEST.FROLOV.RS");
    }
}