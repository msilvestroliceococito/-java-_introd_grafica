package HowToOpenANewWindow;

import java.awt.*;
import javax.swing.*;


public class NewWindow {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("This is the new window");
	
	public NewWindow() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);		
		label.setBounds(0, 0, 300, 15);

		
	}

}
