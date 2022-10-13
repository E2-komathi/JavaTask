package appConEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppCon {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("AppContext.xml");
		Emp em = (Emp) ac.getBean("employee");
		System.out.println(em.getEmpName());
		em.work();
	}

}
