package GridLayout;

import javax.swing.*;
import java.awt.*;


public class window extends JFrame {

	public window() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		this.setSize(500,500);
		this.setLayout(new GridLayout(3,3,10,10));  //n_righe,n_colonne,margineorizzontale,margineverticale
		
		this.add(new Button("1"));
		this.add(new Button("2"));
		this.add(new Button("3"));
		this.add(new Button("4"));
		this.add(new Button("5"));
		this.add(new Button("6"));
		this.add(new Button("7"));
		this.add(new Button("8"));
		this.add(new Button("9"));
		this.add(new Button("10")); // se mettiamo un elemento in più rispetto a quelli definiti con il gridlayout, crea una colonna in più 
	}

}
