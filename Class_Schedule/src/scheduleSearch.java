import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class scheduleSearch extends classInfo {
	
	private ArrayList<classInfo> result = new ArrayList<classInfo>();
	
	public ArrayList<classInfo> search() throws IOException {	
		
		for(int i=0; i < 3; i++) {
			classInfo nn = new classInfo();
			result.add(nn);
		}
		
		
		File file=new File("input.txt");    //creates a new file instance  
		FileReader fr=new FileReader(file);   //reads the file  
		BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
		String line; 
		
		ArrayList<String> srt = new ArrayList<String>();
		while((line=br.readLine())!=null)  
		{  
			srt.add(line);		
				
		}  
		for(int i=0; i< srt.size();i++)
		System.out.println(srt.get(i));
		
		String searchValue = " ";
		String searchResult = " ";
		for(int i=0; i< srt.size();i++) {
			if(srt.get(i).contains(searchValue))
				searchResult = srt.get(i);
		}
		
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
