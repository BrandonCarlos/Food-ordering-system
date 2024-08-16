package com.food.ordering.system.domain.entity;

import java.util.Objects;

public abstract class BaseEntity<ID> { /* <Id> <- generic Id variable, and below I need to create private ID field for this generic type */
    /* For each entity I will go to replace ID field for the identity of the entity */

    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }


    // The methods below is very important because each entity need to have a unique ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity<?> that = (BaseEntity<?>) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
