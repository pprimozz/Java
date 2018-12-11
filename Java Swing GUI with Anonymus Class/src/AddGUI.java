import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddGUI {
	public static void main(String[] args) {
		
		Addition obj = new Addition();
	}
}


class Addition extends JFrame {
	JTextField t1, t2;
	JButton b;
	JLabel l;
	
	public Addition() {
		
		 t1 = new JTextField(20);
		 t2 = new JTextField(20);
		 l = new JLabel("Result");
		 b = new JButton("OK");
		
		add(t1);
		add(t2);
		add(b);
		add(l);
		
		ActionListener al= new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				
				int value = num1+num2;
				l.setText(value+"");	
			}
		};  //ActionListener je interface
		
		b.addActionListener(al);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
