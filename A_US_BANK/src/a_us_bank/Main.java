package a_us_bank;


public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();

        Account account = new Account("İbrahim Fevzi", "12345", 2000);

        atm.run(account);
        System.out.println("Program Terminated...");

    }

}
