package banking.gui.controllers;

import banking.gui.view.JDialog_AddPAcc;
import framework.Account;

public class AddPAccController {
	JDialog_AddPAcc jdpc;
	public AddPAccController(JDialog_AddPAcc frame){
		jdpc=frame;
	}
	public void JRadioButtonChk_mouseClicked(java.awt.event.MouseEvent event)
	{
		jdpc.JRadioButton_Chk.setSelected(true);
		jdpc.JRadioButton_Sav.setSelected(false);
		jdpc.accountType="Checking";
	}

	public void JRadioButtonSav_mouseClicked(java.awt.event.MouseEvent event)
	{
		jdpc.JRadioButton_Chk.setSelected(false);
		jdpc.JRadioButton_Sav.setSelected(true);
		jdpc.accountType="Saving";
	}
	
	public void JButtonOK_actionPerformed(java.awt.event.ActionEvent event)
	{
      Account.create(jdpc.accountnr,jdpc.clientName, jdpc.street,jdpc.city,jdpc.zip, jdpc.state,jdpc.accountType, jdpc.email, jdpc.birthdate);
      jdpc.setVisible(false);
	}

	public void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event)
	{
		jdpc.setVisible(false);
	}


}
