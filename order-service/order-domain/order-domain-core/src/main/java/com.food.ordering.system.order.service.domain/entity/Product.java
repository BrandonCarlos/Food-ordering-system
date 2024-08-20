package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.BaseEntity;
import com.food.ordering.system.domain.valueobject.Money;
import com.food.ordering.system.domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money price;//Money class is from common-module

    public Product(ProductId productId, String name, Money price) {
        super.setId(productId);//invoking super word for call productId attribute in here
        this.name = name;
        this.price = price;
    }

    public Product(ProductId productId) {
        super.setId(productId);//invoking super word for call productId attribute in here
    }

    public void updateWithConfirmedNameAndPrice(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }

    //In here I don't need to override hashcode and equals methods because this was declared in the base class(BaseEntity)

}
