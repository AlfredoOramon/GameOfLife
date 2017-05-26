package utils;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 15/05/17 14:40
 */
@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {

    //In gogle drive there is a good book that explain this practical unit testing with junit and mockito
    private static final Object[] getMoney() {

        return new Object[] {

                new Object[] {10, "USD"},

                new Object[] {20, "EUR"}
        };
    }

    @Test
    @Parameters(method = "getMoney")
    public void constructorShouldSetAmountAndCurrency(int amount, String currency) {

        Money money = new Money(amount, currency);
        assertEquals(amount, money.getAmount());
        assertEquals(currency, money.getCurrency());

    }

    //example class that should be in the src/main/java
    class Money
    {
        private int amount;
        private String currency;

        public Money(int amount,String currency)
        {
            this.amount=amount;
            this.currency=currency;

        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }
    }

}
