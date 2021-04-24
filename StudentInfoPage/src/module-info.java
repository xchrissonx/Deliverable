public class User {
	private String username;
	private String password;
	private String id;
	private String name;
	private boolean active;
 
 
	public User(String username, String password, String id, String name, boolean active) {
    	this.username = username;
    	this.password = password;
    	this.id = id;
    	this.name = name;
    	this.active = active;
	}
 
	public boolean login() {
    	return true;
	}
 
	public String getUsername() {
    	return username;
	}
 
	public void setUsername(String username) {
    	this.username = username;
	}
 
	public String getPassword() {
    	return password;
	}
 
	public void setPassword(String password) {
    	this.password = password;
	}
 
	public String getId() {
    	return id;
	}
 
	public void setId(String id) {
    	this.id = id;
	}
 
	public String getName() {
    	return name;
	}
 
	public void setName(String name) {
    	this.name = name;
	}
 
	public boolean isActive() {
    	return active;
	}
 
	public void setActive(boolean active) {
    	this.active = active;
	}
}
 
 
import java.sql.Date;
 
public class Student extends User{
	private Date dateEnrolled;
	private AcademicYear currentAcademicYear;
 
	public Student(String username, String password, String id, String name, boolean active) {
    	super(username, password, id, name, active);
	}
 
	public Date getDateEnrolled() {
    	return dateEnrolled;
	}
 
    public void setDateEnrolled(Date dateEnrolled) {
    	this.dateEnrolled = dateEnrolled;
	}
 
	public AcademicYear getCurrentAcademicYear() {
    	return currentAcademicYear;
	}
 
	public void setCurrentAcademicYear(AcademicYear currentAcademicYear) {
    	this.currentAcademicYear = currentAcademicYear;
	}
}
 
 
 
 
 
import java.util.ArrayList;
 
public class Lecturer extends User{
 
	private String title;
	private String specialization;
	private ArrayList<String> subjects;
 
	public Lecturer(String username, String password, String id, String name, boolean active) {
    	super(username, password, id, name, active);
	}
 
 
	public String getTitle() {
    	return title;
	}
 
	public void setTitle(String title) {
	    this.title = title;
	}
 
	public String getSpecialization() {
    	return specialization;
	}
 
	public void setSpecialization(String specialization) {
    	this.specialization = specialization;
	}
 
	public ArrayList<String> getSubjects() {
    	return subjects;
	}
 
	public void setSubjects(ArrayList<String> subjects) {
    	this.subjects = subjects;
	}
}
 
 
public class StudentClass {
	private String name;
	private Lecturer lecturer;
	private int hours;
 
	public StudentClass(String name, Lecturer lecturer, int hours) {
    	this.name = name;
    	this.lecturer = lecturer;
    	this.hours = hours;
	}
 
	public String getName() {
    	return name;
	}
 
	public void setName(String name) {
    	this.name = name;
	}
 
	public Lecturer getLecturer() {
    	return lecturer;
	}
 
	public void setLecturer(Lecturer lecturer) {
    	this.lecturer = lecturer;
	}
 
	public int getHours() {
    	return hours;
	}
 
	public void setHours(int hours) {
    	this.hours = hours;
	}
}
import java.util.ArrayList;
 
public class AcademicYear {
	private String name;
	private Student student ;
	private String semester;
	private ArrayList<StudentClass> classes;
 
    public AcademicYear(String name, Student student, String semester, ArrayList<StudentClass> classes) {
    	this.name = name;
    	this.student = student;
    	this.semester = semester;
    	this.classes = classes;
	}
 
	public AcademicYear() {
	}
 
	public String getName() {
    	return name;
	}
 
	public void setName(String name) {
    	this.name = name;
	}
 
	public Student getStudent() {
    	return student;
	}
 
	public void setStudent(Student student) {
        this.student = student;
	}
 
	public String getSemester() {
    	return semester;
	}
 
	public void setSemester(String semester) {
    	this.semester = semester;
	}
 
	public ArrayList<StudentClass> getClasses() {
    	return classes;
	}
 
	public void setClasses(ArrayList<StudentClass> classes) {
    	this.classes = classes;
	}
}
import javax.swing.*;
import java.awt.*;
 
public class StudentPage extends JFrame {
 
 
	public StudentPage(AcademicYear academicYear) throws HeadlessException {
 
    	setLayout(null);
 
    	//    	Name / id
    	JLabel name_l = new JLabel("name: "+academicYear.getStudent().getName());
    	name_l.setBounds(10, 10, 300, 50);
    	add(name_l);
 
    	//    	Current year
    	JLabel year_l = new JLabel("Year: "+academicYear.getName());
    	year_l.setBounds(10, 70, 300, 50);
    	add(year_l);
 
    	//    	Current semester
    	JLabel semester_l = new JLabel("Semester: "+academicYear.getSemester());
        semester_l.setBounds(10, 140, 300, 50);
    	add(semester_l);
 
 
    	//    	Enrollment date
    	JLabel date_l = new JLabel("Enrollment date: "+academicYear.getStudent().getDateEnrolled());
    	date_l.setBounds(10, 200, 300, 50);
 	   add(date_l);
 
    	//    	List of current enrolled classes
    	JLabel classes_l = new JLabel("Classes list");
    	classes_l.setBounds(10, 200, 300, 50);
    	add(classes_l);
 
    	for (int i = 0; i < academicYear.getClasses().size(); i++) {
        	JLabel classi = new JLabel((i+1)+".\t"+academicYear.getClasses().get(i).getName());
        	classi.setBounds(20, 200+(60*(i+1)), 300, 50);
        	add(classi);
    	}
 
    	int width = 450;
    	int height = 300+60*academicYear.getClasses().size();
    	setSize(width, height);
 
    	setVisible(true);
 
	}
}
