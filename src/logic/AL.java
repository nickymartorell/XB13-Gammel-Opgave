package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import ui.Screen;
import data.Account;
import data.SQLHandler;

@SuppressWarnings("unused")
public class AL {

	private Screen screen;
	private SQLHandler sqlhandler;
	public static Account currentUser;

	// private Data data;

	public AL() throws InstantiationException, IllegalAccessException,
			ClassNotFoundException, SQLException {

		screen = new Screen();
		sqlhandler = new SQLHandler();
		// data = new Data();

		// her sætter vi listeneres på skærmene
		screen.getLogin().addActionListener(new LoginAL());
		screen.getMenu().addActionListener(new MenuAL());
		screen.getMenuadmin().addActionListener(new MenuAdminAL());
		screen.getBalance().addActionListener(new BalanceAL());
		screen.getDeposit().addActionListener(new DepositAL());
		screen.getSearchuser().addActionListener(new SearchUserAL());
		screen.getUseradd().addActionListener(new UserAddAL());
		screen.getUseradd().addMouseListener(new UserAddML());
		screen.getTransfer().addActionListener(new TransferAL());
		screen.getWrongpass().addActionListener(new WrongPassAL());

	}

	// metoden som main skal køre
	public void run() {
		screen.show(Screen.LOGIN);
		screen.setVisible(true);
	}

	// listeners

	// Login skærm
	private class LoginAL implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String user = screen.getLogin().getUsername();
			String pass = screen.getLogin().getpassWord();

			try {

				if (sqlhandler.loginVerify(user, pass)) {

					sqlhandler.currentUser(user);

					if (Account.currentUser.isAdmin()) {

						screen.show(Screen.MENUADMIN);
					} else {
						screen.show(Screen.MENU);
					}
				} else {
					System.out.println("fail");
					screen.show(Screen.WRONGPASS);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}
	}

	private class MenuAL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String d = sqlhandler.doubletostring(Account.currentUser.getBalance());
			screen.getBalance().setTextField(d);
			screen.show(Screen.BALANCE);

			// lav en if logged ind = student, så vis MENU, hvis admin
			// vis MenuAdmin, hvis forkert hvis fejl og prøv igen
		}
	}

	private class MenuAdminAL implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == screen.getMenuadmin().getBtnAddUser()) {
				screen.show(Screen.USERADD);
			}
			if (e.getSource() == screen.getMenuadmin().getBtnDeleteUser()) {
				screen.show(Screen.DELETEUSER);
			}
			if (e.getSource() == screen.getMenuadmin().getBtnSetBtcRate()) {
				screen.show(Screen.SETBTC);
			}
			if (e.getSource() == screen.getMenuadmin().getBtnGoToUser()) {
				screen.show(Screen.MENU);
			}
			if (e.getSource() == screen.getMenuadmin().getButton_1()) {
				screen.getLogin().setTextField(null);
				screen.getLogin().setPasswordField(null);
				screen.show(Screen.LOGIN);
			}
		}
	}

	private class BalanceAL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			

			
			/**
			double t = Account.currentUser.getBalance();
			System.out.println(t);
			String x = sqlhandler.doubletostring(t);
			System.out.println(x);
			// sqlhandler.doubletostring(Account.currentUser.getBalance())
			 * 
			 */

		}
	}

	private class DepositAL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.show(Screen.SEARCHUSER);
		}
	}

	private class SearchUserAL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.show(Screen.USERADD);
		}
	}

	private class UserAddAL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String fn = screen.getUseradd().getTextField_7().getText();
			String ln = screen.getUseradd().getTextField_9().getText();
			String un = screen.getUseradd().getTxtId().getText();
			String pw = screen.getUseradd().getPasswordField_2().getText();
			double ba = 1;
			boolean ad = false;
			
			System.out.println(un);
			
			try {
				
			if(e.getSource()==screen.getUseradd().getBtnAdd()) {
				
			if(sqlhandler.userExist(un)){
			screen.show(Screen.WRONGPASS);
			}
			else
			{
			sqlhandler.addUser(fn, ln, un, pw, ba, ad);
			//JOptionpane
			}
			}
			} 
			
			catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			if(e.getSource()==screen.getUseradd().getBtnBack_2()) {
			screen.show(Screen.MENUADMIN);
			}

			
		}
	}

	private class TransferAL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.show(Screen.MENUADMIN);
		}
	}

	private class WrongPassAL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.show(Screen.LOGIN);
		}
	}

	// fjerner tekst fra felterne når man trykker
	private class UserAddML implements MouseListener {
		
		//int værdierne der skal tælle antal click
		private int c1,c2,c3,c4;
	
		public void mouseClicked(MouseEvent e) {

			if (e.getSource() == screen.getUseradd().getTextField_7()) {
				
				c1 += e.getClickCount();
				if(c1<2){
				screen.getUseradd().setTextField(null);
				}
			}
			
			if (e.getSource() == screen.getUseradd().getTextField_9()) {

				
				c2 += e.getClickCount();
				if(c2<2){
				screen.getUseradd().setTextField2(null);
				}
			}
			
			if (e.getSource() == screen.getUseradd().getPasswordField_2()) {

				c3 += e.getClickCount();
				if(c3<2){
				screen.getUseradd().setPass(null);
				}
			}
			
			if (e.getSource() == screen.getUseradd().getTxtId()) {

				c4 += e.getClickCount();
				if(c4<2){
				screen.getUseradd().setTextField3(null);
				}
			}

		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}
	}
}
