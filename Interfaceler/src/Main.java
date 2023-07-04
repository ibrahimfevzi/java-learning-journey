
public class Main {
    
    public static void main(String[] args) {
        
        
       PcMuhendisi muhendis1 = new PcMuhendisi(false, false);
       
       muhendis1.askerlik_durumu_sorgula();
       muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.07));
        String[] tecrube = {"Vestel", "Havelsan", "Turksat"};
        
        muhendis1.is_tecrübesi(tecrube);
        
        
    }
    
    
    
    
    
}
