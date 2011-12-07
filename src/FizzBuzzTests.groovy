import org.junit.Test
import org.junit.Ignore

class FizzBuzzTests extends GroovyTestCase {
//    @Test
//        void testShouldReturnListOfResultsBasedOnInputListOfNumbers() {
//        def x = new FizzBuzz()
//
//        def list = (1..100)
//        assert list == x.calculate(list)
//    }

    @Test
    void testShouldOutputFizzWhenNumberIsMultipleOfThree() {
        def x = new FizzBuzz()

        assert ['Fizz'] == x.calculate([3])
    }

    @Test
    void testShouldOutputFizzWhenNumberContainsADigitEqualToThree() {
        def x = new FizzBuzz()

        assert ['Fizz'] == x.calculate([37])
    }

    @Test
    void testShouldOutputBuzzWhenNumberContainsADigitEqualToFive() {
        def x = new FizzBuzz()

        assert ['Buzz'] == x.calculate([52])
    }

    @Test
    void testShouldOutputBuzzWhenNumberIsMultipleOfFive() {
        def x = new FizzBuzz()

        assert ['Buzz'] == x.calculate([5])
    }

    @Test
    void testShouldOutputFizzBuzzWhenNumberIsMultipleOfThreeAndFive() {
        def x = new FizzBuzz()

        assert ['FizzBuzz'] == x.calculate([15])
    }

    @Test
    void testShouldOutputFizzForEachNumberWhenNumberIsMultipleOfThreeAndNotMultipleOfFive() {
        def x = new FizzBuzz()

        assert ['Fizz', 'Fizz', 'Fizz', 'Fizz', 'Fizz'] == x.calculate([3, 6, 9, 12, 18])
    }

    @Test
    void testShouldOutputBuzzForEachNumberWhenNumberIsMultipleOfFiveAndNotMultipleOfThree() {
        def x = new FizzBuzz()

        assert ['Buzz', 'Buzz', 'Buzz', 'Buzz', 'Buzz'] == x.calculate([5, 10, 20, 25, 40])
    }

    @Test
    void testShouldOutputFizzBuzzForEachNumberWhenNumberIsMultipleOfThreeAndFive() {
        def x = new FizzBuzz()

        assert ['FizzBuzz', 'FizzBuzz', 'FizzBuzz', 'FizzBuzz', 'FizzBuzz'] == x.calculate([15, 30, 45, 60, 75])
    }

    @Test
    void testShouldOutputIncomingNumberWhenNumberIsNotMultipleOfThreeOrFive() {
        def x = new FizzBuzz()

        assert [2] == x.calculate([2])
    }

    @Test
    void testShouldOutputIncomingListOfNumbersWhenNumbersNotMultipleOfThreeOrFive() {
        def x = new FizzBuzz()

        assert [1, 2, 4, 7] == x.calculate([1, 2, 4, 7])
    }

}