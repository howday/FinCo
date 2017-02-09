package datastructure;

import java.util.ArrayList;
import java.util.List;

import finco.Account;

public class DStructure {
	List<Account> list = new ArrayList<Account>();
	private static DStructure myObj;
    private DStructure(){
         
    }
    public static DStructure getInstance(){
        if(myObj == null){
            myObj = new DStructure();
        }
        return myObj;
    }
    
	public List<Account> getList() {
		return list;
	}
	
	public void addAccount(Account acc){
		list.add(acc);
	}

}
