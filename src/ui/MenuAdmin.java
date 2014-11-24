package ui;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionListener;

public class MenuAdmin extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnAddUser;
	private JButton btnDeleteUser;
	private JButton btnSetBtcRate;
	private JButton button_1;
	private JButton btnGoToUser;
	private JLabel lblAdmin;
	private JLabel label_4;
	
	public MenuAdmin(){
		
		setSize(300,450);
		setLayout(null);
		
		lblAdmin = new JLabel("Admin");
		lblAdmin.setBounds(6, 6, 249, 99);
		lblAdmin.setForeground(Color.DARK_GRAY);
		lblAdmin.setFont(new Font("CBS OLD", Font.BOLD, 82));
		lblAdmin.setBackground((Color) null);
		add(lblAdmin);
		
		btnAddUser = new JButton("Add User ");
		btnAddUser.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnAddUser.setBackground(Color.WHITE);
		btnAddUser.setBounds(35, 107, 226, 41);
		add(btnAddUser);
		
		btnDeleteUser = new JButton("Delete User ");
		btnDeleteUser.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnDeleteUser.setBackground(Color.WHITE);
		btnDeleteUser.setBounds(35, 160, 226, 41);
		add(btnDeleteUser);
		
		btnSetBtcRate = new JButton("Set BTC rate ");
		btnSetBtcRate.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnSetBtcRate.setBackground(Color.WHITE);
		btnSetBtcRate.setBounds(35, 213, 226, 41);
		add(btnSetBtcRate);
		
		button_1 = new JButton("Log out ");
		button_1.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/login-icon.png")));
		button_1.setFont(new Font("SansSerif", Font.PLAIN, 14));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(35, 314, 226, 41);
		add(button_1);
		
		label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/rsz_1cbs_logo_horizontal_2lines_black_rgb.png")));
		label_4.setBounds(96, 367, 104, 50);
		add(label_4);
		
		btnGoToUser = new JButton("Go to user menu");
		btnGoToUser.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnGoToUser.setBackground(Color.WHITE);
		btnGoToUser.setBounds(35, 261, 226, 41);
		add(btnGoToUser);
	}
	
	//AL på knapper
	public void addActionListener(ActionListener x) {
		btnAddUser.addActionListener(x);
		btnDeleteUser.addActionListener(x);
		btnSetBtcRate.addActionListener(x);
		button_1.addActionListener(x);
		btnGoToUser.addActionListener(x);
		
	}
	
	public JButton getBtnAddUser() {
		return btnAddUser;
	}


	public JButton getBtnDeleteUser() {
		return btnDeleteUser;
	}


	public JButton getBtnSetBtcRate() {
		return btnSetBtcRate;
	}


	public JButton getButton_1() {
		return button_1;
	}


	public JButton getBtnGoToUser() {
		return btnGoToUser;
	}


	public JLabel getLblAdmin() {
		return lblAdmin;
	}


	public JLabel getLabel_4() {
		return label_4;
	}

}
