package com.echo.scala

/**
 * trait中可以有方法体的实现或者不实现，类继承了trait要实现trait中未实现的方法
 */
trait IsEqule{
   def isEqu(o:Any):Boolean//未实现
   def isNotEqu(o:Any):Boolean = !isEqu(o:Any)//已经实现

}

class Point(xx:Int,yy:Int) extends IsEqule {
  val x = xx
  val y = yy

  override def isEqu(o: Any): Boolean = {
    o.isInstanceOf[Point]&&o.asInstanceOf[Point].x == this.x
  }
}

object Lesson_Trait2 {
  def main(args: Array[String]): Unit = {
    val p1 = new Point(1,2)
    val p2 = new Point(1,3)

    println(p1.isEqu(p2))
  }
}
