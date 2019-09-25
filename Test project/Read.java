package class_Design;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read implements Dave{

	@Override
	public int countLines(File file) throws IOException {
	
		
		int tempNo=0;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			
			while (reader.readLine() !=null)
			{
				
				tempNo++;
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return tempNo;
		
	}

	
	
	
	
}
