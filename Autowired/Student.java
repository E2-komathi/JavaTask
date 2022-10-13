package autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	@Autowired
	private Department dept;
	
	@Autowired       //autowired annotation using setter and by type
	public void setDept(Department dept) {
		this.dept = dept;
		System.out.println("Using autowired annotation");
	}

	public void study()
	{
		dept.process();
	}

}
