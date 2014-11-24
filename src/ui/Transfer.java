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

public class Transfer extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label_3;
	private JLabel lblRecipientsId;
	private JLabel label_8;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnTransfer;
	private JButton button_2;	

	/**
	 * Create the panel.
	 */
	public Transfer() {
		
		setSize(300,450);
		setLayout(null);
		
		label_3 = new JLabel("Amount:");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.DARK_GRAY);
		label_3.setFont(new Font("CBS OLD", Font.PLAIN, 40));
		label_3.setBackground((Color) null);
		label_3.setBounds(24, 62, 226, 49);
		add(label_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(35, 111, 201, 37);
		add(textField_5);
		
		lblRecipientsId = new JLabel("Recipients ID:");
		lblRecipientsId.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecipientsId.setForeground(Color.DARK_GRAY);
		lblRecipientsId.setFont(new Font("CBS OLD", Font.PLAIN, 40));
		lblRecipientsId.setBackground((Color) null);
		lblRecipientsId.setBounds(6, 156, 278, 49);
		add(lblRecipientsId);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(35, 203, 201, 37);
		add(textField_6);
		
		btnTransfer = new JButton("Transfer ");
		btnTransfer.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/emea-icon-send-money.png")));
		btnTransfer.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnTransfer.setBackground(Color.WHITE);
		btnTransfer.setBounds(24, 252, 226, 41);
		add(btnTransfer);
		
		button_2 = new JButton("Cancel");
		button_2.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/Cancel-icon.png")));
		button_2.setFont(new Font("SansSerif", Font.BOLD, 14));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(24, 304, 226, 41);
		add(button_2);
		
		label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/rsz_1cbs_logo_horizontal_2lines_black_rgb.png")));
		label_8.setBounds(93, 367, 104, 50);
		add(label_8);

	}
	
	//AL på knapper
	public void addActionListener(ActionListener x) {
		btnTransfer.addActionListener(x);
		button_2.addActionListener(x);
			
	}

	public JLabel getLabel_3() {
		return label_3;
	}

	public JLabel getLblRecipientsId() {
		return lblRecipientsId;
	}

	public JLabel getLabel_8() {
		return label_8;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public JButton getBtnTransfer() {
		return btnTransfer;
	}

	public JButton getButton_2() {
		return button_2;
	}

}
