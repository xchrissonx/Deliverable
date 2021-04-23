
public class User {
	public String firstName, lastName, birthday, ssn, phone, email, address, username, password, id, name;
	public boolean active;
	
	public User(String firstName, String lastName, String birthday, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.ssn = ssn;
		phone = "";
		email = "";
		address = "";
		active = false;
	}
	
	public String getFirstName() {	return firstName;	}
	
	public String getLastName() {	return lastName;	}
	
	public String getBirthday() {	return birthday;	}
	
	public String getSsn() {	return ssn;	}
	
	public String getPhone() {	return phone;	}
	
	public String getEmail() {	return email;	}
	
	public String getAddress() {	return address;	}
	
	public void setPhone(String phone) {	this.phone = phone;		}
	
	public void setEmail(String email) {	this.email = email;	 	}
	
	public void setAddress(String address) {	this.address = address;	}
	
	public boolean isActive() {		return active;	}
	
}
