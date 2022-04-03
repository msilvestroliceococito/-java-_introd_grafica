package JLayeredPane;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{

	public Window() {
		
		JLabel l1 = new JLabel();
		l1.setOpaque(true);
		l1.setBackground(Color.LIGHT_GRAY);
		l1.setBounds(50, 50, 250, 250);
		
		JLabel l2 = new JLabel();
		l2.setOpaque(true);
		l2.setBackground(Color.RED);
		l2.setBounds(100, 100, 250, 250);
		
		JLabel l3 = new JLabel();
		l3.setOpaque(true);
		l3.setBackground(Color.BLUE);
		l3.setBounds(150, 150, 250, 250);
		
		JLayeredPane layeredpane = new JLayeredPane();
		layeredpane.setBounds(0, 0, 500, 500);
		layeredpane.add(l1, 0); // o JLayeredPane.DEFAULT_LAYER/DRAG_LAYER/...
		layeredpane.add(l2,2);
		layeredpane.add(l3,1);
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		this.setSize(500,500);
		this.setLayout(null); 
		this.add(layeredpane);
		
		
	}

}
