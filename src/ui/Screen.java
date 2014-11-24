package ui;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Screen extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String LOGIN = "hehehe";
	public static final String MENU = "hehehe2";
	public static final String MENUADMIN = "hehehe3";
	public static final String BALANCE = "hehehe4";
	public static final String TRANSFER = "hehehe5";
	public static final String DEPOSIT = "hehehe6";
	public static final String SEARCHUSER = "hehehe7";
	public static final String USERADD = "hehehe8";
	public static final String WRONGPASS = "hehehe9";
	public static final String DELETEUSER = "hehehe10";
	public static final String SETBTC = "hehehe11";
	
	private JPanel contentPane;
	private Menu menu;
	private MenuAdmin menuadmin;
	private Login login;
	private Balance balance;
	private Transfer transfer;
	private Deposit deposit;
	private SearchUser searchuser;
	private UserAdd useradd;
	private WrongPass wrongpass;
	private DeleteUser deleteuser; 
	private SetBtc setbtc;
	
	CardLayout c;
	
	/**
	 * Create the frame.
	 */
	public Screen() {
		setTitle("BCBS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 450);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		login = new Login();
		contentPane.add(login, LOGIN);
		
		menu = new Menu();
		contentPane.add(menu, MENU);
			
		menuadmin = new MenuAdmin();
		contentPane.add(menuadmin, MENUADMIN);
		
		balance = new Balance();
		contentPane.add(balance, BALANCE);
		
		deposit = new Deposit();
		contentPane.add(deposit, DEPOSIT);
		
		searchuser = new SearchUser();
		contentPane.add(searchuser, SEARCHUSER);

		transfer = new Transfer();
		contentPane.add(transfer, TRANSFER);
		
		useradd = new UserAdd();
		contentPane.add(useradd, USERADD);
		
		wrongpass = new WrongPass();
		contentPane.add(wrongpass, WRONGPASS);
		
		deleteuser = new DeleteUser();
		contentPane.add(deleteuser, DELETEUSER);
		
		setbtc = new SetBtc();
		contentPane.add(setbtc, SETBTC);
		
		c = (CardLayout) getContentPane().getLayout();
		
	}

	public Menu getMenu() {
		return menu;
	}

	public Login getLogin() {
		return login;
	}

	public MenuAdmin getMenuadmin() {
		return menuadmin;
	}

	public Balance getBalance() {
		return balance;
	}

	public Transfer getTransfer() {
		return transfer;
	}

	public Deposit getDeposit() {
		return deposit;
	}

	public SearchUser getSearchuser() {
		return searchuser;
	}

	public UserAdd getUseradd() {
		return useradd;
	}
	public void show(String card) {
		c.show(getContentPane(),  card);
	}

	public WrongPass getWrongpass() {
		return wrongpass;
	}

	public SetBtc getSetbtc() {
		return setbtc;
	}
}
