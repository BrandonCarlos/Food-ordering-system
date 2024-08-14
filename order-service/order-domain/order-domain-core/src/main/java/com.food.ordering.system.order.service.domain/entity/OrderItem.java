package src.main.java.com.food.ordering.system.order.service.domain.entity;

import src.main.java.com.food.ordering.system.domain.entity.BaseEntity;
import src.main.java.com.food.ordering.system.domain.valueobject.Money;
import src.main.java.com.food.ordering.system.domain.valueobject.OrderId;
import src.main.java.com.food.ordering.system.order.service.domain.valueobject.OrderItemId;

//Here is my Domain business then I don't need to put any dependency over here
public class OrderItem extends BaseEntity<OrderItemId> {
    private OrderId orderId;//this field is not final because this field will be increment layer during business logic
    private final Product product;
    private final int quantity;
    private final Money price;
    private final Money subTotal;

    private OrderItem(Builder builder) {//Look in here We'll don't use "public contructor" anymore because the constrcutor over here don't need to be visualized outside
        super.setId(builder.orderItemId);
        product = builder.product;
        quantity = builder.quantity;
        price = builder.price;
        subTotal = builder.subTotal;
    }


    public static final class Builder {
        private OrderItemId orderItemId;
        private Product product;
        private int quantity;
        private Money price;
        private Money subTotal;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder orderItemId(OrderItemId val) {
            orderItemId = val;
            return this;
        }

        public Builder product(Product val) {
            product = val;
            return this;
        }

        public Builder quantity(int val) {
            quantity = val;
            return this;
        }

        public Builder price(Money val) {
            price = val;
            return this;
        }

        public Builder subTotal(Money val) {
            subTotal = val;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }
    }

    //The getters below will be needed by mappers
    public OrderId getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getPrice() {
        return price;
    }

    public Money getSubTotal() {
        return subTotal;
    }
}
