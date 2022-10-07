package com.mycompany.project1;

public class ATM_Machine {
    
    private double balance;
    private double depositAmt;
    private double withdrawAmt;
    
    //default constructor
    public ATM_Machine(){
        
    }
    
    //getter setter
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getDepositAmount(){
        return depositAmt;
    }
    
    public void setDepositAmount(double depositAmt){
        this.depositAmt = depositAmt;
    }
    
    
    public double getwithdrawAmount(){
        return withdrawAmt;
    }
    
   
    public void setwithdrawAmount(double withdrawAmt){
        this.withdrawAmt = withdrawAmt;
    }
}
