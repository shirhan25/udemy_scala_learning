package basicspart1

object ValuesVariablesTypes extends App {
  // by adding extends App you can run the code in the IDE

  //declaring a values - val with the name of x with a colon separator then value type.
  //assigning to the value with an equal sign
  val x:Int = 42
//how to print it to the console ? By using the println function with the value name in brackets.
println(x)

//Reassigning x=2, it will upset the complier as VALUES DECLARED WITH VAL CAN NOT BE REASSIGNED !!!!

//Removing the value type (Int) val x=42 will still run. VALUES TYPES ARE OPTIONALS AND COMPLIER CAN INFER TYPES.
//SEMICOLON ARE ALLOWED !
//character between double quotes
val aString : String = "Hello";

//BOOLEAN - variable type - Boolean with a capital B
val aBoolean: Boolean = true;
val anotherBoolean: Boolean = false;


//Characters - variable type - Character with a capital C.
// a single character between single quotes
val aChar: Char = 'a';


//Integer - can give value of numbers or other vowels
//floats - decimal values and f marks it as a float to the complier.
//double - decimal values with no markers at the end of it.
//shorts - represents two bytes
// longs - represented on eight bytes & add a L to denote its a long
val anInt: Int = x;
val aShort: Short = 4613;
val aLong: Long = 3343242424123L;
val aFloat: Float = 2.0f;
val aDouble: Double = 3.14;

//Variables - var can be reassigned compared to a value

var aVariable: Int = 4;

//reassigning the variable
aVariable =5;






}
