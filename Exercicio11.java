import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um número: ");
        float numero=teclado.nextFloat();

        System.out.println("O antecessor do número é: "+(numero-1));
        System.out.println("O sucessor do número é: "+(numero+1));
        System.out.println("O dobro do número é: "+numero*2);
        System.out.println("A metade do núemro é: "+numero/2);
}
}
