package pingVue;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class Vue_Jeu extends JPanel{
	Graphics2D drawable;
	private Object width;
	private Object height;
	JPanel contentPanel;
	
	void affiche_niveau() {
		GridLayout grille1 = new GridLayout(2,2);
		JButton b1 = new JButton("Bouton 1 ");
		JButton b12 = new JButton("Bouton 12 ");
		JButton b13 = new JButton("Bouton 13 ");
		JButton b14 = new JButton("Bouton 14 ");
		b1.setBounds(200,20,100,100);
		//grille1.add(b1);
		grille1.addLayoutComponent("b1", new JButton("Bouton 1 "));
		grille1.addLayoutComponent("b1", new JButton("Bouton 1 "));
		grille1.addLayoutComponent("b1", new JButton("Bouton 1 "));
		contentPanel.setLayout(grille1);
	}

	
}