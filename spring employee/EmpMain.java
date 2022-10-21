package mvcExample;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpMain {

	@RequestMapping("/data")
	public ModelAndView viewemp() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		

		List<EmpPojo> users = session.createCriteria(EmpPojo.class).list();
		return new ModelAndView("data", "list", users);

	}
	
	@RequestMapping("/saveEmployee")  
    public ModelAndView save(HttpServletRequest req,HttpServletResponse res){  
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
        
		EmpPojo ep= new EmpPojo();
		int id =Integer.parseInt(req.getParameter("id"));
		String name =req.getParameter("name");
		String address =req.getParameter("address");

		ep.setId(id);
		ep.setName(name);
		ep.setAddress(address);
		
		session.save(ep);
		t.commit();
       
		List<EmpPojo> users = session.createCriteria(EmpPojo.class).list();
        return new ModelAndView("data","list",users);
	}

}
