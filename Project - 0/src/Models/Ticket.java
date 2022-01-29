package Models;

import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;
import java.util.Locale.Category;
public class Ticket {
	
	String description;
	double amount;
	Status status;
	Category category;
	LocalDate submission_date = LocalDate.now();
	int employee_id;
	private int id;
	
	
	
	public Ticket(Status status) {
		this.status = status;
	}
	
	public Ticket(Status status, double amount,Category category,LocalDate submission_date, int emloyee_id)
	{	this(status);
		this.amount = amount;
		this.category = category;
		this.submission_date = submission_date;
		this.description = description;
		this.employee_id = employee_id;
	}
	public Ticket(double amount, Status status, Category category, String description, LocalDate submission_date, int employee_id, int id)
	{	this(status, amount, category, submission_date, employee_id);
		this.id = id;
	}

	
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

	public LocalDate getSubmission_date() {
		return submission_date;
	}

	public void setSubmission_date(LocalDate submission_date) {
		this.submission_date = submission_date;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
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
				+ category + ", submission_date=" + submission_date + ", employee_id=" + employee_id + ", id=" + id
				+ "]";
	}
	
	
}