import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(20);
		ar.add(30);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(60);
		
		Set<Integer> s1 = new HashSet<Integer>();
		s1.addAll(ar);
		s1.add(null);
		System.out.println("HashSet = " +s1);
		s1.forEach((elt) ->{
			System.out.print(elt + " ");
		});
		
		LinkedHashSet<Integer> Lhset = new LinkedHashSet<Integer>();
		Lhset.addAll(s1);
		System.out.println("\nLinked Hash Set = " + Lhset);
		
		TreeSet<Integer> Ts1 = new TreeSet<Integer>();
		Ts1.add(10);
		Ts1.add(20);
		Ts1.add(30);
		Ts1.add(40);
		Ts1.add(50);
		Ts1.add(60);
		Ts1.add(70);
		System.out.println("Tree Hash Set = " + Ts1);
	}

}
