package com.tommee;

public class Account {

    private int phoneNumber, accountNumber, balance;
    private String name, email;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int deposit(int amount){
        this.balance += amount;
        return this.balance;
    }

    public int withdrawal(int amount){

        if (this.balance >= amount){
            this.balance -= amount;
        } else
            System.out.println("Balance insufficient");
        return balance;
    }
}

// should have made the two methods void, deposit double, and all other variables strings