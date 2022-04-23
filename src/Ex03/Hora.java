package Ex03;

import java.time.LocalDateTime;

public class Hora extends Thread{
    
    public void run(){
        
        try{
            for(int i = 0; i < 10; i++){
                Thread.sleep(10000);
                System.out.println(LocalDateTime.now().getHour()+":"+ LocalDateTime.now().getMinute() + ":" + LocalDateTime.now().getSecond());
            }
        }catch(Exception e){ 
            e.printStackTrace();
        }
    }
}
