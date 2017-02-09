package banking.gui.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import banking.gui.controllers.*;
import datastructure.DStructure;
import finco.Account;
import finco.DomainEventManager;
import finco.IAccount;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import banking.events.AccountCreatedEvent;
import banking.events.InterestAddedEvent;
import banking.events.MoneyDepositedInPersonalAccountEvent;
import banking.events.MoneyWithdrawInPersonalAccountEvent;
import banking.gui.controllers.BankFrmController;
import banking.handlers.AccountCreatedEventHandler;
import banking.handlers.InterestAddedEventHandler;
import banking.handlers.MoneyDepositedInPersonalAccountHandler;
import banking.handlers.MoneyWithdrawInPersonalAccontHandler;

/**
 * A basic JFC based application.
 */
public class BankFrm extends javax.swing.JFrame {
	/****
	 * init variables in the object
	 ****/

	boolean newaccount;
	private DefaultTableModel model;
	private JTable JTable1;
	private JScrollPane JScrollPane1;
	BankFrm myframe;
	private Object rowdata[];
	public String acountnumber;

	public BankFrm() {
		myframe = this;
		/**
		 * TODO: Add all event and handlers dynamic
		 */
		DomainEventManager.addHandler(new InterestAddedEvent(), new InterestAddedEventHandler());
		DomainEventManager.addHandler(new AccountCreatedEvent(), new AccountCreatedEventHandler());
		DomainEventManager.addHandler(new MoneyDepositedInPersonalAccountEvent(),
				new MoneyDepositedInPersonalAccountHandler());
		DomainEventManager.addHandler(new MoneyWithdrawInPersonalAccountEvent(),
				new MoneyWithdrawInPersonalAccontHandler());

		setTitle("Bank Application.");
		setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		setSize(600, 350);
		setVisible(false);
		JPanel1.setLayout(null);
		getContentPane().add(BorderLayout.CENTER, JPanel1);
		JPanel1.setBounds(0, 0, 575, 310);
		/*
		 * /Add five buttons on the pane /for Adding personal account, Adding
		 * company account /Deposit, Withdraw and Exit from the system
		 */
		JScrollPane1 = new JScrollPane();
		model = new DefaultTableModel();
		JTable1 = new JTable(model);
		model.addColumn("AccountNr");
		model.addColumn("Name");
		model.addColumn("City");
		model.addColumn("P/C");
		model.addColumn("Ch/S");
		model.addColumn("Amount");
		rowdata = new Object[8];
		newaccount = false;

		JPanel1.add(JScrollPane1);
		JScrollPane1.setBounds(12, 92, 444, 160);
		JScrollPane1.getViewport().add(JTable1);
		JTable1.setBounds(0, 0, 420, 0);
		// rowdata = new Object[8];

		JButton_PerAC.setText("Add personal account");
		JPanel1.add(JButton_PerAC);
		JButton_PerAC.setBounds(24, 20, 192, 33);
		JButton_CompAC.setText("Add company account");
		JButton_CompAC.setActionCommand("jbutton");
		JPanel1.add(JButton_CompAC);
		JButton_CompAC.setBounds(240, 20, 192, 33);
		JButton_Deposit.setText("Deposit");
		JPanel1.add(JButton_Deposit);
		JButton_Deposit.setBounds(468, 104, 96, 33);
		JButton_Withdraw.setText("Withdraw");
		JPanel1.add(JButton_Withdraw);
		JButton_Addinterest.setBounds(448, 20, 106, 33);
		JButton_Addinterest.setText("Add interest");
		JPanel1.add(JButton_Addinterest);
		JButton_Withdraw.setBounds(468, 164, 96, 33);
		JButton_Exit.setText("Exit");
		JPanel1.add(JButton_Exit);
		JButton_Exit.setBounds(468, 248, 96, 31);
		// lineBorder1.setRoundedCorners(true);
		// lineBorder1.setLineColor(java.awt.Color.green);
		// $$ lineBorder1.move(24,312);

		JButton_PerAC.setActionCommand("jbutton");

		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();
		JButton_Exit.addActionListener(lSymAction);
		JButton_PerAC.addActionListener(lSymAction);
		JButton_CompAC.addActionListener(lSymAction);
		JButton_Deposit.addActionListener(lSymAction);
		JButton_Withdraw.addActionListener(lSymAction);
		JButton_Addinterest.addActionListener(lSymAction);

	}

	private void createDummyData() {
		// TODO Auto-generated method stub

	}

	/*****************************************************
	 * The entry point for this application. Sets the Look and Feel to the
	 * System Look and Feel. Creates a new JFrame1 and makes it visible.
	 *****************************************************/
	

	javax.swing.JPanel JPanel1 = new javax.swing.JPanel();
	javax.swing.JButton JButton_PerAC = new javax.swing.JButton();
	javax.swing.JButton JButton_CompAC = new javax.swing.JButton();
	javax.swing.JButton JButton_Deposit = new javax.swing.JButton();
	javax.swing.JButton JButton_Withdraw = new javax.swing.JButton();
	javax.swing.JButton JButton_Addinterest = new javax.swing.JButton();
	javax.swing.JButton JButton_Exit = new javax.swing.JButton();

	void exitApplication() {
		try {
			this.setVisible(false); // hide the Frame
			this.dispose(); // free the system resources
			System.exit(0); // close the application
		} catch (Exception e) {
		}
	}

	class SymWindow extends java.awt.event.WindowAdapter {
		public void windowClosing(java.awt.event.WindowEvent event) {
			Object object = event.getSource();
			if (object == BankFrm.this)
				BankFrm_windowClosing(event);
		}
	}

	void BankFrm_windowClosing(java.awt.event.WindowEvent event) {
		// to do: code goes here.

		BankFrm_windowClosing_Interaction1(event);
	}

	void BankFrm_windowClosing_Interaction1(java.awt.event.WindowEvent event) {
		try {
			this.exitApplication();
		} catch (Exception e) {
		}
	}

	class SymAction implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent event) {
			int selection = JTable1.getSelectionModel().getMinSelectionIndex();
			if (selection >= 0) {
				String accnr = (String) model.getValueAt(selection, 0);
				myframe.acountnumber = accnr;
				System.out.println(myframe.acountnumber);
			}
			Object object = event.getSource();
			if (object == JButton_Exit)
				(new BankFrmController(myframe)).JButtonExit_actionPerformed(event);
			else if (object == JButton_PerAC)
				(new BankFrmController(myframe)).JButtonPerAC_actionPerformed(event);
			else if (object == JButton_CompAC)
				(new BankFrmController(myframe)).JButtonCompAC_actionPerformed(event);
			else if (object == JButton_Deposit) {
				if (selection >= 0) {
					(new BankFrmController(myframe)).JButtonDeposit_actionPerformed(event);
				} else {
					JOptionPane.showMessageDialog(getParent(), "Please select an account!!");
				}
			} else if (object == JButton_Withdraw) {
				if (selection >= 0) {
					(new BankFrmController(myframe)).JButtonWithdraw_actionPerformed(event);
				} else {
					JOptionPane.showMessageDialog(getParent(), "Please select an account!!");
				}
			}

			else if (object == JButton_Addinterest)
				(new BankFrmController(myframe)).JButtonAddinterest_actionPerformed(event);

			updateView();

		}
	}

	public void updateView() {
		DStructure dis = DStructure.getInstance();
		for (int i = model.getRowCount() - 1; i >= 0; i--) {
			model.removeRow(i);
		}
		List<Account> list = dis.getList();
		for (Account account : list) {
			rowdata[0] = account.getAccountNumber();
			rowdata[1] = account.getCustomer().getName();
			rowdata[2] = account.getCustomer().getCity();
			rowdata[3] = account.getCustomer().getCustomerType();
			rowdata[4] = account.getType();
			rowdata[5] = account.getCurrentBalance();
			rowdata[6] = "S";

			model.addRow(rowdata);
		}

	}

}
