import junit.framework.TestCase;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;

public class search_class_test extends TestCase {

	//@Test
	public void searchClassFunction () {
		
		String enterSubjectField = "CSC 131";
		String enterScheduleField = "MONDAY";
		String enterProfessorField = "JAGAN CHIDELLA";
		String enterUnitsField = "3";
		
		String searchSubjectField = "MATH";
		String searchProfessorFirstNameField = "KATHY";
		String searchProfessorLastNameField = "MILLER";
		
		String enterSubject = "CSC";
		String enterSchedule = "MONDAY";
		String enterProfessor = "CHIDELLA";
		String enterUnits = "3";
		
		String searchSubject = "MATH";
		String searchProfessorFirstName = "KATHY";
		String searchProfessorLastName = "MILLER";
		
		assertEquals("searchClassFunction()", enterSubjectField, enterSubject);
		assertEquals("searchClassFunction()", enterScheduleField, enterSchedule);
		assertEquals("searchClassFunction()", enterProfessorField, enterProfessor);
		assertEquals("searchClassFunction()", enterUnitsField, enterUnits);
		
		assertEquals("searchClassFunction()", searchSubjectField, searchSubject);
		assertEquals("searchClassFunction()", searchProfessorFirstNameField, searchProfessorFirstName);
		assertEquals("searchClassFunction()", searchProfessorLastNameField, searchProfessorLastName);
		
	}
}
