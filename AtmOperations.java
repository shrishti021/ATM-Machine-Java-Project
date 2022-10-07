package com.mycompany.project1;

import java.util.HashMap;
import java.util.Map;

public class AtmOperations {
    ATM_Machine atm = new ATM_Machine();
    Map<Double,String> ministmt = new HashMap<>();
    
    public void viewBalance(){
        System.out.println("Available balance is: " + atm.getBalance());
    }    
    
    public void withdrawAmt(double withdrawAmt){
        if(withdrawAmt%500 == 0){
            if(withdrawAmt <= atm.getBalance()){
                ministmt.put(withdrawAmt, "Amount Withdrawn");
                System.out.println("Collect the cash" + withdrawAmt);
                atm.setBalance(atm.getBalance() -  withdrawAmt);
                viewBalance();
            }
            else{
                System.out.println("Insufficient Balance!!");
            }
        }
    } 
    public void depositAmt(double depositAmt){
         ministmt.put(depositAmt, "Amount deposited");
         System.out.println(depositAmt + "Deposited successfully");
         atm.setBalance(atm.getBalance() + depositAmt);
         viewBalance();
    }
    
    public void viewMiniStmt(){
        for(Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}   

