/*
   
Write a program that prints the numbers from 1 to 100.
But for multiples of three print "Fizz" instead of the number and for multiples of five print "Buzz".
For numbers which are multiples of both three and five print "FizzBuzz".

Bonus: Write it in an esoteric/obscure language.

*/

//For-in style loop
//Numbers from 1 to 100.
for i in 1...100{
    //multiples of three & five
    if i % 3 == 0 && i % 5 == 0 {
        println ("FizzBuzz")
    //multiples of three
    } else if i % 3 == 0{
        println ("Fizz")
    //multiples of five
    } else if i % 5 == 0{
        println ("Buzz")
    //the number
    } else {
        println(i)
    }
}
println()

//C style for loop, with case-switch
for var i = 1; i<=100; i++ {
    switch(i % 3, i % 5){
    //multiples of three & five
    case (0,0):
        println("FizzBuzz")
    //multiples of three
    case (0,_):
        println("Fizz")
    //multiples of five
    case (_,0):
        println("Buzz")
    //the number
    default:
        println(i)
    }
}

/*
 * The underscore is a general token used to indicate a discarded value.
 *
 *Ex:
 * for _ in 0..<5 { ... }
 * Means we want to execute the block 5 times, we don't care about index w/i the block.
 *
 *Ex:
 * let (result, _) = someFunctionThatReturnsATuple()
 * Means we don't care what the second element of the tuple is, only the first
 *
 * #justswiftthings
*/