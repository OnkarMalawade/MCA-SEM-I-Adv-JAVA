package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AccTest {

	private static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("actconfig.xml");
		Account a1= (Account) ctx.getBean("acc");
		System.out.println("Account No.:"+a1.getActNo());
		System.out.println("Account Name.:"+a1.getActNm());
		System.out.println("Account Balance.:"+a1.getActBal());
	}

}
