package test;

public class EmpClass {
	private int rollnum;
	private String Name;
	private int age;
	private long phnum;
	private String address;
	private String gender;
	private int salary;
	private int deptId;
	
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhnum() {
		return phnum;
	}
	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "RollNum : "+rollnum+"\tName : "+Name+"\tage=" +age+"\tphnum="+phnum +"\taddress="+address+"\tgender="
				+ gender + "\tsalary=" + salary + "\tdeptId=" + deptId;
	}
	
	
}
