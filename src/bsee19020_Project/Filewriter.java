package bsee19020_Project;

import java.io.FileWriter;

public class Filewriter {
	FileWriter f = null;
	public void Writer(String data) {
		try {
			f = new FileWriter("Records2.csv",true);
			f.write(data);
			f.close();
			}catch(Exception ef) {
			System.out.println("**you have an error in creating the file.**");
			ef.printStackTrace();
			} 
	}
}
