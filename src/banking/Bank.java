package banking;

import java.util.List;
import java.util.Optional;

import javax.swing.UIManager;

import banking.gui.view.BankFrm;
import datastructure.DStructure;
import finco.Account;
import finco.Customer;
import finco.Entry;
import finco.FinCo;
import finco.IAccount;
import finco.IEntry;

public class Bank extends FinCo{

		
	static public void main(String args[]) {
		try {
			// Add the following code if you want the Look and Feel
			// to be set to the Look and Feel of the native system.

			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e) {
			}

			// Create a new instance of our application's frame, and make it
			// visible.
			(new BankFrm()).setVisible(true);
		} catch (Throwable t) {
			t.printStackTrace();
			// Ensure the application exits with an error condition.
			System.exit(1);
		}
	}

}
