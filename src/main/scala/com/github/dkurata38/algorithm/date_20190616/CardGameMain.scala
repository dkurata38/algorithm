package com.github.dkurata38.algorithm.date_20190616

import scala.annotation.tailrec
import scala.io.StdIn

object CardGameMain extends App {
  val N = StdIn.readInt()
  val cards = StdIn.readLine().split(" ").map(_.toInt)

  val sortedCards = cards.sorted.reverse

  @tailrec
  def rec(cards: List[Int], index: Int = 0, accum: (Int, Int) = (0, 0)): (Int, Int) = cards match {
    case Nil => accum
    case head::tail if index % 2 == 0 => rec(tail, index + 1, (accum._1 + head, accum._2))
    case head::tail => rec(tail, index + 1, (accum._1, accum._2 + head))
  }

  val points = rec(sortedCards.toList)
  println(points._1 - points._2)
}
