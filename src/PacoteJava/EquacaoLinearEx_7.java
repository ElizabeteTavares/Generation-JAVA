package PacoteJava;

import java.util.Scanner;

public class EquacaoLinearEx_7 {
    public static void main(String[] args) {
        double a, b, c, d, E, f, x, y;
        try(Scanner ler = new Scanner(System.in)) {
            a = ler.nextDouble();
            b = ler.nextDouble();
            c = ler.nextDouble();
            d = ler.nextDouble();
            E = ler.nextDouble();
            f = ler.nextDouble();
        }
        x = ((c*E) - (b*f))/((a*E) - (b*d));
        y = ((a*f) - (c*d))/((a*E) - (b*d));
        System.out.println("Temos que x = "+ x +"e y = " + y);
    }
}
