package Button;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Myframe extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	
	public Myframe() {
		
		ImageIcon icon = new ImageIcon("gabriel-jesus.jpg");
		
		button = new JButton();
		button.setBounds(100, 150, 250, 100);	
		button.addActionListener(this);
		button.setText("Bottone");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setForeground(Color.BLUE);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		//button.setEnabled(false);  disabilita un bottone
		
		label = new JLabel();
		label.setBounds(200,240,250,50);
		label.setVisible(false);
		label.setText("hai cliccato");
		label.setBackground(Color.yellow);
		label.setForeground(new Color(255,0,0));
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(true);
		this.setTitle("button prova");
		this.setSize(500,500);
		this.getContentPane().setBackground(new Color(30,40,70));
		this.add(button);
		this.add(label);
		

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("hai appena cliccato");
			button.setEnabled(false);
			label.setVisible(true);
		}	
	}
	
	ActionListener buttonListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ingiosndf");
		}
	};    //to add another buttonlistener

}
