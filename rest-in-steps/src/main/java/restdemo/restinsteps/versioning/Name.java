package restdemo.restinsteps.versioning;

public class Name {
  public String getFirstName() {
		return firstName;
	}
	public Name(String firstName, String secondName) {
	super();
	this.firstName = firstName;
	this.secondName = secondName;
}
	public Name() {
		super();
	}
	public String getSecondName() {
		return secondName;
	}
public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
private String firstName;
  private String secondName;
}
