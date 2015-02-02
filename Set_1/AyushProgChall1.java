import java.util.Scanner;
public class AyushProgChall1 {

	public void BuzzFizz(){
		for(int i=1;i<101;i++){
			if(i%5==0 && i%3==0)
				System.out.println("FizzBuzz");
			else if(i%5==0)
				System.out.println("Buzz");
			else if(i%3==0)
				System.out.println("Fizz");
			else
				System.out.println(i);
		}

	}

	public double Fib(int n){
		if(n==0)
			return 0;
		else if (n==1)
			return 1;
		else
			return Fib(n-1) + Fib(n-(2));	
	}
	public boolean Delimiter(String input){
		char[] Letters= new char[input.length()];
		for(int i=0;i<input.length();i++){
			Letters[i]=input.charAt(i);
		}
		int positive=0;
		if((input.startsWith("[")||input.startsWith("{")|| input.startsWith("(")))
			positive=1;

		if( (input.endsWith("}")||input.endsWith("]")|| input.endsWith(")")))
			positive=1;int mid=input.length()/2;
			if(Letters[0]==Letters[input.length()-1]){
				positive=0;
				return false;}
			if(positive==1){
				if(mid%(2)==1)
					return false;
				else if(Letters[mid]=='{'){
					if(Letters[mid-1]==('}'))
						return true;
					else if(Letters[mid+1]==('}'))
						return true;
				}
				else if(Letters[mid]=='}'){
					if(Letters[(mid-1)]==('{'))
						return true;
					else if(Letters[mid+1]==('{'))
						return true;

				}
				else if(Letters[mid]=='['){
					if(Letters[mid-1]==(']'))
						return true;
					else if(Letters[mid+1]==(']'))
						return true;

				}
				else if(Letters[mid]==']'){
					if(Letters[mid-1]==('['))
						return true;
					else if(Letters[mid+1]==('['))
						return true;

				}
				else if(Letters[mid]=='('){
					if(Letters[mid-1]==(')'))
						return true;
					else if(Letters[mid+1]==(')'))
						return true;

				}
				else if(Letters[mid]==')'){
					if(Letters[mid-1]==('('))
						return true;
					else if(Letters[mid+1]==('('))
						return true;

				}
			}
			else
				return false;
			return false;		
	}


	public static void main(String [] args){
		AyushProgChall1 program= new AyushProgChall1();
		Scanner scan = new Scanner(System.in);
		System.out.println("Test out my Delimiter!!!. Enter 0 to quit testing.");
		String input=scan.next();boolean cond=true;
		while(cond){
			System.out.println(program.Delimiter(input));
			input=scan.next();
			if(input.equalsIgnoreCase("0"))
				cond=false;
		}
		cond=true;
		System.out.println("Test out my Fibonacci sequence!!!. Enter the desired element of sequence. Enter -1 to quit testing.");
		int in=scan.nextInt();
		while(cond){
			in=scan.nextInt();
			System.out.println(program.Fib(in));
			if(in==-1)
				cond=false;
		}
		System.out.println("Press enter to see FizzBuzz");
		scan.next();
		program.BuzzFizz();
				



	}

}
