package com.artemnizhnyk.rabbitmqreceiverpractice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class RabbitConsumer {

    @RabbitListener(queues = {"FirstQueue"})
    void receive(final String message) {
        log.info(message + " - received from queue");
    }
}
