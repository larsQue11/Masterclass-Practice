package com.tommee;

public class Main {

    public static void main(String[] args) {
        Account Doe = new Account();
        Doe.setAccountNumber(0001);
        Doe.setBalance(100);
        System.out.println(Doe.getBalance());
        System.out.println(Doe.deposit(100));
        System.out.println(Doe.withdrawal(150));
        System.out.println(Doe.withdrawal(51));
    }

}
