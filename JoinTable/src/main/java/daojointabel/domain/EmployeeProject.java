package daojointabel.domain;

public class EmployeeProject {
	private Long projectId;
	private String employeeId;
	private String assignedTask;
	private String projectName;
	
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getAssignedTask() {
		return assignedTask;
	}
	public void setAssignedTask(String assignedTask) {
		this.assignedTask = assignedTask;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}
