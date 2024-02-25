package br.com.javachallengeplayground.issue06;

import java.util.Scanner;

public class OBrasilJaVenceuQuantasCopasDoMundo {
    public static void main(String[] args) {
        System.out.print("O Brasil ja venceu quantas copas do mundo?");
        Scanner leitor = new Scanner(System.in);
        String resposta = leitor.nextLine();
        System.out.println("Voce respondeu: " + resposta);
        if (resposta.equals("5")){
            System.out.println("Parabens, voce acertou! ");
        }else {
            System.out.println("Voce errou :( ! ");
        }
    }
}
