package ru.lab_5_core.model.score;

import ru.lab_5_core.model.account.Account;
import ru.lab_5_core.model.money.Money;

public class CurrentScore extends Score {
    private DebetScore debetScore;

    public CurrentScore(Money balance, Account owner, Integer number, DebetScore debetScore) {
        super(balance, owner, number);
        this.debetScore = debetScore;
    }

}