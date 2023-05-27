package basics1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMobile_Application_Context {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ioc1.xml");
		Mobile mobile=(Mobile) applicationContext.getBean("Kavya");
		mobile.musicPlayer();
	}
}
