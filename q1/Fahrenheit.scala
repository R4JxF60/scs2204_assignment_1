object Fahrenheit extends App {
  // coverter function
  def convert(c:Double):Double = c * 1.80 + 32;
  
  // printing
  println(convert(35));
}
