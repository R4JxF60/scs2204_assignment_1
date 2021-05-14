import scala.math.Pi;

object Sphere extends App {
  // volume calculator
  def calVolume(r:Double):Double = (4/3)*Pi*r*r*r;

  // printing sphere volume
  println(calVolume(5));
}
