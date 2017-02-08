package banking.gui.controllers;

import banking.gui.view.BankFrm;
import banking.gui.view.JDialog_AddPAcc;
import banking.gui.view.JDialog_Deposit;

public class DepositeController {
	JDialog_Deposit jdlg;
	BankFrm bnkfrm;
	public DepositeController(JDialog_Deposit jdlg, BankFrm bnkfrm) {
		this.jdlg=jdlg;
		this.bnkfrm=bnkfrm;
	}
	public void JButtonOK_actionPerformed(java.awt.event.ActionEvent event)
	{
        System.out.println(jdlg.depositAmount);
        System.out.println(bnkfrm.acountnumber);
        jdlg.setVisible(false);
	}

	public void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event)
	{
		jdlg.setVisible(false);
	}

}
