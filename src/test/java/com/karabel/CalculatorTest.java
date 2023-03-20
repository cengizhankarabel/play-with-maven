package com.karabel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class CalculatorTest {

    //Arrange
    Calculator calculator = new Calculator();

    //Act
    @Test
    public void addTest(){
        int n1=12;
        int n2=13;
        int expected=25;
        int actual = calculator.add(n1,n2);

        //Assert
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void subTest(){
        int n1=10;
        int n2=3;
        int expected=7;
        int actual=calculator.sub(n1,n2);

        //Assert
        Assertions.assertEquals(expected,actual);
    }




}
