import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzShould {

    @Test
    public void outputsNumberIfNotDivisibleByEitherThreeOrFive() {
        String calculated = FizzBuzz.calculate(1);

        assertEquals("1", calculated);
    }

    @Test
    public void outputsFizzForMultipleOfThree() {
        String calculated = FizzBuzz.calculate(6);

        assertEquals("Fizz", calculated);
    }

    @Test
    public void outputsBuzzForMultiplesOfFive() {
        String calculated = FizzBuzz.calculate(10);

        assertEquals("Buzz", calculated);
    }

    @Test
    public void outputsFizzBuzzForMultiplesOfBothThreeAndFive() {
        String calculated = FizzBuzz.calculate(15);

        assertEquals("FizzBuzz", calculated);
    }
}