package com.raphael.oop.principles_of_oop.encapsulation;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

public class BankAccount {
    private String name;
    private BigDecimal balance;
    private  boolean hasOverDraft;

    public BankAccount(String name, BigDecimal balance,boolean hasOverDraft) {
        this.name = name;
        this.balance = balance;
        this.hasOverDraft = hasOverDraft;
    }

    public BigDecimal withdraw(BigDecimal amount){
        if (balance.subtract(amount).compareTo(ZERO) >= 0) {
            this.balance = this.balance.subtract(amount);
            return amount;
//            return this.balance; // can return this - depends on choice and requirements
        }
        return ZERO;
    }
}
