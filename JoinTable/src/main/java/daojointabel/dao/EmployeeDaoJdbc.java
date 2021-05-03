package daojointabel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import daojointabel.domain.Employee;
import daojointabel.domain.EmployeeProject;

public class EmployeeDaoJdbc {
	Connection connection;
    List<Employee> listEmployee=new ArrayList<Employee>();

	public EmployeeDaoJdbc(Connection connection) {
		this.connection=connection;
	}
	
	public List<Employee> getAll() throws SQLException{
        PreparedStatement ps=connection.prepareStatement(
        		" SELECT a.employee_id,a.employee_code,a.first_name,a.last_name,a.hire_date,a.salary,a.manager,a.dept_id, " +
        		" b.project_id, b.project_name, b.assigned_task" +
        		" FROM employee a " +
        		"inner join employee_project b on(a.employee_id=b.employee_id)");
        ResultSet rs=ps.executeQuery();
        
        while(rs.next()){
            Employee employee=new Employee();
            EmployeeProject employeeProject=new EmployeeProject();
            
            employee.setEmployeeId(rs.getLong("employee_id"));
            employee.setEmployeeCode(rs.getString("employee_code"));
            employee.setFirstName(rs.getString("first_name"));
            employee.setLastName(rs.getString("last_name"));
            employee.setHireDate(rs.getDate("hire_date"));
            employee.setSalary(rs.getDouble("salary"));
            employee.setManager(rs.getInt("manager"));
            employee.setDeptId(rs.getInt("dept_id"));
            
            employeeProject.setProjectId(rs.getLong("project_id"));
            employeeProject.setProjectName(rs.getString("project_name"));
            employeeProject.setAssignedTask(rs.getString("assigned_task"));
            
            employee.setEmployeeProject(employeeProject);
            
            listEmployee.add(employee);
        }
        return listEmployee;
    }

}
