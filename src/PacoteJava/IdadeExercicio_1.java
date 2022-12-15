package PacoteJava;

import java.util.Scanner;

public class IdadeExercicio_1 {
    public static void main(String[] args) {

    int idadeAnos, idadeMeses, idadeDias;
    try(Scanner ler = new Scanner(System.in)) {
        System.out.println("\nInforme a idade em anos: ");
        idadeAnos = ler.nextInt();    }
        System.out.println("\nA idade informada é: " + idadeAnos + "anos");
    idadeMeses = (idadeAnos * 12);
    idadeDias = (idadeMeses * 365);

        System.out.println("\nA idade em quantidade de dias é: " + idadeDias + "dias");

    }

}
