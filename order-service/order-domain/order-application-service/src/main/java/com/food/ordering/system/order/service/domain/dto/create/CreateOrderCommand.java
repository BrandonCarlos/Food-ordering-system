package com.food.ordering.system.order.service.domain.dto.create;

import com.food.ordering.system.order.service.domain.entity.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;


//This file will be like our "controller" but that is no controller
@Getter
@Builder //Will create fluently object that is why I need to use Builder over here
@AllArgsConstructor
public class CreateOrderCommand {

    @NotNull
    private final UUID customerId;

    @NotNull
    private final UUID restaurantId;

    @NotNull
    private final BigDecimal price;

    @NotNull
    private final List<OrderItem> items;

    @NotNull
    private final OrderAddress address;
}
