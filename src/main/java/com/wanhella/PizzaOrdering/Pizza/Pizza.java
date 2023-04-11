package com.example.PizzaOrdering.Pizza;

import java.util.Set;

public class Pizza {
    private int diameter;
    private Set<Topping> toppings;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Set<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(Set<Topping> toppings) {
        this.toppings = toppings;
    }
}
