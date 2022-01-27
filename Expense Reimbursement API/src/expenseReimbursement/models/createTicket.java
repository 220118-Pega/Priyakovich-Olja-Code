package expenseReimbursement.models;

import java.awt.Window.Type;
import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;
import enums.*;
	
	public class createTicket {
		//Fields
		int id;
		double amount;
		Status status;
		Type type;
		LocalDate date = LocalDate.now()
;	
	
	//constructors

	public createTicket(double amount, Status status, Type type, LocalDate date) {
		
		this.amount = amount;
		this.status = status;
		this.type = type;
		this.date = date;
		
	}


	public createTicket(double amount, Status status, Type type, LocalDate date, int id) {
		this(amount, status, type, date);
		
		
	}
	
	public createTicket(double amount, Status status) {
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


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
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
		return "createTicket [id=" + id + ", type=" + type + ", status=" + status + ", amount="
				+ amount + ", date=" + date + "]";
	}
	
}
	

