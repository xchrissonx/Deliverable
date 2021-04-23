
public class Account {
	public static void main(String [] args) {
		Student user = new Student("Josiah", "Villarante", "Marh 12 1998", "123-23-1234", "CS", "Fall");
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getBirthday() + " " + user.getSsn());
		user.setAddress("1234 st");
		user.setEmail("email@csus.edu");
		user.setPhone("1-800-who-cares");
		System.out.println(user.getAddress() + " " + user.getEmail() + " " + user.getPhone());
		user.setMajor("Math");
		user.setTerm("Spring");
		System.out.println(user.getMajor() + " " + user.getTerm());
		
		Account a = new Account(user, "jvillarante", "1234");
		System.out.println(a.getUsername() + " " + a.getPassword());
		a.setPassword("password");
		a.setUsername("jvillarante98");
		System.out.println(a.getUsername() + " " + a.getPassword());
		
		System.out.println(a.getStudent().getBirthday());
		
		System.out.println(a.getStudent().isActive());
	}
	
	private String userName, password;
	private Student student;
	public Account(Student student, String userName, String password) {
		this.userName = userName;
		this.password = password;
		this.student = student;
	}
	
	public String getUsername() {	return userName;	}
	
	public String getPassword() {	return password;	}
	
	public Student getStudent() {	return student;		}
	
	private void setUsername(String userName) {		this.userName = userName;	}
	
	private void setPassword(String password) {		this.password = password;	}
}
