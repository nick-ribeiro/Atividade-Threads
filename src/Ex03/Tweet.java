package Ex03;

public class Tweet extends Thread{
    
    public Tweet(String text) {
        super(text);
    }
    
    public void run() {
       
        try{
            for(int i = 0; i < 10; i++){
                Thread.sleep(8000);
                System.out.println("Tweet: " + this.getName());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
