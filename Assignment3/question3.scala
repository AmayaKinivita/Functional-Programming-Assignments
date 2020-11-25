object question3 { 
      
   def main(args: Array[String]): Unit= {
 
	def sum(n:Int):Int={
    	    n match{
            case 1 => n
            case _ => n+sum(n-1)
            }
        }

  	println("Enter a number to get the sum : ")
  	val number=scala.io.StdIn.readInt()
  	println(sum(number))

 }

}