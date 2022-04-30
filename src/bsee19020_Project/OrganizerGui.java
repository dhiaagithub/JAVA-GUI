package bsee19020_Project;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.SystemColor;
import java.awt.Dimension;

public class OrganizerGui extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public OrganizerGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		setSize(new Dimension(430, 460));
		setPreferredSize(new Dimension(430, 460));
		setBackground(Color.WHITE);
		setTitle("ORGANISER INTERFACE");
		setName("Hellobud!");
		setForeground(SystemColor.textHighlightText);
		setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
	
		getContentPane().setLayout(null);
		
		JLabel Orglabel = new JLabel("Organizer");
		Orglabel.setToolTipText("Type a Name or ID \"This will be used to later Edit or Delete this Event\"");
		Orglabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Orglabel.setBounds(16, 14, 98, 14);
		getContentPane().add(Orglabel);
		
		orgback = new JButton("Back");
		orgback.setToolTipText("Return to the Main Interface");
		orgback.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		orgback.setBounds(310, 203, 89, 23);
		getContentPane().add(orgback);
		
		typename = new JTextField();
		typename.setBounds(113, 12, 86, 20);
		getContentPane().add(typename);
		typename.setColumns(10);
		
		JLabel OrgCity = new JLabel("City");
		OrgCity.setToolTipText("Type the name of the city, where the event is being held");
		OrgCity.setFont(new Font("Times New Roman", Font.BOLD, 15));
		OrgCity.setBounds(16, 41, 46, 18);
		getContentPane().add(OrgCity);
		
		JLabel OrgVenue = new JLabel("Event");
		OrgVenue.setToolTipText("Type the name your Event");
		OrgVenue.setFont(new Font("Times New Roman", Font.BOLD, 15));
		OrgVenue.setBounds(242, 14, 58, 18);
		getContentPane().add(OrgVenue);
		
		typeevent = new JTextField();
		typeevent.setColumns(10);
		typeevent.setBounds(310, 12, 89, 20);
		getContentPane().add(typeevent);
		
		JLabel OrgPeople = new JLabel("People Nos.");
		OrgPeople.setToolTipText("Type the Maximum number of people allowed in the event");
		OrgPeople.setFont(new Font("Times New Roman", Font.BOLD, 15));
		OrgPeople.setBounds(16, 75, 87, 17);
		getContentPane().add(OrgPeople);
		
		nopeople = new JTextField();
		nopeople.setColumns(10);
		nopeople.setBounds(113, 70, 86, 20);
		getContentPane().add(nopeople);
		
		JLabel Typedate = new JLabel("Date");
		Typedate.setToolTipText("Select date");
		Typedate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Typedate.setBounds(16, 137, 46, 19);
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
		typeday.setBackground(SystemColor.control);
		typeday.setBounds(113, 136, 38, 20);
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
		typeyear.setBackground(SystemColor.control);
		typeyear.setBounds(200, 136, 58, 22);
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
		typemonth.setBackground(SystemColor.control);
		typemonth.setBounds(156, 136, 38, 22);
		getContentPane().add(typemonth);
		
		{	
			choice1 = new Choice();
			choice1.setBackground(SystemColor.control);
			choice1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				choice1.add("pm");
				choice1.add("am");
			choice1.setBounds(210, 168, 48, 22);
			getContentPane().add(choice1);
			
		}
			Starthour = new Choice();
			Starthour.setBackground(SystemColor.control);
			Starthour.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			for (i = 1; i < 10; i++) {	
				Starthour.add("0"+String.valueOf(i));
				}
			Starthour.add("11");
			Starthour.add("12");
			Starthour.setBounds(113, 168, 48, 22);
			getContentPane().add(Starthour);
			
			Endhour = new Choice();
			Endhour.setBackground(SystemColor.control);
			Endhour.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			for (i = 1; i < 10; i++) {	
				Endhour.add("0"+String.valueOf(i));
				}
			Endhour.add("11");
			Endhour.add("12");
			Endhour.setBounds(113, 206, 48, 22);
			getContentPane().add(Endhour);
			
			Startmin = new Choice();
			Startmin.setBackground(SystemColor.control);
			Startmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			Startmin.setBounds(166, 168, 38, 22);
			getContentPane().add(Startmin);
			
			Endmin = new Choice();
			Endmin.setBackground(SystemColor.control);
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
			
			Endmin.setBounds(166, 206, 38, 22);
			getContentPane().add(Endmin);
			
			choice2 = new Choice();
			choice2.setBackground(SystemColor.control);
			choice2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			choice2.add("pm");
			choice2.add("am");
			choice2.setBounds(210, 206, 48, 22);
			getContentPane().add(choice2);
		
		JLabel End = new JLabel("Ending Time");
		End.setToolTipText("Select ending time of the Event");
		End.setFont(new Font("Times New Roman", Font.BOLD, 15));
		End.setBounds(16, 203, 89, 23);
		getContentPane().add(End);
		
		JLabel Start = new JLabel("Starting Time");
		Start.setToolTipText("Select starting time of the Event");
		Start.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Start.setBounds(16, 167, 91, 21);
		getContentPane().add(Start);
		
		JLabel Venue = new JLabel("Venue");
		Venue.setToolTipText("Select the quality of Venue");
		Venue.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Venue.setBounds(16, 103, 48, 23);
		getContentPane().add(Venue);
		
		typevenue = new Choice();
		typevenue.setBackground(SystemColor.inactiveCaptionBorder);
		typevenue.add("Conference Room");
		typevenue.add("Marriage Hall");
		typevenue.add("Meeting Room");
		typevenue.setBounds(113, 101, 145, 20);
		getContentPane().add(typevenue);
		
		badd = new JButton("ADD!");
		badd.setToolTipText("Add the event in the records");
		badd.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		badd.setAutoscrolls(true);
		badd.setBounds(310, 75, 89, 48);
		getContentPane().add(badd);
		
		textArea = new TextArea();
		textArea.setBounds(16, 253, 380, 160);
		getContentPane().add(textArea);
		
		Editb = new JButton("Edit");
		Editb.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		Editb.setToolTipText("Edit an Existing event");
		Editb.setBounds(310, 137, 89, 39);
		getContentPane().add(Editb);
		
		typecity = new Choice();
		typecity.add("Islamabad");
		typecity.add("Lahore");
		typecity.add("Sahiwal");
		typecity.setBounds(113, 39, 86, 20);
		getContentPane().add(typecity);
		Adddata();
		orgback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		Editb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				d = new Deleter();
				d.func();
			}
		});
	}
	
	public void Adddata() {
		badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setForeground(Color.RED);
				data = typename.getText()+","+	
						Starthour.getSelectedItem()+":"+
						Startmin.getSelectedItem()+" "+
						choice1.getSelectedItem()+","+
						Endhour.getSelectedItem()+":"+
						Endmin.getSelectedItem()+" "+
						choice2.getSelectedItem()+","+
						typeday.getSelectedItem()+"/"+
						typemonth.getSelectedItem()+"/"+
						typeyear.getSelectedItem()+","+
						typecity.getSelectedItem()+","+
						typeevent.getText()+","+
						nopeople.getText()+","+
						typevenue.getSelectedItem()+",Yes"+",N/A"+"\n";
				try {
			peoplenum = Integer.parseInt(nopeople.getText());
			}catch(Exception People) {
				textArea.setText("No input for number of people!");
			}
				if(typename.getText().equals ("")) {
						
					textArea.setText("Please! Provide your name to save your Event\n");
					return;
				}
				if(nopeople.getText().equals ("")) {
					
					textArea.setText("Please! Provide the maximum number of people allowed in your Event\n");
					return;
				}
                 if(typeevent.getText().equals ("")) {
					
					textArea.setText("Please! Provide the name of Venue\n");
					return;
				}
                 if(peoplenum < 2) {
 					textArea.setText("A single person(ONLY Organiser)is not allowed!\nPlease increase the number of people in your Event\n");
 					return;
 				}else {
 					textArea.setForeground(Color.BLACK);
				textArea.setText("Record added and Saved\n***EVENT DETAILS***\n"+"Organiser Name\n"+typename.getText()+
						"\nStarting Time: "+Starthour.getSelectedItem()+":"+
						Startmin.getSelectedItem()+" "+
						choice1.getSelectedItem()+"\nEnding Time: "+Endhour.getSelectedItem()+":"+
						Endmin.getSelectedItem()+" "+
						choice2.getSelectedItem()+"\nDate of Event: "+typeday.getSelectedItem()+"/"+
						typemonth.getSelectedItem()+"/"+
						typeyear.getSelectedItem()+"\nCity: "+typecity.getSelectedItem()
						+"\nName of your Event: "+typeevent.getText()+
						"\nMaximum number of seats: "+nopeople.getText()+"\nHall/Room: "+typevenue.getSelectedItem());
				Filewriter f = new Filewriter();
				f.Writer(data);
				}
			}
		});}
	public void Setuplisteners(ActionListener org) {
		orgback.addActionListener(org);
		}
	private JTextField typename;
	private SimpleDateFormat sdf;
	private Date date;
	private int uh = 0,peoplenum = 0;
	private JTextField typeevent;
	private JTextField nopeople;
	private TextArea textArea;
	public JButton badd ;
	public String length,data;
	public Choice typeday,typeyear,
	typemonth,choice1,choice2,
	Starthour,Endhour,Startmin,
	Endmin,typecity,typevenue;
	private JButton orgback;
	Deleter d;
	private int i;
	private JButton Editb;
}
