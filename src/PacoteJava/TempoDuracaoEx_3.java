package PacoteJava;

import java.util.Scanner;

public class TempoDuracaoEx_3 {
    public static void main(String[] args) {
        double tempoMinutos, tempoHras, tempoSegundos;
        try (Scanner entrada = new Scanner(System.in)){
            System.out.println("\nQual o tempo de um evento na produção em segundos?");
            tempoSegundos = entrada.nextDouble();
        }
        tempoHras = (tempoSegundos / 3600);
        System.out.println("\nA quantidade em horas de um evento é: " + tempoHras + "hora");

        tempoMinutos = ((tempoSegundos % 3600) / 60);
        System.out.println("\nA quantidade em minutos de um evento é: " + tempoMinutos + "minutos");

        tempoSegundos = ((tempoSegundos % 3600)% 60);
        System.out.println("\nA quantidade em segundos de um evento é: " + tempoSegundos + "segundos");


    }
}
