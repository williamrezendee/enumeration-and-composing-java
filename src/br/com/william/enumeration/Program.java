package br.com.william.enumeration;

import br.com.william.enumeration.entities.Order;
import br.com.william.enumeration.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order); // Order{id=1080, orderDateAndTime=Tue May 23 21:57:44 BRT 2023, status=PENDING_PAYMENT}

        OrderStatus statusTest1 = OrderStatus.PENDING_PAYMENT;
        OrderStatus statusTest2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(statusTest1); // PENDING_PAYMENT
        System.out.println(statusTest2); // DELIVERED
    }
}
