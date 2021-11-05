object HelloWorld {
  def main(args: Array[String]) {
    val name = "mark"
    val age = 80.5
    println(name + " is " + age + " years old ")
    println(s"$name is $age years old") //s string interpolation
    println(f"$name%s is $age%f years old") //type safe
    println(s"Hello \nworld")
    println(raw"Hello \nworld")
  }
}
