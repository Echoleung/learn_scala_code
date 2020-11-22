package com.echo.scala

/**
 * tuple最多支持23个元素
 * 元组可以new也可以不new，甚至可以直接在（）写元素
 */
object Lesson_Tuple {
  def main(args: Array[String]): Unit = {
    val tuple1 = new Tuple1("Hello")
    val tuple2: (String, Int) = new Tuple2("a", 100)
    val tuple3: (Int, Boolean, Char) = new Tuple3(1, true, 'C')
    val tuple4: (Int, Double, String, Boolean) = Tuple4(1, 3.4, "abc", false)
    val tuple6: (Int, Int, Int, Int, Int, String) = (1, 2, 3, 4, 5, "abc")

    //取值
    tuple1._1
    tuple6._6

    //遍历，不能直接foreach，for循环
//    val iter: Iterator[Any] = tuple6.productIterator
//    while(iter.hasNext){
//      println(iter.next())
//    }
//    iter.foreach(println)
  }
}
