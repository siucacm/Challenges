#Fibonacci Solution in Python 2.7.9
#Written by Joshua Sonnenberg

def fib(a):
	x,y = 1,1
	for i in range(a-1):
		x,y = y,x+y
	return x

print("Enter a number:")
num = int(input())

print(fib(num))
