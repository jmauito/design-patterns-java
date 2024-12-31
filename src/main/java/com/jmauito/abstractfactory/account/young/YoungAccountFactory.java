package com.jmauito.abstractfactory.account.young;

import com.jmauito.abstractfactory.account.Account;
import com.jmauito.abstractfactory.account.AccountFactory;
import com.jmauito.abstractfactory.account.CreditCard;
import com.jmauito.abstractfactory.account.DebitCard;

public class YoungAccountFactory implements AccountFactory {
    @Override
    public Account createAccount() {
        return new YoungAccount();
    }

    @Override
    public DebitCard createDebitCard() {
        return new YoungDebitCard();
    }

    @Override
    public CreditCard createCreditCard() {
        return new YoungCreditCard();
    }
}
