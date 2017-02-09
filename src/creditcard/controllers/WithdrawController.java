package creditcard.controllers;

import java.util.Optional;

import javax.swing.JOptionPane;

import creditcard.*;
import creditcard.gui.view.*;
import creditcard.events.*;
import creditcard.handlers.*;
import creditcard.controllers.*;
import finco.Account;
import datastructure.DStructure;
import finco.Account;

public class WithdrawController {
	CreditCardFrm frame;
	JDialog_Withdraw withdrw;
	CreditCard bank = new CreditCard();

	public WithdrawController(CreditCardFrm frame, JDialog_Withdraw withdrw) {
		this.frame = frame;
		this.withdrw = withdrw;
	}

	public void JButtonOK_actionPerformed(java.awt.event.ActionEvent event) {
		System.out.println(frame.acountnumber + " " + withdrw.withdrawalAmount);
		System.out.println("Withdraw Amount : " + withdrw.withdrawalAmount);
		System.out.println("Account Number : " +frame.acountnumber);

		String accountNumber = frame.acountnumber;
		double amount = Double.valueOf(withdrw.withdrawalAmount);
		Optional<Account> account = DStructure.getInstance().getList().stream()
				.filter(acc -> acc.getAccountNumber().equals(accountNumber)).findFirst();

		if (account.isPresent()) {
			try {
				bank.withdraw(amount, (Account)account.get().clone());
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		if(amount>500 && account.get().getCustomer().getCustomerType().equals("P"))
			JOptionPane.showMessageDialog(null, "Email sent to : "+ account.get().getCustomer().getName());
		withdrw.setVisible(false);
	}

	public void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event) {
		withdrw.setVisible(false);
	}
}
