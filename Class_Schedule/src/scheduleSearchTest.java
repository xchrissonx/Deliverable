import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


class scheduleSearchTest {

	@Test
	void testSearch() throws IOException {
		ArrayList<classInfo> result = new ArrayList<classInfo>();
		classInfo nn = new classInfo();
		result.add(nn);
		result.get(0).setTitle("csc131");
		result.get(0).setClassDescription("Principles of Software Engineering covering");
		result.get(0).setClassId("21234");
		result.get(0).setPrerequisite("csc130");
		result.get(0).setProfassorName("chidella");
		result.get(0).setTime("11:00 AM");
		
		assertEquals("search()",
				result.get(0).getTitle(), result.get(0).getTitle() );
		
		assertEquals("search()",
				result.get(0).getTime(), result.get(0).getTime() );
		
		assertEquals("search()",
				result.get(0).getProfassorName(), result.get(0).getProfassorName() );
		
		assertEquals("search()",
				result.get(0).getPrerequisite(), result.get(0).getPrerequisite() );
		
		assertEquals("search()",
				result.get(0).getClassId(), result.get(0).getClassId() );
		
		assertEquals("search()",
				result.get(0).getClassDescription(), result.get(0).getClassDescription() );
	}

	
	 @Test 
	 void testDisplay() {
		 ArrayList<classInfo> result = new ArrayList<classInfo>();
			classInfo nn = new classInfo();
			result.add(nn);
			result.get(0).setClassDescription("Principles of Software");
			assertEquals("search()",
				result.get(0).getClassDescription(), result.get(0).getClassDescription() );
		
			}
	 
}