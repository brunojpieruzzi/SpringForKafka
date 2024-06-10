package com.kafka.consumer.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;


@Configuration
public class KafkaConsumerListener {
    private Logger LOOGGER = LoggerFactory.getLogger(KafkaConsumerListener.class);

    @KafkaListener(topics = {"kafkaProviderTopic"}, groupId = "myGroupId")
    public void listener(String message){
        LOOGGER.info("el mensaje es "+message);
    }
}
