import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calc {
	public static void main(String[] args) {
		
		AddSub obj = new AddSub();
	}
	
}

class AddSub extends JFrame implements ActionListener{
	
	JTextField t1, t2;
	JButton b1;
	JButton b2;
	JLabel l;
	
	public AddSub() {
	 t1 = new JTextField(20);
	 t2 = new JTextField(20);
	 l = new JLabel("Result");
	 b1 = new JButton("Add");
	 b2 = new JButton("Result");
	
	add(t1);
	add(t2);
	add(b1);
	add(b2);
	add(l);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	setLayout(new FlowLayout());
	setVisible(true);
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	
	public void actionPerformed(ActionEvent ae) {
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
		int value;
		if (ae.getSource()==b1)
		{
			value = num1+num2;
			l.setText(value+"");
		} else {
			value = num1 - num2;
		}
		l.setText(value+"");
	}
}

