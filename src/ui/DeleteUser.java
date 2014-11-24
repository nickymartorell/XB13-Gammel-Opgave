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

public class DeleteUser extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel label_7;
	private JTextField txtUserId;
	private JButton delete;
	
	
	public DeleteUser()
	
	{	

	setSize(300,450);
	setLayout(null);
	
	txtUserId = new JTextField();
	txtUserId.setText("User ID ");
	txtUserId.setFont(new Font("Tahoma", Font.PLAIN, 14));
	txtUserId.setBounds(43, 77, 180, 35);
	txtUserId.setColumns(10);
	add(txtUserId);
	
	
	delete = new JButton("Delete user ");
	delete.setFont(new Font("SansSerif", Font.BOLD, 14));
	delete.setBackground(Color.WHITE);
	delete.setBounds(33, 128, 204, 49);
	add(delete);
	
	label_7 = new JLabel("New label");
	label_7.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/rsz_1cbs_logo_horizontal_2lines_black_rgb.png")));
	label_7.setBounds(88, 328, 104, 78);
	add(label_7);
	
	lblNewLabel = new JLabel("Delete successful!");
	lblNewLabel.setEnabled(false); //husk at enable når vi sletter
	lblNewLabel.setIcon(null);
	lblNewLabel.setForeground(new Color(0, 128, 0));
	lblNewLabel.setFont(new Font("CBS NEW", Font.BOLD, 24));
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setBounds(33, 42, 214, 23);
	add(lblNewLabel);

	}
	
	//AL på knapperne
	public void addActionListener (ActionListener x){
		delete.addActionListener(x);
	}


	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}


	public JLabel getLabel_7() {
		return label_7;
	}


	public JTextField getTxtUserId() {
		return txtUserId;
	}


	public JButton getDelete() {
		return delete;
	}
	
}
