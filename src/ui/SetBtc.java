package ui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;


public class SetBtc extends JPanel {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labelle;
	private JTextField tal;
	private JButton btnSetBtcRate;
	
	
	
	public SetBtc() {
	
		setSize(300,450);
		setLayout(null);
		
		tal = new JTextField();
		tal.setText("BTC ");
		tal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tal.setColumns(10);
		tal.setBounds(49, 78, 180, 35);
		add(tal);
		
		labelle = new JLabel("New label");
		labelle.setIcon(new ImageIcon(Screen.class.getResource("/Billeder/rsz_1cbs_logo_horizontal_2lines_black_rgb.png")));
		labelle.setBounds(91, 328, 104, 78);
		add(labelle);
		
		btnSetBtcRate = new JButton("Set exchange rate ");
		btnSetBtcRate.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnSetBtcRate.setBackground(Color.WHITE);
		btnSetBtcRate.setBounds(36, 125, 204, 49);
		add(btnSetBtcRate);
		
	}
	//AL på knapperne
	public void addActionListener (ActionListener x){
		btnSetBtcRate.addActionListener(x);
	}
	public JLabel getLabelle() {
		return labelle;
	}
	public JTextField getTal() {
		return tal;
	}
	public JButton getBtnSetBtcRate() {
		return btnSetBtcRate;
	}

}
