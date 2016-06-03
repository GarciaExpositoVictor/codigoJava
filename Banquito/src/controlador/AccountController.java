package controlador;
import javax.swing.JFrame;

import modelo.Account;
import vista.AccountWindow;
public class AccountController {
	private Account model;
	public AccountController(Account model, AccountWindow view) {
		this.model = model;
	}
	public static void main(String args[]) {
		Account myAccount = new Account("AimeeBartSeppe Ltd.", 3000);
		AccountWindow myView = new AccountWindow();
		AccountController controller = new AccountController(myAccount, myView);
		// Register controller and view
		// (This can also be done in controller constructor)
		myView.registerController(controller);
		myAccount.addAccountListener(myView);
		myView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myView.setVisible(true);
	}
	public void notifyAddFunds(double d) {
		model.addFunds(d);
	}
}
