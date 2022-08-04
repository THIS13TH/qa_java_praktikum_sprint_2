package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Discount;

public interface Discountable {
    default double getDiscount() {
            return Discount.DEFAULT_SALE;
    }
}
