package daojointabel.domain;

import java.util.Date;

public class Employee {
	private Long employeeId;
	private String employeeCode;
	private String firstName;
	private String lastName;
	private Date hireDate;
	private Double salary;
	private int manager;
	private int deptId;
	private EmployeeProject EmployeeProject;
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public EmployeeProject getEmployeeProject() {
		return EmployeeProject;
	}
	public void setEmployeeProject(EmployeeProject employeeProject) {
		EmployeeProject = employeeProject;
	}
}
