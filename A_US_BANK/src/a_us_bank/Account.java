package a_us_bank;


public class Account {

   public String user_name;
    public String password;
    public int balance;

    
    public Account(String user_name, String password, int balance) {
        this.user_name = user_name;
        this.password = password;
        this.balance = balance;
    }

    Account() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
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
