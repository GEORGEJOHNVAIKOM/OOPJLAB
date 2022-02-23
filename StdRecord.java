import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;

public class StudentRecord implements ActionListener {
	
	JButton button1, button2;
	JTextField text1, text2, text3, text4, text5;
	JLabel label1, label2, label3, label4, label5;
	static String strql;
	
	public StudentRecord() {
		JFrame frame = new JFrame("Data Base");
		frame.setSize(640,480);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6,2));
		
		button1 = new JButton("Add");
		button2 = new JButton("Clear");
		
		label1 = new JLabel("StdID");
		label2 = new JLabel("StdName");
		label3 = new JLabel("Age");
		label4 = new JLabel("Branch");
		label5 = new JLabel("Batch");
		
		text1 = new JTextField();
		text2 = new JTextField();
		text3 = new JTextField();
		text4 = new JTextField();
		text5 = new JTextField();
		
		panel.add(label1);
		panel.add(text1);
		
		panel.add(label2);
		panel.add(text2);
		
		panel.add(label3);
		panel.add(text3);
		
		panel.add(label4);
		panel.add(text4);
		
		panel.add(label5);
		panel.add(text5);
		
		panel.add(button1);
		panel.add(button2);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button1) {
			int stdid=Integer.parseInt(text1.getText());
			String stdn=text2.getText();
			int age=Integer.parseInt(text3.getText());
			String branch=text4.getText();
			String batch=text5.getText();
			String strql="INSERT INTO minnalTable(stdID,stdName,Age,Branch,Batch) VALUES ("+stdid+ ",'" +stdn+"',"+age+",'"+branch+ "','"+batch+"')";		
			try {   
				String userName = "root";
		   		   String password = "";
		   		   String url = "jdbc:mysql://localhost/test";
		   		   Class.forName ("com.mysql.cj.jdbc.Driver");
		   		   Connection con= DriverManager.getConnection(url, userName, password);
		   			Statement st=con.createStatement(); 
					st.executeUpdate(strql);
					System.out.println("Data Added Successfully");
		   		}
		   		catch(Exception eX ) {
		   			System.err.println(eX);
		   		}
		}
			
		else if(e.getSource() == button2) {
			text1.setText("");
			text2.setText("");
			text3.setText("");
			text4.setText("");
			text5.setText("");
		}
	}
	
	public static void main(String[] args) {
		new StudentRecord();
	}


}
