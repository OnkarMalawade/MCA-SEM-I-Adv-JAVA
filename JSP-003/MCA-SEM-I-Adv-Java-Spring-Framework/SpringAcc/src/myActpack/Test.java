package myActpack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("empConfig.xml");
		
		Employee emp1 = (Employee) ctx.getBean("empBean1");
		System.out.println("Employee ID:"+emp1.getId());
		System.out.println("Employee ID:"+emp1.getNm());
		System.out.println("Employee Building.:"+emp1.getAddr());
	}

}
