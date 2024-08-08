package src.main.java.com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class OrderId extends BaseId<UUID> { /* UUID as generic type */

    protected OrderId(UUID value) {
        super(value);
    }

}
