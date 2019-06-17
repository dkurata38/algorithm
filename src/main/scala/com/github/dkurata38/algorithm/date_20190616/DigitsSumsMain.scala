package com.github.dkurata38.algorithm.date_20190616

import scala.io.StdIn

object DigitsSumsMain extends App {
  val N = StdIn.readInt()
  val S = N.toString.toCharArray.map(_.toString.toInt).sum

  if (N % S == 0) {
    println("Yes")
  } else {
    println("No")
  }
}
