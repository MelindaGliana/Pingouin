import java.util.*;
import javax.swing.*;
import java.io.InputStream;
import java.awt.BorderLayout;
import java.awt.Component;
import gaufre.view.*;
import gaufre.controller.*;

public class DemoFenetre implements Runnable {
	
	public void run() {
		// Creation d'une fenetre
		JFrame frame = new JFrame("Ma fenetre a moi");
		
		Vue_Jeu vj = new Vue_Jeu();
		
		// Ajout de notre composant de dessin dans la fenetre
		frame.add(vj);

		// Un clic sur le bouton de fermeture clos l'application
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// On fixe la taille et on demarre
		frame.setSize(1000, 1000);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new DemoFenetre());
	}
}
