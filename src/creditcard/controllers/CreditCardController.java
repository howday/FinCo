package creditcard.controllers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.sun.scenario.effect.Blend.Mode;

import banking.gui.view.BankFrm;
import creditcard.*;
import creditcard.events.*;
import creditcard.handlers.*;
import creditcard.gui.view.*;
import datastructure.DStructure;
import finco.Account;
import finco.DomainEventManager;
import finco.Entry;
import finco.IAccount;
import finco.IEntry;

public class CreditCardController {

	CreditCard bank;
	CreditCardFrm bnkframe;
	public CreditCardController(CreditCardFrm frm)
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
		bank = new CreditCard();
		List<Account>ls=bank.getAccounts();
		DefaultTableModel model = new DefaultTableModel();
		Object rowdata[]=new Object[8];
		model.addColumn("Depositor");
		model.addColumn("Amount");
		for (Account acc:ls)
		{
			List<IEntry>list=acc.getEntryList();
			if(acc.getAccountNumber().equals(bnkframe.acountnumber)){
				for(IEntry ent: list)
				{
					rowdata[0]=ent.getDepositerName();
					rowdata[1]=ent.getAmount();
					
					model.addRow(rowdata);
				}
			}
		}
		
		 JTable table = new JTable(model);

		JFrame frame = new JFrame();
		frame.setTitle("Bills Detail");
	    frame.setLayout(new BorderLayout());
	    frame.add(new JScrollPane(table));
	    frame.pack();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}

	public void JButtonExit_actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
