package expenseReimbursement.models;

import java.awt.Window.Type;
import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;


	
	public class createTicket {
		//Fields
		private int id;
		private Type type;
		private Status status;
		private String amount;
		private LocalDate date = LocalDate.now();
	
	
	//constructors

	public createTicket(int id, Type type, Status status, String amount, LocalDate date) {
		
		
		this.id = id;
		this.type = type;
		this.status = status;
		this.amount = amount;
		this.date = date;
	}


	public createTicket(Type type, Status status, long amount, int id, LocalDate date) {
		this(null, id, type, status, amount);
		this.id = id;
		this.date = date;
	}


	public createTicket(String name2, int id2, Type type2, Status status2, long amount2) {
		// TODO Auto-generated constructor stub
	}



	public createTicket(Object amount2) {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "createTicket [Name=" + Name + ", id=" + id + ", type=" + type + ", status=" + status + ", amount="
				+ amount + ", date=" + date + "]";
	}
	
}
	

