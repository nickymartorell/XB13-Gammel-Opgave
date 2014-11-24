package data;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ui.Screen;

import com.mysql.jdbc.Connection;

public class SQLHandler {

	String url = "jdbc:mysql://localhost:3306/mathias";
	String driver = "com.mysql.jdbc.Driver";
	String un = "root";
	String pw = "keeponmoving123";

	//private Account account;
	private Screen screen;
	private Connection connection = null;
	private PreparedStatement Login = null;
	@SuppressWarnings("unused")
	private PreparedStatement updateBalance = null;
	private PreparedStatement selectAllUser = null;
	private PreparedStatement createNewUser = null;
	private PreparedStatement currentUser = null;
	private PreparedStatement checkUsers = null;


	public SQLHandler() throws InstantiationException, IllegalAccessException,
			ClassNotFoundException

	{
		
		screen = new Screen();

		try {

			Class.forName(driver).newInstance();
			connection = (Connection) DriverManager.getConnection(url, un,pw);

			selectAllUser = connection.prepareStatement("SELECT * FROM user");
			Login = connection.prepareStatement("SELECT UserName, passWord FROM user WHERE UserName = ? AND passWord = ?");
			// se forskel på DML OG DDL --> createNewUser = connection.prepareStatement("INSERT INTO user FirstName, LastName, UserName, passWord, balance, admin VALUES ?,?,?,?,?,?");
			updateBalance = connection.prepareStatement("UPDATE user SET balance = ? WHERE id = ?");
			currentUser = connection.prepareStatement("SELECT FirstName, LastName, UserName, balance, admin FROM user WHERE UserName = ?");
			checkUsers = connection.prepareStatement("SELECT UserName FROM user WHERE UserName = ?");
			createNewUser = connection.prepareStatement("INSERT INTO user (FirstName, LastName, UserName, passWord, balance, admin) VALUES (?,?,?,?,?,?)");
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
	}

	public int addUser(String fn, String ln, String un, String pw, double ba, boolean ad)
			throws SQLException

	{	
		int result = 0;

		// sætter de parametre som skal bruges
		try {
			createNewUser.setString(1, fn);
			createNewUser.setString(2, ln);
			createNewUser.setString(3, un);
			createNewUser.setString(4, pw);
			createNewUser.setDouble(5, ba);
			createNewUser.setBoolean(6, ad);

			// indsætter
			result = createNewUser.executeUpdate();
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			close();
		}

		return result;
	}
	
	public boolean userExist(String un) throws SQLException
		{
		
		try {
			
			checkUsers.setString(1, un);
			
			ResultSet rs = checkUsers.executeQuery();
			
			if (rs.first()){
				
				System.out.println("findes");
				rs.close();
				return true;
			}
			else
			{
				System.out.println("findes ikke");
				rs.close();
			}
		
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			//close();
		}
		return false;
		
	} // end catch
	public boolean loginVerify(String user, String pass) throws SQLException

	{		
		try {

			Login.setString(1, user);
			Login.setString(2, pass);

			ResultSet rs = Login.executeQuery();
			System.out.println(rs.next());

			if (rs.first()){
				
				rs.close();
				//connection.close();
				//Login.close();
				return true;
			}
			else
			{
			//connection.close();
			//Login.close();
			rs.close();
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			//close();
		}
		return false;
		
	} // end catch
	
	public void currentUser(String user) throws SQLException {
		
		try {
			
			currentUser.setString(1, user);
			ResultSet rs = currentUser.executeQuery();
			if (rs.first()) {			
			
			Account.currentUser = new Account(
					rs.getString("FirstName"),
					rs.getString("LastName"),
					rs.getString("UserName"),
					rs.getDouble("balance"), 
					rs.getBoolean("admin"));
			System.out.println(Account.currentUser.isAdmin());
			
			rs.close();
		}	
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			close();
		}
	}
	
	public void newBalance () {
		
	}
	
	
	//closer connection
	public void close() throws SQLException {
	try {	
			connection.close();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
	}
	
	//laver en double til string
public String doubletostring (double y)
	{
	String converted = String.valueOf(y);
	return converted;
	}
}

