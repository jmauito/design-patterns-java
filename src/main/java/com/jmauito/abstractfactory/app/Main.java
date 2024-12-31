package com.jmauito.abstractfactory.app;

import com.jmauito.abstractfactory.account.Account;
import com.jmauito.abstractfactory.account.AccountFactory;
import com.jmauito.abstractfactory.account.CreditCard;
import com.jmauito.abstractfactory.account.DebitCard;
import com.jmauito.abstractfactory.account.gold.GoldAccountFactory;
import com.jmauito.abstractfactory.account.ten.TenAccountFactory;
import com.jmauito.abstractfactory.account.young.YoungAccountFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating young account");
        AccountFactory youngAccountFactory = new YoungAccountFactory();
        Account youngAccount = youngAccountFactory.createAccount();
        DebitCard youngDebitCard = youngAccountFactory.createDebitCard();
        CreditCard youngCreditCard = youngAccountFactory.createCreditCard();
        System.out.println(
                "Young account: "  + youngAccount.getInterest() + "% of interest. " +
                        "Debit card initial balance: " + youngDebitCard.getBalance() + ". " +
                        "Credit card Initial balance: " + youngCreditCard.getBalance() + " " +
                        "max amount: " + youngCreditCard.getMaxAmount()
        );

        System.out.println("Creating ten account");
        AccountFactory tenAccountFactory = new TenAccountFactory();
        Account tenAccount = tenAccountFactory.createAccount();
        DebitCard tenDebitCard = tenAccountFactory.createDebitCard();
        CreditCard tenCreditCard = tenAccountFactory.createCreditCard();
        System.out.println(
                "10 account: "  + tenAccount.getInterest() + "% of interest. " +
                        "Debit card initial balance: " + tenDebitCard.getBalance() + ". " +
                        "Credit card Initial balance: " + tenCreditCard.getBalance() + " " +
                        "max amount: " + tenCreditCard.getMaxAmount()
        );

        System.out.println("Creating gold account");
        AccountFactory goldAccountFactory = new GoldAccountFactory();
        Account goldAccount = goldAccountFactory.createAccount();
        DebitCard goldDebitCard = goldAccountFactory.createDebitCard();
        CreditCard goldCreditCard = goldAccountFactory.createCreditCard();
        System.out.println(
                "Gold account: "  + goldAccount.getInterest() + "% of interest. " +
                        "Debit card initial balance: " + goldDebitCard.getBalance() + ". " +
                        "Credit card Initial balance: " + goldCreditCard.getBalance() + " " +
                        "max amount: " + goldCreditCard.getMaxAmount()
        );
    }
}
