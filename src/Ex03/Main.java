package Ex03;

public class Main {
    
    public static void main(String[] args) {
        
        String users[] = {"@mariazinha", "@jonasdobbb", "@lucasgamer", "@suquinho"};
        
        Tweet thread = new Tweet("#Bom dia");
        thread.start();
            
        Hora thread2 = new Hora();
        thread2.start();
           
        Usuario thread3 = new Usuario(users[(int)Math.floor(Math.random()*(3 + 1))]);
        thread3.start();
    }
}
