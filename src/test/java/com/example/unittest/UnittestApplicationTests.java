package com.example.unittest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
@SpringBootTest
public class UnittestApplicationTests {

    private FizzBuzz fizzBuzz;
    @Before
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void evaluateFizzBuzz_fizzNumber(){
        String result  = fizzBuzz.evaluateFizzBuzz(3);
        assertEquals("Fizz",result);
    }

    @Test
    public void evaluateFizzBuzz_buzzNumber(){
        String result  = fizzBuzz.evaluateFizzBuzz(5);
        assertEquals("Buzz",result);
    }

    @Test
    public void evaluateFizzBuzz_FizzBuzzNumber(){
        String result  = fizzBuzz.evaluateFizzBuzz(15);
        assertEquals("FizzBuzz",result);
    }

    @Test
    public void evaluateFizzBuzz_Number(){
        String result  = fizzBuzz.evaluateFizzBuzz(4);
        assertEquals(String.valueOf(4),result);
    }

}
