package com.github.dkurata38.algorithm.date_20190619

import scala.io.StdIn

object CoinMain extends App {
  val A = StdIn.readLine().trim.toInt
  val B = StdIn.readLine().trim.toInt
  val C = StdIn.readLine().trim.toInt
  val X = StdIn.readLine().trim.toInt

  val maxA = if (X / A * 500 > 50) 50 else X / A * 500
  val maxB = if (X / A * 100 > 50) 50 else X / A * 100
  val maxC = if (X / A * 50 > 50) 50 else X / A * 50

  val results =
  for {
    _500 <- 0 to maxA
    _100 <- 0 to maxB
    _50 <- 0 to maxC
  } yield {
    val amount = _500 * 500 + _100 * 100 + _50 * 50
    if (amount == X) 1 else 0
  }

  val count = results.count(n => n == 1)

  println(count)
}
