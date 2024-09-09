import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a altura em metros: ");
        float altura=teclado.nextFloat();
        double pesoIdeal =(72.7*altura)-58;
        System.out.print("O peso ideal é: "+pesoIdeal);

}
}
