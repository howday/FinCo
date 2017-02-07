package banking.gui.controllers;

import banking.events.AccountCreatedEvent;
import banking.events.InterestAddedEvent;
import banking.gui.view.JDialog_AddPAcc;
import framework.DomainEventManager;
import framework.IAccount;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;

public class AddPAccController {
	JDialog_AddPAcc jdpc;
	public AddPAccController(JDialog_AddPAcc frame){
		jdpc=frame;
	}
	public void JRadioButtonChk_mouseClicked(java.awt.event.MouseEvent event)
	{
		jdpc.accountType="Checking";
	}

	public void JRadioButtonSav_mouseClicked(java.awt.event.MouseEvent event)
	{
		jdpc.accountType="Saving";
	}
	
	public void JButtonOK_actionPerformed(java.awt.event.ActionEvent event)
	{
      IAccount acc= PersonFactory.create(jdpc.accountnr,jdpc.clientName, jdpc.street,jdpc.city,jdpc.zip, jdpc.state,jdpc.accountType);
      DomainEventManager.raise(new AccountCreatedEvent(acc));
      jdpc.setVisible(false);
	}

	public void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event)
	{
		jdpc.setVisible(false);
	}


}
