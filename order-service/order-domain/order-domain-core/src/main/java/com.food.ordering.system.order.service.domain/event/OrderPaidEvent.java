package src.main.java.com.food.ordering.system.order.service.domain.event;

import src.main.java.com.food.ordering.system.domain.event.DomainEvent;
import src.main.java.com.food.ordering.system.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderPaidEvent extends OrderEvent {

    public OrderPaidEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }

}
