package com.wanhella.PizzaOrdering;

import com.wanhella.PizzaOrdering.Pizza.Pizza;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;
import java.util.Objects;

public class Order {
    private @Id @GeneratedValue long id;

    private List<Pizza> pizzas;

    public Order() {
    }

    public Order(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(pizzas, order.pizzas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pizzas);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", pizzas=" + pizzas +
                '}';
    }
//    private CustomerInfo customerInfo;

//    private PaymentInfo paymentInfo;
}
