
public class ThreadSafe {
    
    private int count = 0;
    
    public void threadleriCalistir(){
        
        Thread thread1 = new Thread(new Runnable()) {
            @Override
            public void run() {
                
                for(int i=0; i<5000; i++){
                    count++;
                    
                }
                
                
            }
        };
         Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        }) {
            @Override
            public void run() {
                
                for(int i=0; i<5000; i++){
                    count++;
                    
                }
                
                
            }
        };
         thread1.start();
         thread2.start();
         
        
        
       
    }
    
    public static void main(String[] args) {
        
        ThreadSafe threadsafe = new ThreadSafe();
        
        threadsafe.threadleriCalistir();
    }
    
    
    
    
}
