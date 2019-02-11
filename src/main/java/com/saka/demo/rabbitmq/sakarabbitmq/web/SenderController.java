package com.saka.demo.rabbitmq.sakarabbitmq.web;

import com.saka.demo.rabbitmq.sakarabbitmq.sender.OrderQueueProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {

    @Autowired
    OrderQueueProducer orderQueueProducer;

    @GetMapping("/greeting/{message}")
    public String greeting(@PathVariable("message") String message) {
        orderQueueProducer.send(message);
        return "";
    }
}