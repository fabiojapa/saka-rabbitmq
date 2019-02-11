package com.saka.demo.rabbitmq.sakarabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    @RabbitListener(queues = {"${queue.order.name}"})
    public void receive(@Payload String fileBody) {
        System.out.println("fileBody = " + fileBody);
    }
}
