package Flowlayout;

import javax.swing.*;
import java.awt.*;

public class Myframe extends JFrame{
	
	JPanel panel = new JPanel();

	public Myframe() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		this.setSize(500,500);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,10,100)); //imposta il flowlayout   
		
		
		panel.setPreferredSize(new Dimension(250,250));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout());  //i jpanel usano già il flowlayout di default //inutile
		this.add(panel);
	
		panel.add(new Button("1"));
		panel.add(new Button("2"));
		panel.add(new Button("3"));
		panel.add(new Button("4"));
		panel.add(new Button("5"));
		panel.add(new Button("6"));
		panel.add(new Button("7"));
		panel.add(new Button("8"));
		panel.add(new Button("9"));
		
	
		
		
	}

}
