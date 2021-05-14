object Cost extends App {

  // cover cost calculator
  def coverCost(z:Int):Double = 24.95 * 0.60 * z;

  // shipping cost calculator
  def shipCost(x:Int):Double = if(x>50) 3+(x-50)*0.75 else 3;

  // wholesale cost calculator
  def wholesaleCost(bookCount:Int):Double = coverCost(bookCount)+shipCost(bookCount);

  // printing
  println(wholesaleCost(60));
}
