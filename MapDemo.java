import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(1,"One");
		mp.put(2,"Two");
		mp.put(3,"Three");
		mp.put(4,"Four");
		mp.put(5,"Five");
		mp.put(6,"Six");
		//Operations on Hash Map
		System.out.println("Hash Map : " + mp);
		System.out.println("Hash Map Size: " + mp.size());
		System.out.println(mp.containsValue("Five")?"Five It Contains":"Five Its Not Contains");
		System.out.println(mp.containsKey(3)?"3 Contains":"3 Not Contains");
		System.out.println("Value At Key 6 is "+mp.get(6));
		System.out.println(mp.replace(5, "Ten"));
		System.out.println("Modified Hash Map : " + mp);
		
		//Searching key in Map
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Key Value ");
			Integer skey = (Integer)sc.nextInt();
			mp.forEach((num,str) ->
			{
				if(num == skey) {
					System.out.print("Key is Present with " + num + " " + str);
				}
			});
			
			System.out.println("\nEnter Values to search ");
			String sStr = sc.nextLine();
			mp.forEach((num,str)->{
				if(str != null && str.equals(sStr)) {
					System.out.println("Values is present with " +num+ " " +str);
				}
			});
			sc.close();
			
		}catch(Exception e){}
		
		Map<Integer,String> mp1 = new LinkedHashMap<Integer,String>();
		mp1.put(1,"One");
		mp1.put(2,"Two");
		mp1.put(3,"Three");
		mp1.put(4,"Four");
		mp1.put(5,"Five");
		mp1.put(6,"Six");
		
		System.out.println("Linked Hash Map : " + mp1);
		
		TreeMap<Integer,String> mp2 = new TreeMap<Integer,String>();
		mp2.put(1,"One");
		mp2.put(2,"Two");
		mp2.put(3,"Three");
		mp2.put(4,"Four");
		mp2.put(5,"Five");
		mp2.put(6,"Six");
		
		System.out.println("Tree Hash Map : " + mp2);
	}

}
