import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o valor da conta: ");
        double conta=teclado.nextDouble();
        double gorjeta = conta*0.1;
        System.out.println("O valor da gorjeta é "+gorjeta);
}

}
