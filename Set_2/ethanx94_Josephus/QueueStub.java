
public class QueueStub {
	public static void main(String[] args) {
		QueueADT<String> students = new QueueADT<String>();
		
		/*students.enqueue("Dillon");
		students.enqueue("Justin");
		
		System.out.println(students.first());
		
		//kill Dillon
		students.dequeue();
		
		//kill Justin
		System.out.println(students.dequeue());
		
		System.out.println("I have " + students.size() + " items");
		
		int i;
		for(i=1; i<11; i++)
		{
			students.enqueue("Students #" + i);
		}
		
		System.out.println("I have " + students.size() + " items");
		*/
		
		for(int i=1; i<10; i++)
			students.enqueue((String)("Student #" + i));
		
		while(!(students.isEmpty()))
		{
			String temp = students.dequeue();
			System.out.println(temp);
			students.enqueue(temp);
		}
		
		/*
		for(int j=0; j<100; j++)
		{
			String temp = students.dequeue();
			System.out.println(temp);
			students.enqueue(temp);
		}
		*/
	}

}
