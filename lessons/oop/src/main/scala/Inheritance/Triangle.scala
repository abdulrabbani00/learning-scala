package Inheritance

class Triangle(var width: Double, var height: Double)
  extends Polygon with Shape {
  def area: Double = width * height / 2
  def color: String = "Green"
}
