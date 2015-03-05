
public interface QueueADTInterface<T> {

	public void enqueue(T data);
	public T dequeue();
	public T first();
	public boolean isEmpty();
	public int size();
	public String toString();
	
}
