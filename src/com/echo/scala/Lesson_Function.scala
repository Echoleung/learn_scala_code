package com.echo.scala

import java.util.Date

object Lesson_Function {
  def main(args: Array[String]): Unit = {
    /**
     * 1. 方法定义
     *  1). 方法体中的最后返回值可以使用return，那么方法定义中的返回值类型一定要指定
     *  2). 如果方法体中没有return，默认将方法体的最后一行的计算结果当作返回值返回。法体的返回值可以省略，会自动推断返回值的类型
     *  3). 定义方法传入的参数一定要指定类型
     *  4). 方法的方法体如果可以一行搞定，那方法体的{}可以省略
     *  5). 如果定义方法时省略方法名称和方法体之间的等号，那么无论方法体最后一行的结果是什么都会被丢弃返回Unit
     * @param
     * @param
     * @return
     */
//    def max(x: Int, y: Int): Int = {
//      if (x > y)
//        return x
//      else
//        return y
//    }
//
//    //定义是不指定返回值类型，不使用return
//    def min(x: Int, y: Int) = {
//      if (x < y)
//        x
//      else
//        y
//    }
//
//    val result: Int = max(99, 100)
//    println(result)

    /**
     * 2. 递归方法
     * 递归方法要显示声明返回值类型
     */
//    def fun(num:Int):Int = {
//      if(num ==1){
//        1
//      }
//      else{
//        num*fun(num-1)
//      }
//    }
//
//    println(fun(5))

    /**
     * 3. 参数有默认值的方法
     */
//    def fun(a:Int=10,b:Int=20) = {
//      a+b
//    }
//
//    println(fun())//默认
//    println(fun(100,200))//指定
//    println(fun(200))
//    println((fun(b=200)))//指定部分

    /**
     * 4. 可变长参数的方法
     */
//    def fun(s:String*) = {
//      for(elem<-s){
//        println(elem)
//      }
//    }
//
//    println(fun("hello","a","b"))

    /**
     * 5. 匿名函数
     * "=>"就是匿名函数，多用于方法的参数是函数时，常用匿名函数
     */
//    def fun = (a:Int,b:Int) => {
//      a+b
//    }

    /**
     * 6. 嵌套方法
     */
//    def fun(num:Int)={
//      def fun1(a:Int):Int = {
//        if(a==1){
//          1
//        }
//        else{
//          a*fun1(a-1)
//        }
//      }
//      fun1(num)
//    }
//
//    println(fun(5))

    /**
     * 7. 偏应用函数
     *    某些情况下变量参数非常多，调用这个方法非常频繁，每次调用只有固定的某个参数变化，其他都不变，可以定义偏应用实现
     */
//    def showLog(date:Date,log:String)={
//      println(s"data is $date ,log is $log")
//    }
//
//    val date = new Date()
//    showLog(date,"a")
//    showLog(date,"b")
//    showLog(date,"c")
//
//    def fun = showLog(date,_:String)
//    fun("aaa")
//    fun("bbb")
//    fun("ccc")

    /**
     * 8. 高阶函数
     *  1). 方法的参数是函数
     *  2). 方法的返回是函数，<必须显式地写出函数的返回值类型，加 _ 可以不显式地声明方法的返回值类型>
     *  3). 方法的参数和返回都是函数
     */
    //方法的参数是函数
//    def fun(a:Int,b:Int)={
//      a+b
//    }
//
//    def fun1(f:(Int,Int) => Int,s:String)={
//      var i = f(100, 200)
//      i+"#"+s
//    }
//
//    val result = fun1(fun, "scala")//直接调用函数
//    val result1 = fun1((a:Int,b:Int)=>{a*b},"scala")//使用匿名函数
//    println(result)
//    println(result1)
    //方法的返回是函数
//    def fun(s:String):(String,String)=>String={
//      def fun1(s1:String,s2:String):String = {
//        s1+"~"+s2+"#"
//      }
//      fun1
//    }

//    def fun(s:String)={
//      def fun1(s1:String,s2:String):String = {
//        s1+"~"+s2+"#"
//      }
//      fun1 _
//    }
//    println(fun("hello")("sca","la"))
  //参数和返回值都是函数
//    def fun(f:(Int,Int)=>Int):(String,String)=>String = {
//      val i = f(1, 2)
//      def fun1(s1:String,s2:String):String = {
//        s1+s2+i
//      }
//      fun1
//    }
//
//    val result = fun((a: Int, b: Int) => {
//      a * b
//    })("hello", "Scala")
//    println(result)
    /**
     * 9. 柯里化函数
     */
//    def fun(a:Int,b:Int)(c:Int,d:Int)={
//      a+b+c+d
//    }
//
//    println(fun(1, 2)(3, 4))


  }
}

