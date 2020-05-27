package com.junggo.kafkabatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class KafkaBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaBatchApplication.class, args);
    }

}
