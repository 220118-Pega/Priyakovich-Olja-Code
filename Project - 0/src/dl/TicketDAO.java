package dl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Models.Ticket;
import ui.Category;
import ui.Status;

public class TicketDAO implements DAO <Ticket, Integer>{
	
	private final Logger logger = LogManager.getLogger(this.getClass());

	
	
	
	@Override
	public Ticket findById(Integer id) {
		// TODO Auto-generated method stub
//		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
		try (Connection conn = ConnectionFactory.getInstance().getconnection()){
			String query = "select * from ticket where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				return
						new Ticket(
								rs.getString("description"),
								rs.getDouble("amount"),
								Status.valueOf(rs.getString("status")),
								Category.valueOf(rs.getString("category")),
								rs.getTimestamp("submission_date").toLocalDateTime(),
								rs.getInt("id"));
				}	
			}catch (SQLException e) {
				e.printStackTrace();
				logger.error("Error with conneciton to the DB", e);
			}
	
		return null;
	
	}

//	@Override
//	public List<Ticket> getTicketbyEmployeeId(Integer emloyee_id) {
//		// TODO Auto-generated method stub
//		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
//		try (Connection conn = ConnectionFactory.getInstance().getconnection()){
//			String query = "select * from tickets where employee_id = ? order by submition_date desc";
//			PreparedStatement pstmt = conn.prepareStatement(query);
//			pstmt.setInt(1, emloyee_id);
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				tickets.add(
//						new Ticket(
//						rs.getDouble("amount"),
//						Status.valueOf(rs.getString("status")),
//						Category.valueOf(rs.getString("category")),
//						rs.getString("description"),
//						rs.getDate("submission_date").toLocalDate(),
//						rs.getInt("employee_id"),
//						rs.getInt("id")));
//				}	
//			}catch (SQLException e) {
//				e.printStackTrace();
//				logger.error("Something went wrong", e);
//			}
//	
//		return tickets;
//	
//	}
//
//	@Override
//	public List<Ticket> filterStatus(Status status) {
//		// TODO Auto-generated method stub
//		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
//		try (Connection conn = ConnectionFactory.getInstance().getconnection()){
//			
//			String query = "select * from ticket(amount, status)values(?,?);";
//			PreparedStatement stmt = conn.prepareStatement(query);
//			stmt.setString(1, status.toString());
//			ResultSet rs = stmt.executeQuery();
//			while(rs.next()) {
//				tickets.add(
//						new Ticket(
//						rs.getDouble("amount"),
//						Status.valueOf(rs.getString("status")),
//						Category.valueOf(rs.getString("category")),
//						rs.getString("description"),
//						rs.getDate("submission_date").toLocalDate(),
//						rs.getInt("employee_id"),
//						rs.getInt("id")));
//				}	
//			}catch (SQLException e) {
//				e.printStackTrace();
//				logger.error("Error with conneciton to the DB", e);
//			}
//	
//		return tickets;
//	
//	}

	@Override
	public List<Ticket> findAllTickets() {
		// TODO Auto-generated method stub
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
		try (Connection conn = ConnectionFactory.getInstance().getconnection()){
			String query = "select * from ticket";
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				tickets.add(
						new Ticket(
								rs.getString("description"),
								rs.getDouble("amount"),
								Status.valueOf(rs.getString("status")),
								Category.valueOf(rs.getString("category")),
								rs.getTimestamp("submission_date").toLocalDateTime(),
								rs.getInt("id")));
				}
			
			}catch (SQLException e) {
				e.printStackTrace();
				logger.error("Error with conneciton to the DB", e);
			}
	
		return tickets;
	}

	@Override
	public void add(Ticket newObject) {
		// TODO Auto-generated method stub
		try (Connection conn = ConnectionFactory.getInstance().getconnection()){
			String query = "insert into ticket(amount, status, category, description, submission_date) values (?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, (int) newObject.getAmount());
			pstmt.setString(2, newObject.getStatus().toString());
			pstmt.setString(3, newObject.getCategory().toString());
			pstmt.setString(4, newObject.getDescription());
			pstmt.setObject(5, newObject.getSubmission_date().toLocalDate());
//			pstmt.setInt(6, newObject.getEmployee_id());
			pstmt.execute();			
		}catch (SQLException e) {
				e.printStackTrace();
			}
	}
	

	@Override
	public void update(Ticket newObject) {
		// TODO Auto-generated method stub
		try (Connection conn = ConnectionFactory.getInstance().getconnection()){
			String query = "update ticket set status = ?, description = ? where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, newObject.getStatus().toString());
			pstmt.setString(2, newObject.getDescription());
			pstmt.setInt(3, newObject.getId());
			pstmt.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Ticket> getTicketbyEmployeeId(Integer emloyee_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> filterStatus(Status status) {
		// TODO Auto-generated method stub
		return null;
	}
}
	

	