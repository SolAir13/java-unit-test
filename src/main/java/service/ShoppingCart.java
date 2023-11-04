package service;

import model.Food;


public class ShoppingCart {

    public ShoppingCart(Food[] food) {
        this.food = food;

    }

    Food[] food;

    public double getSumWhithOutDis() {
        double sum = 0;
        for (int i = 0; i < food.length; i++) {
            sum = sum + food[i].getAmount() * food[i].getPrice();
        }
        return sum;
    }

    public double getSumWhithDis() {
        double sum = 0;
        for (int i = 0; i < food.length; i++) {
            sum = sum + food[i].getAmount() * food[i].getPrice() * ((100 - food[i].getDiscount()) / 100);
        }
        return sum;
    }

    public double getSumVegProd() {
        double sum = 0;
        ;
        for (int i = 0; i < food.length; i++) {
            if (food[i].isVegetarian()) {
                sum = sum + food[i].getAmount() * food[i].getPrice();
            }
        }
        return sum;
    }


}
