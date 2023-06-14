package com.samiach.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    // @KakfaListen is going to make this class/method capable enough to be a Kafka Listener

    @KafkaListener(topics = "demo_topic_1", groupId = "demo_group_1")
    public void listednToTopic(String receivedMessage) {
        System.out.println("The message received is : " + receivedMessage);
    }

}
