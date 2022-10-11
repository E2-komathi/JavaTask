package test;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args) {

		EmpMain em = new EmpMain();
		em.option();

	}

	public void option() {
		EmpMain em = new EmpMain();

		System.out.println("Enter the option to perform ");
		System.out.println("1--To view the Employee table");
		System.out.println("2--To get the Employee by department");
		System.out.println("3--To update the Employee details");
		System.out.println("4--View by salary");
		System.out.println("5--View by Name");

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter any of these option = ");
		int num = scn.nextInt();

		switch (num) {
		case 1: {
			em.view();
			break;
		}
		case 2: {
			em.dept();
			break;
		}
		case 3: {
			em.update();
			break;
		}
		case 4: {
			em.salary();
			break;
		}
		case 5: {
			em.name();
			break;
		}
		default:
			System.out.println("plz enter a valid number");
		}
	}

	public void view() {
		EmpMain em = new EmpMain();
		Configuration configuration = new Configuration();
		configuration.configure("test/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();      
        
        String hql = "from EmpClass";
		Query query1 = session.createQuery(hql);

		List<EmpClass> list = query1.list();

		for (EmpClass emp : list) {

			System.out.println(emp);
		}

		System.out.println();
		em.option();
	}

	public void dept() {
		EmpMain em = new EmpMain();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter department Id to view");
		System.out.println("101-ECE");
		System.out.println("102-EEE");
		System.out.println("103-MCA");
		System.out.println("104-MSC");
		System.out.println("105-BCA");
		int id = scn.nextInt();
		Configuration configuration = new Configuration();
		configuration.configure("test/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		String hql = "from EmpClass where deptId ="+id;
		Query query1 = session.createQuery(hql);

		List<EmpClass> list = query1.list();

		for (EmpClass emp : list) {

			System.out.println(emp);
		}

		System.out.println();
		em.option();
	}

	public void update() {
		EmpMain em = new EmpMain();
		int id;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Id to update");
		id=scn.nextInt();
		
		Configuration configuration = new Configuration();
		configuration.configure("test/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
		 String hql = "from EmpClass where rollnum ="+id;
			Query query1 = session.createQuery(hql);

			List<EmpClass> list = query1.list();

			for (EmpClass emp : list) {

				System.out.println(emp);
			}
			
			System.out.println("Enter name=");
			String Name = scn.next();
			System.out.println("Enter age=");
			int age = scn.nextInt();
			System.out.println("Enter Ph-Num=");
			int phnum = scn.nextInt();
			System.out.println("Enter gender=");
			String gen = scn.next();
			System.out.println("Enter salary=");
			int sal = scn.nextInt();

		List<EmpClass> list1= query1.list();

		for (EmpClass emp : list1) {
			emp.setName(Name);
			emp.setAge(age);
			emp.setPhnum(phnum);
			emp.setGender(gen);
			emp.setSalary(sal);
			t.commit();
		}		
		em.option();
	}

	public void salary() {
		EmpMain em = new EmpMain();
		Configuration configuration = new Configuration();
		configuration.configure("test/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		String hql ="from EmpClass order by salary";
		Query query1 = session.createQuery(hql);

		List<EmpClass> list = query1.list();

		for (EmpClass emp : list) {

			System.out.print("RollNum = "+emp.getRollnum()+"\t");
			System.out.print("Name = "+emp.getName()+"\t");
			System.out.print("Salary = "+emp.getSalary()+"\t");
			System.out.println("Dept Id = "+emp.getDeptId());
		}

		System.out.println();
		em.option();
	}

	public void name() {
		EmpMain em = new EmpMain();
		Configuration configuration = new Configuration();
		configuration.configure("test/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		String hql ="from EmpClass order by Name";
		Query query1 = session.createQuery(hql);

		List<EmpClass> list = query1.list();

		for (EmpClass emp : list) {

			System.out.print("RollNum = "+emp.getRollnum()+"\t");
			System.out.print("Name = "+emp.getName()+"\t");
			System.out.print("Salary = "+emp.getSalary()+"\t");
			System.out.println("Dept Id = "+emp.getDeptId());
		}

		System.out.println();
		em.option();
	}

}
