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

public class DepositeController {
	JDialog_Deposit depositDialog;
	CreditCardFrm bnkfrm;
	CreditCard bank = new CreditCard();

	public DepositeController(JDialog_Deposit jdlg, CreditCardFrm bnkfrm) {
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
			JOptionPane.showMessageDialog(null, "Email sent to : "+ account.get().getCustomer().getName());
		
		depositDialog.setVisible(false);
	}

	public void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event) {
		depositDialog.setVisible(false);
	}

}
