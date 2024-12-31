package com.jmauito.abstractfactory.account.gold;

import com.jmauito.abstractfactory.account.CreditCard;

public class GoldCreditCard extends CreditCard {
    public GoldCreditCard(){
        balance = 20.00;
        maxAmount = 4000.00;
    }
}
