package bsee19020_Project;
import java.io.File;
import java.io.FileWriter;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Readit {
	private String filepath;
	private String s;
	String string = "";
	int no;
	private String  jk;
	int i;
	int number;
	private Boolean bool2 = false;
	private StringTokenizer st;
	private String remove;
	FileWriter fw;
	File newfile;
	public Readit(String path, String rem) {
		filepath = path;
		remove = rem;
	}
	public Readit(String path,String edit,String match) {
		filepath = path;
		string = edit;
		remove = match;
	}
	public Boolean Edited(Boolean bool) {
		bool2 = bool;
		String Name = "";
		String copy0 = "";
		String copy1 = "";
		String copy2 = "";String copy3 = "";String copy4 = "";String copy5 = "";
		String copy6 = "";String copy7 = "";String copy8 = "";
		
		try {
			File Oldfile = new File(filepath);
			newfile = new File("temp.csv");
			Vector <String> u = null;
			fw = new FileWriter(newfile,true);
			Opener2 O = new Opener2(s);
			u = new Vector <String> ();
			u = O.Open(u);
				for(no = 0; no < u.size(); no++) {	
				String fa = (String)u.elementAt(no);   
		try {
				st = new StringTokenizer(fa,",\r");
				int us = st.countTokens();
				for(i = 0 ; i < us; i++) {
						jk = st.nextToken();
							if (i == 0) {
								Name = jk;
							}if (i == 1) {
								copy0 = jk;
							}if (i == 2) {
								copy1 = jk;
							}if (i == 3) {
								copy2 = jk;
							}if (i == 4) {
								copy3 = jk;
							}if (i == 5) {
								copy4 = jk;
							}if (i == 6) {
								copy5 = jk;
							}if (i == 7) {
								copy6 = jk;
							}if (i == 8) {
								copy7 = jk;
							}if (i == 9) {
								copy8 = jk;
							}
				     }//second for end
				String files = (Name+","+copy0+","+copy1+","+copy2+","+copy3+","+copy4+","+copy5
						+","+copy6+","+copy7+","+copy8+"\n");
				
		if (!Name.equalsIgnoreCase(remove)){
			fw.write(files);
		}else if(Name.equalsIgnoreCase(remove)) {
			fw.write(string);
			bool2 = true;
		}
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, " String tokenizer ERROR");
					e.printStackTrace();	
				}
				}
			fw.close();
			Oldfile.delete();
			File junk = new File(filepath);
			newfile.renameTo(junk);
		}catch(Exception csd) {
 JOptionPane.showMessageDialog(null, "ERROR in file reading and writing\n please close program & delete the temp.csv file in directory\nto futher use the prom");
            newfile.delete();
		}
		return bool2;
	}	
	
	public Boolean deleted(Boolean bool) {
		bool2 = bool;
		String copy0 = "";
		String Name = "";
		String copy1 = "";
		String copy2 = "";String copy3 = "";String copy4 = "";String copy5 = "";
		String copy6 = "";String copy7 = "";String copy8 = "";
		
		try {
			File Oldfile = new File(filepath);
			newfile = new File("temp.csv");
			Vector <String> u = null;
			fw = new FileWriter(newfile,true);
			Opener2 O = new Opener2(s);
			u = new Vector <String> ();
			u = O.Open(u);
				for(no = 0; no < u.size(); no++) {	
				String fa = (String)u.elementAt(no);   
		try {
				st = new StringTokenizer(fa,",\r");
				int us = st.countTokens();
				for(i = 0 ; i < us; i++) {
						jk = st.nextToken();
							if (i == 0) {
								Name = jk;
							}if (i == 1) {
								copy0 = jk;
							}if (i == 2) {
								copy1 = jk;
							}if (i == 3) {
								copy2 = jk;
							}if (i == 4) {
								copy3 = jk;
							}if (i == 5) {
								copy4 = jk;
							}if (i == 6) {
								copy5 = jk;
							}if (i == 7) {
								copy6 = jk;
							}if (i == 8) {
								copy7 = jk;
							}if (i == 9) {
								copy8 = jk;
							}
				     }//second for end
				String files = (Name+","+copy0+","+copy1+","+copy2+","+copy3+","+copy4+","+copy5
						+","+copy6+","+copy7+","+copy8+"\n");
				
		if (!Name.equalsIgnoreCase(remove)){
			fw.write(files);
		}else if(Name.equalsIgnoreCase(remove)) {
			bool2 = true;
		}
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, " String tokenizer ERROR");
					e.printStackTrace();	
				}
				}
			fw.close();
			Oldfile.delete();
			File junk = new File(filepath);
			newfile.renameTo(junk);
		}catch(Exception csd) {
 JOptionPane.showMessageDialog(null, "ERROR in file reading and writing\n please close program & delete the temp.csv file in directory\nto futher use the prom");
            newfile.delete();
		}
		return bool2;
	}	

}
