package com.echo.scala

import scala.collection.mutable

object Lesson_map {
  def main(args: Array[String]): Unit = {

    import scala.collection.mutable.Map //定义可变
    val map = Map[String,Int]()
    map.put("a",100)
    val result: mutable.Map[String, Int] = map.filter(tp => {
      val key = tp._1
      val value = tp._2
      value == 200
    })

//    val map1 = Map[String,Int](("a",1),("b",2),("c",3),("d",4))
//    val map2 = Map[String,Int](("a",100),("b",2),("c",300),("e",500))
//    val result: Map[String, Int] = map1.++(map2)//map2进入map1，要进行替代
//    val result: Map[String, Int] = map1.++:(map2)//map1进入map2，要进行替代

//    val map = Map[String,Int]("a"->100,"b"->200,("c",300),("c",400))
    //val option = map.get("a")//返回option类型
    //val option = map.get("aa")//返回None
    //val option = map.get("aa").getOrElse("No Find")//未找到时输出信息
    //println(option)
    //val value = map.get("a").get//返回100
    //val value = map.get("aa")//返回None

//    val keys: Iterable[String] = map.keys//Iterable是所有集合的接口，这可以获取map的所有key
//    keys.foreach(key=>{
//      val value = map.get(key).get
//      println(s"key = $key ,value = $value")
//    })

//    val values: Iterable[Int] = map.values//获取所有的value值
//    values.foreach(println)

    //println(value)

//    println(map)
//    for(elem<-map){
//      println(elem)
//    }
//    map.foreach(println)
  }
}
