package beanfac;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PaymentMain {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the name");
		String st = scn.next();
		
		BeanFactory fac = new XmlBeanFactory(new ClassPathResource("newSpring.xml"));
		
		Cod py = (Cod) fac.getBean("cod");
		py.payment();
		py.str = st;
		System.out.println(py.str);
		
		Upi py1 =(Upi) fac.getBean("upi");
		py1.payment();
		
		NetBanking py2 = (NetBanking) fac.getBean("netb");
		py2.payment(); 
		}

}
