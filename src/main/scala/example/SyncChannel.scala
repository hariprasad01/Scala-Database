package scala.concurrent
class Channel[A] {
class LinkedList[A] {
var elem: A = _
var next: LinkedList[A] = null
}
private var written = new LinkedList[A]
private var lastWritten = written
private var nreaders = 0
def write(x: A) = synchronized {
lastWritten.elem = x
lastWritten.next = new LinkedList[A]
lastWritten = lastWritten.next
if (nreaders > 0) notify()
}
def read: A = synchronized {
if (written.next == null) {
nreaders = nreaders + 1; wait(); nreaders = nreaders - 1
}
val x = written.elem
written = written.next
x
}
}
