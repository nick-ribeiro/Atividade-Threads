package Ex01;

public class NumerosPrimos extends Thread{
    
    private Integer inicio = 0;
    private Integer fim = 1000;
    
    public NumerosPrimos(String text, Integer inicio, Integer fim){
        super(text);
        this.inicio = inicio;
        this.fim = fim;
    }
    
    private Integer div;
    
    public void run() {
        try{
            for(int i = inicio; i < fim; i++){
                div = 0;
                for(int j = i; j > 0; j--){
                    if(i % j == 0)
                        div++;
                }
                if(div == 2) 
                    System.out.println(getName() + " Numeros Primos: " + i);
            }
            System.out.println("Finalizando " + this.getName());
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public Integer getInicio() {
        return inicio;
    }

    public void setInicio(Integer inicio) {
        this.inicio = inicio;
    }

    public Integer getFim() {
        return fim;
    }

    public void setFim(Integer fim) {
        this.fim = fim;
    }
}
