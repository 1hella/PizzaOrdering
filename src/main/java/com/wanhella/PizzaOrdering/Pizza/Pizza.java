package com.wanhella.PizzaOrdering.Pizza;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;
import java.util.Set;

@Entity
public class Pizza {
    private @Id @GeneratedValue Long id;
    private int diameter;
    private Set<Topping> toppings;

    Pizza(int diameter, Set<Topping> toppings) {
        this.diameter = diameter;
        this.toppings = toppings;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Set<Topping> getToppings() {
        return toppings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return diameter == pizza.diameter && Objects.equals(id, pizza.id) && Objects.equals(toppings, pizza.toppings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, diameter, toppings);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", diameter=" + diameter +
                ", toppings=" + toppings +
                '}';
    }

    public void setToppings(Set<Topping> toppings) {
        this.toppings = toppings;
    }
}
