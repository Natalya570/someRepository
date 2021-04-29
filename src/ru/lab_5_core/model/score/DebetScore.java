package ru.lab_5_core.model.score;

import ru.lab_5_core.model.account.Account;
import ru.lab_5_core.model.money.Money;

public class DebetScore extends Score {
    private CreditScore creditScore;

    public DebetScore(Money balance, Account owner, Integer number, CreditScore creditScore) {
        super(balance, owner, number);
        this.creditScore = creditScore;
    }
}