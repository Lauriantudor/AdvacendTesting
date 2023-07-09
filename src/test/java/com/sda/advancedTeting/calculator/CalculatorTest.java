package com.sda.advancedTeting.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @Test
    void verifyAdd(){
        //given
        double a =20;
        double b =32;
        Calculator calculator =new Calculator();
        //when
        double result= calculator.add(a,b);
        //then

        assertEquals(52,result);

    }
    @Test
    void verifySubtract(){
        //given
        double a =5;
        double b =3;
        Calculator calculator =new Calculator();
        //when
        double result= calculator.subtract(a,b);
        //then

        assertEquals(2,result);

    } @Test
    void verifyMultiply(){
        //given
        double a =3;
        double b =5;
        Calculator calculator =new Calculator();
        //when
        double result= calculator.multiply(a,b);
        //then

        assertEquals(15,result);

    }@Test
    void verifyDivide(){
        //given
        double a =15;
        double b =5;
        Calculator calculator =new Calculator();
        //when
        double result= calculator.divide(a,b);
        //then

        assertEquals(3,result);

    }
    @Test
    void verifyModulo(){
        //given
        int a =3;
        int b =5;
        Calculator calculator =new Calculator();
        //when
        double result= calculator.modulo(a,b);
        //then

        assertEquals(3,result);

    }

}