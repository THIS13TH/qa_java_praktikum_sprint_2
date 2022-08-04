package ru.yandex.praktikum.model.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {
    private Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double allSumNoSale(Food[] food){
        double sum = 0;
        for (int i = 0; i < food.length; i++) {
            sum += food[i].getPrice() * food[i].getAmount();
        }
        return sum;
    }

    public double allSumSale(Food[] food){
        double sum = 0;
        for (int i = 0; i < food.length; i++) {
            if(Double.compare(food[i].getDiscount(), 0.0) == 0) {
                sum += food[i].getPrice() * food[i].getAmount();
            } else {
                sum += ((food[i].getPrice() * food[i].getAmount()) * food[i].getDiscount()) / 100;
            }
        }
        return sum;
    }

    public double allIsVegetarian(Food[] food){
        double sum = 0;
        for (int i = 0; i < food.length; i++) {
            if(food[i].isVegetarian()){
                if(Double.compare(food[i].getDiscount(), 0.0) == 0) {
                    sum += food[i].getPrice() * food[i].getAmount();
                } else {
                    sum += ((food[i].getPrice() * food[i].getAmount()) * food[i].getDiscount()) / 100;
                }
            }
        }
        return sum;
    }

}
