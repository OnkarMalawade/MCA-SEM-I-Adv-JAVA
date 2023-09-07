import java.util.*;

public class strLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> LL = new LinkedList<String>();
		
		LL.add("One");
		LL.add("Two");
		LL.add("Three");
		LL.add("Four");
		
		System.out.println("" + LL);
		
		LinkedList <String> LL1 = new LinkedList <String>();
		
		LL1.addAll(LL);
		
		LL1.add(null);
		LL1.add("Five");
		LL1.add("Six");
		System.out.println("" + LL1);
		LL1.add(5,"Ten");
		System.out.println("" + LL1);
		LL1.addFirst("Zero");
		LL1.addLast("Nine");
		System.out.println("" + LL1);
		LL1.remove("Ten");
		System.out.println("" + LL1);
		LL1.removeFirst();
		System.out.println("" + LL1);
		LL1.removeLast();
		System.out.println("" + LL1);
		LL1.add(4, "Ten");
		System.out.println("It contains: " + LL1.get(2));
		
		System.out.println("It Contains: " + LL1.getFirst());
		
		System.out.println("It contains: " + LL1.getLast());
		
		System.out.println("Contains: " + LL1.contains("Three"));
		
		System.out.println("Contains: " + LL1.contains("Three1"));
		
		System.out.println("PeekFirst: "+LL1.peekFirst());
		
		System.out.println("PeekFirst: "+LL1.peekLast());
		
		LL1.remove(5);
		
		System.out.println("" + LL1);
		System.out.println();
		for(String str : LL1) {
			System.out.println("" + str + " has length " + str.length());
		}
		System.out.println();
		Collections.sort(LL1);
		for(String str : LL1) {
			System.out.print(" " + str);
		}
		System.out.println();
		Collections.reverse(LL1);
		for(String str : LL1) {
			System.out.print(" " + str);
		}
	}
}
