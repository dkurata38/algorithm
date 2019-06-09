import scala.annotation.tailrec
import scala.io.StdIn

object PrimeMain extends App {
  val n = StdIn.readLine().toInt

  @tailrec
  def a(current: Int = 2, accum: List[Int] = List.empty): List[Int] = {
    if (accum.size == n) accum else {
      if(isPrime(current)) {
        a(current + 1, accum :+ current)
      } else {
        a(current + 1, accum)
      }
    }
  }

  def isPrime(num: Int) = if (num == 1) false else (2 until num).forall(e => num % e != 0)

  a().foreach(println(_))
}
