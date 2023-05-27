package basics1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestMobile {

	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("ioc1.xml");
	////// Bean factory is also caller application context
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		Mobile mobile=(Mobile) beanFactory.getBean("Kavya");
		mobile.musicPlayer();
		// for our reference
		Mobile mobile1=(Mobile) beanFactory.getBean("Kavya");
		mobile.musicPlayer();
	}
}
