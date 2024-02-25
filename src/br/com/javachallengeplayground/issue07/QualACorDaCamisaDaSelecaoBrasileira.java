package br.com.javachallengeplayground.issue07;

import java.util.Scanner;

public class QualACorDaCamisaDaSelecaoBrasileira {
    public static void main(String[] args) {
        System.out.println("Qual a cor da camisa da selecao brasileira?");
        Scanner leitor = new Scanner(System.in);
        String resposta = leitor.nextLine();
        System.out.println("Voce respondeu: " + resposta);

        if (resposta.equals("amarelo") || resposta.equals("azul")){
            System.out.println("Parabens, voce acertou! ");
        }else {
            System.out.println("voce errou! ");
        }
    }
}
