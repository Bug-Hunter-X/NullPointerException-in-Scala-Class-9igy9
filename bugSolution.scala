```scala
class MyClass(val name: String) {
  def printName(): Unit = {
    // Solution 1: Using pattern matching
    name match {
      case null => println("My name is unknown")
      case n => println(s"My name is $n")
    }
  }
}

object Main extends App {
  val obj = new MyClass(null)
  obj.printName()
}

// Solution 2: Using Option
class MyClassOption(val name: Option[String]) {
  def printName(): Unit = {
    name match {
      case Some(n) => println(s"My name is $n")
      case None => println("My name is unknown")
    }
    name.foreach(n => println(s"My name is $n")) //Another way using Option
  }
}

object MainOption extends App{
  val obj = new MyClassOption(Some("John"))
  obj.printName()
  val obj2 = new MyClassOption(None)
  obj2.printName()
}
```