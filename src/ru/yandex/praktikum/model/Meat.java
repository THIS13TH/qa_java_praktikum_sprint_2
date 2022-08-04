package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Discount;

public class Meat extends Food implements Discountable {

    public Meat(int amount, double price) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }

    public double getPrice() {
        return this.price;
    }

    public int getAmount() {
        return this.amount;
    }

    public double getDiscount() {
        return Discount.DEFAULT_SALE;
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }


}
