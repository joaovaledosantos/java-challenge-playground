package br.com.javachallengeplayground.issue05;

import java.util.Scanner;

public class QualACorDoCeu {
    public static void main(String[] args) {

        System.out.print("Qual a cor do ceu? ");
        Scanner leitor = new Scanner(System.in);
        String resposta = leitor.nextLine();
        System.out.println("Voce respondeu: " + resposta);
        if (resposta.equals("azul")) {
            System.out.println("Voce acertou! ");
        } else {
            System.out.println("Voce errou! ");
        }
    }
}
