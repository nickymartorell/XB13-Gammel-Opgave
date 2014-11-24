package data;

public class Account {
	
	private String FirstName;
	private String LastName;
	private boolean admin;
	private String UserName;
	private String passWord;
	double rate;
	double balance;
	int id;
	public static Account currentUser;
	
	
	public Account(String fn, String ln, String un, double ba, boolean am)
	
	{
		FirstName = fn;
		LastName = ln;
		UserName = un;
		admin = am;
		balance = ba;	
	}
	
	public Account getCurrentUser() 
	{
		return currentUser;
	}
		
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isAdmin() {
		return admin;
	}
	public String getUserName() {
		return UserName;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}

	public void setCurrentUser(Account currentUser) {
		Account.currentUser = currentUser;
	}
}
