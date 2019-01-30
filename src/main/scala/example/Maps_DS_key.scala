object Demo {
   def main(args: Array[String]) {
      val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

      if( colors.contains( "red" )) {
         println("Red key exists with value :"  + colors("red"))
      } else {
           println("Red key does not exist")
      }
      
      if( colors.contains( "maroon" )) {
         println("Maroon key exists with value :"  + colors("maroon"))
      } else {
         println("Maroon key does not exist")
      }
   }
}
