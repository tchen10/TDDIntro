package com.thoughtworks.accountbalance;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    private Account account = new Account();
    private int balance;

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        int result = account.deposit(50);
        assertThat(result, is(150));
    }
//
//    @Test
//    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
//
//    }
//
//    @Test
//    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
//
//    }
}
