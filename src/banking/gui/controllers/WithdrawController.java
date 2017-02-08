package banking.gui.controllers;

import java.util.Optional;

import banking.Bank;
import banking.gui.view.BankFrm;
import banking.gui.view.JDialog_Withdraw;
import datastructure.DStructure;
import framework.Account;

public class WithdrawController {
	BankFrm frame;
	JDialog_Withdraw withdrw;
	Bank bank = new Bank();

	public WithdrawController(BankFrm frame, JDialog_Withdraw withdrw) {
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		withdrw.setVisible(false);
	}

	public void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event) {
		withdrw.setVisible(false);
	}
}
