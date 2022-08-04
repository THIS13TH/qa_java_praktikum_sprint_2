package ru.yandex.praktikum.model;

public abstract class Food {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public abstract double getPrice();
    public abstract int getAmount();

    public abstract double getDiscount();

    public abstract boolean isVegetarian();
}
