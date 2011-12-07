import FizzBuzz

def x = new FizzBuzz()
x.calculate((1..100)).eachWithIndex { num, idx ->
    println idx+1 + " : " + num
}
