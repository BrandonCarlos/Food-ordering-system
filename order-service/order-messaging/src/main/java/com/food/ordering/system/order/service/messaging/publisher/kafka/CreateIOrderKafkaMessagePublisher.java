package com.food.ordering.system.order.service.messaging.publisher.kafka;

import com.food.ordering.system.order.service.domain.event.OrderCreatedEvent;
import com.food.ordering.system.order.service.domain.ports.output.message.publisher.payment.OrderCreatedPaymentRequestMessagePublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CreateIOrderKafkaMessagePublisher implements OrderCreatedPaymentRequestMessagePublisher {//OrderCreatedPaymentRequestMessagePublisher it's output port
    @Override
    public void publish(OrderCreatedEvent domainEvent) {

    }
}
