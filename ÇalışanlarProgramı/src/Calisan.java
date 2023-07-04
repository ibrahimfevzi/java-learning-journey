
public class Calisan {
    
    private string ad;
    private string soyad;
    private int id;

    public Calisan(string ad, string soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }

    public string getAd() {
        return ad;
    }

    public void setAd(string ad) {
        this.ad = ad;
    }

    public string getSoyad() {
        return soyad;
    }

    public void setSoyad(string soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void bilgileriGoster(){
        System.out.println("Çalışan Bilgileri....");
        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);
        System.out.println("ID : " + id);
        
    }
    
    
}
