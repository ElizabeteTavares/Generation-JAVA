package PacoteJava;

import java.util.Scanner;
import java.lang.Math;


public class NumerosInteiroEx_4 {
    public static void main(String[] args) {
        double A, B, C, D, R, S;
        try (Scanner recebe = new Scanner(System.in)){
            System.out.println("\nDigite um valor: ");
            A = recebe.nextInt();
            B = recebe.nextInt();
            C = recebe.nextInt();
        }
        System.out.println(A + " " + B +" "+ C);
        R = Math.pow(A + B, 2);
        S = Math.pow(B + C, 2);
        D = (R + S) / 2;
        System.out.println("\nO resultado da expressão é: " + D);
    }
}
