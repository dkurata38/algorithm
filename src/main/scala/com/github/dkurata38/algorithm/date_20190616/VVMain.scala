package com.github.dkurata38.algorithm.date_20190616

import scala.io.StdIn

object VVMain extends App {
  val meter = StdIn.readInt()
  if (meter < 100) {
    println("00")
  } else if (meter < 1000) {
    println("0" + (meter / 100))
  } else if (meter < 5000) {
    println(meter / 100)
  } else if (meter < 30000) {
    println(meter / 1000 + 50)
  } else if (meter >= 35000 && meter <= 70000) {
    println((meter / 1000 - 30) / 5 + 80)
  } else if (meter > 70000) {
    println("89")
  }
}
