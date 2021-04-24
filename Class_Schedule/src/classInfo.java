
public class classInfo {
	
	private String title;
	private String profassorName;
	private String classDecription;
	private String prerequisite;
	private String time;
	private int classId;
	
	
	//set functions
	public void setTitle(String title) {
		this.title = title;
	}
	public void setProfassorName(String pn) {
		profassorName = pn;
	}
	public void setClassDescription(String sDec) {
		classDecription = sDec;
	}
	public void setPrerequisite(String prere) {
		prerequisite = prere;
	}
	public void setTime(String t) {
		time = t;
	}
	public void setClassId(int id) {
		classId= id;
	}
	
	
	//get functions 
	public String getTitle() {
		return title;
	}
	public String getProfassorName() {
		return profassorName;
	}
	public String getClassDescription() {
		return classDecription;
	}
	public String getPrerequisite() {
		return prerequisite;
	}
	public String getTime() {
		return time;
	}
	public int getClassId() {
		return classId;
	}
	
	//I didn't understand this methods
	private String listProf() {
		return null;
	}
	private int spots() {
		return 0;
	}
	private int spotsleft() {
		return 0;
	}
	private int getSpots() {
		return 0;
	}
	public void updateSpots() {
		
	}
	public void updateProf() {
		
	}
		

}
