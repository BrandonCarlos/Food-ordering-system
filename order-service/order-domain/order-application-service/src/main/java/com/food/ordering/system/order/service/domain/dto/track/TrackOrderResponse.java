package com.food.ordering.system.order.service.domain.dto.track;

import com.food.ordering.system.domain.valueobject.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TrackOrderResponse {
    @NotNull
    private final UUID OrderTrackingId;

    @NotNull
    private final OrderStatus orderStatus;

    //In failureMessages I won't use notNull annotation because this can be null or not
    private final List<String> failureMessages;//this field will be to send failureMessage to the clients
}
