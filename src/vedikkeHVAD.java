String DropDatabase = "DROP DATABASE IF EXISTS BtcDatabase";
	String CreateDatabase = "CREATE DATABASE BtcDatabase;";
	String ProfileTable = "CREATE TABLE BtcDatabase.Login_Information(ID int not null PRIMARY KEY AUTO_INCREMENT, CBSMail varchar(255) NOT NULL, Password varchar(255),Balance decimal(10,2))";		String TransferTable ="CREATE TABLE BtcDatabase.Transfer_Information(TransferID int NOT NULL PRIMARY KEY, Date varchar(8) NOT NULL, Outgoing varchar(30) NOT NULL, Ingoing varchar(30) NOT NULL, Amount decimal(10,2) NOT NULL, ID int, FOREIGN KEY (ID) REFERENCES BtcDatabase.Login_Information(ID))";
	String exchangeTable ="CREATE TABLE BtcDatabase.exchangeRate(exchangeRateText varchar(255), exchangeRateDecimal decimal (10,4) not null PRIMARY KEY)"; //Husk at arguenter i rapporten for decimal tal
	String AddAdmin = "Insert Into BtcDatabase.Login_Information (CBSMail, Password, Balance) VALUES ('88888888', '1234abcd', '12.34')";		String AddUsername = "Insert Into BtcDatabase.Login_Information (CBSMail, Password, Balance) VALUES ('test', 'test', '11.43')";
		String AddUsername1 = "Insert Into BtcDatabase.Login_Information (CBSMail, Password, Balance) VALUES ('Asger', '1234', '421.34')";
		String setExchangeRate = "Insert into BtcDatabase.exchangeRate(exchangeRateText, exchangeRateDecimal) VALUES ('EXR', '2375.1810')";
		
		DC.doUpdate(DropDatabase);
		DC.doUpdate(CreateDatabase);
		DC.doUpdate(ProfileTable);
		DC.doUpdate(TransferTable);
		DC.doUpdate(exchangeTable);
		DC.doUpdate(AddUsername);
		DC.doUpdate(AddUsername1);
		DC.doUpdate(AddAdmin);
		DC.doUpdate(setExchangeRate);
		
		
		public int doUpdate(String Update) throws SQLException
	    {
	    	getConnection();
	    	int temp = 0;
	    	
	    	try
	    	{
	    		stmt = conn.createStatement();
	    		temp = stmt.executeUpdate(Update);
	    	}
	    	catch(SQLException ex)
	    	{
	    		ex.printStackTrace();
	    		if(ex.getErrorCode() == 1062)
	    		{
	    			throw new SQLException ("Duplicate entry");
	    		}
	    		else
	    		{
	    			throw ex;
	    		}
	    	}
	    	
	    	finally
	    	{
	    		if(stmt != null)
	    		{
	    			try
	    			{
	    			stmt.close();
	    			}
	    			catch(SQLException sqlEx)
	    			{
	    				stmt = null;
	    			}
	    		}
	    	}
	    	return temp;
	    }