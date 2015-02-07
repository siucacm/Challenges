def fib(a):
	a += 1
	x,y = 1,1
	for i in range(a-1):
		x,y = y,x+y
	return x

print("Enter a number:")
num = int(input())

print(fib(num))