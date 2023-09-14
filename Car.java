package mypack;

public class Car {
	int carNo;
	String carNm;
	double carPr;
	public Car(int carNo, String carNm, double carPr) {
		super();
		this.carNo = carNo;
		this.carNm = carNm;
		this.carPr = carPr;
	}
	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", carNm=" + carNm + ", carPr=" + carPr + "]";
	}
}
