package com.jmauito.abstractfactory.account.ten;

import com.jmauito.abstractfactory.account.CreditCard;

public class TenCreditCard extends CreditCard {
    public TenCreditCard(){
        balance = 10.00;
        maxAmount = 2000.00;
    }
}
