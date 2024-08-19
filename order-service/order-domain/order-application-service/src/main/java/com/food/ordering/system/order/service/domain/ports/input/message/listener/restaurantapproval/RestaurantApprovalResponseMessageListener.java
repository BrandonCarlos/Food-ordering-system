package com.food.ordering.system.order.service.domain.ports.input.message.listener.restaurantapproval;

import com.food.ordering.system.order.service.domain.dto.message.RestaurantApprovalResponse;

public interface RestaurantApprovalResponseMessageListener {

    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);//RestaurantApprovalResponse is DTO for a customized response

    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);

}
