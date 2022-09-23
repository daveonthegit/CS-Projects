package BankAccount;

public class BankAccountRunner {
    public static void main(String[] args)
    {
      //Create four accounts 
        BankAccount a1 = new BankAccount("Hitotsu", "877393", 534.35);
        BankAccount a2 = new BankAccount("Futatsu", "868712", 874.60);
        BankAccount a3 = new BankAccount("Mittsu", "986514", 610.90);
        BankAccount a4 = new BankAccount("Yottsu", "987631", 587.56);
      //print out the account info for each customer
        a1.printAccountInfo();
        a2.printAccountInfo();
        a3.printAccountInfo();
        a4.printAccountInfo();
      //add to the balance of two of the customers
        a3.deposit(50);
        a4.deposit(60);
      //check their new balance
        a3.printAccountInfo();
        a4.printAccountInfo();
      //withdraw money from two of the accounts
        a1.withdrawal(45.34);
        a2.withdrawal(88.65);
      //check the new balance
        a1.printAccountInfo();
        a2.printAccountInfo();
      //update the name to a customer and check the new name.  
        a2.changeName("Ni");
        a2.printAccountInfo();
      //test out the toString() method
        a2.toString();
    }
}
