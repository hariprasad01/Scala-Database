object Demo {
   def main(args: Array[String]) {
      val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
      
      println( "Before reverse fruit : " + fruit )
      println( "After reverse fruit : " + fruit.reverse )
   }
}
