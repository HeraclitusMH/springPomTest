package com.almaviva.service.greeting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GreetingTest {

    @Test
    public void testIsFreeWhithNoPrenotationsSoTrue(){
        Greeting g = new Greeting(0,"cickeciack");
        assertEquals("cickeciack",g.getContent());
    }

}
