package com.echo.scala

/**
 * 一个类继承多个trait时，第一个关键字使用extends，其他的使用with
 * trait不可以传参
 */
trait Read{
  def read(name:String)={
    println(s"$name is reading...")
  }
}
trait Listen{
  def listen(name:String)={
    println(s"$name is listen...")
  }
}

//继承只能第一个用extends，其他的用with
class Human extends Read with Listen{

}

object lesson_Trait1 {
  def main(args: Array[String]): Unit = {
    val h = new Human
    h.read("zhangsan")
    h.listen("lisi")
  }
}
