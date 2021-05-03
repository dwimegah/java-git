package daojointabel;

import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import daojointabel.dao.EmployeeDaoJdbc;
import daojointabel.domain.Employee;

public class App {
	public static void main( String[] args ) throws SQLException
    {
        //setingan datasource
        MysqlDataSource dataSource=new MysqlDataSource();
        dataSource.setServerName("localhost");
        dataSource.setDatabaseName("company");
        dataSource.setUser("root");
        dataSource.setPassword("");
        
        EmployeeDaoJdbc employeeDao=new EmployeeDaoJdbc(dataSource.getConnection());
        
        //ambil data dari basisdata
        List<Employee> listEmployee=employeeDao.getAll();
        
        //cetak hasil kelayar
        for(Employee e:listEmployee){
            System.out.println("employee_id: " + e.getEmployeeId() + ", " +
            					" first_name: " + e.getFirstName() + ", " +
            					" project_name: " + e.getEmployeeProject().getProjectName() + ", " +
            					" assigned_task: " + e.getEmployeeProject().getAssignedTask() 
            				);
        }
    }
}
