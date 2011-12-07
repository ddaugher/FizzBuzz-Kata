class FizzBuzz {

    def public calculate(listOfNumbers) {
        def list = []
        listOfNumbers.each {
//            def x = "${it%3 ? '' : 'Fizz'}" ?: "${it%5 ? '' : 'Buzz'}" ?: it
            //            def x = "${it%3 ? '' : 'Fizz'}${it%5 ? '' : 'Buzz'}" ?: it
            def x = "${calculateFizz(it)}${calculateBuzz(it)}" ?: it
            list << x
        }
        list
    }

    private def calculateFizz(number) {
        if (number.toString().contains("3")) {
            return "Fizz"
        }
        number % 3 ? '' : 'Fizz'
    }

    private def calculateBuzz(number) {
        if (number.toString().contains("5")) {
            return "Buzz"
        }
        number % 5 ? '' : 'Buzz'
    }
}