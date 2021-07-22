package com.platzi.javatests.util;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

public class DateUtilShould {


    /*
      All years divisible by 400 ARE leap years (1600, 2000, 2400),
      All years divisible by 100 but not by 400 are NOT leap years (1700, 1800, 1900),
      All years divisible by 4 but not by 100 ARE leap years (1996, 2004, 2008),
      All years not divisible by 4 are NOT leap years (2017, 2018, 2019).
     */

    @Test
    public void return_true_when_year_is_divisible_by_400() {
        Assertions.assertTrue(DateUtil.isLeapYear(1600));
        Assertions.assertTrue(DateUtil.isLeapYear(2000));
        Assertions.assertTrue(DateUtil.isLeapYear(2400));


        /*assertionsThat( DateUtil.isLeapYear(1600), is(true) );*/
        //Assert.that(DateUtil.isLeapYear(1600), "true");
    }
    @Test
    public void return_false_when_year_is_divisible_by_100_but_not_by_400() {
        Assertions.assertFalse(DateUtil.isLeapYear(1700));
        Assertions.assertFalse(DateUtil.isLeapYear(1800));
        Assertions.assertFalse(DateUtil.isLeapYear(1900));
    }
    @Test
    public void return_true_when_year_is_not_divisible_by_100() {
        Assertions.assertTrue(DateUtil.isLeapYear(1996));
        Assertions.assertTrue(DateUtil.isLeapYear(2004));
        Assertions.assertTrue(DateUtil.isLeapYear(2008));
    }

    @Test
    public void return_false_when_year_is_noy_divisible_by_4() {
        Assertions.assertFalse(DateUtil.isLeapYear(2017));
        Assertions.assertFalse(DateUtil.isLeapYear(2019));
        Assertions.assertFalse(DateUtil.isLeapYear(1900));
    }
}