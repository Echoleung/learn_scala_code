package com.echo.scala

/**
 * @Auther: Echoleung
 * @Date: 2020/11/23 - 2:09 下午
 * @Description: com.echo.scala
 * @Version: 1.0
 */
object Lesson_ImplicitTrans {
  //部分参数隐式需要使用柯里化
  def sayName(age:Int)(implicit name:String)={
    println(s"$name is a $age years old student...")
  }

//  def sayName(implicit name:String)={
//    println(s"$name is a student...")
//  }
  def main(args: Array[String]): Unit = {
    implicit val name = "zhangsan"//只能定义一个，定义多个运行会报错
    sayName(12)

  }
}
