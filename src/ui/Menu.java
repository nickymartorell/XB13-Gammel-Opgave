package ui;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionListener;

public class Menu extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private JButton btnDeposit;
	private JButton btnTransfer;
	private JButton btnBalance;
	private JButton btnLogOut;
	private JButton btnSearchUser;
	private JLabel lblNewLabel_1;
	private JLabel lblMenu;
	private JLabel label_1;
	private JButton btnLogOff;

	/**
	 * Create the panel.
	 */
	public Menu() {
	
		setLayout(null);
		setSize(300,450);
		
		btnDeposit = new JButton("Deposit ");
		btnDeposit.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnDeposit.setBackground(Color.WHITE);
		btnDeposit.setBounds(30, 100, 226, 41);
		add(btnDeposit);
		
		lblMenu = new JLabel("Menu");
		lblMenu.setForeground(Color.DARK_GRAY);
		lblMenu.setFont(new Font("CBS OLD", Font.BOLD, 82));
		lblMenu.setBackground((Color) null);
		lblMenu.setBounds(6, 0, 278, 86);
		add(lblMenu);
		
		btnTransfer = new JButton("Transfer");
		btnTransfer.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnTransfer.setBackground(Color.WHITE);
		btnTransfer.setBounds(30, 153, 226, 41);
		add(btnTransfer);
		
		btnBalance = new JButton("Balance");
		btnBalance.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnBalance.setBackground(Color.WHITE);
		btnBalance.setBounds(30, 206, 226, 41);
		add(btnBalance);
		
		btnSearchUser = new JButton("Search User");
		btnSearchUser.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnSearchUser.setBackground(Color.WHITE);
		btnSearchUser.setBounds(30, 259, 226, 41);
		add(btnSearchUser);
		
		btnLogOut = new JButton("Log out ");
		btnLogOut.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/login-icon.png")));
		btnLogOut.setFont(new Font("SansSerif", Font.PLAIN, 14));
		btnLogOut.setBackground(Color.WHITE);
		btnLogOut.setBounds(30, 312, 226, 41);
		add(btnLogOut);
		
		label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/rsz_1cbs_logo_horizontal_2lines_black_rgb.png")));
		label_1.setBounds(97, 365, 104, 50);
		add(label_1);

	}
	
	//AL på knapper
	public void addActionListener(ActionListener x) {
		btnDeposit.addActionListener(x);
		btnTransfer.addActionListener(x);
		btnBalance.addActionListener(x);
		btnLogOut.addActionListener(x);
		btnSearchUser.addActionListener(x);
		
	}

	public JButton getBtnTransfer() {
		return btnTransfer;
	}

	public JButton getBtnBalance() {
		return btnBalance;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public JLabel getLblMenu() {
		return lblMenu;
	}

	public JButton getBtnLogOff() {
		return btnLogOff;
	}
}
