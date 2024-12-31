package com.jmauito.abstractfactory.account;

public interface AccountFactory {

    Account createAccount();
    DebitCard createDebitCard();
    CreditCard createCreditCard();

}
