import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira um número para fazer a tabuada: ");
        int numero = teclado.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(numero +"X"+i+"="+numero*i);     
       }
}}
