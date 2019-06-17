package com.github.dkurata38.algorithm.date_20190616

import scala.annotation.tailrec
import scala.io.StdIn

object CakesAndDonutsMain extends App {
  val c_price = 7
  val d_price = 4
  val N = StdIn.readInt()

  @tailrec
  def rec(c_count: Int = 0): Boolean = {
    if (c_count * c_price > N) {
      false
    } else {
      if ((N - (c_count * c_price)) % d_price == 0) {
        true
      } else {
        rec(c_count + 1)
      }
    }
  }

  val result = rec()
  if (result) {
    println("Yes")
  } else {
    println("No")
  }
}
