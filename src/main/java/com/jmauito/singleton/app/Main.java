package com.jmauito.singleton.app;

import com.jmauito.singleton.company.Company;

public class Main {
    public static void main(String[] args) {
        Company companyA = Company.getInstance();
        Company companyB = Company.getInstance();
        System.out.println("Company A's hashcode:" +  companyA.hashCode());
        System.out.println("Company B's hashcode:" + companyB.hashCode());
        System.out.println("Company A info: " + companyA.toString());
        System.out.println("Company B info: " + companyB.toString());
    }
}
