package bsee19020_Project;

import javax.swing.*;
import java.awt.Font;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Vector;
import java.awt.Dimension;
import java.awt.Label;

public class UserGui extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton b1 ;
	public JButton BOOK ;
	public int i = 0;
	public String length;
	public TextArea textArea;
	public Choice typeday,
	typeyear,
	typemonth,typevenue,typepeople,eventchoice;
	private JButton UserBack;
	private JTextField namer;
	private JLabel NAMES,arrowL,newL;
	private Label selectE;

	public UserGui() {
		setTitle("USER INTERFACE");
		getContentPane().setBackground(Color.WHITE);
		setPreferredSize(new Dimension(615, 415));
		setSize(new Dimension(615, 419));
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().setLayout(null);
		
		JLabel Venue = new JLabel("Venue:");
		Venue.setToolTipText("Quality of Venue");
		Venue.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Venue.setBounds(40, 60, 83, 24);
		getContentPane().add(Venue);
		
		JLabel Image = new JLabel("");
		Image.setToolTipText("UserImage");
		Image.setIcon(new ImageIcon(UserGui.class.getResource("user-group-icon.png")));
		Image.setBounds(450, 16, 127, 140);
		getContentPane().add(Image);
		
		JLabel city = new JLabel("City:");
		city.setToolTipText("Type the name of the city");
		city.setFont(new Font("Times New Roman", Font.BOLD, 15));
		city.setBounds(40, 29, 89, 19);
		getContentPane().add(city);
		
		JLabel Typedate = new JLabel("Date:");
		Typedate.setToolTipText("Date to Attend the Event");
		Typedate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Typedate.setBounds(40, 96, 83, 19);
		getContentPane().add(Typedate);
		
		typeday = new Choice();
		typeday.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		for (int i = 1;i < 32;i++) {
				if(i < 10) {
		typeday.add("0"+String.valueOf(i));
				}else {
		typeday.add(String.valueOf(i));
				}
		}
		typeday.setBackground(Color.LIGHT_GRAY);
		typeday.setBounds(136, 96, 38, 20);
		getContentPane().add(typeday);
		
		typeyear = new Choice();
		typeyear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			sdf = new SimpleDateFormat("yyyy");
			date = new Date();
			typeyear.add(sdf.format(date));
			uh = Integer.parseInt(sdf.format(date));
			for (int i = 0;i < 31;i++) {
				uh++;
			typeyear.add(String.valueOf(uh));
		
			}
		typeyear.setBackground(Color.LIGHT_GRAY);
		typeyear.setBounds(224, 96, 58, 22);
		getContentPane().add(typeyear);
		
		typemonth = new Choice();
		typemonth.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		for (int i = 1;i < 13;i++) {
				if(i < 10) {
		typemonth.add("0"+String.valueOf(i));
				}else {
		typemonth.add(String.valueOf(i));
				}		
		}
		typemonth.setBackground(Color.LIGHT_GRAY);
		typemonth.setBounds(180, 96, 38, 22);
		getContentPane().add(typemonth);
		textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setText("Available Events (Results):");
		textArea.setBounds(40, 144, 258, 215);
		getContentPane().add(textArea);
		
		typevenue = new Choice();
		typevenue.add("Conference Room");
		typevenue.add("Marriage Hall");
		typevenue.add("Meeting Room");
		typevenue.setBounds(136, 61, 185, 22);
		getContentPane().add(typevenue);
		
		b1 = new JButton("Search");
		b1.setToolTipText("Search for Events");
		
		b1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		b1.setAutoscrolls(true);
		b1.setBounds(488, 213, 89, 43);
		getContentPane().add(b1);
		
		UserBack = new JButton("Back");
		UserBack.setToolTipText("Return to the Main Interface");
		UserBack.setFont(new Font("SansSerif", Font.BOLD, 12));
		
		UserBack.setBounds(488, 319, 89, 23);
		getContentPane().add(UserBack);
		
		typepeople = new Choice();
		for (i = 1; i < 100; i++) {
			length = String.valueOf(i);
		typepeople.add(length);
		}
		
		typepeople.setBounds(390, 96, 38, 22);
		getContentPane().add(typepeople);
		
		JLabel People = new JLabel("No. of people:");
		People.setToolTipText("Maximum number of People");
		People.setFont(new Font("Times New Roman", Font.BOLD, 15));
		People.setBounds(288, 93, 96, 24);
		getContentPane().add(People);
		
		NAMES = new JLabel("Username:");
		NAMES.setForeground(Color.RED);
		NAMES.setBackground(Color.RED);
		NAMES.setToolTipText("Enter your name in Field");
		NAMES.setFont(new Font("Times New Roman", Font.BOLD, 17));
		NAMES.setBounds(368, 167, 89, 24);
		NAMES.setVisible(false);
		getContentPane().add(NAMES);
		
		namer = new JTextField();
		namer.setBackground(Color.YELLOW);
		namer.setVisible(false);
		namer.setToolTipText("Type your name");
		namer.setColumns(10);
		namer.setBounds(467, 167, 114, 24);
		getContentPane().add(namer);
		
		BOOK = new JButton("BOOK!");
		BOOK.setVisible(false);
		BOOK.setBounds(488, 273, 89, 23);
		getContentPane().add(BOOK);
		
		typecity = new Choice();
		typecity.add("Lahore");
		typecity.add("Islamabad");
		typecity.add("Sahiwal");
		typecity.setBounds(138, 29, 106, 22);
		getContentPane().add(typecity);
		
		eventchoice = new Choice();
		eventchoice.setBackground(Color.YELLOW);
		eventchoice.setBounds(424, 258, 58, 22);
		getContentPane().add(eventchoice);
		eventchoice.setVisible(false);
		
		selectE = new Label("Select an Event:");
		selectE.setFont(new Font("Times New Roman", Font.BOLD, 17));
		selectE.setForeground(Color.RED);
		selectE.setBounds(304, 217, 129, 22);
		getContentPane().add(selectE);
		selectE.setVisible(false);
		
		arrowL = new JLabel("");
		arrowL.setForeground(Color.BLACK);
		arrowL.setBackground(Color.WHITE);
		arrowL.setIcon(new ImageIcon(UserGui.class.getResource("Arrows-Right-3-icon.png")));
		arrowL.setBounds(336, 235, 48, 61);
		getContentPane().add(arrowL);
		
		newL = new JLabel("No.");
		newL.setVisible(false);
		newL.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		newL.setBounds(393, 258, 25, 24);
		getContentPane().add(newL);
		arrowL.setVisible(false);
		
	
		 
	}
	public void visible(String n,int k) {
		eventchoice.setVisible(true);
		arrowL.setVisible(true);
		selectE.setVisible(true);
		BOOK.setVisible(true);
		namer.setVisible(true);
		newL.setVisible(true);
		NAMES.setVisible(true);
	      BOOK.addActionListener( new ActionListener() {
	    	  String sdfg = "";
			public void actionPerformed(ActionEvent e) {
				user = namer.getText();
				if(user.equals("")) {
					textArea.setForeground(Color.RED);
					textArea.setText("\nTYPE USERNAME TO BOOK");
				}else {
					textArea.setForeground(Color.BLACK);
			sdfg = USER(n,k);
		 textArea.setText(sdfg);
				}
			 }
	      }); 
	}
	public String USER(String n,int nos) {
			textArea.setForeground(Color.BLACK);
			String Name = null;
			String copy1 = null;
			String copy2 = null;String copy3 = null;String copy4 = null;String copy5 = null;
			String copy6 = null;String copy7 = null;String copy8 = null;String username = null;
			
			try {
				Oldfile = new File(filepath);
				newfile = new File("temp2.csv");
				Vector <String> u = null;
				fw = new FileWriter(newfile,true);
				Opener2 O = new Opener2(s);
				u = new Vector <String> ();
				u = O.Open(u);
				number = eventchoice.getSelectedItem();
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
									copy1 = jk;
								}if (i == 2) {
									copy2 = jk;
								}if (i == 3) {
									copy3 = jk;
								}if (i == 4) {
									copy4 = jk;
								}if (i == 5) {
									copy5 = jk;
								}if (i == 6) {
									copy6 = jk;
								}if (i == 7) {
									copy7 = jk;
								}if (i == 8) {
									copy8 = jk;
								}if (i == 9) {
									username = jk;
								}
					}//second for end
		file = (number+","+copy3+","+copy4+","+copy5+","+copy6+","+copy7+","+copy8);
		
		files = (Name+","+copy1+","+copy2+","+copy3+","+copy4+","+copy5+","+copy6+","+copy7+","+copy8+","+username+"\n");
		
		String st[] = n.split("\\|");
		checkbook = 0;
		for (int k = 0;k < nos-1; k++ ) {
			if(file.equals(st[k])) {
				checkbook++;
			}
		}
		if (checkbook == 0){
				fw.write(files);
			}
		else if(checkbook != 0) {
				sdf2 = "\nEVENT BOOKED!";
				files2 = (Name+","+copy1+","+copy2+","+copy3+","+copy4+","+copy5+","+copy6+","+copy7+",No,"
						+user+"\n");
				fw.write(files2);
			}
		
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, " String tokenizer ERROR");
						e.printStackTrace();	
					}
					}//FIRST FOR ENDS
				fw.close();
				Oldfile.delete();
				File junk = new File(filepath);
				newfile.renameTo(junk);
			}catch(Exception csd) {
	 JOptionPane.showMessageDialog(null, "ERROR in file reading and writing\n please close program & delete the temp.csv file in directory\nto futher use the prom");
	            newfile.delete();
			}
			return sdf2;
	}	

	public void Setuplisteners(ActionListener i,ActionListener k) {
		b1.addActionListener(i);
		UserBack.addActionListener(k);
		}
	private String filepath = "Records2.csv";
	private String s,file;
	int no;
	private String  jk;
	private String  sdf2 = "";
	private String  user = "";
	int checkbook = 0;
	String number;
	String files,files2;
	private SimpleDateFormat sdf;
	private int uh;
	private Date date;
	private StringTokenizer st;
	private FileWriter fw;
	private File newfile;
	private File Oldfile;
	public Choice typecity;
}

