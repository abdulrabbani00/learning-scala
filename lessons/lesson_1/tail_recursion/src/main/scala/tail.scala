import scala.annotation.tailrec

@tailrec
def gcd(a: Int, b: Int): Int =
    if b == 0 then a else gcd(b, a % b)
    // Tail recusrive function

def factorial(n: Int): Int =
    if n == 0 then 1 else n * factorial(n - 1)
    // A step after recursion.

@tailrec
def tail_factorial(cur: Int, total: Int): Int = 
    if cur == 0 then total else tail_factorial(cur - 1, total * cur )


// @main def test = println(gcd(14, 21))
// @main def test = println(factorial(4))
@main def test = println(tail_factorial(4, 1))