object Function {
  def main(args: Array[String]) {
    println("Hello world");
    val result = addTwoNumbers(3, 6);
    functionWithNoParam();
    println(result);
  }

  def addTwoNumbers(num1: Int, num2: Int): Int = num1 + num2;

  def functionWithNoParam() {
    println("Hello there am function with no param");
  }
}
