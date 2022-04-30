package bsee19020_Project;
import java.io.*;
import java.util.Vector;

public class Filereader {
private File f;
public Vector<String> d = new Vector <String> ();
	public Filereader(File s) {
	    f = s;
		}
	public Vector <String> reading()
	{
		int i = 0;
	  try {
		  BufferedReader bf = new BufferedReader(new FileReader(f));
		  while(true) {
		String filter = bf.readLine();
		 if (filter == null)
			 break;
		 if (i!=0)
			 d.add(filter);
			 i++;
			 }
			
		 bf.close();
		  return d ;
		  }
	  catch(Exception ex)
	  	{
		  System.out.println(" Error in vector and string "+ex.getMessage());
		  ex.printStackTrace();
		  return null;
	  	}	
	}
}
