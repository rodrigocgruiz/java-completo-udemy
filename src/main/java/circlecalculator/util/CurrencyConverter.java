package circlecalculator.util;

public class CurrencyConverter {

    public static final double IOF = 6;
    public static final double DOLLAR_PRICE = 5.19;

    public static double dollarToReal(double amount) {

        double valueTotalInReais = amount * DOLLAR_PRICE;
        double iofValue = valueTotalInReais * IOF / 100;

        return valueTotalInReais + iofValue;
    }

}
