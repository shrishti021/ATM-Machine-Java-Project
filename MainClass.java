package com.mycompany.project1.Main;

import com.mycompany.project1.*;

import java.util.Scanner;

import com.mycompany.project1.AtmOperations;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args){
        AtmOperations op=new AtmOperations();
        int atmNumber = 12345;
        int atmpin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine!!");
        System.out.println("Enter Atm Number: ");
        int atmnumber = in.nextInt();
        System.out.println("Enter Pin: ");
        int pin = in.nextInt();
        
        if((atmNumber == atmnumber )&&(atmpin == pin)){
            while(true){
                System.out.println("1.View Available Balance\\n2.Withdraw Amount\\n3.Deposit Amount\\n4.View Ministatement\\n5.Exit");
                System.out.println("Enter choice: ");
                
                int ch = in.nextInt();
                if(ch==1){
                    op.viewBalance();
                }
                
                else if(ch==2){
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmt = in.nextDouble();
                    op.withdrawAmt(withdrawAmt);
                }
                
                else if(ch==3){
                    System.out.println("Enter amount to deposit: ");
                    double depositAmt = in.nextDouble();
                    op.depositAmt(depositAmt);
                }
                
                else if(ch==4){
                    op.viewMiniStmt();
                }
                
                else if(ch==5){
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                }
                
                else{
                    System.out.println("Please enter correct choice");
                }
            }
    }
        else{
            System.out.println("Incorrect Atm number or pin");
            System.exit(0);
        }
        
        
    }
   
}
