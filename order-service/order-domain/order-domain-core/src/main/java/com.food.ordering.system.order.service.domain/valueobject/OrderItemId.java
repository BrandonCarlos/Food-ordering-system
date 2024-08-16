package com.food.ordering.system.order.service.domain.valueobject;

import com.food.ordering.system.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {//Long will be started from 1
    public OrderItemId(Long value) {
        super(value);
    }
}
