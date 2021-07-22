package com.platzi.javatests.discounts;

import com.platzi.javatests.util.DateUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorShould {

    @Test
    void total_zero_when_there_are_prices() {

        PriceCalculator calculator = new PriceCalculator();
        //assertThat(calculator.getTotal(), is (0));
        Assertions.assertEquals(0, calculator.getTotal());
    }

    @Test
    void total_is_the_sum_of_prices() {

        PriceCalculator calculator = new PriceCalculator();
        //assertThat(calculator.getTotal(), is (0));
        calculator.addPrices(10.2);
        calculator.addPrices(15.5);
        Assertions.assertEquals(25.7, calculator.getTotal());
    }
    @Test
    void apply_discount_to_prices() {

        PriceCalculator calculator = new PriceCalculator();
        //assertThat(calculator.getTotal(), is (0));
        calculator.addPrices(12.5);
        calculator.addPrices(17.5);

        calculator.setDiscount(50);
        Assertions.assertEquals(15.0, calculator.getTotal());
    }
}