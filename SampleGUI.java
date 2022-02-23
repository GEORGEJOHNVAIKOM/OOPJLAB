import javax.swing.*;
import java.awt.event.*;

public class SampleGUI implements ActionListener {
	
	JFrame f;
	JPanel p;
	JTextField t;
	JLabel l;
	JButton b;
	SampleGUI() {
		f = new JFrame();
		f.setSize(720,720);
		f.setVisible(true);
		
		p = new JPanel();
		f.setContentPane(p);
		l = new JLabel("Enter a Text");
		t = new JTextField(60);
		b = new JButton("Press");
		
		p.add(l);
		p.add(t);
		p.add(b);
		
		b.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			t.setText("Clicked");
	}
	
	public static void main(String[] args) {
		new SampleGUI();
	}

}
