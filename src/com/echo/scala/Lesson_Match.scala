package com.echo.scala

/**
 * Match模式匹配
 * 1. case _ 什么都匹配不上，放在最后
 * 2. match可以匹配值还可以匹配类型
 * 3. 匹配过程中会有数值类型的转换
 * 4. 从上往下匹配，匹配上会终止
 * 5. 模式匹配外部的括号”{}“可以省略
 */
object Lesson_Match {
  def main(args: Array[String]): Unit = {
    val tp = (1,1.0,"abc",'a',true)
    val iter = tp.productIterator
    //iter.foreach(s=>{MatchTest(s)})
    iter.foreach(MatchTest)
  }

  def MatchTest(o:Any)={
    o match {
      case 1=>println("value is 1")
      case i:Int => println(s"Type is Int,value = $i")
      case d:Double=>println(s"type is Double,value is $d")
      case s:String=>println(s"type is String,value is $s")
      case 'a'=>println("value is c")
      case _ => {println("no match...")}
    }
  }
}
