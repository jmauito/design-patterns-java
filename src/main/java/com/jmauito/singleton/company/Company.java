package com.jmauito.singleton.company;

public class Company {
    private static int id = 1;
    private static String name = "Singleton Company.co";
    private static String email = "test@singletoncompany.com";

    private static Company company;

    private Company() {}

    public static Company getInstance() {
        if (company == null) {
            company = new Company();
        }
        return company;
    }

    public String toString() {
        return "id: " + id + ", name:" + name + ", email:" + email;
    }
}