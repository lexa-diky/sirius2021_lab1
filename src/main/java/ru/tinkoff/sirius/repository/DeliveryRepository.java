package ru.tinkoff.sirius.repository;

import ru.tinkoff.sirius.entity.Delivery;
import ru.tinkoff.sirius.entity.Order;
import ru.tinkoff.sirius.entity.Product;
import ru.tinkoff.sirius.service.OrderService;
import ru.tinkoff.sirius.util.ProductUtilsKt;

import java.util.*;

public class DeliveryRepository {

    OrderService orderService = new OrderService();

    public List<Delivery> getDeliveries() {
        List<Order> orders = new ArrayList<>();
        List<Delivery> deliveries = new ArrayList<>();

        orderService.getOrders(orders);
        for (Order order : orders) {
            deliveries.add(orderToDelivery(order));
        }

        return deliveries;
    }

    private Delivery orderToDelivery(Order order) {
        Delivery delivery = new Delivery();
        delivery.uuid = UUID.randomUUID();
        delivery.order = order;
        delivery.address = getAddress();
        delivery.deliveryPrice = getDeliveryPrice(order);

        return delivery;
    }

    private Double getDeliveryPrice(Order order) {
        Double total = 5D;
        total = order.getTotalPrice() / 100D;
        for (Product product : order.getProducts()) {
            if (ProductUtilsKt.isPizza(product.getName())) {
                total += 5D;
            }
            if (ProductUtilsKt.isHeadphones(product.getName())) {
                total += 10D;
            }
            if (ProductUtilsKt.isMicrophone(product.getName())) {
                total += 15D;
            }
        }

        return total;
    }

    private String getAddress() {
       return Arrays.asList(null, "address 1", "address 2").get(new Random(0).nextInt(2));
    }
}
