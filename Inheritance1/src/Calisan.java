
public class Calisan { //Superclass veya Baseclass
    
    
    private String isim;
    
    private int maas;
    
    private String departman;
    
    public Calisan(String isim, int maas, String departman) {
        
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
        
        
    }
    public void calis() {
        
        System.out.println("Çalışan Çalışıyor...");
        
    }
  public void bilgilerigoster(){
      
      System.out.println("İsim : " + this.getIsim());
      System.out.println("Maaş : " + getMaas());
      System.out.println("Departman : " + getDepartman());
     
  }
    public void departman_degistir (String yeni_departman) {
        
        System.out.println("Departman değiştiriliyor...");
        this.setDepartman(yeni_departman);
        
        System.out.println("Yeni Departman : " + this.getDepartman());
        
        
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }

    /**
     * @return the departman
     */
    public String getDepartman() {
        return departman;
    }

    /**
     * @param departman the departman to set
     */
    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
    
}
