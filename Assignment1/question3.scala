object question3 { 
      
   def main(args: Array[String]): Unit= { 
     def price(a: Int): Double ={a*24.95}

  def discount(b: Double): Double ={ b*40/100}

  def newprice(x: Double, y: Double): Double ={x-y}

  def shippingcost(n: Int): Double ={
    if(n<=50)
      3
    else
      3+((n-50)*0.75)
  }
  val ans = newprice(price(60),discount(price(60)))+shippingcost(60)
  println("Total wholesale cost : " + ans)
 
       
   }

} 