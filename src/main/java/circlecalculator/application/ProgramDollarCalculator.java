package circlecalculator.application;

import circlecalculator.util.CurrencyConverter;

import java.util.Scanner;

public class ProgramDollarCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("IOF tax is 6%\n");
        System.out.println("Dollar price is R$5,19\n");
        System.out.println("How many dollars will be bought? ");
        double dollarToBuy = sc.nextDouble();

        double amountPaid = CurrencyConverter.dollarToReal(dollarToBuy);

        System.out.printf("Amount to be paid in reais : %.2f", amountPaid);
    }
}
