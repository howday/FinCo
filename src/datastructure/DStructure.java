package datastructure;

import java.util.ArrayList;
import java.util.List;

import framework.IAccount;

public class DStructure {
	List<IAccount> list = new ArrayList<IAccount>();
	private static DStructure myObj;
    private DStructure(){
         
    }
    public static DStructure getInstance(){
        if(myObj == null){
            myObj = new DStructure();
        }
        return myObj;
    }
    
	public List<IAccount> getList() {
		return list;
	}
	
	public void addAccount(IAccount acc){
		list.add(acc);
	}

}
