package com.thoughtworks.accountbalance;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    private Account account = new Account();

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        int result = account.deposit(100, 50);
        assertThat(result, is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        int result = account.withdraw(100, 50);
        assertThat(result, is(50));

    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        int result = account.withdraw(50, 100);
        assertThat(result, is(50));
    }
}
