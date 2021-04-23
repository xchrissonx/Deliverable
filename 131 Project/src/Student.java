
public class Student extends User {
	String major, term;
	
	public Student(String firstName, String lastName, String birthday, String ssn, String major, String term) {
		super(firstName, lastName, birthday, ssn);
		this.major = major;
		this.term = term;
		active = true;
	}
	
	public String getMajor() {	return major;	}
	
	public String getTerm() {	return term;	}
	
	public void setMajor(String major) {	this.major = major;	}
	
	public void setTerm(String term) {	this.term = term;	}
}
