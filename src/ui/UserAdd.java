package ui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class UserAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblAddUser;
	private JLabel label_9;
	private JTextField txtFirstName;
	private JTextField textField_9;
	private JTextField txtId;
	private JPasswordField passwordField_2;
	private JButton btnAdd;
	private JButton btnBack_2;

public UserAdd(){
	
	setSize(300,450);
	setLayout(null);
	
	lblAddUser = new JLabel("Add User:");
	lblAddUser.setBounds(58, 6, 164, 49);
	lblAddUser.setHorizontalAlignment(SwingConstants.CENTER);
	lblAddUser.setForeground(Color.DARK_GRAY);
	lblAddUser.setFont(new Font("CBS OLD", Font.PLAIN, 40));
	lblAddUser.setBackground((Color) null);
	add(lblAddUser);
	
	txtFirstName = new JTextField("First name");
	txtFirstName.setHorizontalAlignment(SwingConstants.CENTER);
	txtFirstName.setColumns(10);
	txtFirstName.setBounds(37, 99, 201, 28);
	add(txtFirstName);
	
	textField_9 = new JTextField("Last name");
	textField_9.setHorizontalAlignment(SwingConstants.CENTER);
	textField_9.setColumns(10);
	textField_9.setBounds(37, 138, 201, 28);
	add(textField_9);
	
	passwordField_2 = new JPasswordField("Password");
	passwordField_2.setHorizontalAlignment(SwingConstants.CENTER);
	passwordField_2.setToolTipText("Password");
	passwordField_2.setBounds(37, 216, 201, 28);
	add(passwordField_2);
	
	txtId = new JTextField("Username");
	txtId.setHorizontalAlignment(SwingConstants.CENTER);
	txtId.setColumns(10);
	txtId.setBounds(37, 177, 201, 28);
	add(txtId);
	
	btnAdd = new JButton("Add");
	btnAdd.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/icon-tick_original.jpg")));
	btnAdd.setFont(new Font("SansSerif", Font.BOLD, 14));
	btnAdd.setBackground(Color.WHITE);
	btnAdd.setBounds(25, 258, 226, 41);
	add(btnAdd);
	
	btnBack_2 = new JButton("Back");
	btnBack_2.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/gray-back-icon.png")));
	btnBack_2.setFont(new Font("SansSerif", Font.BOLD, 14));
	btnBack_2.setBackground(Color.WHITE);
	btnBack_2.setBounds(25, 303, 226, 41);
	add(btnBack_2);
	
	label_9 = new JLabel("New label");
	label_9.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/rsz_1cbs_logo_horizontal_2lines_black_rgb.png")));
	label_9.setBounds(91, 367, 104, 50);
	add(label_9);
	
}

//AL på knapper
public void addActionListener(ActionListener x) {
	btnAdd.addActionListener(x);
	btnBack_2.addActionListener(x);	

}

//ML på knapperne
public void addMouseListener(MouseListener x) {
	txtFirstName.addMouseListener(x);
	textField_9.addMouseListener(x);
	passwordField_2.addMouseListener(x);
	txtId.addMouseListener(x);
}

public JLabel getLblAddUser() {
	return lblAddUser;
}

public JLabel getLabel_9() {
	return label_9;
}

public JTextField getTextField_7() {
	return txtFirstName;
}

public JTextField getTextField_9() {
	return textField_9;
}

public JTextField getTxtId() {
	return txtId;
}

public JPasswordField getPasswordField_2() {
	return passwordField_2;
}

public JButton getBtnAdd() {
	return btnAdd;
}

public JButton getBtnBack_2() {
	return btnBack_2;
}

public void setTextField(String user) {
	txtFirstName.setText(user);
}
public void setTextField2(String user) {
	textField_9.setText(user);
}
public void setPass(String user) {
	passwordField_2.setText(user);
}
public void setTextField3(String user) {
	txtId.setText(user);
}
}
