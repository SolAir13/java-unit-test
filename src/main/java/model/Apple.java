package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple extends Food {
    private final String color;

    public Apple(int amount, double price, String colour) {
        this.isVegetarian = true;
        this.amount = amount;
        this.price = price;
        this.color = colour;
    }

    @Override
   public double getDiscount(){

        if (color.equals(Colour.RED)) {
            return Discount.DISCOUNT_60;
        } else if (color.equals(Colour.GREEN)) {
            return Discount.DISCOUNT_0;
        } else {
            return Discount.DISCOUNT_0;
        }

    };
}
