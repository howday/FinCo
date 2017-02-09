package creditcard.controllers;

import java.awt.event.MouseEvent;

import creditcard.*;
import creditcard.gui.view.*;
import creditcard.events.*;
import creditcard.handlers.*;
import creditcard.controllers.*;
import finco.Account;
import finco.Account;

public class AddPAccController {
	JDialog_AddPAcc jdpc;
	public AddPAccController(JDialog_AddPAcc frame){
		jdpc=frame;
	}
	public void JRadioButtonChk_mouseClicked(java.awt.event.MouseEvent event)
	{
		
	}

	public void JRadioButtonSav_mouseClicked(java.awt.event.MouseEvent event)
	{
		
	}
	
	public void JButtonOK_actionPerformed(java.awt.event.ActionEvent event)
	{
	  System.out.println("Customer type: "+jdpc.customerType);
      Factory.create(jdpc.accountnr,
    		  jdpc.clientName,
    		  jdpc.street,
    		  jdpc.city,
    		  jdpc.zip,
    		  jdpc.state,
    		  jdpc.accountType,
    		  jdpc.email,
    		  jdpc.birthdate
    		  );
      jdpc.setVisible(false);
	}

	public void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event)
	{
		jdpc.setVisible(false);
	}
	public void JRadioButtonGold_mouseClicked(MouseEvent event) {
		// TODO Auto-generated method stub
		jdpc.JRadioButton_Gold.setSelected(true);
		jdpc.JRadioButton_Silver.setSelected(false);
		jdpc.JRadioButton_Bronze.setSelected(false);
		jdpc.accountType="Gold";
	}
	public void JRadioButtonSilver_mouseClicked(MouseEvent event) {
		// TODO Auto-generated method stub
		jdpc.JRadioButton_Gold.setSelected(false);
		jdpc.JRadioButton_Silver.setSelected(true);
		jdpc.JRadioButton_Bronze.setSelected(false);
		jdpc.accountType="Silver";
	}
	public void JRadioButtonBronze_mouseClicked(MouseEvent event) {
		// TODO Auto-generated method stub
		jdpc.JRadioButton_Gold.setSelected(false);
		jdpc.JRadioButton_Silver.setSelected(false);
		jdpc.JRadioButton_Bronze.setSelected(true);
		jdpc.accountType="Bronze";
	}


}
