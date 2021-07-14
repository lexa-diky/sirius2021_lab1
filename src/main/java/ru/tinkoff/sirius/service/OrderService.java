package ru.tinkoff.sirius.service;

import ru.tinkoff.sirius.entity.Order;
import ru.tinkoff.sirius.entity.Product;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class OrderService {

    public static List<Order> staticOrders = new CopyOnWriteArrayList<>(
            Arrays.asList(
                    new Order() {{
                        id = UUID.randomUUID();
                        totalPrice = 300D;
                        products = Arrays.asList(
                                new Product(UUID.randomUUID(), "headphones", 100D),
                                new Product(UUID.randomUUID(), "microphone", 200D)
                        );
                    }},
                    new Order() {{
                        id = UUID.randomUUID();
                        totalPrice = 400D;
                        products = Arrays.asList(
                                new Product(UUID.randomUUID(), "headphones", 200D),
                                new Product(UUID.randomUUID(), "microphone", 200D)
                        );
                    }},
                    new Order() {{
                        id = UUID.randomUUID();
                        totalPrice = 600D;
                        products = Arrays.asList(
                                new Product(UUID.randomUUID(), "camera", 500D),
                                new Product(UUID.randomUUID(), "light", 100D)
                        );
                    }},
                    new Order() {{
                        id = UUID.randomUUID();
                        totalPrice = 1000D;
                        products = Arrays.asList(
                                new Product(UUID.randomUUID(), "pizza", 100D),
                                new Product(UUID.randomUUID(), "pizza", 100D),
                                new Product(UUID.randomUUID(), "pizza", 100D),
                                new Product(UUID.randomUUID(), "pizza", 100D),
                                new Product(UUID.randomUUID(), "pizza", 100D),
                                new Product(UUID.randomUUID(), "pizza", 100D),
                                new Product(UUID.randomUUID(), "pizza", 100D),
                                new Product(UUID.randomUUID(), "pizza", 100D),
                                new Product(UUID.randomUUID(), "pizza", 100D),
                                new Product(UUID.randomUUID(), "pizza", 100D)
                        );
                    }}
            )
    );

    public void getOrders(List<Order> orders) {
        orders.addAll(staticOrders);
    }
}
