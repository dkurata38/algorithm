package com.github.dkurata38.algorithm.date_20190616

import scala.annotation.tailrec
import scala.io.StdIn

object VoteMain extends App {
  val N = StdIn.readInt()
  val SList = (1 to N).map(_ => StdIn.readLine())

  @tailrec
  def count(voteList: List[String], accum: Map[String, Int] = Map.empty): Map[String, Int] = voteList match {
    case Nil => accum
    case head::tail => accum.get(head) match {
      case Some(value) => count(tail, accum + (head -> (value + 1)))
      case None => count(tail, accum + (head -> 1))
    }
  }

  val voteResult = count(SList.toList)
  val winner = voteResult.maxBy{case(_, count) => count}
  println(winner._1)
}
