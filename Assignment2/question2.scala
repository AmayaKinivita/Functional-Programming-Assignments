object question2 { 
      
   def main(args: Array[String]): Unit= { 
	
	
	      
//function to give the no of attendees according to the price(input)
      def attendees(p: Int) : Int= {
            120+(15-p)/5*20
      }
//function to calculate the revenue Input-ticket price
      def revenue(p: Int) : Int= {
            p*attendees(p)
      }
//function to calculate the cost
      def cost(p: Int) : Int= {
            500+ 3*attendees(p) 
      }
//function to calculate the profit
      def profit(p: Int) : Int= {
            revenue(p)-cost(p)
      }  

	print(profit(25))    

   }

}
//15-120, 10- 140, 20- 100
//per cost = 500+ 3per attendee
//x=price, y=no of tickets