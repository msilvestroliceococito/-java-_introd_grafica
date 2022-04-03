package grafic_javagui;

import javax.swing.*;
import java.awt.*;  


import javax.swing.border.Border;

public class Frame extends JFrame{
	
	JLabel label = new JLabel();
	Border border = BorderFactory.createLineBorder(Color.cyan,10);
	

	public Frame() {
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(true);
		this.setTitle("Prova");
		this.setSize(500,500);
		this.getContentPane().setBackground(new Color(30,40,70)); //imposta il colore dello sfondo dell intero frame
		this.add(label);
		//ImageIcon icon = new ImageIcon("gabriel-jesus.jpg");    
		//label.setIcon(icon);    
		label.setText("PROVA camel");
		
		
		label.setHorizontalTextPosition(JLabel.CENTER); //inutile
		label.setVerticalTextPosition(JLabel.BOTTOM); //inutile
		
		label.setForeground(new Color(255,0,0)); //colore della scritta
		label.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		label.setIconTextGap(25); //inutile
		label.setBackground(Color.yellow);   //imposta il colore dello sfondo del label
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(100,0,250,250); 
		
		//this.pack();
		

	}

}
