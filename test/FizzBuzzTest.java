import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void isDivisibleByTest() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(true, fizzbuzz.isDivisibleBy(3, 15));
        assertEquals(true, fizzbuzz.isDivisibleBy(6, 18));

    }

    @Test
    public void isDivisibleByThreeTest() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(true, fizzbuzz.isDivisibleByThree(3));
        assertEquals(true, fizzbuzz.isDivisibleByThree(21));
    }

    @Test
    public void isDivisibleByFiveTest() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(true, fizzbuzz.isDivisibleByFive(5));
        assertEquals(true, fizzbuzz.isDivisibleByFive(70));

    }

    @Test
    public void isDivisibleByThreeAndFiveTest() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(true, fizzbuzz.isDivisibleByThreeAndFive(15));
        assertEquals(true, fizzbuzz.isDivisibleByThreeAndFive(60));

    }

    @Test
    public void sayTest() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Fizz", fizzbuzz.say(3));
        assertEquals("Buzz", fizzbuzz.say(50));
        assertEquals("FizzBuzz", fizzbuzz.say(30));
        assertEquals("4", fizzbuzz.say(4));

    }


}