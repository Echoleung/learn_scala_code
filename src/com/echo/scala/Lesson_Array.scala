package com.echo.scala

object Lesson_Array {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.ArrayBuffer //导入可变数组包
     var arr = ArrayBuffer[Int](1,2,3)
    arr.+=(4)//加在尾部
    arr.+=:(100)//加在头部
    arr.append(7,8,9)
    arr.foreach(println)

//    val arr = Array[String]("a","b","c")
//    val arr1 = Array[String]("d","e")
//
//    val array: Array[String] = Array.fill(5)("Scala")//初始化包含5个Scala字符串的一个数组
//    array.foreach(println)

//    val arrays = Array.concat(arr, arr1)//合并String
//    arrays.foreach(println)

//    val array = new Array[Array[Int]](3)//二维数组
//    array(0) = Array[Int](1,2,3)
//    array(1) = Array[Int](4,5,6)
//    array(2) = Array[Int](7,8,9)

//    for(arr<-array){//二维数组遍历
//      arr.foreach(println)
//    }
//    for(arr<-array;elem<-arr){//写法二
//      println(elem)
//    }
//    array.foreach(arr=>{arr.foreach(println)})//写法三

//    val arr1 = new Array[Int](3)//[]里是类型,()里是长度；默认初始值的0；不能追加元素
//    arr1(0) = 100//赋值不能使用[]，要用()
//    arr1(1) = 200
//    arr1(2) = 300
//    arr1.foreach(println)
    //arr.foreach(println)
//    for(elm<-arr){
//      println(elm)
//    }
  }
}
