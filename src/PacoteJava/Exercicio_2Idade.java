package PacoteJava;

import java.util.Scanner;

public class Exercicio_2Idade {
    public static void main(String[] args) {
        int idadeAnos, idadeMeses, idadeDias;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("\nInfrme sua idade em quantidade de dias: ");
            idadeDias = entrada.nextInt();
        }

        idadeAnos = (idadeDias / 365);
        System.out.println("\nA idade informada é: " + idadeAnos + "anos");

        idadeMeses = (idadeDias * 12) / 365;
        System.out.println("\nA idade informada é: " + idadeMeses + "meses");
    }
}
