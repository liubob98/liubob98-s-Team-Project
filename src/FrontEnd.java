import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class FrontEnd 
{
	
	public FrontEnd()
	{
		JFrame frame = new JFrame("FRONTEND");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(300, 260));
		frame.setLocation(400, 100);
		
		
		Box box = Box.createHorizontalBox();
		frame.add(box);
		Box box2 = Box.createVerticalBox();
		box.add(box2);
		Box box3 = Box.createVerticalBox();
		box.add(box3);


		
		
		JLabel label = new JLabel("Input Username");
		box2.add(label);
		JTextArea area = new JTextArea();
		area.setLineWrap(true);
		
		JScrollPane pane = new JScrollPane(area);
		pane.setMaximumSize(new Dimension(400,30));
		box2.add(pane);
		
		box2.add(Box.createVerticalStrut(7));
		
		JLabel label2 = new JLabel("Enter Message");
		box2.add(label2);
		JTextArea area2 = new JTextArea();
		area2.setLineWrap(true);
		
		JScrollPane pane2 = new JScrollPane(area2);
		pane2.setMaximumSize(new Dimension(400,150));
		box2.add(pane2);
		
		box2.add(Box.createVerticalStrut(30));
		
		JButton button3 = new JButton("Get Messages");
		box2.add(button3);
		
		
		
		
		
		
		JButton button = new JButton("Enter");
		box3.add(button);
		
		box3.add(Box.createVerticalStrut(30));
		
		JButton button2 = new JButton("Enter");
		box3.add(button2);
		button2.setMaximumSize(new Dimension(65,50));
		
		
		
		frame.setVisible(true);
	}
	
	
	public static void main(String [] args)
	{
		FrontEnd f = new FrontEnd();
	}
}
