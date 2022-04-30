 package bsee19020_Project;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Choice;
import java.awt.Cursor;

public class Deleter extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField typerecord;
	private OrganizerGui g;
	private JButton Deleteb,Finishb,Backb1,Editb,exitb;
	private JPanel panel;
	private JLabel Venue,End;
	private JLabel city,Recordremove;
	private JLabel People,Start,Typedate;
	private Choice typeday,typemonth,typeyear,typecity;
	private Choice choice1,Starthour,Endhour,Startmin,Endmin,choice2,typevenue,typepeople;
	private Boolean bool = false;
	private TextArea textArea,textArea_1;
	private String filepath = "Records2.csv";
	private String remove = "";
	private String string = "";
	Readit n;
	Readit edit;
	private Date date;
	private int uh = 0;
	private int i = 0;
	private String length = "";
	private SimpleDateFormat sdf;
	public Deleter() {
		getContentPane().setBackground(Color.WHITE);
		setSize(new Dimension(450, 300));
		setVisible(true);
		setPreferredSize(new Dimension(450, 300));
		
		setTitle("Delete Record");
		getContentPane().setLayout(null);		
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setVisible(false);
		panel.setBounds(6, 6, 422, 249);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		Venue = new JLabel("Venue");
		Venue.setToolTipText("Type of Hall/Room");
		Venue.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Venue.setBounds(23, 5, 69, 24);
		panel.add(Venue);
		
		city = new JLabel("City");
		city.setToolTipText("Type the name of the city");
		city.setFont(new Font("Times New Roman", Font.BOLD, 15));
		city.setBounds(23, 41, 58, 19);
		panel.add(city);
		
		Typedate = new JLabel("Date");
		Typedate.setToolTipText("Date to Attend the Event");
		Typedate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Typedate.setBounds(23, 75, 58, 19);
		panel.add(Typedate);
		
		typeday = new Choice();
		typeday.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		typeday.setBackground(Color.LIGHT_GRAY);
		for (int i = 1;i < 32;i++) {
			if(i < 10) {
	typeday.add("0"+String.valueOf(i));
			}else {
	typeday.add(String.valueOf(i));
			}
	}
		typeday.setBounds(119, 74, 38, 22);
		panel.add(typeday);
		
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
		typemonth.setBounds(163, 74, 38, 22);
		panel.add(typemonth);
		
		typeyear = new Choice();
		sdf = new SimpleDateFormat("yyyy");
		date = new Date();
		typeyear.add(sdf.format(date));
		uh = Integer.parseInt(sdf.format(date));
		for (i = 0;i < 31;i++) {
			uh++;
		typeyear.add(String.valueOf(uh));
		}
		typeyear.setBackground(Color.LIGHT_GRAY);
		typeyear.setBounds(207, 74, 58, 22);
		panel.add(typeyear);
		
		Start = new JLabel("Starting Time");
		Start.setToolTipText("Select time in from when you are free ");
		Start.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Start.setBounds(23, 106, 90, 22);
		panel.add(Start);
		
		choice1 = new Choice();
		choice1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		choice1.add("pm");
		choice1.add("am");
		choice1.setBounds(217, 106, 48, 22);
		panel.add(choice1);
		
		Starthour = new Choice();
		Starthour.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		for (i = 1; i < 10; i++) {	
			Starthour.add("0"+String.valueOf(i));
			}
		Starthour.add("11");
		Starthour.add("12");
		Starthour.setBounds(119, 106, 48, 22);
		panel.add(Starthour);
		
		Endhour = new Choice();
		Endhour.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		for (i = 1; i < 10; i++) {	
			Endhour.add("0"+String.valueOf(i));
			}
		Endhour.add("11");
		Endhour.add("12");
		Endhour.setBounds(119, 136, 48, 22);
		panel.add(Endhour);
		
		Startmin = new Choice();
		Startmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Startmin.setBounds(173, 106, 38, 22);
		panel.add(Startmin);
		
		Endmin = new Choice();
		Endmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		for (i = 0; i < 60; i++) {
			 length = String.valueOf(i);
				if (length.length() < 2) {
				Startmin.add("0"+String.valueOf(i));
				Endmin.add("0"+String.valueOf(i));
				}
				else {
					Startmin.add(String.valueOf(i));
					Endmin.add(String.valueOf(i));
					}
				}
		Endmin.setBounds(173, 136, 38, 22);
		panel.add(Endmin);
		
		choice2 = new Choice();
		choice2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		choice2.add("pm");
		choice2.add("am");
		choice2.setBounds(217, 136, 48, 22);
		panel.add(choice2);
		
		End = new JLabel("Ending Time");
		End.setForeground(Color.BLACK);
		End.setBackground(Color.LIGHT_GRAY);
		End.setToolTipText("Select time when you are not available anymore!");
		End.setFont(new Font("Times New Roman", Font.BOLD, 15));
		End.setBounds(23, 140, 84, 19);
		panel.add(End);
		
		typevenue = new Choice();
		typevenue.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		typevenue.add("Conference Room");
		typevenue.add("Marriage Hall");
		typevenue.add("Meeting Room");
		typevenue.setBounds(119, 5, 146, 22);
		panel.add(typevenue);
		
		typepeople = new Choice();
		typepeople.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		for (i = 1; i < 51; i++) {
			length = String.valueOf(i);
		typepeople.add(length);
		}
		typepeople.setBounds(346, 38, 46, 22);
		panel.add(typepeople);
		
		People = new JLabel("No. of people");
		People.setToolTipText("Maximum number of People");
		People.setFont(new Font("Times New Roman", Font.BOLD, 15));
		People.setBounds(250, 38, 90, 24);
		panel.add(People);
		
		Finishb = new JButton("Finish");
		Finishb.setToolTipText("Finish Editing");
		Finishb.setBounds(326, 170, 90, 31);
		panel.add(Finishb);
		
		textArea_1 = new TextArea();
		textArea_1.setText("RESULTS");
		textArea_1.setEditable(false);
		textArea_1.setBounds(23, 170, 290, 79);
		panel.add(textArea_1);
		
		typecity = new Choice();
		typecity.add("Lahore");
		typecity.add("Islamabad");
		typecity.add("Sahiwal");
		typecity.setBounds(119, 39, 111, 24);
		panel.add(typecity);
		
		JLabel Typeplace = new JLabel("Event");
		Typeplace.setHorizontalAlignment(SwingConstants.CENTER);
		Typeplace.setToolTipText("");
		Typeplace.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Typeplace.setBounds(320, 76, 58, 19);
		panel.add(Typeplace);
		
		Eventname = new JTextField();
		Eventname.setToolTipText("Type the name of your Event");
		Eventname.setBounds(294, 100, 122, 28);
		panel.add(Eventname);
		Eventname.setColumns(10);
		
		exitb = new JButton("EXIT");
		exitb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitb.setToolTipText("Exit!");
		exitb.setBounds(326, 213, 90, 28);
		panel.add(exitb);
		exitb.setVisible(false);
		
		typerecord = new JTextField();
		typerecord.setToolTipText("Type the name of the Organiser");
		typerecord.setBounds(197, 34, 172, 25);
		getContentPane().add(typerecord);
		typerecord.setColumns(10);
		
		 
		textArea = new TextArea();
		textArea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		textArea.setBackground(SystemColor.menu);
		textArea.setText("            Results will show Here");
		textArea.setEditable(false);
		textArea.setBounds(27, 96, 260, 155);
		getContentPane().add(textArea);
		
		Backb1 = new JButton("Back");
		Backb1.setToolTipText("Return to the Organiser screen");
		Backb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					g = new OrganizerGui();
					g.setVisible(true);
						setVisible(false);
						
			}catch(Exception Error)
				{
				JOptionPane.showMessageDialog(null, "ERROR! RESTART PROGRAM");
				Error.printStackTrace();
				}
			}
		});
		Backb1.setBounds(319, 211, 89, 23);
		getContentPane().add(Backb1);
		
		Deleteb = new JButton("Delete");
		Deleteb.setToolTipText("Delete the typed Record");
		Deleteb.setBounds(319, 140, 89, 50);
		getContentPane().add(Deleteb);
		
		Recordremove = new JLabel("Record Name");
		Recordremove.setHorizontalAlignment(SwingConstants.CENTER);
		Recordremove.setBounds(39, 34, 100, 31);
		getContentPane().add(Recordremove);
		Editb = new JButton("Edit Event");
		Editb.setToolTipText("Edit the Event!");
		Editb.setBounds(319, 96, 90, 28);
		getContentPane().add(Editb);
		Editb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				USER = typerecord.getText();
				if (USER.equals("")) {
					textArea.setForeground(Color.RED);
					textArea.setText("INPUT NAME\n");
				}else {
					textArea.setForeground(Color.BLACK);
					setTitle("Record Editor");
				textArea.setVisible(false);
				Deleteb.setVisible(false);
				Backb1.setVisible(false);
				typerecord.setVisible(false);
				Recordremove.setVisible(false);
				Editb.setVisible(false);
				panel.setVisible(true);}
			}
		});
		Finishb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent es) {
				exitb.setVisible(true);
				try {
				string = typerecord.getText()+","+Starthour.getSelectedItem()+":"+
							Startmin.getSelectedItem()+" "+
							choice1.getSelectedItem()+","+
							Endhour.getSelectedItem()+":"+
							Endmin.getSelectedItem()+" "+
							choice2.getSelectedItem()+","+
							typeday.getSelectedItem()+"/"+
							typemonth.getSelectedItem()+"/"+
							typeyear.getSelectedItem()+","+
							typecity.getSelectedItem()+","+
							Eventname.getText()+","+
							typepeople.getSelectedItem()+","+
							typevenue.getSelectedItem()+",Yes"+",N/A"+"\n";
						USER = typerecord.getText();
						edit = new Readit(filepath,string,USER);
							bool = edit.Edited(bool);
							if(bool == false){
								textArea_1.setForeground(Color.RED);
								textArea_1.append("\nINVALID INPUT or no such record found!\nYou have typed the wrong Organiser name\nSorry for causing you trouble");
							}else {
								textArea.setForeground(Color.BLACK);
								textArea_1.append("\nRECORD EDITED");
							}
						
				}catch(Exception E) {
					File del = new File("temp.csv");
					del.delete();
					JOptionPane.showMessageDialog(null,"ERROR EDITING the record");
				}
			}
		});
	}
	public void func() {
		Deleteb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editb.setVisible(false);
				try
				{
					remove = typerecord.getText();
					n = new Readit(filepath,remove);
						bool = n.deleted(bool);
						if(bool == false){
							textArea.setForeground(Color.RED);
							textArea.append("\nINVALID INPUT or no such record found!");
							Editb.setVisible(true);
						}else {
							textArea.setForeground(Color.RED);
							textArea.append("\nRECORD DELETED");
						}
				}catch(Exception except)
				{
					File del = new File("temp.csv");
					del.delete();
					JOptionPane.showMessageDialog(null," SORRY Error! unable to delete");	
				}
			}
		});
	}
	private String USER;
	private JTextField Eventname;
}