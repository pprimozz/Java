import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGUI {

	public static void main(String[] args) {
	
		Abc obj = new Abc();
		
	
	}
}



class Abc extends JFrame{
	
	public Abc() {
		
		JLabel l = new JLabel("Hello world");
		JLabel l1 = new JLabel("Welcome Navin");
		
		
		add(l);
		add(l1);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}