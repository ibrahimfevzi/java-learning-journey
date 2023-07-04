
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        
        /* Çalışanlar Programı
        
        Çalışan sınıfı şeklinde bir üst sınıf
        Çalışan sınıfından türeyen Yazilimci adında bir alt sınıf
        Çalışan sınıfından türeyen yönetici adında bir alt sınıf
        */
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Çalışanlar programına hoşgeldiniz...");
        
        String islemler = "İşlemler...\n"
                + "1. Yazılımcı İşlemler\n"
                + "2. Yönetici İşlemleri\n"
                + "Çıkış İçin q'ya basın...";
        
        System.out.println("***********************");
        System.out.println(islemler);
        System.out.println("***********************");
        
        
        while(true)
        {
            System.out.println("İşlemi Saçiniz : ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                
                System.out.println("Programdan çıkılıyor...");
                break;
                
            }
            else if (islem.equals("1")){
                
               Yazilimci yazilimci = new Yazilimci ("Mustafa MUrat","Coşkun",567,"Phyton,Java,C");
               
               String yazilimci_islem  = "1. Format At\n"
                                       + "2. Bilgileri Göster\n"
                                       + "Çıkış için q'ya basın";
                System.out.println(yazilimci_islem);
               while(true){
                   System.out.println("İşlemi Saçiniz : ");
                   String y_islem = scanner.nextLine();
                   
               }
                
                
            }
            else if (islem.equals("2")){
                
                
            }
            else {
                System.out.println("Geçersiz İşlem");
            }

        }      
    }
    
    
}
