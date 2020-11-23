package com.echo.scala

/**
 * @Auther: Echoleung
 * @Date: 2020/11/23 - 2:26 下午
 * @Description: com.echo.scala
 * @Version: 1.0
 */
class Animal(name:String){
  def canFly()={
    println(s"$name can fly...")
  }

}

class Rabbit(xname:String){
  val name = xname
}

object Lesson_ImplicitTrans2 {
  //隐式转换函数
  implicit def rabbitToAnimal(r:Rabbit):Animal={
    val n = new Animal(r.name)
    n
  }
  def main(args: Array[String]): Unit = {
    val rabbit = new Rabbit("rabbit")
    rabbit.canFly()
  }
}
