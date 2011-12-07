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

        def list = [3]
        assert ['Fizz'] == x.calculate(list)
    }

    @Test
    void testShouldOutputFizzWhenNumberContainsADigitEqualToThree() {
        def x = new FizzBuzz()

        def list = [37]
        assert ['Fizz'] == x.calculate(list)
    }

    @Test
    void testShouldOutputBuzzWhenNumberContainsADigitEqualToFive() {
        def x = new FizzBuzz()

        def list = [52]
        assert ['Buzz'] == x.calculate(list)
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

        def list = [3, 6, 9, 12, 18]
        assert ['Fizz', 'Fizz', 'Fizz', 'Fizz', 'Fizz'] == x.calculate(list)
    }

    @Test
    void testShouldOutputBuzzForEachNumberWhenNumberIsMultipleOfFiveAndNotMultipleOfThree() {
        def x = new FizzBuzz()

        def list = [5, 10, 20, 25, 40]
        assert ['Buzz', 'Buzz', 'Buzz', 'Buzz', 'Buzz'] == x.calculate(list)
    }

    @Test
    void testShouldOutputFizzBuzzForEachNumberWhenNumberIsMultipleOfThreeAndFive() {
        def x = new FizzBuzz()

        def list = [15, 30, 45, 60, 75]
        assert ['FizzBuzz', 'FizzBuzz', 'FizzBuzz', 'FizzBuzz', 'FizzBuzz'] == x.calculate(list)
    }

    @Test
    void testShouldOutputIncomingNumberWhenNumberIsNotMultipleOfThreeOrFive() {
        def x = new FizzBuzz()

        def list = [2]
        assert [2] == x.calculate(list)
    }

    @Test
    void testShouldOutputIncomingListOfNumbersWhenNumbersNotMultipleOfThreeOrFive() {
        def x = new FizzBuzz()

        def list = [1, 2, 4, 7]
        assert [1, 2, 4, 7] == x.calculate(list)
    }

}