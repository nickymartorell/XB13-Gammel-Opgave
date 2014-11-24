package ui;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class WrongPass extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel tekst;
	private JButton tilbage;
	private JLabel logo;	
			
		public WrongPass() {
		
		setSize(300,450);
		setLayout(null);
		
		tekst = new JLabel("Wrong. Try again");
		tekst.setHorizontalAlignment(SwingConstants.CENTER);
		tekst.setForeground(Color.DARK_GRAY);
		tekst.setFont(new Font("CBS OLD", Font.PLAIN, 32));
		tekst.setBackground((Color) null);
		tekst.setBounds(10, 169, 278, 56);
		add(tekst);
		
		tilbage = new JButton("Back");
		tilbage.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/gray-back-icon.png")));
		tilbage.setFont(new Font("SansSerif", Font.BOLD, 14));
		tilbage.setBackground(Color.WHITE);
		tilbage.setBounds(25, 316, 226, 41);
		add(tilbage);
		
		logo = new JLabel("New label");
		logo.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/rsz_1cbs_logo_horizontal_2lines_black_rgb.png")));
		logo.setBounds(93, 367, 104, 50);
		add(logo);
		
	}
		//AL på knapper
		public void addActionListener(ActionListener x) {
			tilbage.addActionListener(x);
	
	}
		public JLabel getTekst() {
			return tekst;
		}
}
