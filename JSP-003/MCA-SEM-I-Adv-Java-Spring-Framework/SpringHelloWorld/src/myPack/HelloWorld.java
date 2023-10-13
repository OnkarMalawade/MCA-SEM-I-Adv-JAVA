package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("greeting.xml");
		Greeting hwobj=(Greeting) ctx.getBean("greetBean");
		
		System.out.println("MSG:" + hwobj);
	}

}
