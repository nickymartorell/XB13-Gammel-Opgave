package Main;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class gamle 
{
	
	public static void main(String[] args) throws Exception{
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mathias","root","keeponmoving123");
		
		
		PreparedStatement statement = con.prepareStatement("select * from student");
		
		
		ResultSet result = statement.executeQuery();
		
		
		while(result.next())
			
		{
			System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " " + result.getString(4));
			System.out.println();
	

	}
	
	}

}
	
}