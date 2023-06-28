import java.util.NoSuchElementException;

public class ResizingArrayQueueOfStrings {
    private String[] q;
    private int head;
    private int tail;
    
    public ResizingArrayQueueOfStrings(int capacity) {
        q = new String[capacity];
        head = 0;
        tail = 0;
    }
    
    public boolean isEmpty() {
        return head == tail;
    }
    
    public void enqueue(String item) {
        if (tail == q.length) {
            resize(2 * q.length);
        }
        q[tail++] = item;
    }
    
    public String dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        String item = q[head];
        q[head++] = null;
        
        if (head > 0 && tail - head == q.length / 4) {
            resize(q.length / 2);
        }
        return item;
    }
    
    private void resize(int capacity) {
        String[] copy = new String[capacity];
        int size = tail - head;
        System.arraycopy(q, head, copy, 0, size);
        q = copy;
        tail = size;
        head = 0;
    }
}
