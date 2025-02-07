package Main;

public class CurrencyConverter {
    private static final double IOF = 0.06; // 6% de imposto

    public static double convertToReais(double dollarRate, double amountInDollars) {
        double totalInDollars = amountInDollars * (1 + IOF); // Adiciona o IOF
        return totalInDollars * dollarRate; // Converte para reais
    }
}
