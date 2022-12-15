package PacoteJava;

import java.util.Scanner;

public class CustoCarroNovoEx_8 {
    public static void main(String[] args) {
        double custoFabrica, porcentDistribuidor, imposto, precoCarNovo;
        try (Scanner entrada = new Scanner(System.in)){
            System.out.println("Preço de fábrica: ");
            custoFabrica = entrada.nextFloat();
        }
        porcentDistribuidor = (custoFabrica * 0.28);
        imposto = (custoFabrica * 0.45);

        precoCarNovo = (custoFabrica + porcentDistribuidor+ imposto);
        System.out.println("O preço final do carro é: " + precoCarNovo);
    }
}
