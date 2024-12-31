package com.jmauito.abstractfactory;

import com.jmauito.abstractfactory.account.Account;
import com.jmauito.abstractfactory.account.AccountFactory;
import com.jmauito.abstractfactory.account.CreditCard;
import com.jmauito.abstractfactory.account.DebitCard;
import com.jmauito.abstractfactory.account.gold.GoldAccountFactory;
import com.jmauito.abstractfactory.account.ten.TenAccountFactory;
import com.jmauito.abstractfactory.account.young.YoungAccountFactory;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class AccountTest {
    @Test
    public void shouldRetrieveYoungAccountPack(){
        AccountFactory accountFactory = new YoungAccountFactory();
        Account account = accountFactory.createAccount();
        DebitCard debitCard = accountFactory.createDebitCard();
        CreditCard creditCard = accountFactory.createCreditCard();

        assertEquals(1.00, account.getInterest());
        assertEquals(0.00, debitCard.getBalance());
        assertEquals(0.00, creditCard.getBalance());
        assertEquals(600.00, creditCard.getMaxAmount());
    }

    @Test
    public void shouldRetrieveTenAccountPack(){
        AccountFactory accountFactory = new TenAccountFactory();
        Account account = accountFactory.createAccount();
        DebitCard debitCard = accountFactory.createDebitCard();
        CreditCard creditCard = accountFactory.createCreditCard();

        assertEquals(1.5, account.getInterest());
        assertEquals(0.00, debitCard.getBalance());
        assertEquals(10.00, creditCard.getBalance());
        assertEquals(2000.00, creditCard.getMaxAmount());
    }

    @Test
    public void shouldRetrieveGoldAccountPack(){
        AccountFactory accountFactory = new GoldAccountFactory();
        Account account = accountFactory.createAccount();
        DebitCard debitCard = accountFactory.createDebitCard();
        CreditCard creditCard = accountFactory.createCreditCard();

        assertEquals(2.0, account.getInterest());
        assertEquals(5.00, debitCard.getBalance());
        assertEquals(20.00, creditCard.getBalance());
        assertEquals(4000.00, creditCard.getMaxAmount());
    }
}
