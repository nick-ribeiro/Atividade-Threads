package Ex02;

public class Soma extends Thread{
    
    private Integer v1;
    private Integer v2;
    
    public Soma(String text, Integer v1, Integer v2) {
        super(text);
        this.v1 = v1;
        this.v2 = v2;
    }
    
    public void run() {
        
        try{
            System.out.println(getName() + " Soma: " + (v1 + v2));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public Integer getV1() {
        return v1;
    }

    public void setV1(Integer v1) {
        this.v1 = v1;
    }

    public Integer getV2() {
        return v2;
    }

    public void setV2(Integer v2) {
        this.v2 = v2;
    }
    
}
