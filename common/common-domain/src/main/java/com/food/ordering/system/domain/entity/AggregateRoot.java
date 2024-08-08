package src.main.java.com.food.ordering.system.domain.entity;

public abstract class AggregateRoot<ID> extends BaseEntity<ID> { /* I'm extending BaseEntity that is because I will go getters, setters, equal and hashcode from there */
}
