import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;  //gives you basec windows features
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class tuna extends JFrame{

	private JLabel item1;
	private JTextField item2;
	private JTextArea textArea;
	private JButton btn;
	
	public tuna(){
		super("The title bar");
		setLayout(new FlowLayout());   //gives you default layout
		
		item1 = new JLabel("Enter IP address");
		item1.setToolTipText("This is gonna show up on hover");
		textArea = new JTextArea(5, 20);
		item2 = new JTextField(20);
		btn = new JButton("Get IP");
		
		btn.addActionListener(new ActionListener()
	    {
	      
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			textArea.setText(item2.getText());
		}
	    });
		
		add(item1);
		add(item2);
		add(btn);
		add(textArea);
		
	}
}
