package expenseReimbursement.models;

import java.awt.Window.Type;
import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;


	//Field
	public class createTicket {
		private String reinbursement; 
		private int id;
		Status status;
		Type type; 
		LocalDate date = LocalDate.now();
	
	
	//constructors
	public createTicket(String reinbursement, int id, Status status, Type type, LocalDate date) {
		super();
		this.reinbursement = reinbursement;
		this.id = id;
		this.status = status;
		this.type = type;
		this.date = date;
	}



	public String getReinmursement() {
		return reinbursement;
	}



	public void setReinmursement(String reinmursement) {
		this.reinbursement = reinmursement;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "createTicket [reinmursement=" + reinbursement + ", id=" + id + "]";
	}
	

	
	
	
	
}
	

