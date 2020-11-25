object question1 { 
      
   def main(args: Array[String]): Unit= { 
      var normal_hr = 40
      var ot_hr = 20

      val total = normal_hr * 150 + ot_hr * 75

      val salary = total*0.9

      println("Salary = " +salary)
 
       }

} 

//150- normal, 75-OT
//Typically 40- normal, 20- OT
//Tax= 10% hr per week