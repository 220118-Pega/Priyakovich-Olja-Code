package dl;

import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import Models.Employee;
import ui.Status;
public class EmployeeDAO implements DAO <Employee, Integer> {
	private final Logger logger = LogManager.getLogger(this.getClass());
	
	

	@Override
	public Employee findById(Integer id) {
		// TODO Auto-generated method stub
		try (Connection conn = ConnectionFactory.getInstance().getconnection()){
			String query = "select * from employees where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				return new Employee(rs.getString("name"), rs.getBoolean("is_Manager"),rs.getInt("id"));	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Error with conneciton to the DB");
		}

		return null;
}
	

	@Override
	public List<Employee> getTicketbyEmployeeId(Integer employee_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> filterStatus(Status status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAllTickets() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public void add(Employee newObject) {
		// TODO Auto-generated method stub
		try (Connection conn = ConnectionFactory.getInstance().getconnection()){
			String query = "insert into employee (?,?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, newObject.getName());
			pstmt.setBoolean(2, false);
			pstmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Employee newObject) {
		// TODO Auto-generated method stub
		try (Connection conn = ConnectionFactory.getInstance().getconnection()){
			String query = "Update employees set is_Manager = ? where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setBoolean(1, !newObject.getIsManager());
			pstmt.setInt(2, newObject.getId());
			pstmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
}
	
