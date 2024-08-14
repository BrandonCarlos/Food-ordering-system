package src.main.java.com.food.ordering.system.order.service.domain.entity;

import src.main.java.com.food.ordering.system.domain.entity.AggregateRoot;
import src.main.java.com.food.ordering.system.domain.valueobject.*;
import src.main.java.com.food.ordering.system.order.service.domain.exception.OrderDomainException;
import src.main.java.com.food.ordering.system.order.service.domain.valueobject.OrderItemId;
import src.main.java.com.food.ordering.system.order.service.domain.valueobject.StreetAddress;
import src.main.java.com.food.ordering.system.order.service.domain.valueobject.TrackingId;

import java.util.List;
import java.util.UUID;

public class Order extends AggregateRoot<OrderId> {//First Entity object, AggregateRoot came from Common module
    //Note: I won't go declared setters over here because this is immutable class

    private final CustomerId customerId; //this field came from Common module
    private final RestaurantId restaurantId;
    private final StreetAddress deliveryAddress;
    private final Money money;//this field came from Common module
    private final List<OrderItem> items;

    private TrackingId trackingId;//This 3 fields over here is not final because I will go set them during business logic after created "Order entity"
    private OrderStatus orderStatus;
    private List<String> failureMessages;

    public void initializeOrder() {
        setId(new OrderId(UUID.randomUUID()));//setId is from BaseEntity and I can access this in this manner because this method is public
        trackingId = new TrackingId(UUID.randomUUID());
        orderStatus = OrderStatus.PENDING;
        initializeOrderItems();
    }

    public void validateOrder() {
        validateInitialOrder();
        validateTotalPrice();
        validateItemsPrice();
    }

    private void validateInitialOrder() {
        if(orderStatus != null || getId() != null) {
            throw new OrderDomainException("Order is not in correct state for initialization!");
        }
    }

    private void validateTotalPrice() {
    }

    private void validateItemsPrice() {
    }

    private void initializeOrderItems() {//remember void over here that is because we'll won't return any value from this method
        long itemId = 1;
        for(OrderItem orderItem: items) {//OrderItem because we'll go to loop items(list) and each of items(list) is OrderItem type
            orderItem.initializeOrderItem(super.getId(), new OrderItemId(itemId++));
        }
    }

    private Order(Builder builder) {
        super.setId(builder.orderId);
        customerId = builder.customerId;
        restaurantId = builder.restaurantId;
        deliveryAddress = builder.deliveryAddress;
        money = builder.money;
        items = builder.items;
        trackingId = builder.trackingId;
        orderStatus = builder.orderStatus;
        failureMessages = builder.failureMessages;
    }


    public CustomerId getCustomerId() {
        return customerId;
    }

    public RestaurantId getRestaurantId() {
        return restaurantId;
    }

    public StreetAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public Money getMoney() {
        return money;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public TrackingId getTrackingId() {
        return trackingId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public List<String> getFailureMessages() {
        return failureMessages;
    }

    public static final class Builder {
        private OrderId orderId;
        private CustomerId customerId;
        private RestaurantId restaurantId;
        private StreetAddress deliveryAddress;
        private Money money;
        private List<OrderItem> items;
        private TrackingId trackingId;
        private OrderStatus orderStatus;
        private List<String> failureMessages;


        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder orderId(OrderId val) {
            orderId = val;
            return this;
        }

        public Builder customerId(CustomerId val) {
            customerId = val;
            return this;
        }

        public Builder restaurantId(RestaurantId val) {
            restaurantId = val;
            return this;
        }

        public Builder deliveryAddress(StreetAddress val) {
            deliveryAddress = val;
            return this;
        }

        public Builder money(Money val) {
            money = val;
            return this;
        }

        public Builder items(List<OrderItem> val) {
            items = val;
            return this;
        }

        public Builder trackingId(TrackingId val) {
            trackingId = val;
            return this;
        }

        public Builder orderStatus(OrderStatus val) {
            orderStatus = val;
            return this;
        }

        public Builder failureMessages(List<String> val) {
            failureMessages = val;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
