package com.pal.sanjeet

import java.lang.Object
object basic {
  
  println("print statement outside main method")
  def main(args:Array[String]){
    var l:Long=10L
    val constant="pal"
    var name_string="sanjeet"
    println("long variable"+l.getClass());
    println("String variable"+name_string.getClass())
    println("this is a constant"+constant.getClass());
    
    var num1:Int =8;
    var num2:Int=7
    num1 = 67
    var result_var=num1+num2
    var nums=List(4,"sanjeet",78)
    var complex_list_contain_student_object=List(Student(5,"pal"),Student(marks=99),Student(name="sonu"))
    for(a<-0 to complex_list_contain_student_object.size-1){
      println(complex_list_contain_student_object(a).name);
    }
    
//    println(complex_list_contain_student_object(2).name)
    
    complex_list_contain_student_object.foreach{i:Any => println(i+" "+complex_list_contain_student_object.head.name)}
    val filter_student=complex_list_contain_student_object.filter(s=> s.marks>=60)
    val partition_student=complex_list_contain_student_object.partition(s=> s.marks>=60)
//    Tuples
    val tuple1=partition_student._1
    val tuple2=partition_student._2
    
    println("========================>")
    nums.drop(4)
   
    nums.foreach{ i:Any => println(i) };
    
    var reverse_num=nums.reverse
    
//    println(nums.getClass)
    for(n<-reverse_num){
      println(n);
    }
    
    println(result_var +" ")
    var student=Student(4,name="aman");
    var studnet2=Student(marks=45);
    var marks_greater:Boolean= student.>(studnet2);
    println(marks_greater)
  
  
    println(student.marks+" "+student.name+" "+student.rollno);
    student.online_method();
    student.multiline_method();
    
    
    
    l
    
    
    
    
  }
  
  case class Student(var rollno:Int=1,var name:String="Sanjeet":String,var marks:Int=456){
    def online_method()=println("single line method call:")
    def multiline_method(){
      println("multi line method line one");
      println("multi line method line two");
      
      
    }
    
    def >(student2:Student):Boolean=marks>student2.marks;
  }
  

  
 
}