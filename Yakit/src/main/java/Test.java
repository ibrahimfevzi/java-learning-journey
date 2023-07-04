
import java.util.Scanner;


public class Test {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Araç kilometrede kaç kuruş yakıyor Örn: 0,34");
    
    double kurus = scanner.nextDouble();
    
    System.out.println("Aracınızla kaç km gittiniz");
    
    int km = scanner.nextInt();
    
        System.out.println("Toplam ödemeniz gereken tutar: " + (kurus * km) );
        
        
    
    
    
    
    
    
}
}
