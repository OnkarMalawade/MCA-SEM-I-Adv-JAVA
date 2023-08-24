package in.ac.famt;

public class Gen<T> {
	T obj;

	public Gen() {
		super();
	}

	public Gen(T obj) {
		super();
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public void showType() {
		System.out.println("Type of T is " + obj.getClass().getName());
	}
}
