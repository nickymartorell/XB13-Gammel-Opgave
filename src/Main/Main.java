package Main;

import java.sql.SQLException;

import logic.AL;


public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		
		
		AL al = new AL();
		al.run();
		
		/** 	
	 	GetConnection ok = new GetConnection();
		ok.run();
		Login run = new Login();
		
		run.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		run.setSize(300,450);
		run.setVisible(true);
		 */
	}
}