#include <iostream>
#include <sstream>
#include <vector>

// Mark Ira Goldberg
// Fibonacci calculator

unsigned long long fibonacci(unsigned long n);

std::vector<unsigned long long> fibocache;
const int maximumN = 93;

int main()
{
	fibocache.push_back(0);
	fibocache.push_back(1);

	/*int x = 0;
	while (x < 94)
	{
		std::cout << x << " " << fibonacci(x) << "\n";
		x++;
	}*/

	std::string st;
	std::stringstream sts;
	unsigned long n = 0;
	std::cout << "Enter a non-negative integer, n, no greater than " << maximumN << ": ";
	std::cin >> n;

	if (n < maximumN+1)
	{
		std::cout << "F(" << n << ") is " << fibonacci(n) << ".\n";
	}
	else
	{
		std::cout << "Your n is negative, or too large to process.";
	}
	
	return 0;
}

unsigned long long fibonacci(unsigned long n)
{
	if (fibocache.size() > n)
		return fibocache[n];

	unsigned long long nToCache = fibonacci(n - 1) + fibonacci(n - 2);
	fibocache.push_back(nToCache);
	return nToCache;
}
