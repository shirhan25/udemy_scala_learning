package basicspart1

object Functions extends App {

  //how to define a function
  //each function has a parameters name and type in the brackets
  //perimeter a of type String
  //perimeter b of type Integer
  // the function will return a string - call on string at the end is the return type of the function
  //function header - def aFunction (a:String, b:Int):String
  // After the equal sign the implementation - a single expression which is the implementation of the function
  // the implementation is string concatenation
  // the function is taking two parameters a string and an int and concatenate them with a space in between
  def aFunction(a: String, b: Int): String =
    a + "" + b

  // you can move the expression into a code block too  which is still a valid function definition
  // why is it valid ? a block is also an expression and its result is the value of its last constituent expression

  //  def aFunction (a:String, b:Int):String = {
  //    a + "" + b
  //  }

  // how to call function
  //name it and in parenthesese pass in some actual values for parameters
  // we can use the call of the function in the println statement
  println(aFunction("hello", 3))

  //Parameter-less function can be also called with just their names
  //takes no parameters
  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  //or
  //def aParameterlessFunction: Int = 42
  //println(aParameterlessFunction)
  //in Scala 3
  //functions with parentheses must be called with parentheses
  //functions without parentheses must be called without parentheses

  // aString of type String
  // n: Int , nu of type Int - number of times to repeat the string
  //return type - String
  //implementation - if n is equal to 1, return aString else return aString and aRepeatedFunction(aString, n-1)
  //Recusive function - calls on itself
  def aRepeatedFunction(aString: String, n: Int): String =
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)

//CONFUSED !!!!! 6:20
  println(aRepeatedFunction("hello", 3))
// n doesnt not equal to 3 so else print hello and concatenate the calling of repeated function
// the repeated function got into the n ==1 base case and returned a string






}
