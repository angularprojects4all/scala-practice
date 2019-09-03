package com.test.model

object Sample {
  
  def main(args: Array[String]): Unit = {
	  //biggest
	  val numbers = List(1,2,3,4,5,5,10,3,4);
	  println(numbers.foldLeft(0)(_ max _))
  }
  
}