package src.main.java.com.food.ordering.system.order.service.domain.event;

import src.main.java.com.food.ordering.system.domain.event.DomainEvent;
import src.main.java.com.food.ordering.system.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public abstract class OrderEvent implements DomainEvent<Order> {//I made this abstract class because I don't wanna that class will be created
    private final Order order;
    private final ZonedDateTime createdAt;

    public OrderEvent(Order order, ZonedDateTime createdAt) {
        this.order = order;
        this.createdAt = createdAt;
    }

    //In here we have just 2 fields then I won't create objects with "builder" only with constructor now
    public Order getOrder() {
        return order;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }
}
