package com.food.ordering.system.order.service.domain.ports.input.service;

import com.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.create.CreateOrderResponse;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderQuery;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderResponse;

import javax.validation.Valid;

//How go to use this class? Client
public interface OrderApplicationService {// We will go declare same methods over here because Domain layer(order-application) that will go to implement these methods over here

    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);//Valid annotation that is for enabled the annotation there are in the CreateOrderCommand

    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);

}
