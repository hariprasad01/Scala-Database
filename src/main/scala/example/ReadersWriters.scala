import scala.concurrent._
class ReadersWriters {
val m = new MailBox
private case class Writers(n: Int), Readers(n: Int) { m send this }
Writers(0); Readers(0)
def startRead = m receive {
case Writers(n) if n == 0 => m receive {
case Readers(n) => Writers(0); Readers(n+1)
}
}
def startWrite = m receive {
case Writers(n) =>
Writers(n+1)
m receive { case Readers(n) if n == 0 => }
}
def endRead = m receive {
case Readers(n) => Readers(n-1)
}
def endWrite = m receive {
case Writers(n) => Writers(n-1); if (n == 0) Readers(0)
}
}
