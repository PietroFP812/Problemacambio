package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da cotação do dólar
        System.out.print("Qual o valor do dólar? ");
        double dollarRate = scanner.nextDouble();

        // Entrada da quantidade de dólares a comprar
        System.out.print("Quantos dólares serão comprados? ");
        double amountInDollars = scanner.nextDouble();

        // Cálculo da conversão
        double amountInReais = CurrencyConverter.convertToReais(dollarRate, amountInDollars);

        // Exibir resultado
        System.out.printf("Valor a ser pago em reais = %.2f%n", amountInReais);

        scanner.close();
    }
}
