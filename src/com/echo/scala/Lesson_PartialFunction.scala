package com.echo.scala

/**
 * 偏函数，只能匹配一个值，匹配上了返回某个值
 * PartialFunction[A,B] A时匹配的类型，B是匹配上返回的值
 */
object Lesson_PartialFunction {
  def MyTest:PartialFunction[String,Int]={
    case "abc" => 2
    case "a" => 1
    case _ => 200
  }
  def main(args: Array[String]): Unit = {
    val result = MyTest("abc")
    println(result)
  }
}
