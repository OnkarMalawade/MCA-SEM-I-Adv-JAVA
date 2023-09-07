public class Car implements Comparable<Car>{
	String carNm;
	int price;
	
	public Car(String carNm, int price) {
		super();
		this.carNm = carNm;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [car name=" + carNm +"price="+price + "]";
	}

	//@Override
	//public int compareTo(Car o) {
		// TODO Auto-generated method stub
		//return carNm.compareToIgnoreCase(o.carNm);
	//}
	
	public int compareTo(Car o) {
		if(price < o.price) {
			return 1;
		}
		else if(price > o.price) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
