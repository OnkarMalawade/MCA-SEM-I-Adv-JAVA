import java.util.*;

public class CarDemo {
	public static void main(String []args) {
		List<Car> cr = new ArrayList<Car>();
		cr.add(new Car("Jaguar",101111));
		cr.add(new Car("Audi",201111));
		cr.add(new Car("Maruti",301111));
		cr.add(new Car("WagonR",101511));
		cr.add(new Car("Ferarri",161111));
		cr.add(new Car("Mercides",171111));
		cr.add(new Car("Mustang",105111));
		cr.add(new Car("Nano",17711));
		
		System.out.println("Cars Details:" + cr);
		
		Collections.sort(cr);
		System.out.println("Sort by Name: " + cr);
		
		System.out.println("Highest Value: " + cr.get(0));
	}
}
