package bsee19020_Project;

import java.awt.event.*;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.Dimension;
 
public class Eventmanager extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton OrgBt,UserBt;
	public Eventmanager(UserGui u, OrganizerGui o) {
		
		setPreferredSize(new Dimension(465, 400));
		setSize(new Dimension(465, 400));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Eventmanager.class.getResource("img.png")));
		getContentPane().setBackground(Color.WHITE);
		setTitle("Event Manager");
		getContentPane().setLayout(null);
		setVisible(true);
		
		OrgBt = new JButton("Organiser");
		OrgBt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		OrgBt.setToolTipText("Organize a new Event or Edit & Delete an existing Event");
		
		OrgBt.addActionListener(new ActionListener() { // Organiser Button
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				o.setVisible(true);
			}
		});
		OrgBt.setBounds(68, 233, 103, 60);
		getContentPane().add(OrgBt);
		
		UserBt = new JButton("User");
		UserBt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		UserBt.setToolTipText("To Find a suitable Event!");
		
		UserBt.addActionListener(new ActionListener() {// USER BUTTON
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				u.setVisible(true);
			}
		});
		
		UserBt.setBounds(283, 233, 103, 60);
		getContentPane().add(UserBt);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Eventmanager.class.getResource("img.png")));
		lblNewLabel.setBounds(161, 11, 134, 127);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chose?");
		lblNewLabel_1.setToolTipText("Chose anyone of above!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1.setBounds(169, 302, 103, 44);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME");
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.BOLD, 26));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(94, 138, 255, 42);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Event Registration Desk");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Yu Gothic", Font.BOLD, 24));
		lblNewLabel_3.setBounds(79, 178, 297, 44);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("FINAL PROJECT");
		lblNewLabel_4.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel_4.setBounds(22, 23, 122, 22);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BSEE19020");
		lblNewLabel_5.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel_5.setBounds(22, 56, 103, 20);
		getContentPane().add(lblNewLabel_5);
		
	}

	public static void main(String arg[]) {
		try {
		OrganizerGui og = new OrganizerGui();
		UserGui a = new UserGui();
		Eventmanager em = new Eventmanager(a,og);
		ActionListener Uback = new ActionListener() { //ORGANISER TO MAIN INTERFACE BUTTON
			public void actionPerformed(ActionEvent e) {
				a.setVisible(false);
				em.setVisible(true);
			}
		};
		ActionListener Oback = new ActionListener() { //ORGANISER TO MAIN INTERFACE BUTTON
			public void actionPerformed(ActionEvent e) {
				og.setVisible(false);
				em.setVisible(true);
			}
		};
		
		ActionListener i = new ActionListener() {// TO FIND EVENT MATCH
			public void actionPerformed(ActionEvent e) {
				a.textArea.setText("");
			a.eventchoice.removeAll();

			String ss = "";
				String s = "";
				int P = 0;
				int i = 0;
				String Y = "Yes";
				int peop = 0;
				int integ = 1;
				String sss1 = "";
				String UNAME = "";
				String people = "";
				String Type = "";
				String Match = "";
				String eventn = "";
				String jk = "";
				String Start = "";
				String End = "";
				String City = "";
				String Available = "";
				String Date = "";
				StringTokenizer st = null;
				ss =	a.typecity.getSelectedItem()
						+" "+a.typeday.getSelectedItem()
						+"/"+a.typemonth.getSelectedItem()
						+"/"+a.typeyear.getSelectedItem()
				       +" "+a.typevenue.getSelectedItem();
				P = Integer.parseInt(a.typepeople.getSelectedItem());
				
				Vector <String> u = null;
				Opener O = new Opener(s);
				u = new Vector <String> ();
				u = O.Open(u);
				int no = 0;
				for(no = 0; no < u.size(); no++) {
					String sss = "";
				String fa = (String)u.elementAt(no);   
		try {
				st = new StringTokenizer(fa,",\r");
				int us = st.countTokens();
				for(i = 0 ; i < us; i++) {
				jk = st.nextToken();
				if (jk == null) {
					break;
				}if (i == 0) {
					 UNAME = jk;
				}if (i == 1) {
					Start = jk;
				}if (i == 2) {
					End = jk;
				}if (i == 3) {
					Date = jk;
				}if (i == 4) {
					City = jk;
				}if (i == 5) {
					eventn = jk;
				}if (i == 6) {
					people = jk;
				peop = Integer.parseInt(jk);
				}if (i == 7) {
					Type = jk;
				}if (i == 8) {
				Available = jk;
				}
			}// SECOND FOR ENDS
					Match = City+" "+Date+" "+Type;
					 if (Match.equals(ss) && P < peop && Available.equals(Y) ) {
						 Match = "***EVENT DETAILS***"+"\nOrganiser Name: "+UNAME+
									"\nStarting Time: "+Start+"\nEnding Time: "+End
									+"\nDate of Event: "+Date+"\nCity: "+City+"\nName of your Event: "
									+eventn+"\nMaximum number of seats: "+people+"\nHall/Room: "+Type+"\n";
						  String num = Integer.toString(integ);
						a.textArea.append("\nEvent Number: "+num+"\n"+Match+"\n\n");
						a.eventchoice.add(num);
						sss = num+","+Date+","+City+","+eventn+","+people+","+Type+","+Available+"|";
						integ++;
					 }
					sss1 = sss1+sss;
			}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"Error");
			}
				 }//First for ends
				if (integ == 1){
					a.textArea.setText("EVENT NOT AVAILABLE\nADD an Event in Organiser Interface");
				    }	else {
				    	a.visible(sss1,integ);
				    }
				}	
			};// ACTION LISTENER FOR
	a.Setuplisteners(i,Uback);
	og.Setuplisteners(Oback);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"main Error");
		}		
	}
}
