package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class OrderId extends BaseId<UUID> { /* UUID as generic type */

    public OrderId(UUID value) {//I need to do that public field because I need use this super constructor in the "Order class"
        super(value);
    }

}
