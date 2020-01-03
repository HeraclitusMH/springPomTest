package com.almaviva.service.greeting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MutationExampleTest {

    @Test
    public void TestOddOrEven(){
        MutationExample me = new MutationExample();
        int x = 0;
        assertEquals("even",me.oddOrEven(x));
        assertEquals(0,x);
    }

    @Test
    public void TestOddOrEvenWithOne(){
        MutationExample me = new MutationExample();
        assertEquals("odd",me.oddOrEven(1));
    }

    @Test
    public void TestOddOrEvenWithEven(){
        MutationExample me = new MutationExample();
        assertEquals("even",me.oddOrEven(4));
    }

    @Test
    public void TestOddOrEvenWithNegativeEven(){
        MutationExample me = new MutationExample();
        assertEquals("even",me.oddOrEven(-4));
    }

    @Test
    public void TestOddOrEvenWithOdd(){
        MutationExample me = new MutationExample();
        assertEquals("odd",me.oddOrEven(3));
    }

    @Test
    public void TestOddOrEvenWithNegativeOdd(){
        MutationExample me = new MutationExample();
        assertEquals("odd",me.oddOrEven(-3));
    }

    @Test
    public void TestMantainVarValue(){
        MutationExample me = new MutationExample();
        Integer x = 4;
        String res = me.oddOrEven(x);
        assertEquals(4,x);

    }
}
