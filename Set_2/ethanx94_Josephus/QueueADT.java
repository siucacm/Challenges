
public class QueueADT<T> implements QueueADTInterface<T> {

	//all of these variables are default private
	QueueADTNode head;
	QueueADTNode tail;
	int count;
	String name;
	
	public QueueADT()
	{
		head = null;
		tail = null;
		count = 0;
		name = "";
	}
	
	public QueueADT(String name)
	{
		head = null;
		tail = null;
		count = 0;
		this.name = name;
	}
	
	@Override
	public void enqueue(T data) {
		//create a new node for queue
		QueueADTNode<T> temp = new QueueADTNode<T>();
		temp.data = data;
		temp.next = null;
		
		if(isEmpty())
		{
			head = temp;
			tail = temp;
			count++;
			return;
		}
		
		tail.next = temp;
		tail = temp;
		count++;
	}

	@Override
	public T dequeue() {
		T temp;
		
		if(isEmpty())
		{
			return null;
		}
		
		if(size() == 1)
		{
			temp = (T)head.data;
			head = null;
			tail = null;
			count = 0;
			return temp;
		}
		
		temp = (T)head.data;
		head = head.next;
		count--;
		return temp;
	}

	@Override
	public T first() {
		if(isEmpty())
			return null;
		
		return (T)head.data;
		
	}

	@Override
	public boolean isEmpty() {
		return(count == 0);
	}

	@Override
	public int size() {
		return count;
	}

	
	
}
