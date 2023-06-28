import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class GenericStack<Item> {
	private Node first = null;
	
	private class Node{
		Item item;
		Node next;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void push(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}
	
	public Item pop() {
		Item item = first.item;
		first = first.next;
		return item;
	}
	
	public static void main(String[] args) {
		LinkedStackOfStrings stack = new LinkedStackOfStrings();
		while(!StdIn.isEmpty()) {
			String s = StdIn.readString();
			if(s.equals("-")) StdOut.print(stack.pop());
			else stack.push(s);
		}
	}
}
