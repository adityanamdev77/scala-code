object Main {
  def main(args: Array[String]): Unit = {

    val name = "Aditya"
    var age = 20

    println("Name: " + name)
    println("Age: " + age)

    age = 21
    println("Updated Age: " + age)

    // val cannot be reassigned
    // name = "Rahul"   // Error: reassignment to val
  }
}