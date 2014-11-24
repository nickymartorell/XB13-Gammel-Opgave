

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

import ui.Login;
import ui.Menu;

public class LoginAction {
	
	private Screen screen;
	
		
	public LoginAction()
	{
		Login li = new Login();
		
		li.Login();
	
		
		
		//under her skal vi have brugt den information som de trykker i username og password
				public class TextFieldHandler implements ActionListener
				{
					
					Login log = new Login();

					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent e) {
						
						String user = textField.getText();
						String pass = passwordField.getText();
						
						String string = "";
						if (e.getSource() == btnEnter)
						string = String.format("textField: %s\n"
								+ "password:%s",user,pass);
						JOptionPane.showMessageDialog(null, string);		
						//e.getActionCommand()
					
						new Menu().setVisible(true);
						
						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = (Connection) 
							DriverManager.getConnection("jdbc:mysql://localhost:3306/mathias","root","keeponmoving123");
							String sql = "select UserName, passWord from student where UserName = '"+textField.getText()+"' passWord ='"+passwordField.getText()+"'";
							
							//laver statement og udfører query
							
							Statement st = (Statement) con.createStatement();
							ResultSet rs = st.executeQuery(sql);
							
							if(rs.next());
							{
							String dbpass = rs.getString(1);
							if(dbpass.equals(pass)){
							JOptionPane.showMessageDialog(null, "Login Successful! ", " Success", JOptionPane.PLAIN_MESSAGE);
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Login Unsuccessful!","Error",1);
							}
							}
							
					
							
							//while loop for at kører igennem SQL database
							
							/**
							
							while(rs.next()) {
							String uname=rs.getString("UserName");
							String password=rs.getString("passWord");
							
							if ((user.equals(uname)) && (pwd.equals(password)))
								
								JOptionPane.showMessageDialog( Login.this, String.format(
										"Logget ind", e.getActionCommand() ) );
										
							 * 
							 */
								
						}
							catch (Exception e1){
								JOptionPane.showMessageDialog(Login.this, e1.getMessage());
						}
					//String sql = "select UserName, passWord from student where UserName = '"+UserName+"' passWord ='"+passWord+"'";
					//rs = st.executeQuery(sql);
				{				
						
						
				
			}	
			}
	
		
		
		
		

		
		
	}

}
