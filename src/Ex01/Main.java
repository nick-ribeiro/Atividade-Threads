package Ex01;

public class Main {
    
    public static void main(String[] args) {
             
        Integer inicio = 0;
        Integer fim = 1000;
        
        do{
            NumerosPrimos thread = new NumerosPrimos("Thread: ", inicio, fim);
            thread.start();
            inicio = fim;
            fim += 1000;
        }while(fim < 1000000);
    }
}
