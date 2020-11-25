case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  
  def +(that:Point)=Point(this.x+that.x,this.y+that.y) 
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  
  def -(that:Point)=Point(this.x-that.x,this.y-that.y) 
  def DisOfpoints(that:Point):Double={
   val distance=math.sqrt((this.x)*(this.x)+(this.y)*(this.y))
   return distance
  }

  def InvertOfpoint(that:Point)=Point(this.y,this.x)
}

object assignment6{
   def main(args:Array[String]){
   val u=Point(3,6)
   val v=Point(7,12)
   
   println("01:Addition ="+(u+v))
   
   println("02:Move ="+u.move(3,7))
   
   val w=u-v

   println("03:Distance ="+w.DisOfpoints(w))
   
   println("04:Invert ="+u.InvertOfpoint(u))
  }
}