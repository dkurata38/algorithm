import scala.io.StdIn

object CardMain extends App {
  val N = StdIn.readLine().toInt
  val a = StdIn.readLine().split(",").map(s => s.trim.toInt)

  val result = (0 to N - 1).foldLeft((0, 0, a)){
    case((alice: Int, bob: Int, rest: Array[Int]), index: Int) if (index % 2 == 0) => {
      val max = rest.zipWithIndex.reduce((o1 , o2) => if (o1._1 > o2._1) o1 else o2)
      (alice + max._1, bob, rest.zipWithIndex.filterNot(e => e._2 == max._2).map(e => e._1))
    }
    case((alice: Int, bob: Int, rest: Array[Int]), index: Int) if (index % 2 == 1) => {
      val max = rest.zipWithIndex.reduce((o1 , o2) => if (o1._1 > o2._1) o1 else o2)
      (alice, bob + max._1, rest.zipWithIndex.filterNot(e => e._2 == max._2).map(e => e._1))
    }
  }
  println(result._1 - result._2)
}
