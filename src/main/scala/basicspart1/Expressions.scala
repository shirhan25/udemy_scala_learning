package basicspart1

object Expressions extends App{
  // declare value x and with the value one plus two
  //print it
  // right hand side (1+2) is an expression - evaluated to a value (3) & have a type (int).

  val x = 1+2;
  println(x)

  //math expressions preserve the operation ordering
 // + - * / & | << >>
 // >>> right shift with zero extension

 println(2+3*4)

 //relational operations - test equality and non-equality.
 // ==(equality) != (non-equality
 //relational between numbers - >= <=
 println(1 ==x)
 // testing for equality between number 1 and x, an expression which evaluated to a boolean.


 //Negation using !
 //Logical negation is a unary operator !
 // Logical and operation and logical or operator which are binary && ||
 println(!(1==x))


 // Changing variables with -= *= /= & only work with variables
 //changing a variable is a side effect
 var aVariable = 2;
 aVariable += 3
 println(aVariable)

// Instructions vs Expressions
// Instructions - something you tell the computer to do. DO THIS
// Expressions - something that has value or a type.

// If expression
val aCondition = true
// compute a value in terms of this condition
val aConditionedValue = if(aCondition) 5 else 3;
print(aConditionedValue) // you can use the if expression as is println(if(aCondition) 5 else 3)
  //aConditionedValue(left hand side) is either five if a condition is true otherwise it's three.
// It's called an if expression as it gives back a value in this case is 5 (int)
  // other languages if the condition does something then set the value of 5 otherwise set the value of 3.

//Loop expression
// execute side-effects & do bring back anything valuable.
//declare a variable i and initialise with 0 & count to 10.
var i = 0;
//AVOID THIS & AVOID LOOPS.
//DONT WRITE IMPERATIVE CODE WITH SCALA SYNTAX AS SCALA FORCES EVERYTHING TO BE AN EXPRESSION
while (i<=10) {
  println(i)
  //print i then
  i+=1
  //increment by 1
}

//ONLY DEFINITIONS OF A VOWEL,CLASS,PACKAGE ARE NOT EXPRESSIONS
//UNIT type is equivalent to void in other langs, which means it doesnt return anything meaningful
val aWeirdValue=(aVariable = 3)
println(aWeirdValue)
//value of unit is () - only value unit type can hold.


//CodeBlocks - special kind of expression with special properties
// Code surrounded by curly brackets.
// Inside Codeblocks you can define values & can write expressions. Everything declared inside the codeblock stays visible within the codeblock.
// val anotherValue = z+1; z is defined within a codeblock and so not visible outside & cant be accessed
//CodeBlock is an expression (its on the right hand side of a value definition)
// value of the block is the value of its last expression
// the value of aCodeBlock is  the value of the if expression. Which is a String "hello"
//
val aCodeBlock = {
  val y =2
  val z = y+1
  if(z>2) "hello" else "goodbye"
}
println(aCodeBlock)

//val anotherValue = z+1;
}
