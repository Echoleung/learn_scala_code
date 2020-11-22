package com.echo.scala

import scala.collection.mutable.ListBuffer

object Lesson_List {
  def main(args: Array[String]): Unit = {
     val list = ListBuffer[Int](1,2,3)
    list.+=:(100)
    list.append(4,5,6)
      list.foreach(println)

//    val list = List("hello Scala","hello Java","hello Spark")
//    val result: Int = list.count(s => {
//      s.length > 4
//    })//统计满足（）内要求的数量
//    println(result)

//    val result: List[String] = list.filter(s => "hello Scala".equals(s))
//    result.foreach(println)//filter方法，true的留下

//    val result: List[String] = list.flatMap(s => {
//      s.split(" ")
//    })//flatMap方法，一对多的关系
//    result.foreach(println)

//    val result: List[Array[String]] = list.map(s => {
//      s.split(" ")
//    })//map方法，一对一的关系
//    result.foreach(arr=>{arr.foreach(println)})

    //val list = List(1,2,3,"a",true)//不建议这么做
//    val list = List[Int](1,2,3,4,5)

//    list.foreach(println)
//    for(elem<-list){
//      println(elem)
//    }
  }
}
