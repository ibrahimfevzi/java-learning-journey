
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
 
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.Connection;
import java.sql;








public class Baglanti {
    
private String kullanici_adi = "root" ;
private String parola = "";

private String db_ismi = "demo";

private String host = "localhost";

private int port = 3306;

private Connection con = null;

private Statement statement = null;

public void calisanlariGetir(){

String sorgu ="Select * From calisanlar";

   
try {
statement =  (Statement) con.createStatement();

ResultSet rs = statement.executeQuery(sorgu);





}catch (SQLException ex) {
   
}





}

public Baglanti () {
    
    // jdbc:mysql://localhost:3306/demo
    String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi;
    
    
    try {
        
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        
    } catch (ClassNotFoundException ex) {
        System.out.println("Driver Bulunamadı...");
    }
    
    
    
    try {
        con =  DriverManager.getConnection(url, kullanici_adi, parola);
        System.out.println("Bağlantı Başarılı...");
        
    } catch (SQLException ex) {
        System.out.println("Bağlantı Başarısız...");
    }
    
    
   
}

    public static void main(String[] args) {
        
        Baglanti baglanti = new Baglanti();
        
    }


    
    
    
    
    
}
