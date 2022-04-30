// THIS CLASS OPENS THE CSV FILE
package bsee19020_Project;
import java.io.File;
import java.util.Vector;

public class Opener {
	protected String f;
	protected Vector <String> result;
	public Opener(String text) {
		f = text;
	}
	public Vector <String> Open (Vector<String>v){
		try {
		result = new Vector<String>();
		File f = new File ("Records2.csv");
		Filereader gf = new Filereader(f);
		result = gf.reading();
		}
		catch(Exception e) {
			System.out.println("File reading Error");
			e.printStackTrace();
		}
return result;
	}
}