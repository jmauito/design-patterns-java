package com.jmauito.abstractfactory.account.ten;

import com.jmauito.abstractfactory.account.Account;
import com.jmauito.abstractfactory.account.AccountFactory;
import com.jmauito.abstractfactory.account.CreditCard;
import com.jmauito.abstractfactory.account.DebitCard;

public class TenAccountFactory implements AccountFactory {
    @Override
    public Account createAccount() {
        return new TenAccount();
    }

    @Override
    public DebitCard createDebitCard() {
        return new TenDebitCard();
    }

    @Override
    public CreditCard createCreditCard() {
        return new TenCreditCard();
    }
}
