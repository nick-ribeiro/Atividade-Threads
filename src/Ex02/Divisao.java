package Ex02;

public class Divisao extends Thread{
    
    private Double v1;
    private Double v2;
    
    public Divisao(String text, Double v1, Double v2) {
        super(text);
        this.v1 = v1;
        this.v2 = v2;
    }
    
    public void run() {
        
        try{
            if(v2 == 0){
                System.out.println("A divisao nao pode ser realizada");
            }
            else
            {
                System.out.println(getName() + " Divisao: " + (v1 / v2));
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public Double getV1() {
        return v1;
    }

    public void setV1(Double v1) {
        this.v1 = v1;
    }

    public Double getV2() {
        return v2;
    }

    public void setV2(Double v2) {
        this.v2 = v2;
    }
    
}
