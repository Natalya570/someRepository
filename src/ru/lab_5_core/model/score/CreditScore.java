package ru.lab_5_core.model.score;

import ru.lab_5_core.model.account.Account;
import ru.lab_5_core.model.money.Money;

public class CreditScore extends Score {
    public CreditScore(Money balance, Account owner, Integer number) {
        super(balance, owner, number);
    }

}


