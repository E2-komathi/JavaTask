package exampleMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloMVC extends AbstractController{
	  
	 @Override
	   protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 System.out.println("jjjj");
	      ModelAndView model = new ModelAndView("ex");
	      model.addObject("message", "Welcome!");
	      return model;
}
}
