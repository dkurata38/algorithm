package com.github.dkurata38.algorithm.date_20190609

import scala.annotation.tailrec
import scala.io.StdIn

object DivMain extends App {
  val n = StdIn.readLine().toInt

  @tailrec
  def a(division: Int = 1, accum: List[Int] = List.empty): List[Int] = {
    if (division > n) accum else {
      if (n % division == 0) a(division + 1, accum :+ division) else a(division + 1, accum)
    }
  }

  a().foreach(println(_))
}
