package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeMain {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("awire.xml");
		Student st = ac.getBean("stud",Student.class);
		st.study();
		}

}
