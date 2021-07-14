package ru.tinkoff.sirius.entity;

import java.util.Objects;
import java.util.UUID;

public class Delivery {

    public UUID uuid;
    public Order order;
    public String address;
    public Double deliveryPrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return Objects.equals(order, delivery.order) && Objects.equals(address, delivery.address) && Objects.equals(deliveryPrice, delivery.deliveryPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, address, deliveryPrice);
    }
}
