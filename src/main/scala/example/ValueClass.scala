trait Printable extends Any {
   def print(): Unit = println(this)
}
class Wrapper(val underlying: Int) extends AnyVal with Printable

object Demo {
   def main(args: Array[String]) {
      val w = new Wrapper(3)
      w.print() // actually requires instantiating a Wrapper instance
   }
}
