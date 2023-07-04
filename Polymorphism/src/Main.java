
class hayvan {
    
    private String isim;

    public hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String konus() {
        return "Hayvan konuşuyor...";
    }
    
    class Kedi extends hayvan{

        public Kedi(String isim) {
            super(isim);
        }

        @Override
        public String konus() {
            return this.getIsim() + " Miyavlıyor..."; 
        }
    class Kopek extends hayvan {

            public Kopek(String isim) {
                super(isim);
            }

            @Override
            public String getIsim() {
                return super.getIsim()+ " havlıyor..."; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
    class At extends hayvan {

                public At(String isim) {
                    super(isim);
                }

                @Override
                public String konus() {
                    return this.getIsim() + "Kişniyor..."; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                }
        
        
    }
        
    }
        
        
    }
    
    public class Main {
    
    public static void Main(String[] args){
        
        hayvan hayvan = new hayvan("Tekir");
        System.out.println(hayvan.konus());
        
    
    
    
    
}


        
    }
    
}
