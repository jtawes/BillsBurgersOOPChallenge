package com.example.java;

public class Burger {
    private String breadRollType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean cheese;
    private double price;

    public Burger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 7.50;
        this.lettuce = false;
        this.tomato = false;
        this.carrot = false;
        this.cheese = false;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
        if (lettuce) {
            this.price = this.price + .50;
            System.out.println("Lettuce added for .50, new price = " + this.price);
        }
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
        if (tomato) {
            this.price = this.price + .75;
            System.out.println("Tomator added for .75, new price = " + this.price);
        }
    }

    public boolean isCarrot() {
        return carrot;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
        if (carrot) {
            this.price = this.price + .25;
            System.out.println("Carrot added for .25, new price = " + this.price);
        }
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
        if (cheese) {
            this.price = this.price + 1.00;
            System.out.println("Cheese added for 1.00, new price = " + this.price);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
