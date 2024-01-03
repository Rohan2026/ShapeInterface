
/**
 * Write a description of class Dodecagon here.
 * Its got 12 sides
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dodecagon implements Shape
{
  private String color;
  private int sidelength;
  public Dodecagon(String color, int sidelength)
  {
      this.color=color;
      this.sidelength=sidelength;
  }
     /**
   * Computes the area of the shape
   * 
   * @return    The computed area
   */
  public double getArea()
  {
      return 5;
  }

  /**
   * Computes the perimeter of the shape
   * 
   * @return    The computed perimeter
   */
  public double getPerimeter()
  {
      return this.sidelength * 12;
  }

  /**
   * Gets the shape's color
   * 
   * @return    The color
   */
  public String getColor()
  {
      return this.color;
  }
}
