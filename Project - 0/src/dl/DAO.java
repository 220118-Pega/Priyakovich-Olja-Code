package dl;

import java.util.List;

import ui.Status;

public interface DAO<T, K> {
	T findById(K id);
	List<T>getTicketbyEmployeeId(K emloyee_id);
	List<T>filterStatus(Status status);
	List<T>findAllTickets();
	void add(T newObject);
	void update(T newObject);
	
	
}
