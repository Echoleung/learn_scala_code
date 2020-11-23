package com.echo.scala

/**
 * @Auther: Echoleung
 * @Date: 2020/11/23 - 2:36 下午
 * @Description: com.echo.scala
 * @Version: 1.0
 */
class Rabbit1(xname:String){
  val name = xname
}


object Lesson_ImplicitTrans3 {
  implicit class Animal1(r:Rabbit1){
    def showName()={
      println(s"${r.name} is Rabbit")
    }
  }

  def main(args: Array[String]): Unit = {
    val rabbit = new Rabbit1("RABBIT")
    rabbit.showName()
  }
}
