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

}