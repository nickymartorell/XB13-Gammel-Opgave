

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;


public class Connect {

	
	private static Connection con;


	public Connect() throws ClassNotFoundException, SQLException {
		

	
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			setCon((DriverManager.getConnection("jdbc:mysql://localhost:3306/mathias","root","keeponmoving123")));
			
			}
			catch (Exception e){
			e.printStackTrace();
			}
	}
	
	public void close()
	{
		try
	{
		getCon().close();
	}
		catch (SQLException sqlException)
	{
		sqlException.printStackTrace();
	}
	
	}

	public static Connect getCon() {
		return (Connect) con;
	}

	public static void setCon(Connection con) {
		Connect.con = con;
	}

}



//trækker balance, rate og username ud

/**
Statement st = (Statement) conn.createStatement();
ResultSet res = st.executeQuery("SELECT * FROM student");
while (res.next()) {
	int id =res.getInt("balance");
	int id1 =res.getInt("rate");
	String msg = res.getString("UserName");
	System.out.println(id + "\t" + msg + "\t" + id1);
* 
 */
	
//indæstter værdier

/**
int val = st.executeUpdate("INSERT into student VALUES("+1+","+"'Easy'"+")");
	if(val==1)
	System.out.println("Successfully");
	conn.close();
	} catch (Exception e) {
	e.printStackTrace();
		}
			
}
		
				
				
				
	/** Vi bruger prepated statement for at kunne hente dataer hurtigere fra SQL
	PreparedStatement hejsa = con.prepareStatement("select * from student");
	ResultSet result = hejsa.executeQuery();
	while(result.next())
	{
	System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " " + result.getString(4));
	System.out.println();
	 * 
	 */


//en måde at connecte

/**
 * 	Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url,un,pw);
									
 		String url = "jdbc:mysql://localhost:3306/mathias";
		String driver = "com.mysql.jdbc.Driver";
		String un = "root";
		String pw = "keeponmoving123";
 */
	


/** Vi bruger prepared statement for at kunne hente dataer hurtigere fra SQL

PreparedStatement hejsa = con.prepareStatement("select * from student");


ResultSet rs = hejsa.executeQuery();


while(rs.next())
	
{
	System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " " + result.getString(4));
	System.out.println();
* 
 */
	
		
	


