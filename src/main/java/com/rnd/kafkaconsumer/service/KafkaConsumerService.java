package com.rnd.kafkaconsumer.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @Value("${spring.kafka.consumer.topic}")
    private String topic;
    @Value("${spring.kafka.consumer.group-id}")
    private String groupId;

    @KafkaListener(topics = "dev-topic", groupId = "groupDevId")
    public void kafkaListener(String data) {
        System.out.println("Data yang diterima : " + data);
    }
}
