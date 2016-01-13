public class Vector2D 
{
  private double xVal, yVal;
  
  public Vector2D(double xVal, double yVal)
  {
    this.xVal = xVal;
    this.yVal = yVal;
  }
  
  public double getX()
  {
    return xVal;
  }
  public double getY()
  {
    return yVal;
  }
  
  public double distance(Vector2D v)
  {
    return Math.sqrt((Math.pow((v.getX() - xVal), 2)+Math.pow((v.getY() - yVal), 2)));
  }
}
