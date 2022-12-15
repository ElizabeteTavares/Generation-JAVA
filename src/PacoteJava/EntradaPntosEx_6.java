package PacoteJava;

import java.util.Scanner;
import java.lang.Math;

public class EntradaPntosEx_6 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, d, p1, p2;
        try (Scanner ler = new Scanner(System.in)){
            System.out.println("\nDigite um valor: ");
            x1 = ler.nextDouble();
            System.out.println("\nDigite um valor: ");
            x2 = ler.nextDouble();
            System.out.println("\nDigite um valor: ");
            y1 = ler.nextDouble();
            System.out.println("\nDigite um valor: ");
            y2 = ler.nextDouble();
        }
        p1 = Math.pow(x2 - x1, 2);
        p2 = Math.pow(y2 - y1, 2);
        d = Math.sqrt(p1 + p2);

        System.out.println("\n distancia entre os pontos é: " + Math.round(d));
    }


}
