#Programming Challenge 1 (FizzBuzz, Fibonacci) 
#Made by: justcharlie

# Start FizzBuzz
for num in range(1, 101):
	if (num % 3 == 0 and num % 5 == 0):
		print "FizzBuzz"
	elif (num % 3 == 0):
		print "Fizz"
	elif (num % 5 == 0):
		print "Buzz"
	else:
		print num
#End FizzBuzz

#Start Fibonacci
def Fib(num):
    if (num == 0):
        return 0
    elif (num == 1):
        return 1
    else:
        return (Fib(num-1)) + (Fib(num-2))

print Fib(int(raw_input("Enter the index for a value in the Fibonacci sequence: ")))
#End Fibonnaci
