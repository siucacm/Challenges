# Challenge Set 1
FizzBuzz: (Difficulty: Easy)

Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

Bonus: Write it in an esoteric/obscure language.


Fibonacci: (Difficulty: Medium) 
Write a function that generates values from the Fibonacci sequence. 
Fibonacci is defined by:
F(n) = F(n - 1) + F(n - 2), F(1)=0 and F(2)=1

Given the number n, print the nth value of the Fibonacci sequence.


Delimiter: (Difficulty: Tricky)

For this question, you will parse a string to determine if it contains only "balanced delimiters."

A balanced delimiter starts with an opening character (, [, {, ends with a matching closing character ), ], } respectively), and has only other matching delimiters in between. A balanced delimiter may contain any number of balanced delimiters.

Valid:
()[]{} 
([{}])
([]{})

Invalid:
([)]
([]
[]))
Each test case will consist of a string only containing the characters ()[]{}
