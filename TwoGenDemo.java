package in.ac.famt;

public class TwoGenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoGen<Integer,String> Obj = new TwoGen<Integer,String>(1,"Onkar");
		System.out.println("Roll No.: " + Obj.getOb1());
		System.out.println("Name: " + Obj.getOb2());
	}

}
