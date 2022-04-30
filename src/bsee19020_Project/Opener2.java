package bsee19020_Project;
// THIS CLASS OPENS THE CSV FILE

import java.io.File;
import java.util.Vector;

public class Opener2 {
	protected String f;
	protected Vector <String> result;
	public Opener2(String text) {
		f = text;
	}
	public Vector <String> Open (Vector<String>v){
		try {
		result = new Vector<String>();
		File f = new File ("Records2.csv");
		Filereader2 gf = new Filereader2(f);
		result = gf.reading();
		}
		catch(Exception e) {
			System.out.println("File reading Error");
			e.printStackTrace();
		}
return result;
	}
}