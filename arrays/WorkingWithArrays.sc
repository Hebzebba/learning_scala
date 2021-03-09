object WorkingWithArrays {

  var names: Array[String] = new Array[String](3);

  def main(args: Array[String]) {
    names(0) = "Seth";
    names(1) = "Gregory";
    names(2) = "Kwashie";

    names.foreach(name => println(name));

  }
}
