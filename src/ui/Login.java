package ui;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Login extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblUsername;
	private JLabel label_2;
	private JPasswordField passwordField;
	private JTextField textField;
	private JLabel label;
	private JButton button;
	
	/**
	 * Create the panel.
	 */
	public Login(){
				
		setSize(300,450);
		setLayout(null);
		
		button = new JButton("Login");
		button.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/login-icon.png")));
		button.setFont(new Font("SansSerif", Font.BOLD, 14));
		button.setBackground(Color.WHITE);
		button.setBounds(85, 280, 124, 41);
		add(button);
		
		label = new JLabel("Password");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("CBS NEW", Font.PLAIN, 37));
		label.setBounds(85, 207, 124, 41);
		add(label);
		
		passwordField = new JPasswordField("");
		passwordField.setBounds(75, 240, 148, 29);
		add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(75, 173, 148, 29);
		add(textField);
		
		lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setForeground(Color.DARK_GRAY);
		lblUsername.setFont(new Font("CBS NEW", Font.PLAIN, 37));
		lblUsername.setBounds(85, 142, 124, 29);
		add(lblUsername);
		
		label_2 = new JLabel("Login");
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("CBS OLD", Font.BOLD, 82));
		label_2.setBackground((Color) null);
		label_2.setBounds(0, 0, 278, 86);
		add(label_2);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/rsz_1cbs_logo_horizontal_2lines_black_rgb.png")));
		lblNewLabel.setBounds(97, 367, 104, 50);
		add(lblNewLabel);
		
		}
		//AL på knapper
		public void addActionListener(ActionListener x) {
			button.addActionListener(x);
		}

		public JLabel getLblNewLabel() {
			return lblNewLabel;
		}

		public JLabel getLblUsername() {
			return lblUsername;
		}

		public JLabel getLabel_2() {
			return label_2;
		}

		public JPasswordField getPasswordField() {
			return passwordField;
		}

		public JTextField getTextField() {
			return textField;
		}

		public JLabel getLabel() {
			return label;
		}
		public String getUsername(){
			return textField.getText();
		}
		@SuppressWarnings("deprecation")
		public String getpassWord(){
			return passwordField.getText();
		}
		public JButton getButton() {
			return button;
		}
		public void setPasswordField(String pass) {
			passwordField.setText(pass);
		}
		public void setTextField(String user) {
			textField.setText(user);
		}
}



