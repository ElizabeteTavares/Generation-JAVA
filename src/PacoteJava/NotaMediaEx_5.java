package PacoteJava;

import java.util.Scanner;

public class NotaMediaEx_5 {
    public static void main(String[] args) {
        double n1, n2, n3, somaPesos, media;
        try (Scanner recebe = new Scanner(System.in)){
            System.out.println("\nInforme a nota: ");
            n1 = recebe.nextDouble();
            n2 = recebe.nextDouble();
            n3 = recebe.nextDouble();
        }
        somaPesos = (2 + 3 + 5);

        media = ((n1*2) + (n2 * 3) + (n3*5))/ somaPesos;
        System.out.println("\nA média final é:" + media);
    }
}
