package br.com.william.enumeration.entities;

import br.com.william.enumeration.entities.enums.OrderStatus;

import java.util.Date;

public class Order {

    private Integer id;
    private Date orderDateAndTime;
    private OrderStatus status;

    public Order() {
    }

    public Order(Integer id, Date orderDateAndTime, OrderStatus status) {
        this.id = id;
        this.orderDateAndTime = orderDateAndTime;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public Date getOrderDateAndTime() {
        return orderDateAndTime;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDateAndTime=" + orderDateAndTime +
                ", status=" + status +
                '}';
    }
}
