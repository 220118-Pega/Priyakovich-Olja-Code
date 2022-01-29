package Models;

public class Employee {
	int id;
	String name;
	Boolean isManager;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsManager() {
		return isManager;
	}
	public void setIsManager(Boolean isManager) {
		this.isManager = isManager;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", isManager=" + isManager + "]";
	}
	
	
	
}
