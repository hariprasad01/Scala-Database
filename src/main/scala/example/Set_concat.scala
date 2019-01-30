object Demo {
   def main(args: Array[String]) {
      val fruit1 = Set("apples", "oranges", "pears")
      val fruit2 = Set("mangoes", "banana")

      // use two or more sets with ++ as operator
      var fruit = fruit1 ++ fruit2
      println( "fruit1 ++ fruit2 : " + fruit )

      // use two sets with ++ as method
      fruit = fruit1.++(fruit2)
      println( "fruit1.++(fruit2) : " + fruit )
   }
}
