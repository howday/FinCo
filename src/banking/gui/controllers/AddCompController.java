package banking.gui.controllers;

import banking.gui.view.JDialog_AddCompAcc;
import framework.Account;

public class AddCompController {
	JDialog_AddCompAcc companyFrame;

	public AddCompController(JDialog_AddCompAcc frame) {
		companyFrame = frame;
	}
	
	public void JRadioButtonChk_mouseClicked(java.awt.event.MouseEvent event)
	{
		System.out.println("JRadioButtonChk_mouseClicked");
		companyFrame.JRadioButton_Chk.setSelected(true);
		companyFrame.JRadioButton_Sav.setSelected(false);
		companyFrame.accountType="Checking";
	}

	public void JRadioButtonSav_mouseClicked(java.awt.event.MouseEvent event)
	{
		System.out.println("JRadioButtonSav_mouseClicked");
		companyFrame.JRadioButton_Chk.setSelected(false);
		companyFrame.JRadioButton_Sav.setSelected(true);
		companyFrame.accountType="Saving";
	}

	public void JButtonOK_actionPerformed(java.awt.event.ActionEvent event) {
		
		System.out.println("Customer type: "+companyFrame.customerType+"\n"+
				"Account type: "+companyFrame.accountType);
		
		Account.createCompanyAccount(companyFrame.accountnr,
				companyFrame.clientName,
				companyFrame.street,
				companyFrame.city,
				companyFrame.zip,
				companyFrame.state,
				companyFrame.accountType,
				companyFrame.email,
				companyFrame.noOfEmployees
				);
		
		companyFrame.setVisible(false);
	}

	public void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event) {

	}

}
