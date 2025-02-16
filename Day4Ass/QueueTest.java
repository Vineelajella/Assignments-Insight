package Day4Ass;

public class QueueTest {

	public static void main(String[] args) {
		
		 MyQueue<Integer> intQueue = new MyQueue<>();
	        intQueue.enqueue(10);
	        intQueue.enqueue(20);
	        intQueue.enqueue(30);
	        intQueue.displayQueue();
	        intQueue.dequeue();
	        intQueue.displayQueue();

	        MyQueue<String> stringQueue = new MyQueue<>();
	        stringQueue.enqueue("Apple");
	        stringQueue.enqueue("Banana");
	        stringQueue.enqueue("Orange");
	        stringQueue.displayQueue();
	        stringQueue.dequeue();
	        stringQueue.displayQueue();
	    }
	}