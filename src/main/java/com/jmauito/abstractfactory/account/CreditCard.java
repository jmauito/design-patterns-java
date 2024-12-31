package com.jmauito.abstractfactory.account;

public abstract class CreditCard {

    protected Double balance;
    protected Double maxAmount;

    public Double getBalance(){
        return balance;
    }
    public Double getMaxAmount(){
        return maxAmount;
    }
}
