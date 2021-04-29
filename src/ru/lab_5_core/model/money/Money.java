package ru.lab_5_core.model.money;

import ru.lab_5_core.model.Currency;
import ru.lab_5_core.model.CurrencyHolder;

public class Money {
    private Currency currency;
    private double value;
    public Money(double value, String currencyName) {
        this.value = value;
        this.currency = CurrencyHolder.getCurrencyByName(currencyName); }
    public Currency getCurrency() {
        return currency; }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    }

