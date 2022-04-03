package HowToOpenANewWindow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LaunchPage implements ActionListener{

	JFrame frame = new JFrame();
	JButton button = new JButton("new window");
	
	public LaunchPage() {
		
		button.setBounds(100,160,200, 100);
		button.setFocusable(false);
		button.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(button);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			frame.dispose(); // IMPORTANTE // chiude automaticamente la launchpage una volta cliccato il bottone
			NewWindow window = new NewWindow();
			
		}
	}

}
