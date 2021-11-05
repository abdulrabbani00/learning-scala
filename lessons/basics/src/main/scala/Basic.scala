import java.util.Date
import Array._
import scala.collection.mutable.Map

class strict {
  val e = {
    println("strict")
    9
  }
}

class LazyEval {
  lazy val l = {
    println("lazy")
    9
  }
}

object Basic {

  // Functions
  /*
  object Math {
    def add(x: Int = 45, y: Int = 15): Int = {
      return x + y
    }

    def square(x: Int) = x * x

    def +(x: Int, y: Int): Int = { //This isnt operator overloading, this is a default feature
      return x + y
    }

    def **(x: Int) = x * x
  }

  def add(x: Int, y: Int): Int = {
    return x + y
  }
  def subtract(x: Int, y: Int): Int = {
    x - y //last line of function is considered return
  }
  def multiply(x: Int, y: Int): Int = x * y

  def divide(x: Int, y: Int) = x / y

  def print(x: Int, y: Int): Unit = {
    println(x + y)
  }
   */

  // Higher Order Functions
  //def math(x: Double, y: Double, z: Double, f: (Double, Double)=>Double): Double = f(f(x, y), z)

  // Partially Applied Function
  /*
  def log(date: Date, message: String) = {
    println(date + " " + message)
  }
   */

  // Closure
  /*
  var number = 10
  val add = (x: Int) => {
    number = x + number
    number
  }
   */

  // Currying
  /*
  def add(x: Int, y: Int) = x + y

  def add2(x: Int)= (y: Int ) => x + y

  def add3(x: Int) (y: Int) = x + y
   */

  // Lazy
  /*
  def nonLazy(n: Int): Unit = {
    println("Not Lazy")
    println(n)
  }

  def lazy1(n: => Int): Unit = {
    println("Lazy")
    println(n)
  }
  */

  def main(args: Array[String]) = {
    // IF Statement
    /*
    val x = 20
    val y = 30
    var res = ""

    if (x == 20 || y == 30) {
      res = "x == 20"
    } else {
      res = "x != 20"
    }
    println(res)

    val res2 = if (x == 20) "x == 20" else "x != 20"
    println(res2)
    println(if (x == 20) "x == 20" else "x != 20")
     */

    // While Loops
    /*
    var x = 0
    while (x < 10) {
      println("x= " + x)
      x += 1 // x++ does not exist in scala
    }

    var y = 0
    do {
      println("y = " + y)
      y = y +1
    } while (y < 0)
     */

    // For Loops
    /*
    for (var a <- Range) {
      statement()
    }

    for (i <- 1 to 5) {
      println("i using to " + i)
    }

    for (i <- 1.to(5)) {
      println("i using to " + i)
    }

    for (i <- 1.until(6)) {
      println("i using until " + i)
    }
    for (i <- 1 until 6) {
      println("i using until " + i)
    }

    for (i <- 1 to 9; j <- 1 to 3) {
      println("i using multiple ranges " + i + " " + j)
    }

    val lst = List(1, 2, 3, 4, 5)

    for (i <- lst) {
      println("i using lst " + i)
    }
    for (i <- lst; if i < 3) {
      println("i using filters " + i)
    }

    val result = for {
      i <- lst
      if i < 4} yield {
      i * i
    }

    println("result = " + result)
     */
    // Match Expressions
    // Same as switch case
    /*
    val age = 18

    age match {
      case 20 => println(age)
      case 18 => println(age)
      case 22 => println(age)
      case 23 => println(age)
      case _ => println("default")
    }

    val result = age match {
      case 20 => age
      case 18 => age
      case 22 => age
      case 23 => age
      case _ => "default"
    }

    println(result)

    val i = 7
    i match {
      case 1 | 3 | 5 | 7 | 9 => println("odd")
      case 2 | 4 | 6 | 8 | 10 => println("even")
    }
     */

    // Functions in Scala
    /*
    println(add(5 ,6))
    println(subtract(7 ,6))
    println(multiply(5 ,6))
    println(divide(5 ,6))
    println(Math.add(5 ,6)) //do not need to instantiate a class
    println(Math.add())
    println(Math.add(60))
    println(Math square 3) // One arg can be passed with spaces
    print(100, 200)
    println(Math.+(10, 20))
    println(Math ** 10)
    val sum =  20 + 10 //+ is not an operator, its a function

    val add = (x: Int, y: Int) => x + y //anonymous function
    println(add(300, 500))
     */
    // Higher Order Functions
    // Take and return functions
    /*
    val result = math(50, 20, 10, (x, y)=>x max y) //Using an anonymous function
    val result_wild = math(50, 20, 10, _ max _) // using wildcard
    println(result)
    println(result_wild)
     */

    // Partially Applied Function
    /*
    val sum = (a: Int, b: Int, c: Int) => a + b + c

    val f = sum(10, 20, _: Int)
    println(sum(10, 20, 30))
    println(f(30))

    val date = new Date
    val newLog = log(date, _:String)
    newLog("the message 1")
    Thread.sleep(5000)
    newLog("the message 2")
    newLog("the message 3")
    newLog("the message 4")
     */

    // Closures
    /* A closure is a function which uses one or more
    variables declared outside the function
     */
    /* Impure vs Pure closure
    val number = 10 -- Pure
    var number = 10 -- Impure
     */
    /*
    number = 100 // Closure takes the last valid state of the variable.
    println(add(20))
    println(number)
     */

    // Currying
    /* Currying is the technique of transforming a function
    that takes multiple arguments into a function
    that takes a single argument
     */
    /*
    println(add(20, 10))

    println(add2(20)(10))
    val sum40 = add2(40)
    println(sum40(100))

    println(add3(100)(200))
    val sum50 = add3(50)_
    println(sum50(100))
     */

    // Strings
    /*
    val str1 : String = "Hello World"; //immutable strings
    val str2 : String = " Max";
    val num1 = 75
    val num2 = 100.25
    println(str1.length())
    println(str1.concat(str2))
    println(str1 + str2)

    val result = printf("(%d -- %f -- %s)", num1, num2, str1) // Returns Unit which is nothing
    println(result)
    println("(%d -- %f -- %s)".format(num1, num2, str1))
    printf("(%d -- %f -- %s)", num1, num2, str1) // Don't assing to var to avoid extra ()
     */

    // Array
    /*
    val myarray: Array[Int] = new Array[Int](4);
    val myarray2 = new Array[Int](5) //Arrays are initialized with the types default type
    val myarray3 = Array(1, 2, 3, 4, 5)
    myarray(0) = 20
    myarray(1) = 30
    myarray(2) = 40
    myarray(3) = 50
    // println(myarray) // Not pretty
    for (x <- myarray) println(x)

    for (i <- 0 to (myarray.length - 1)) println(myarray(i))

    println(myarray3.length)

    val result = concat(myarray, myarray3)
    for (x <- result) println(x)
     */

    // List
    /*
    * Lists are immutable
    * Lists are linked lists while arrays are flat
    * */
    /*
    val mylist: List[Int] = List(1, 2, 3, 4, 121, 1211)
    val name: List[String] = List("max", "Abdul", "Tom")
    // mylist(0) = 5 won't work since lists are immutable
    println(mylist)
    println(0 :: mylist) //cons
    println(mylist)
    println(name)
    println(Nil)
    println(1:: 5 :: 9 :: Nil)
    println(mylist.head)
    println(mylist.tail)
    println(mylist.isEmpty)
    println(mylist.reverse)
    println(List.fill(5)(2))

    mylist.foreach(println)
    var sum: Int = 0
    mylist.foreach(sum += _)
    println(sum)

    for (i <- name) {
      println(i)
    }
     */

    // Sets
    /* Can't have duplicate values.
    Can be mutable or immutable. My default they are immutable
    Not ordered
    */
    /*

    val myset: Set[Int] = Set(1,2 ,3, 4, 5, 5) // Immutable
    val myset2 = scala.collection.mutable.Set(1, 2, 3)
    val myset3: Set[Int] = Set(1, 2, 12, 11, 15)
    val names: Set[String] = Set("Max", "Tom", "James")

    println(myset + 10)
    println(myset)
    println(myset(3)) // checks to see if 3 is in the set or not

    println(myset2)
    println(myset2 += 4 )
    println(myset2 -= 2 )

    println(myset.head)
    println(myset.tail)
    println(myset.isEmpty)

    println(myset ++ myset3)
    println(myset.++(myset3))

    println(myset.&(myset3)) // Shows intersection
    println(myset.intersect(myset3)) // Shows intersection

    println(myset.max)
    println(myset.min)

    myset.foreach(println(_))

    for (name <-names) {
      println(name)
    }
     */

    // Maps
    // Immutable and mutable type
    /*

    val mymap: Map[Int, String] =
      Map(801 -> "Max", 802 -> "Tom", 804 -> "July", 804 -> "Howard")
    // Cant have duplicates, it will be overwritten
    val mymap2: Map[Int, String] =
      Map(805 -> "Lua")

    val mymap3: Map[String, String] = Map(("Name", "Abdul"), ("Age", "Unknown"))

    println(mymap)
    println(mymap(802))
    println(mymap.keys)
    println(mymap.values)
    println(mymap.isEmpty)

    mymap.keys.foreach { key =>
      println("key: " + key)
      println("value: " + mymap(key))
    }

    println(mymap.contains(801))
    println(mymap ++ mymap2)

    println(mymap3)
    mymap3 += ("Hometown" -> "Queens")
    println(mymap3)
    mymap3 += ("Age" -> "23")
    println(mymap3)
    mymap3 -= ("Age")
    println(mymap3)
     */

    // Tuples
    // Contains elements of multiple data type
    // Immutable
    // No more than 22 elements
    /*
    val mytuple = (1, "a", 1.3, "call", true)
    val mytuple2 = new Tuple5(1, "a", 1.3, "call", true)
    val mytuple3 = new Tuple3(1, "a", (1.3, 2))
    println(mytuple)
    println(mytuple._1) //starts at 1 not 0

    mytuple.productIterator.foreach{
      i => println(i)
    }

    println(1 -> "Tom") // Creates a TWO element tuple only
    println(1 -> "Tom" -> true) // Creates a TWO element tuple only

    println(mytuple3._3._1)
     */

    // Options (Some or None)
    /*
    val lst = List(1, 2, 3)
    val mymap = Map(1-> "Tom", 2 -> "Max", 3 -> "John")
    val opt : Option[Int] = Some(5)

    println(lst.find(_ > 6))
    println(lst.find(_ > 6).getOrElse(0))
    println(lst.find(_ > 1)) //Gives first result
    println(lst.find(_ > 1).get)

    println(mymap.get(1).get)
    println(mymap.get(6).getOrElse("No name found"))
    println(mymap.get(6).getOrElse())

    println(opt.get)
     */

    // Map and Filter
    /*
    val lst = List(1, 2, 3, 4, 5, 6, 7, 12)
    val mymap = Map(1-> "Tom", 2 -> "Max", 3 -> "John")

    println(lst.map(_ * 2))
    println(lst.map(x => x * 2))
    println(lst.map(x => "Hi: " + x))
    println(lst.map(x => "Hi: " * x))

    println(mymap.map(x => "Hi: " + x)) // Each iteration of x is a tuple
    println(mymap.mapValues(x => "hi" + x).view.force)
    println("hello".map(_.toUpper))

    println(List(List(1,2,3), List(3,4,5)).flatten)
    println(lst.flatMap(x => List(x, x +1)))
    println(lst.map(x => List(x, x +1)))

    println(lst.filter(x => x % 2 == 0))
    */

    // Reduce, fold or scan
    /*
    val lst = List(1, 2, 3, 5, 7, 10, 13)
    val lst2 = List("A", "B", "C")

    // Iterates through the list, allows you to operate
    println(lst2.reduceLeft(_ + _ ))
    println(lst.reduceLeft(_ + _ ))
    println(lst.reduceLeft((x, y) => {println(x +" , " + y); x+y; }))

    println(lst.reduceRight(_ - _ ))
    println(lst.reduceLeft(_ - _ ))
    println(lst.reduceRight((x, y) => {println(x +" , " + y); x+y; }))

    // Provides a start value
    println(lst.foldLeft(100)(_ + _ ))
    println(lst2.foldLeft("z")(_ + _ ))

    // shows each iteration in a list
    println(lst.scanLeft(100)(_ + _ ))
    println(lst2.scanLeft("z")(_ + _ ))
    */

    // Lazy evaluation
    /*
    val e = 9
    lazy val l = 9 // Not initialized
    println(l) // l is evaluated

    val x = new strict;
    val y = new LazyEval;

    println(x.e)
    println(y.l)

    val add = (a: Int, b: Int) => {
      println("Add")
      a + b
    }
    nonLazy(add(5,6))
    lazy1(add(5,6))
    */
  }
}
