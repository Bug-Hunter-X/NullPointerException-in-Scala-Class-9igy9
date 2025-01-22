```scala
class MyClass(val name: String) {
  def printName(): Unit = {
    println(s"My name is $name")
  }
}

object Main extends App {
  val obj = new MyClass("John")
  obj.printName() // This line throws a NullPointerException if name is null
}
```