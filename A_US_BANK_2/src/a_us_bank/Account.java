package a_us_bank;


public class Account {

    private String password;
    private int balance;
    private int amount;

    public Account(int balance) {
        
        this.balance = balance;
    }

    Account() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
     public void deposit(int amount) {
        
         balance += amount;
         System.out.println("New Balance: " + balance);
   
     }
     public void withdraw(int amount) {
         
         if ((balance-amount)<0) {
         
         System.out.println("Insufficient Balance!");
             
         }
         else{
             balance -= amount;
         System.out.println("New Balance: " + balance);
         }
        
        
     }

    void deposit(String amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
         
}
