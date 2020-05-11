package com.ma.raymond.settlementNetwork.configurations;

import com.ma.raymond.settlementNetwork.constants.PaymentMQ;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = PaymentMQ.QUEUE_PAYMENT_NETWORK_REQ_H)
public class RabbitReceiverConfigs {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }
}
