
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    
    public static void main(String[] args) {
        
        
        FileOutputStream fos = null;
        
        try {
            //File file = new File("dosya.txt");

            fos = new FileOutputStream("dosya.txt", true);
            
            byte [] array = {101,75,66,68};
            
            fos.write(array);
                    
                    
                    
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception oluştu...");
        } catch (IOException ex) {
            System.out.println("Dosyaya yazılırken bir hata oluştu...");
        }
        finally {
            
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata oluştu...");;
            }
        }
        
        
        
    }
    
}
