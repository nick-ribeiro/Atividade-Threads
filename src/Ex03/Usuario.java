package Ex03;

public class Usuario extends Thread{
    
    private String user;
    
    public Usuario(String user){
        this.user = user;
    }
    
    public void run(){
        
        try{
            for(int i = 0; i < 10; i++) {
                Thread.sleep(8000);
                System.out.println(" Usuario: " + this.user);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
