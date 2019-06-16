package com.github.dkurata38.algorithm.date_20190616

import scala.io.StdIn

object KagamimochiMain extends App {
  val X = StdIn.readInt()
  val count = (1 to X).map(_ => StdIn.readInt()).distinct.size
  println(count)
}
