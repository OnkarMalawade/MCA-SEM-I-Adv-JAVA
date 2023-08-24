package in.ac.famt;

public class CircleDemo {
	public static void main(String[] args) {
		Circle<Float> c1 = new Circle<Float>(5.0f);
		System.out.println("Radius of Circle " + c1.getOb());
		c1.area();
	}
}
