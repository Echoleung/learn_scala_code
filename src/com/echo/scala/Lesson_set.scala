package com.echo.scala

import scala.collection.mutable

object Lesson_set {
  def main(args: Array[String]): Unit = {
    import collection.mutable.Set //可变
     val set = Set[Int](1,2,3)
    set.+=(100)
    set.foreach(println)

//    val set = Set[Int](1,2,3,4,5,3)//有去重功能
//    val set1 = Set[Int](3,4,5,6)

//    val result = set.filter(elem => {
//      elem > 4
//    })//按条件过滤
//    result.foreach(println)

//    val result = set.diff(set1)//差集或者使用&~符号
//    result.foreach(println)

//    val result: Set[Int] = set.intersect(set1)//交集或者用&符号
//    result.foreach(println)


//    for(elem<-set){
//      println(elem)
//    }
//    set.foreach(println)
  }
}
