package Ex02;

public class Main {
    
    public static void main(String[] args) {
        
        Integer s1 = 5, s2 = 7;
        Soma thread1 = new Soma("Primeira thread: ", s1, s2);
        thread1.start();
        
        Integer sub1 = 15, sub2 = 5;
        Subtracao thread2 = new Subtracao("Segunda thread: ", sub1, sub2);
        thread2.start();
        
        Integer m1 = 5, m2 = 7;
        Multiplicacao thread3 = new Multiplicacao("Terceira thread: ", m1, m2);
        thread3.start();
        
        Double d1 = 15.0, d2 = 2.0;
        Divisao thread4 = new Divisao("Quarta thread: ", d1, d2);
        thread4.start();
    }
}
