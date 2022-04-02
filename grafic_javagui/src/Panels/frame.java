package Panels;

import javax.swing.*;
import java.awt.*;  


import javax.swing.border.Border;

public class frame extends JFrame{
	
	JPanel redpanel = new JPanel();
	JPanel greenpanel = new JPanel();
	JPanel bluepanel = new JPanel();
	
	JLabel label = new JLabel();
	ImageIcon icon = new ImageIcon("moai-whatsapp.png");
	
	public frame() {
		
		label.setText("gabriel jesus");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setBounds(0, 75, 100, 100);
		label.setForeground(new Color(255,0,255));
		label.setBackground(Color.cyan);
		label.setOpaque(true);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(true);
		this.setTitle("Prova");
		this.setSize(500,500);
		this.getContentPane().setBackground(new Color(30,40,70)); //imposta il colore dello sfondo dell intero frame
		this.add(redpanel);
		this.add(greenpanel);
		this.add(bluepanel);
		
		
		
		redpanel.setBackground(Color.red);	
		redpanel.setBounds(0, 0, 300, 400);
		redpanel.add(label);
		redpanel.setLayout(new BorderLayout());
		
		greenpanel.setBackground(Color.green);	
		greenpanel.setBounds(300, 400, 300, 400);
		greenpanel.setLayout(new BorderLayout());
		
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(300, 0, 300, 400);
		bluepanel.setLayout(new BorderLayout());


	}

}
