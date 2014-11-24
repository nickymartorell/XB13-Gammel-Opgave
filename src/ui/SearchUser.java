package ui;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.DropMode;


public class SearchUser extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblResults;
	private JTextField txtSearchOnFirstname;
	private JButton btnSearch;
	private JLabel lblResult;
	private JTextField textField_4;
	private JButton btnBack_1;
	private JLabel label_7;
	private JTable resultat;

	/**
	 * Create the panel.
	 */
	public SearchUser() {
		
		setSize(300,450);
		setLayout(null);
		
		txtSearchOnFirstname = new JTextField("Search on firstname");
		txtSearchOnFirstname.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearchOnFirstname.setBounds(25, 45, 226, 36);
		txtSearchOnFirstname.setColumns(10);
		add(txtSearchOnFirstname);
	
		btnSearch = new JButton("Search ");
		btnSearch.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/icon_search.png")));
		btnSearch.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnSearch.setBackground(Color.WHITE);
		btnSearch.setBounds(25, 93, 226, 41);
		add(btnSearch);
		
		lblResults = new JLabel("Users:");
		lblResults.setHorizontalAlignment(SwingConstants.CENTER);
		lblResults.setForeground(Color.DARK_GRAY);
		lblResults.setFont(new Font("CBS OLD", Font.PLAIN, 46));
		lblResults.setBackground((Color) null);
		lblResults.setBounds(0, 165, 278, 56);
		add(lblResults);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 217, 265, 95);
		textField_4.setColumns(10);
		add(textField_4);
		
		btnBack_1 = new JButton("Back");
		btnBack_1.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/gray-back-icon.png")));
		btnBack_1.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(25, 316, 226, 41);
		add(btnBack_1);
		
		label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/rsz_1cbs_logo_horizontal_2lines_black_rgb.png")));
		label_7.setBounds(93, 367, 104, 50);
		add(label_7);
		
		resultat = new JTable();
		resultat.setBounds(10, 307, 268, -84);
		add(resultat);
		
	}
	
	//AL på knapper
	public void addActionListener(ActionListener x) {
		btnSearch.addActionListener(x);
		btnBack_1.addActionListener(x);
			
	}

	public JLabel getLblResults() {
		return lblResults;
	}

	public JTextField getTextField_3() {
		return txtSearchOnFirstname;
	}

	public JButton getBtnSearch() {
		return btnSearch;
	}

	public JLabel getLblResult() {
		return lblResult;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public JButton getBtnBack_1() {
		return btnBack_1;
	}

	public JLabel getLabel_7() {
		return label_7;
	}

	public JTable getResultat() {
		return resultat;
	}
	
}
