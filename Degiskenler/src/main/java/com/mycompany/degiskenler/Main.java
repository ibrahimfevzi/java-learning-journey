
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
      
        System.out.println("Kilonuzu Girin");
        int kilo = scanner.nextInt();
        System.out.println("Boyunuzu Girin (Örnek: 1,71) ");
        double boy = scanner.nextDouble();
        
        double bki = kilo / (boy * boy);
        
        System.out.println("Vücut Kitle İndeksiniz: " + bki);
        
        
      
        
       
       
       
        
        
        
    }
    
}
