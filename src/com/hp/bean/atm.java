package com.hp.bean;

public class atm {
    public static void main(String[] args) {
        phone phone1 = phone.getInstance();
        phone phone2 = phone.getInstance();
        System.out.println(phone1 == phone2);
    }

}
