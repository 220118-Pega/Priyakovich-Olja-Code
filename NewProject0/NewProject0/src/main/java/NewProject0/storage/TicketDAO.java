package NewProject0.storage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.Ticket;
import Models.Category;
import Models.Status;

public class TicketDAO {
	public List<Ticket> getAllTickets() {
		List<Ticket> allTickets = new ArrayList<Ticket>();
		try (Connection conn = ConnectionFactory.getInstance().getConnection()){
			
			String query = "select * from tickets";
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				allTickets.add(
						new Ticket(
								rs.getInt("id"),
								rs.getString("name"),
								rs.getInt("amount"),
								Category.valueOf(rs.getString("category")),
								Status.valueOf(rs.getString("status"))
								)
				);
								
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allTickets;
	}
	public Ticket getTicketById(int id) {
		try (Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String query = "Select * from ticket where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return new Ticket(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getInt("amount"),
						Category.valueOf(rs.getString("category")),
						Status.valueOf(rs.getString("status")));
						
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void addTicket(Ticket newTicket) {
		try(Connection conn=ConnectionFactory.getInstance().getConnection())
		{
			String query  = "insert into tickets (0,name, amount, category, status) values (?,?,?,CAST(? as category, status))";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, newTicket.getName());
			pstmt.setDouble(2, newTicket.getAmount());
			pstmt.setString(3, newTicket.getCategory().toString());
			pstmt.setString(4, newTicket.getStatus().toString());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
};
