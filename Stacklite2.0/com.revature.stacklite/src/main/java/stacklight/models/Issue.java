package stacklight.models;

import java.util.List;

/**
 * This is a class used to model coding issues
 * @author oljap.
 *
 */
public class Issue {
//The class: the blue print, the template
	//The members: fields or attributes, methods, constructors

//Fields
	//used to define characteristics of a class
	//used to define dependencies of the class 
	
	private String title;
	private String description;
	private int Id;
	private List<Solution> solutions;
	
	
//Constructors
	//special methods that are used to initialize properties of a class
	//if you don't put in a constructor, there is default constructor
	//No Args constructor
	public Issue() {
		
	}
	//Parameterized constructor
	public Issue(String title, String description) {
		//the this keyword pertains to the particular instance's title and description properties
		
		this.title = title;
		this.description = description;
	}
	public Issue(String title, String description, int id) {
		
		//Calling an existing constructor of the same class
		this(title, description);
		this.Id = id;
	}
	public Issue(String title, String description, int id, List<Solution> solutions)
	{
		this(title, description, id);
		this.solutions = solutions;
	}
	// having multiple constructors is a form of polymorphism, called method overloading
	
	//Methods
		//describe behavior of your class
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
		return Id;	
	}
	public void setId(int id) {
		Id = id;
	}
	
	public List<Solution> getSolutions() {
		return solutions;
	}
	public void setSolutions(List<Solution> solutions) {
		this.solutions = solutions;
	}
	//Format of object when converted to string
	@Override
	public String toString() {
		return "Issue [title = " + title + ", description = " + description + ", Id= " + Id + "]";
	}
	

}
