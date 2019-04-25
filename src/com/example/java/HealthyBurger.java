package com.example.java;

public class HealthyBurger extends Burger {
    private String name;
    private boolean alfalfaSprouts;
    private boolean tofu;
    private double price = 8.00;

    public HealthyBurger() {
        super("Brown Rye", "Black Bean");
        this.name = "Vegan Delight";
    }

    public boolean isAlfalfaSprouts() {
        return alfalfaSprouts;
    }

    public void setAlfalfaSprouts(boolean alfalfaSprouts) {
        this.alfalfaSprouts = alfalfaSprouts;
        if (alfalfaSprouts) {
            this.price = this.price + .35;
            System.out.println("Alfalfa sprouts added, new price = " + this.price);
        }
    }

    public boolean isTofu() {
        return tofu;
    }

    public void setTofu(boolean tofu) {
        this.tofu = tofu;
        if (tofu) {
            this.price = this.price + .60;
            System.out.println("Tofu added, new price = " + this.price);
        }
    }
}
