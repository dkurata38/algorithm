import scala.io.StdIn

object SumMain extends App {
  val N = StdIn.readLine().toInt
  val A = StdIn.readLine().toInt
  val B = StdIn.readLine().toInt

  val numbers = for {
    number <- 1 to N if (number.toString.toCharArray.map(c => c.toString.toInt).sum >= A
      && number.toString.toCharArray.map(c => c.toString.toInt).sum <= B)
  } yield number

  println(numbers.sum)
}