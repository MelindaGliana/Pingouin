package pingVue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class VueAccueil {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueAccueil window = new VueAccueil();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VueAccueil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setBackground(new Color(240, 240, 240));

		JButton btnNewButton = new JButton("Jouer");

		JButton btnNewButton_1 = new JButton("R\u00E8gles");
		FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 5, 5);
		flowLayout.setAlignOnBaseline(true);
		frame.getContentPane().setLayout(flowLayout);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(100, 100, 490, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
