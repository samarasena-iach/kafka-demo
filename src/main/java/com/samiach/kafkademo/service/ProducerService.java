package com.samiach.kafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    // To send something to Kafka, we need a KafkaTemplate
    // In the KafkaTemplate<Param1, Param2> - Param1 is the name of the topic, Param2 is the message.

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public void sendMsgToTheTopic(String message) {
        kafkaTemplate.send("demo_topic_1", message);
    }

}
