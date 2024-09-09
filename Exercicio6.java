import  java.util.*;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int termoA;
        int termoB;
        int termoC;

        System.out.println("Insira o termo a: ");
        termoA = teclado.nextInt();
        System.out.println("Insira o termo b: ");
        termoB = teclado.nextInt();
        System.out.println("Insira o termo c: ");
        termoC = teclado.nextInt();
       
        

        int delta = (termoB*termoB) -4*(termoA*termoC);

        double raiz1=(-termoB+java.lang.Math.sqrt(delta))/2*termoA;
        double raiz2=(-termoB-java.lang.Math.sqrt(delta))/2*termoA;
        System.out.println("As raizes da função são " +raiz1+" e "+raiz2 );


    }
}
