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
								Category.valueOf(rs.getString("Category")),
								Status.valueOf(rs.getString("Status"))
								)
				);
								
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allTickets;
	}
};
