import scala.io.StdIn.readLine

object Main {
  def main(args: Array[String]): Unit = {

    print("Enter first number: ")
    val num1 = readLine().toDouble

    print("Enter second number: ")
    val num2 = readLine().toDouble

    println("Addition: " + (num1 + num2))
    println("Subtraction: " + (num1 - num2))
    println("Multiplication: " + (num1 * num2))
    println("Division: " + (num1 / num2))

    println("num1 == num2: " + (num1 == num2))
    println("num1 > num2: " + (num1 > num2))
    println("num1 < num2: " + (num1 < num2))

    println("Both numbers are positive: " + (num1 > 0 && num2 > 0))
    println("At least one number is positive: " + (num1 > 0 || num2 > 0))
    println("num1 is not equal to num2: " + (num1 != num2))
  }
}