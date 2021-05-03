import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class classInfoTest {

	@Test
	void testSetTitle() {
		
			String title = "csc131";
			classInfo info = new classInfo();
			info.setTitle(title);
			assertEquals("getTitle()",
					title, info.getTitle() );
		
		//fail("Not yet implemented");
	}

	@Test
	void testSetProfassorName() {
		String profName = "mike";
		classInfo info = new classInfo();
		info.setProfassorName(profName);
		assertEquals("setProfassorName()",
				profName, info.getProfassorName() );
	}

	@Test
	void testSetClassDescription() {
		String classDec = "Principles of Software ";
		classInfo info = new classInfo();
		info.setClassDescription(classDec);
		assertEquals("setClassDescription()",
				classDec, info.getClassDescription() );
	}

	@Test
	void testSetPrerequisite() {
		String prere = "csc 130 and csc 60";
		classInfo info = new classInfo();
		info.setPrerequisite(prere);
		assertEquals("SetPrerequisite()",
				prere, info.getPrerequisite() );
	}

	@Test
	void testSetTime() {
		String setT = "12:15 AM";
		classInfo info = new classInfo();
		info.setTime(setT);
		assertEquals("SetTime()",
				setT, info.getTime() );
	}

	@Test
	void testSetClassId() {
		String classId = "80213";
		classInfo info = new classInfo();
		info.setClassId(classId);
		assertEquals("SetClassId",
				classId, info.getClassId() );
	}

}
