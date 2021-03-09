object Variables{
    def main(args:Array[String]){

        //This type of variable declaration is mutable.
        var myVar : String = "Seth";

        //This type of variable declaration in immutable.
        val myVal : String = "Gregory";

        println(myVar + " " + myVal );

        myVar = "Yaw";
        println(myVar + " " + myVal );

        //multiple assignment
        val (myVar1,myVar2) = Pair(40,"Foo");

        println(myVar1);

    }
}