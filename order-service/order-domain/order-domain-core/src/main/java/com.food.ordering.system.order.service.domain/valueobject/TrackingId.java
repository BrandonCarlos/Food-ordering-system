package src.main.java.com.food.ordering.system.order.service.domain.valueobject;

import src.main.java.com.food.ordering.system.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {

    protected TrackingId(UUID value) {
        super(value);
    }
}