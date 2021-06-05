public class Model {
	//Private fields belonging to the model
	private String firstname;
	private String lastname;

	//Constructor
	public Model(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	//Getter for the first name
	public String getFirstname() {
		return firstname;
	}
	
	//Setter for the first name
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	//Getter for the last name
	public String getLastname() {
		return lastname;
	}

	//Setter for the last name
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}