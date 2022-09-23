package BankAccount;

public class BankAccount {
    private String password;
    private double balance;
    private String name;
    //Empty Constructor Sets password to null and balance to 0.0;
    {
        name = "null";
        password = "null";
        balance = 0.0;
    }
    public BankAccount(String user, String pw, double bal)
    {
        name = user;
        password = pw;
        balance = bal;
    }
    
    public void changeName(String user){
        name = user;
    }
    //deposit adds money to the balance
    public void deposit(double depositAmount)
    {
        balance += depositAmount;
    }
    
    //withdrawal subtracts from the balance
    public void withdrawal(double withdrawalAmount)
    { 
        balance -= withdrawalAmount;
    }
    
    //print Name and balance
    public void printAccountInfo()
    {
        System.out.println(name + ":" + balance);
    }
    
    //make a toString method instead
    public String toString(){
        return name.toString() + ":" + balance;
    }
}
