import java.util.Scanner;

/**
 * Created by Lenovo on 17.03.2017.
 */
public class ExchangeManager {
    static Bank[] banks = new Bank[3];

    ExchangeManager() {
        banks = generate();
    }

    public Bank[] generate() {
        Bank[] banks = new Bank[3];

        banks[0] = new Bank("PrivatBank", 26, 0.9, 30, 1.2, 0.3, 0.2);
        banks[1] = new Bank("OshadBank", 27, 0.89, 31, 1.1, 0.25, 0.18);
        banks[2] = new Bank("PUMB", 28, 0.8, 29, 1.4, 0.31, 0.22);

        return banks;
    }

    public static void main(String[] args) {
        ExchangeManager em = new ExchangeManager();
        System.out.println(em.banks[0].name + ": 100 " + "USD = " + 100 * em.banks[0].USD_TO_UAH);
        System.out.println(em.banks[1].name + ": 100 " + "USD = " + 100 * em.banks[1].USD_TO_UAH);
        System.out.println(em.banks[2].name + ": 100 " + "USD = " + 100 * em.banks[2].USD_TO_UAH);
        System.out.println("-------------------------------------");

        String nameOfTheChosenBank = getNameOfTheBankFromConsole();
        System.out.println("Name Of The Chosen Bank = " + nameOfTheChosenBank);
        System.out.println("-------------------------------------");

        Bank chosenBank = getBankByName(nameOfTheChosenBank);
        System.out.println(chosenBank);
        System.out.println("-------------------------------------");

        System.out.println("Enter your currency: ");
        String yourCurrency = getCurrencyFromConsole();

        System.out.println("Enter bank currency: ");
        String bankCurrency = getCurrencyFromConsole();

        double course = 0;
        if (yourCurrency.equals("UAH") && bankCurrency.equals("USD")) {
            course = chosenBank.UAH_TO_USD;
        } else if (yourCurrency.equals("UAH") && bankCurrency.equals("EUR")) {
            course = chosenBank.UAH_TO_EUR;
        } else if (yourCurrency.equals("USD") && bankCurrency.equals("EUR")) {
            course = chosenBank.USD_TO_EUR;
        } else if (yourCurrency.equals("USD") && bankCurrency.equals("UAH")) {
            course = chosenBank.USD_TO_UAH;
        } else if (yourCurrency.equals("EUR") && bankCurrency.equals("UAH")) {
            course = chosenBank.EUR_TO_UAH;
        } else if (yourCurrency.equals("EUR") && bankCurrency.equals("USD")) {
            course = chosenBank.EUR_TO_USD;
        }

        System.out.println("Result: " + chosenBank.name + ": 100 " + yourCurrency + " = " + 100 * course + bankCurrency);
    }

    private static String getCurrencyFromConsole() {
        //init scanner
        Scanner scanner = new Scanner(System.in);

        String currency = "UAH";

        //enter name of the bank
        System.out.println("Choose currency. Enter 1, 2 or 3: ");
        System.out.print("1. UAH; ");
        System.out.print("2. USD; ");
        System.out.println("3. EUR.");
        int numberOfTheBank = scanner.nextInt();

        switch (numberOfTheBank) {
            case 1:
                currency = "UAH";
                break;

            case 2:
                currency = "USD";
                break;

            case 3:
                currency = "EUR";
                break;
        }
        return currency;
    }

    public static String getNameOfTheBankFromConsole() {
        //init scanner
        Scanner scanner = new Scanner(System.in);

        String nameOfTheBank = "MyBank";

        //enter name of the bank
        System.out.println("Choose the name of the bank. Enter 1, 2 or 3: ");
        System.out.print("1. PrivatBank; ");
        System.out.print("2. OshadBank; ");
        System.out.println("3. PUMB.");
        int numberOfTheBank = scanner.nextInt();

        switch (numberOfTheBank) {
            case 1:
                nameOfTheBank = "PrivatBank";
                break;

            case 2:
                nameOfTheBank = "OshadBank";
                break;

            case 3:
                nameOfTheBank = "PUMB";
                break;
        }
        return nameOfTheBank;
    }

    public static Bank getBankByName(String nameOfTheBank) {
        switch (nameOfTheBank) {
            case "PrivatBank":
                return banks[0];

            case "OshadBank":
                return banks[1];

            case "PUMB":
                return banks[2];

            default:
                return null;
        }

    }
}
