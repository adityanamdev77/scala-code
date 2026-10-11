object Main {
  def main(args: Array[String]): Unit = {

    val number = 100
    val text = "25"
    val decimal = 50

    println("Inferred Number: " + number)
    println("Inferred Text: " + "Scala")

    val intValue = text.toInt
    val doubleValue = decimal.toDouble
    val stringValue = decimal.toString

    println("String to Int: " + intValue)
    println("Int to Double: " + doubleValue)
    println("Int to String: " + stringValue)
  }
}