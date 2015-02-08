'''
Fibonacci (Difficulty: Medium)
Write a function that generates values from the Fibonacci sequence. 
Fibonacci is defined by: F(n) = F(n - 1) + F(n - 2), F(1)=0 and F(2)=1
Given the number n, print the nth value of the Fibonacci sequence.

NOTICE: Since F(1) = 0, this sequence begins with 0. Read carefully!
'''

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
	n = int(input("Provide a 1-based index of the Fibonacci sequence: "))
	#Print the nth value of the Fibonacci sequence
	print("Value at index", n, "is:", fib(n))
	
	#View rest of sequence
	q = input("View entire sequence? ")
	if(q == 'y' or q == 'Y' or q == "yes" or q == "Yes"):
		print("[", end="")
		for x in range (n, 1, -1):
			print(fib(x), ", ", end="", sep='')
		
		#Sequence always ends with 0
		#Outside the for loop for proper formatting	
		print("0]")

main()