package mypack;
import java.util.ArrayList;
import java.util.Collections;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(5,"Maruti",10.55);
		Car c2 = new Car(2,"i10",20.55);
		Car c3 = new Car(3,"i20",30.55);
		Car c4 = new Car(4,"Audi",40.55);
		Car c5 = new Car(1,"Jaguar",50.55);
		
		ArrayList<Car> ar = new ArrayList<Car>();
		
		ar.add(c5);
		ar.add(c4);
		ar.add(c3);
		ar.add(c2);
		ar.add(c1);
		
		System.out.println("Cars - "+ ar);
		Collections.sort(ar, new CarSort());
		System.out.println("Sorted Cars - "+ ar);
	}

}
