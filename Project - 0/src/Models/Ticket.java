package Models;


import java.time.LocalDate;
import java.time.LocalDateTime;

import ui.Category;
import ui.Status;




public class Ticket {
	
	String description;
	double amount;
	Status status;
	Category category;
	LocalDateTime submission_date = LocalDateTime.now();
	private int id;
	
	
	public Ticket() {
		
	}
	
	public Ticket(Status status) {
		this.status = status;
	}
	
	public Ticket(String description, double amount, Status status, Category category, LocalDateTime submission_date,
			int id) {
		this.description = description;
		this.amount = amount;
		this.status = status;
		this.category = category;
		this.submission_date = submission_date;
		this.id = id;
	}

//	public Ticket(Status status, double amount,Category category,LocalDate submission_date, int emloyee_id)
//	{	this.status = status;
//		this.amount = amount;
//		this.category = category;
//		this.submission_date = submission_date;
//		this.description = description;
//		this.employee_id = employee_id;
//	}
//	public Ticket(double amount, ui.Status status2, ui.Category category2, String description, LocalDate submission_date, int employee_id, int id)
//	{	this(status2, amount, category2, submission_date, employee_id);
//		this.id = id;
//	}

	
//	public Ticket(double d, ui.Status pending, ui.Category food, LocalDate now, String string, int i) {
//		// TODO Auto-generated constructor stub
//	}

//	public Ticket(ui.Status status2, double amount2, ui.Category category2, LocalDate submission_date2,
//			int employee_id2) {
//		// TODO Auto-generated constructor stub
//	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDateTime getSubmission_date() {
		return submission_date;
	}

	public void setSubmission_date(LocalDateTime submission_date) {
		this.submission_date = submission_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ticket [description=" + description + ", amount=" + amount + ", status=" + status + ", category="
				+ category + ", submission_date=" + submission_date + ", id=" + id + "]";
	}

	
	
}
