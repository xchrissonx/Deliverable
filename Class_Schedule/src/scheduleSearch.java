import java.util.ArrayList;

public class scheduleSearch extends classInfo {
	
	private ArrayList<classInfo> result = new ArrayList<classInfo>();
	//private classInfo nn = new classInfo();
	
	public ArrayList<classInfo> search() {	
		
		for(int i=0; i < 3; i++) {
			classInfo nn = new classInfo();
			result.add(nn);
		}
		//Demo 
		//first course
		result.get(0).setClassId(80407);
		result.get(0).setTitle("CSC 130 - Data Structure+Algorithm Analy (3 Units)" );
		result.get(0).setTime("Days MWF Times: 1100AM-1150AM\n");
		result.get(0).setClassDescription("Specification, implementation, and manipulation of abstract data types"
				+ " and their structures: \n balanced trees, priority queues, sets, hash tables, and graphs; recursion;"
				+ " searching and sorting algorithms;\n asymptotic analysis; NP completeness;fundamental graph algorithms"
				+ " including graph search, shortest path, and minimum spanning trees\n");
		result.get(0).setPrerequisite("Prerequisite: CSC 20, CSC 28; CSC 28 may be taken concurrently. Not currently enrolled in CSC 130.\n");
		result.get(0).setProfassorName("Phillips,Matthew\n");
		
		
		//second course
		result.get(1).setClassId(80615);
		result.get(1).setTitle("CSC 133 - Obj-Oriented Cmptr Graph (3 Units)\r\n"
				+ "");
		result.get(1).setTime("Days MWF Times: 0900AM-0950AM");
		result.get(1).setClassDescription("Introduction to computer graphics and to advanced topics in object-oriented programming.\n"
				+ " Mobile application development; implementation of event-driven systems; advanced object-oriented concepts such \n"
				+ "as inheritance and polymorphism; implementation of software design patterns; graphical user interface development;\n"
				+ " fundamentals of 2D graphics systems. Application of these topics to mobile programming.");
		result.get(1).setPrerequisite("Prerequisite: CSC 130, CSC 131, not currently enrolled in CSC 133.\n");
		result.get(1).setProfassorName("Posnett,Daryl P	\n");
		
		//third course
		result.get(2).setClassId(80408);
		result.get(2).setTitle("CSC 131 - Computer Software Engr (3 Units)");
		result.get(2).setTime("Days TR Times: 1200PM-0115PM");
		result.get(2).setClassDescription("Principles of Software Engineering covering the software development life cycle, including software requirements \n"
				+ "engineering (elicitation, modeling, analysis and specification), software design, software implementation and testing.\n"
				+ " Main topics include various software development process models, method and techniques for specifying requirements,\n"
				+ " architectural and detailed design specification, prototyping, top-down and bottom-up software implementation and testing.\n"
				+ " Topics also include project management, project documentation and the development of communication skills through written\n"
				+ " documentation and oral presentation.");
		result.get(2).setPrerequisite("Prerequisite: CSC 130; may be taken concurrently. Not currently enrolled in CSC 131.");
		result.get(2).setProfassorName("Chidella,Jagannadha S");
		
		
		return result;
	}
	
	public void display(ArrayList<classInfo> result) {
		//System.out.print(result.get(0).getPrerequisite());
		for(int i=0; i< result.size();i++) {
			System.out.println("course ID:" + result.get(i).getClassId());
			System.out.println(result.get(i).getTitle());
			System.out.println(result.get(i).getTime());
			System.out.println(result.get(i).getClassDescription());
			System.out.println(result.get(i).getPrerequisite());
			System.out.println(result.get(i).getProfassorName());
		}
	}
	
	
	
}
