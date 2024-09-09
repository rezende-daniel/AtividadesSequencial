import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero=teclado.nextDouble();

        System.out.println("O valor do número ao quadrado é: "+Math.pow(numero, 2));
        System.out.println("O valor do número ao cubo é: " +Math.pow(numero, 3));
        System.out.println("A raiz quadrada do núemro é: "+Math.sqrt(numero));
        System.out.println("A raiz cubica do núemro é: "+Math.cbrt(numero));
}
}
