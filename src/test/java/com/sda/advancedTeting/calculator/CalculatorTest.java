package com.sda.advancedTeting.calculator;

import com.sda.advancedTeting.calculator.exceptions.TruncatedResultException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

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
    @Test
    void multiplyThrowsTruncatedResultException() {
        // given
        double a = 1000;
        double b = Double.MAX_VALUE/(a-1);


        Calculator calculator = new Calculator();

        //  then when
        assertThatExceptionOfType(TruncatedResultException.class)
                .isThrownBy(
                        // lambda (paramtrii) -> {cod}
                        () -> calculator.multiply(a,b)
                );
    }
    @Test
    void IllegalArgumentException(){
        double a=10;
        double b=0;
        Calculator calculator= new Calculator();

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(
                        ()->calculator.divide(a,b)
                )
                .withMessage("Division by 0 is not supported");
    }
    //to do moduloexception
}