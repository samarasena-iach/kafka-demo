package com.samiach.kafkademo.controller;

import com.samiach.kafkademo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafkaMessages {
    @Autowired
    ProducerService producerService;

    @GetMapping("/producerMsg")
    public void getMessageFromClient(@RequestParam("message") String message) {
        producerService.sendMsgToTheTopic(message);
    }

}
