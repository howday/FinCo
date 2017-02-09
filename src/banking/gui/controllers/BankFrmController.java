package banking.gui.controllers;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import banking.Bank;
import banking.events.InterestAddedEvent;
import banking.gui.view.BankFrm;
import banking.gui.view.JDialog_AddCompAcc;
import banking.gui.view.JDialog_AddPAcc;
import banking.gui.view.JDialog_Deposit;
import banking.gui.view.JDialog_Withdraw;
import datastructure.DStructure;
import finco.DomainEventManager;
import finco.IAccount;

public class BankFrmController {

	Bank bank;
	BankFrm bnkframe;
	public BankFrmController(BankFrm frm)
	{
		bnkframe=frm;
	}

	public void JButtonPerAC_actionPerformed(java.awt.event.ActionEvent event) {

		JDialog_AddPAcc pac = new JDialog_AddPAcc();
		pac.setBounds(450, 20, 300, 400);
		pac.show();

	}

	public void JButtonCompAC_actionPerformed(java.awt.event.ActionEvent event) {
		JDialog_AddCompAcc pac = new JDialog_AddCompAcc();
		pac.setBounds(450, 20, 300, 400);
		pac.show();
	}

	public void JButtonDeposit_actionPerformed(java.awt.event.ActionEvent event) {
		JDialog_Deposit dep = new JDialog_Deposit(bnkframe);
		dep.setBounds(430, 15, 275, 160);
		dep.show();
		
		

	}

	public void JButtonWithdraw_actionPerformed(java.awt.event.ActionEvent event) {
		JDialog_Withdraw wd = new JDialog_Withdraw(bnkframe);
		wd.setBounds(430, 15, 275, 160);
		wd.show();
	}

	public void JButtonAddinterest_actionPerformed(java.awt.event.ActionEvent event) {
		bank = new Bank();
		bank.addInterestToAllAccounts();

	}

	public void JButtonExit_actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
