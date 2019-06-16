package com.github.dkurata38.algorithm.date_20190609

import scala.annotation.tailrec
import scala.io.StdIn

object FibMain extends App {
  val n = StdIn.readLine().toInt

  @tailrec
  def a(last: Int = 0, lastBefore: Int = 0, accum: List[Int] = List.empty): List[Int] = {
    val count = accum.size
    if (n == count) accum
    else {
      if (count == 0) {
        a(1, 0, accum :+ 1)
      } else {
        a(last + lastBefore, last, accum :+ (last + lastBefore))
      }
    }
  }

  a().foreach(println(_))
}
