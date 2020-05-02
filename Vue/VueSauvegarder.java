package pingVue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;

public class VueSauvegarder {

	private JFrame frame;
	private JTextField txtNouvelleSauvegarde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueSauvegarder window = new VueSauvegarder();
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
	public VueSauvegarder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 763, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane()
				.setLayout(new MigLayout("", "[][][][][][][][][grow]", "[][][][][][grow][][][][][][][][][][][]"));

		JLabel lblNewLabel = new JLabel("Sauvegarde");
		frame.getContentPane().add(lblNewLabel, "cell 8 3");

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "cell 8 5,grow");
		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblNewLabel_1 = new JLabel("Liste des save existante");
		panel.add(lblNewLabel_1);

		txtNouvelleSauvegarde = new JTextField();
		txtNouvelleSauvegarde.setText("nouvelle sauvegarde");
		frame.getContentPane().add(txtNouvelleSauvegarde, "flowx,cell 8 16,growx");
		txtNouvelleSauvegarde.setColumns(10);

		JButton btnNewButton = new JButton("New button");
		frame.getContentPane().add(btnNewButton, "cell 8 16");
	}

}
