package ui;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("unused")
public class Balance extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label_5;
	private JLabel lblBalance;
	private JTextField textField;
	private JLabel lblHistory;
	private JTextField textField_1;
	private JButton btnBack;

	/**
	 * Create the panel.
	 */
	public Balance() {
		
		setSize(300,450);
		setLayout(null);
		
		lblBalance = new JLabel("Balance:");
		lblBalance.setForeground(Color.DARK_GRAY);
		lblBalance.setFont(new Font("CBS OLD", Font.PLAIN, 45));
		lblBalance.setBackground((Color) null);
		lblBalance.setBounds(6, 6, 173, 55);
		add(lblBalance);
		
		textField = new JTextField("");
		textField.setFont(new Font("Verdana", Font.ITALIC, 32));
		textField.setBounds(182, 12, 96, 44);
		textField.setColumns(10);
		add(textField);
		
		lblHistory = new JLabel("Statement:");
		lblHistory.setForeground(Color.DARK_GRAY);
		lblHistory.setFont(new Font("CBS OLD", Font.PLAIN, 39));
		lblHistory.setBackground((Color) null);
		lblHistory.setBounds(48, 61, 198, 47);
		add(lblHistory);
		
		textField_1 = new JTextField("");
		textField_1.setBounds(22, 106, 244, 193);
		textField_1.setColumns(10);
		add(textField_1);
	
		btnBack = new JButton("Back");
		btnBack.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/gray-back-icon.png")));
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(32, 311, 226, 41);
		add(btnBack);
		
		label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/rsz_1cbs_logo_horizontal_2lines_black_rgb.png")));
		label_5.setBounds(91, 367, 104, 50);
		add(label_5);

	}
	//AL på knapperne
	public void addActionListener (ActionListener x) {
		btnBack.addActionListener(x);
		
	}
	
	public void show(String s){
		
	}

	public JLabel getLabel_5() {
		return label_5;
	}

	public JLabel getLblBalance() {
		return lblBalance;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JLabel getLblHistory() {
		return lblHistory;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JButton getBtnBack() {
		return btnBack;
	}
	
	public void setTextField(String d) {
		textField.setText(d);
	}
}


	

	



