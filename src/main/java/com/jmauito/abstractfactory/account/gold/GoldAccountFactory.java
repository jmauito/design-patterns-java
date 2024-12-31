package com.jmauito.abstractfactory.account.gold;

import com.jmauito.abstractfactory.account.Account;
import com.jmauito.abstractfactory.account.AccountFactory;
import com.jmauito.abstractfactory.account.CreditCard;
import com.jmauito.abstractfactory.account.DebitCard;

public class GoldAccountFactory implements AccountFactory {
    @Override
    public Account createAccount() {
        return new GoldAccount();
    }

    @Override
    public DebitCard createDebitCard() {
        return new GoldDebitCard();
    }

    @Override
    public CreditCard createCreditCard() {
        return new GoldCreditCard();
    }
}
