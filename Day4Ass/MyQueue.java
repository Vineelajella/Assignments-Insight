package Day4Ass;

import java.util.LinkedList;

public class MyQueue <T>{
	private LinkedList<T> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.addLast(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void clear() {
        queue.clear();
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            for (T element : queue) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
