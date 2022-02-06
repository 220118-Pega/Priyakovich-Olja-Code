package Models;

public class Ticket {
	private int id;
	private String name;
	private double amount;
	private Category Category;
	private Status Status;
	
	
	public Ticket(int id, String name, double amount, Models.Category category, Models.Status status) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		Category = category;
		Status = status;
	}
	
	
	public Ticket() {
		
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Category getCategory() {
		return Category;
	}
	public void setCategory(Category category) {
		Category = category;
	}
	public Status getStatus() {
		return Status;
	}
	public void setStatus(Status status) {
		Status = status;
	}


	@Override
	public String toString() {
		return "Ticket [id=" + id + ", name=" + name + ", amount=" + amount + ", Category=" + Category + ", Status="
				+ Status + "]";
	}
	
	
	
}
