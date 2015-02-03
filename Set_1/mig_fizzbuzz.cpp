#include <iostream>
#include <iomanip>

//Mark Ira Goldberg
//FizzBuzz

int main()
{
	int num = 1;
	int whitespaceCounter = 0;
	for(int i=1; i<101; i++)
	{
		if (i % 15 == 0)
			std::cout << "FizzBuzz";
		else if(i%3 == 0)
			std::cout << "Fizz    ";
		else if(i%5 == 0)
			std::cout << "    Buzz";
		else
			std::cout << std::setw(8) << i;
		if(whitespaceCounter >= 4)
		{
			whitespaceCounter = 0;
			std::cout << "\n";
		}
		else
		{
			std::cout << ' ';
			whitespaceCounter++;
		}
	}
	return 0;
}
