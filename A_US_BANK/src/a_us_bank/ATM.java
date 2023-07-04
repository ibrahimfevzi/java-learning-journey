package a_us_bank;


import java.util.Scanner;
import javax.xml.namespace.QName;


public class ATM {
    
    public void run(Account account){
        
        Login login = new Login();
        
        
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Welcome!");
        
        System.out.println("*****************************");
        System.out.println("User Login");        
        System.out.println("*****************************");
        
        int remaining_login_attempt =3;
        
        while(true){
            if (login.login(account)) {
                System.out.println("Login Succesful...");
                break;
                
            }else{
                System.out.println("Login Failed...");
                remaining_login_attempt -= 1;
                System.out.println("Remaining Login Attempts :  " + remaining_login_attempt);
                
            }
            if (remaining_login_attempt==0) {
                System.out.println("You have entered incorrectly 3 times. Please call Customer Service.");
                
               return;
            }
           
               
            
        }
        
        System.out.println("***********************************");
        System.out.println("Select the Operation ");
        String operations = " 1. Balance\n "
                           +"2. Deposit\n "
                           +"3. Withdraw\n "
                           +"q. Press q to exit";
        System.out.println(operations);
        System.out.println("***********************************");
        
        while (true){
            
            System.out.println("Select the Operation");
            String operation = scanner.nextLine();
            
            if (operation.equals("q")) {
                break;

            }
            else if (operation.equals("1")) {
                System.out.println("Balance :" + account.getBalance());

            }
            else if (operation.equals("2")) {
                
                System.out.print("Enter the amount you want to deposit : ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.deposit(amount);

            }
            else if (operation.equals("3")) {
                
                System.out.print("Enter the amount you want to withdraw : ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.withdraw(amount);
        }
            else{
                
                System.out.println("Invalid Operation!");
            }
        
    }
    
}
}
