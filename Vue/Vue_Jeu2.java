package pingVue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Vue_Jeu2 {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vue_Jeu2 window = new Vue_Jeu2();
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
	public Vue_Jeu2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(0, 0, 763, 550);
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0,
				Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 3;
		gbc_panel_2.gridwidth = 5;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		frame.getContentPane().add(panel_2, gbc_panel_2);

		JButton btnNewButton = new JButton("Historique");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		panel_2.add(btnNewButton);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 3;
		gbc_panel_1.gridwidth = 17;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 5;
		gbc_panel_1.gridy = 0;
		frame.getContentPane().add(panel_1, gbc_panel_1);

		JButton btnNewButton_1 = new JButton("R\u00E8gles");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblNewLabel = new JLabel("C'est \u00E0 ton tour ! ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		panel_1.add(lblNewLabel);
		panel_1.add(btnNewButton_1);

		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridheight = 8;
		gbc_panel_3.gridwidth = 5;
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 3;
		frame.getContentPane().add(panel_3, gbc_panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		JButton btnNewButton_2 = new JButton("Pr\u00E9c\u00E9dent");
		panel_3.add(btnNewButton_2);

		JButton btnNewButton_4 = new JButton("Suggestion");
		panel_3.add(btnNewButton_4);

		JButton btnNewButton_6 = new JButton("Valider");
		panel_3.add(btnNewButton_6);

		JButton btnNewButton_5 = new JButton("Sauvegarder");
		panel_3.add(btnNewButton_5);

		JButton btnNewButton_3 = new JButton("Quitter");
		panel_3.add(btnNewButton_3);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 8;
		gbc_panel.gridwidth = 17;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 5;
		gbc_panel.gridy = 3;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null, null }, },
				new String[] { "", "", "", "", "", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column" }));
		panel.add(table, BorderLayout.CENTER);
	}
}
