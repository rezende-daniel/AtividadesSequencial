

import java.util.Scanner;

class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anoAtual;
        int anoNascimento;
        int anoDoUsuario;

        System.out.println("Insira o ano atual: ");
        anoAtual = teclado.nextInt();
        System.out.println("Insira seu ano de nascimento: ");
        anoNascimento= teclado.nextInt();
        System.out.println("Insira um ano aleatorio: ");
        anoDoUsuario= teclado.nextInt();

        int idade= anoAtual-anoNascimento;
        System.out.println("Você tem "+idade+"anos");

        int idadeAleatoria= anoDoUsuario-anoNascimento;
        System.out.println("Você tera "+idadeAleatoria+"anos em "+anoDoUsuario);


    }
}