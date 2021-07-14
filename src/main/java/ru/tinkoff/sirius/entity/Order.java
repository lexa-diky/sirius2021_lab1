package ru.tinkoff.sirius.entity;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Order {

    protected UUID id;
    protected Double totalPrice;
    protected List<Product> products;

    public UUID getId() {
        return id;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(totalPrice, order.totalPrice) && Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, totalPrice, products);
    }
}
