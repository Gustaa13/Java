package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.gustaa13.entities.Financing;

public class FinancingTests {

    @Test
    public void constructorShouldCreateObjectWhenDataIsValid() {

        Double totalAmount = 50000.0;
        Double income = 10000.0;
        Integer months = 8;

        Financing financing = new Financing(totalAmount, income, months);

        Assertions.assertTrue(
            totalAmount == financing.getTotalAmount() && income == financing.getIncome() && months == financing.getMonths()
        );
    }

    @Test
    public void constructorShouldThrowExceptionWheDataIsNotValid() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Financing(50000.0, 10000.0, 7);
        });

    }

    @Test
    public void setTotalAmountShouldUpdateIfDataIsValid() {

        Financing financing = new Financing(10000.0, 1000.0, 16);

        Double newTotalAmount = 9000.0;
        financing.setTotalAmount(newTotalAmount);

        Assertions.assertEquals(newTotalAmount, financing.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldThrowExceptionWhenDataIsNotValid() {

        Financing financing = new Financing(10000.0, 1000.0, 16);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            financing.setTotalAmount(11000.0);
        });
    }

    @Test
    public void setIncomeShouldUpdateIfDataIsValid() {

        Financing financing = new Financing(10000.0, 1000.0, 16);

        Double newIncome = 1100.0;
        financing.setIncome(newIncome);

        Assertions.assertEquals(newIncome, financing.getIncome());
    }

    @Test
    public void setIncomeShouldThrowExceptionWhenDataIsNotValid() {

        Financing financing = new Financing(10000.0, 1000.0, 16);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            financing.setIncome(900.0);
        });
    }

    @Test
    public void setMonthsShouldUpdateIfDataIsValid() {

        Financing financing = new Financing(10000.0, 1000.0, 16);

        Integer newMonths = 17;
        financing.setMonths(newMonths);

        Assertions.assertEquals(newMonths, financing.getMonths());
    }

    @Test
    public void setMonthsShouldThrowExceptionWhenDataIsNotValid() {

        Financing financing = new Financing(10000.0, 1000.0, 16);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            financing.setMonths(15);
        });
    }

    @Test
    public void entryShouldCorrectlyCalculateEntryValue() {

        Financing financing = new Financing(10000.0, 1000.0, 16);

        Assertions.assertEquals(2000.0, financing.entry());
    }

    @Test
    public void quotaShouldCorrectlyCalculateEntryValue() {

        Financing financing = new Financing(10000.0, 1000.0, 16);

        Assertions.assertEquals(500.0, financing.quota());
    }
}
