object Demo {
   def main(args: Array[String]) {
      val a:Option[Int] = Some(5)
      val b:Option[Int] = None 
      
      println("a.isEmpty: " + a.isEmpty )
      println("b.isEmpty: " + b.isEmpty )
   }
}
