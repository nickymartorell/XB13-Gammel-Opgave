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


public class Deposit extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblAmount;
	private JLabel label_6;
	private JTextField textField_2;
	private JButton btnDeposit_1;
	private JButton btnCancel;

	/**
	 * Create the panel.
	 */
	public Deposit() {
		
		setSize(300,450);
		setLayout(null);
	
		
		lblAmount = new JLabel("Amount:");
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setForeground(Color.DARK_GRAY);
		lblAmount.setFont(new Font("CBS OLD", Font.PLAIN, 47));
		lblAmount.setBackground((Color) null);
		lblAmount.setBounds(29, 63, 226, 69);
		add(lblAmount);
		
		textField_2 = new JTextField();
		textField_2.setBounds(39, 125, 201, 37);
		textField_2.setColumns(10);
		add(textField_2);
		
		
		btnDeposit_1 = new JButton("Deposit");
		btnDeposit_1.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/icon-tick_original.jpg")));
		btnDeposit_1.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnDeposit_1.setBackground(Color.WHITE);
		btnDeposit_1.setBounds(29, 238, 226, 41);
		add(btnDeposit_1);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/Cancel-icon.png")));
		btnCancel.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(29, 291, 226, 41);
		add(btnCancel);
		
		label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/rsz_1cbs_logo_horizontal_2lines_black_rgb.png")));
		label_6.setBounds(95, 367, 104, 50);
		add(label_6);

	}
	
	//AL på knapperne
	public void addActionListener (ActionListener x){
		btnDeposit_1.addActionListener(x);
		btnCancel.addActionListener(x);
	}

	public JLabel getLblAmount() {
		return lblAmount;
	}

	public JLabel getLabel_6() {
		return label_6;
	}
	
	public String getTextField_2() {
		return textField_2.getText();
	}

	public JButton getBtnDeposit_1() {
		return btnDeposit_1;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}
}
