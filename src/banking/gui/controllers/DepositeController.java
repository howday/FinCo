package banking.gui.controllers;

import java.util.Optional;

import javax.swing.JOptionPane;

import banking.Bank;
import banking.gui.view.BankFrm;
import banking.gui.view.JDialog_Deposit;
import datastructure.DStructure;
import framework.Account;

public class DepositeController {
	JDialog_Deposit depositDialog;
	BankFrm bnkfrm;
	Bank bank = new Bank();

	public DepositeController(JDialog_Deposit jdlg, BankFrm bnkfrm) {
		this.depositDialog = jdlg;
		this.bnkfrm = bnkfrm;
	}

	public void JButtonOK_actionPerformed(java.awt.event.ActionEvent event) {
		System.out.println("Deposit Amount : " + depositDialog.depositAmount);
		System.out.println("Account Number : " + bnkfrm.acountnumber);

		String accountNumber = bnkfrm.acountnumber;
		double amount = Double.valueOf(depositDialog.depositAmount);
		Optional<Account> account = DStructure.getInstance().getList().stream()
				.filter(acc -> acc.getAccountNumber().equals(accountNumber)).findFirst();

		if (account.isPresent()) {
			try {
				bank.deposit(amount, (Account) account.get().clone());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(amount>500 && account.get().getCustomer().getCustomerType().equals("P"))
			JOptionPane.showMessageDialog(null, "Email sent to"+ account.get().getCustomer().getName());
		
		depositDialog.setVisible(false);
	}

	public void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event) {
		depositDialog.setVisible(false);
	}

}
