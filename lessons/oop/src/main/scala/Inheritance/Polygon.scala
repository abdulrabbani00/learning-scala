package Inheritance

// May contain abstract and non abstract methods
// At least 1 method must be abstract
trait Shape {
  def color: String
}

trait otherShape {
  def name: String
}

abstract class Polygon {
  def area: Double // If you dont provide a body, the method must be specified in the subclass
  //def area: Double = 0.0;
}

object Polygon {
  def main(args: Array[String]) = {
    //var poly = new Polygon // Can't instantiate abstract class
    var rect = new Rectangle(10, 12)
    var tri = new Triangle(10, 12)
    // printArea(poly)
    printArea(rect)
    println(rect.color)
    printArea(tri)
    println(tri.color)
  }

  def printArea(p: Polygon) = {
    println(p.area)
  }
}
