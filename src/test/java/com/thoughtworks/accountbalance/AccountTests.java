package com.thoughtworks.accountbalance;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        Account account = new Account(100);
        account.deposit(50);
        int result = account.getBalance();
        assertThat(result, is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account(100);
        account.withdraw(50);
        int result = account.getBalance();
        assertThat(result, is(50));

    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account(50);
        account.withdraw(100);
        int result = account.getBalance();
        assertThat(result, is(50));
    }
}
