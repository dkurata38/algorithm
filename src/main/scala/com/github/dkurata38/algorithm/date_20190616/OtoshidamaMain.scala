package com.github.dkurata38.algorithm.date_20190616

import scala.annotation.tailrec
import scala.io.StdIn

object OtoshidamaMain extends App {
  val inputs = StdIn.readLine().split(" ")
  val N = inputs(0).toInt
  val Y = inputs(1).toInt

  if (Y > N * 10000 || Y < N * 1000) {
    println("-1 -1 -1")
  } else {
    val max_10000 = Y / 10000
    val combi_10000_5000 =
    for {
      c_10000 <- 0 to max_10000
      c_5000 <- 0 to N - c_10000
    } yield (c_10000, c_5000)

    @tailrec
    def rec(combi_10000_5000: List[(Int, Int)]): Option[(Int, Int, Int)] = combi_10000_5000 match {
      case Nil => None
      case head::tail =>
        val c_10000 = head._1
        val c_5000 = head._2
        val c_1000 = N - c_10000 - c_5000
        if (c_10000 * 10000 + c_5000 * 5000 + c_1000 * 1000 == Y) {
          Some(c_10000, c_5000, c_1000)
        } else {
          rec(tail)
        }
    }

    rec(combi_10000_5000.toList) match {
      case Some((_1, _2, _3)) => println(_1 + " " + _2 + " " + _3)
      case None => println("-1 -1 -1")
    }
  }
}
