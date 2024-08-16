package com.food.ordering.system.domain.valueobject;

import java.util.Objects;

public abstract class BaseId<T> {
    private final T value; /* This is private field then I need to put this in the constructor */

    protected BaseId(T value) { //only subclasses can use this constructor in here
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    /* Create Equals and Hashcode methods is best practice */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseId<?> baseId = (BaseId<?>) o;
        return value.equals(baseId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
