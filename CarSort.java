package mypack;
import java.util.Comparator;

public class CarSort implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		/*if(o1.carNo > o2.carNo)
			return 1;
		else if(o1.carNo < o2.carNo)
			return -1;
		else 
			return 0;
		*/
		return o1.carNm.compareToIgnoreCase(o2.carNm);
	}

}
