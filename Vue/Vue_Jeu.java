package Vue;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.InputStream;
import java.util.*;
import javax.imageio.ImageIO;

public class Vue_Jeu{

	
	
	void chargerImage() {
		InputStream IScase = ClassLoader.getSystemClassLoader().getResourceAsStream("Case.png");
		try {
		  uneCase = ImageIO.read(IScase);
		 }
		catch (Exception e) {
		  System.out.println("probleme avec l'image");
		  System.exit(1);
		 }
	}
	void affiche_niveau() {
		GridLayout grille1 = new GridLayout(2,2);
		
		grille1.add(new JButton("Bouton 1 "));
		grille1.add(new JButton("Bouton 2 "));
		grille1.add(new JButton("Bouton 3 "));
		grille1.add(new JButton("Bouton 4 "));
			
	}
	
	@Override
	  public void paintComponent(Graphics g) {
	    this.drawable = (Graphics2D) g;
	    this.width = getSize().width;
	    this.height = getSize().height;
	    affiche_niveau();
	  }
	
}