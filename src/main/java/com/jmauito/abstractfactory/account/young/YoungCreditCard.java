package com.jmauito.abstractfactory.account.young;

import com.jmauito.abstractfactory.account.CreditCard;

public class YoungCreditCard extends CreditCard {
    public YoungCreditCard(){
        balance = 0.00;
        maxAmount = 600.00;
    }
}
