package expenseReimbursement.models;

public class createTicket {
	private String title;
	private String description;
	private int id;
	

	
	public createTicket() {
			
	}
	
	public createTicket(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	public createTicket (String title, String description, int id)
	{
		this(title, description);
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "createTicket [title=" + title + ", description=" + description + ", id=" + id + "]";
	}
	
	
	
}
	

