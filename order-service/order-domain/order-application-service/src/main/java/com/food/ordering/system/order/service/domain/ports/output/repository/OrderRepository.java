package com.food.ordering.system.order.service.domain.ports.output.repository;

import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {
    Order save(Order order); // I've been passed Order domain entity over here, this mean that I can use this in here

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
