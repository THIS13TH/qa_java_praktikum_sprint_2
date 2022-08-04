package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.constants.Discount;

public class Apple extends Food implements Discountable{
    private final String color;

    public Apple(int amount, double price, String color) {
        this.amount = amount;
        this.price = price;
        this.color = color;
        this.isVegetarian = true;
    }

    public double getPrice() {
        return this.price;
    }
    public int getAmount() {
        return this.amount;
    }

        @Override
    public double getDiscount() {
        return this.color.equals(Colour.RED_APPLE) ?  Discount.RED_APPLE_SALE :  Discount.DEFAULT_SALE;
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }
}
