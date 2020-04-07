package com.pal.sanjeet
import java.util.Date
import Array._
object basic_2 {
  
  var number=10
  val arr:Array[Int]=new Array[Int](4)
  val arr2=new Array[Int](5)
  val arr3=Array(1,2,3,5,6,7)
  
  
  
  
  def main(args: Array[String]) {
    /* array in scala */
    
    arr(0)=78
    arr(1)=99

    for(x <- arr){
      println(x)  
    }
    for(a<-0 to arr.size-1){
      println(arr(a))
    }
    println(arr(1))
    val concat_array=concat(arr,arr3)
    println(concat_array)
    /* list in scala */
    val list1:List[Any]=List(1,"sanjeet",2,5,4,8,5,74,55);
    val list2:List[Int]=List(7,8,9,5,6,2,5,6,4)
    println(list2.find(_>2).get)
    println(list1.head);
    println(list1.isEmpty)
    println(list1.reverse)
    println(List.fill(5)(2))
    println(list2.max)//only for same type of numeric data
    var sum:Int =0
    list2.foreach(sum += _)
    println(sum)    
    println("first"::list1 )    //pre pent first to list for this prinlt only
    
    
    /* maps in scala */
    val map1:Map[Int,String]=Map(222->"sanjeet",223->"pal",224->"saurab")
    println(map1)
    println(map1(224))
    println(map1.keySet)
    println(map1.keys)
    println(map1.values)
    
    
    map1.keys.foreach{
      key=>println("key"+key)
      println("values"+map1(key))
      
    }
    println(map1.isEmpty)
    println(map1.contains(224))
   
    
    /* tuples in scala */
    val tuple1=(1,2,3,("hello","sanjeet","pal","four"))
    val tuple2=new Tuple3(1,2,"sanjeet")//Tuple3 three is to decleared number of value in tuple
    println(tuple1._1)
    println(tuple1._2)
    println(tuple1._4._4)
    tuple1.productIterator.foreach(i=>println(i))
    println(tuple1)
    /* options in scala */
    val opt:Option[Int]=None
    println(map1.get(222).get)
    println(map1.get(789).getOrElse("no key found"))
    println(opt.isEmpty)
    
    /* map and filter in scala */
    println(list2.map(_ * 5))
    println(map1.map(x=>"some"+x))
    println("hello".map(_.toUpper))
    println(List(List(1,2,3),List(4,5,6)).flatten)
    println(list2.flatMap(x=>List(x,x+2)))
    
    println(list2.filter(x=>x/2==0))
      
    /* Reduce fold and scan */
    println(list2.reduceLeft(_+_)) //used to add it list type is int or concat if list type is String or any
    
    println(list2.reduceLeft((x,y)=>{println(x +" "+y);x+y}));
    println(list2.foldRight(159)(_+_))
    println(list2.scanRight(159)(_+_))
    
    
    /* classes in scala */
    var student=new Student("pal",22);
    println(student.getName)
    println(student.age)
    // for var getter and setter are present
    // for val only getter is present
    //for default no getter no setter is present 
    
    /* inheritance in scala */
    
    var parent=new Parent_Class;
    var child=new Child_Class
    display(child)
    
    def display(p:Parent_Class){
      println(p.pal)
    }
    
    /* Abstract class in scala */
   var abstract_class=new Abstract_implement_Class
   abstract_class.unimplemented_method()
    /* Lazy Evalution */
   lazy val l=9;
   //scala doennot support mutiple inheritance trait( interface) can be implemented using keyword with
   
    
    println("================================>")
    /* sets in scala we cannot duplicate value immutable*/
      val list_set:Set[Int]=Set(1,2,2,3,3,4,5,6,7,8,9) //immutable
      var list_set_mutable=scala.collection.mutable.Set(1,5,7,8,5,2,5,6,7);
      
    println(list_set+785)
    println(list_set(6))//check if present ornot
    println(list_set++list_set_mutable)
    println(list_set.++(list_set_mutable))
    println(list_set.&(list_set_mutable)+"present in both")//present in both or user intersect in place of .
    println(list_set.max)
    list_set.foreach(println) //print all the value
    
    
    /*lazy variable cannot allocate space until it  use a value */
    lazy val Lazy = 5000;
    var name = "sanjeet";

    println(Lazy * 10)
    println(s"$Lazy and $name") //not type safe
    println(f"$Lazy%d and $name%s") //type safe
    println(s"Hello \nworld")
    println(raw"hello \n world")
    if (Lazy == 500) println("equals to 500") else println("not equal to 500")
    var loop=500
    while(loop>490){println(loop); loop-=1;}
    loop=500;
    do{print(loop+"do"); loop-=1;}while(loop>490);
    for(i<- 1 to 5 ;j <- 1.to(2)) println(i+"nested for loop"+j)
    for(i<- 1.until(5)) println(i+"until")
    
    val lst=List(45,78,99,"sanjeet",true)
    for(i<-lst; if i=="sanjeet") println(i)
    val for_result=for{i<-lst if i=="sanjeet"} yield {
      i+"pal";
    }
    println("result in a list"+for_result);
    val age=20;
    age match{
      case 17=>println("age17"+age)
      case 20|100|78|99=>println("age20"+age)
      case 18=>println("age18"+age)
      case _=>println("default")
      
    }
    println(adding_two_numbers(100,99))
    
    println(Math.addExact(45, 89));
    println(Math sqrt 9 )
    println(adding_two_numbers())
    void_return(7, 7)
    /* anonymous function */
    
    var anon_value=(x:Int,y:Int)=>x*y;
    println(anon_value(4,2))
   /*scala -higher order function */
    
    var pal_result=pal(4,50,(x,y)=>x min y)
    var pal2_result=pal2(4,5,2,(x,y)=>x max y)
    var pal3_result=pal2(4,5,3,_+_)
    var pal4_result=pal2(4,5,6,_ max _)
    println(pal3_result)
    println(pal2_result)
    println(pal_result)
    /* partially applied  function */
    val partial_sum=(a:Int,b:Int,c:Int)=>a-b+c
    val partial_sum_complete=partial_sum(_:Int,2,_:Int)
    println(partial_sum_complete(5,7))
    
    
    var date=new Date;
    var log_value=log(date,_:String)   
    log_value("This is message forlog to println")
    log_value("This is second message forlog to println")
    println(date)
    
    
    
    /*closure used to use one or more variable which are declared outside the function*/
    println(closure_function_value(12))
    number=1000
    println(closure_function_value(12))
    println(number) /* closure can change  the value of a only(variable) not val declared outside the function */ 
    
    
    /* currying in scala: technique of transforming a function */
    println(curry_function(7)(5)+"currry")
    var curry_1=curry_function(7)
    println(curry_1(5)+"curry")
    var curry2_1=curry_function2(78)_
    println(curry2_1(7)+"curry")
    
    
    /* String in scala */
    
 
    
    
  }
  def  curry_function(x:Int)=(y:Int)=>x+y
  def curry_function2(x:Int)(y:Int)=x+y
  var closure_function_value=(x:Int)=>{number = x+number; number;}
  
  def log(date:Date,message:String)={
    println(date+" "+message)
  }
 
  
  def pal(x:Double,y:Double,f:(Double,Double)=>Double):Double=f(x,y)+x;
  def pal2(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double=f(f(x,y),z);
  
  def adding_two_numbers(x:Int=4,y:Int=2):Int={
//    return x+y;
    x+y;
  }
  def void_return(x:Int,y:Int):Unit={
    println(x+y)
  }
  
}


/* classes in scala */
class Student(private var name:String,var age:Int){
  /* Auxilary Coonstructors */
  def this(){
    this("sam",45);
  }
  def this(name:String){
    this(name,45)
  }
  //getter method
  def getName:String={return name;}
};
/* Inheritance */
class Parent_Class{
  def pal:Double=100;
}
class Child_Class extends Parent_Class{
  override def pal:Double=50;
}
/* abstract class in scala */
abstract class Abstract_Class{
  def unimplemented_method();
}
class Abstract_implement_Class extends Abstract_Class{
  def unimplemented_method()=78;
}



