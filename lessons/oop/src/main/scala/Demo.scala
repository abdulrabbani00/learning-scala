
// var getter setter
// val getter ------
// default ----- ------

/*            Getter?     Setter?
 ---------    -------     -------
var           yes         yes
val           yes         no
default       no          no
*/

class User(var name: String, var age: Int, private val sex: String) {
  def printSex = {
   println(sex)
  }
};

// Use auxillory Constructor
class UserAux(var name: String, var age: Int) {
  def this() = {
    this("Tom", 32)
  }

  def this(name: String) = {
    this(name, 32)
  }
};

object Demo {
  def main(args: Array[String]) = {
    // Class Basics
    /*
    var user = new User("Max", 28, "Male");
    println(user.name)
    println(user.age)
    user.name = "Tom"
    user.age = 12
    println(user.name)
    println(user.age)
    user.printSex
    */

    // Auxillory Classes - Constructor
    /*
    var user2 = new UserAux("Abdul", 28)
    var user3 = new UserAux()
    var user4 = new UserAux("Gerina")
    */


  }

}
