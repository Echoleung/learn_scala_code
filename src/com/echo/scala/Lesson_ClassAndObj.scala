package com.echo.scala

/**
 * Scala:
 * 1. Scala object相当于java中的单例，object中定义的全是静态的,相当于java的工具类
 * 2. Scala中定义变量使用var,定义常量使用val，变量可变，常量不可以;变量常量类型可以不写，会自动推断
 * 3. Scala中每行后面都有分号推断机制，不用显式写出“;”
 * 4. Scala中命名建议使用驼峰命名
 * 5. Scala类中可以传参，传参一定要指定类型，有了参数就有了构造；类中的属性默认有get和set方法；Object不能传参，除非有apply()
 * 6.类中重写构造时，构造中第一行必须先调用默认的构造:def this(...)
 * 7. Scala中当new class时，类中除了方法不执行【除了构造方法】，其他都执行
 * 8. 在同一个Scala文件中，class名称和Object名称一样时，这个类叫做这个对象的伴生类，这个对象叫做这个类的伴生对象，他们之间可以互相访问私有变量
 */

class Person(xname:String,xage:Int){
  val name = xname
  val age = xage
  var gender = 'M'

  println("********** Person Class ***********")

  def this(yname:String,yage:Int,ygender:Char){
    this(yname,yage)
    this.gender = ygender

  }

  def sayName() = {
    println("hello world...")
  }

  println("========== Person Class ==========")

}

object Lesson_ClassAndObj {
  println("########### Lesson_ClassAndObj Class ###########")

  def main(args: Array[String]): Unit = {
    val p = new Person("zhangsan",20)
//    val p1 = new Person("wangwu",20,'F')
//    println(p.gender)
//    println(p1.gender)
//    println(p.name)
//    println(p.age)
//    p.sayName()
//    val  a = 100
//    var b = 200
//    b = 300
//    println(a)
  }

}
