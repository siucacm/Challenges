'''
Fibonacci (Difficulty: Medium)
Write a function that generates values from the Fibonacci sequence. 
Fibonacci is defined by: F(n) = F(n - 1) + F(n - 2), F(1)=0 and F(2)=1
Given the number n, print the nth value of the Fibonacci sequence.

NOTICE: Since F(1) = 0, this sequence begins with 0. Read carefully!
'''
import sys

def fib(n):
	#F(1) = 0
	if (n == 1):
		return 0
	#F(2) = 1
	elif (n == 2):
		return 1
	#F(n) = F(n - 1) + F(n - 2)
	else:
		return (fib(n-1) + fib(n-2))
		

def main():
	#Given the number n
	n = int(input("Provide nth value of Fib sequence: "))
	#Print the nth value of the Fibonacci sequence
	print(fib(n))

main()