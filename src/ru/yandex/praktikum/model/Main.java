package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, "red");
        Apple greenApple = new Apple(8, 60, "green");

        Food[] test = new Food[3];
        test[0] = meat;
        test[1] = greenApple;
        test[2] = redApple;

        ShoppingCart cart = new ShoppingCart(test);

        System.out.println("Сумма скидки для всех корзины: " + cart.allSumSale(test));
        System.out.println("Сумма всех товаров без скидки: " + cart.allSumNoSale(test));
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.allIsVegetarian(test));

    }

}

