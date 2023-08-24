package in.ac.famt;

public class Circle<T extends Number> {
	T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}

	public Circle(T ob) {
		super();
		this.ob = ob;
	}
	
	public void area() {
		float r = (float) ob;
		System.out.print("Area of Circle: ");
		System.out.println(3.14 * r * r);
	}
}
