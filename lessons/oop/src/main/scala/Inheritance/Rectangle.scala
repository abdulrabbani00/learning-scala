package Inheritance

class Rectangle(var width: Double, var height: Double)
  extends Polygon with Shape with otherShape {
  override def area: Double = width * height // When overriding an abstract class, override is not needed
  def color: String = "red"
  def name: String = "rect"

}
