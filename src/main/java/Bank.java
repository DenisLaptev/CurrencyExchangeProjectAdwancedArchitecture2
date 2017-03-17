/**
 * Created by Lenovo on 17.03.2017.
 */
public class Bank {
    String name;
    double USD_TO_UAH;
    double USD_TO_EUR;

    double EUR_TO_UAH;
    double EUR_TO_USD;

    double UAH_TO_USD;
    double UAH_TO_EUR;

    public Bank(String name, double USD_TO_UAH, double USD_TO_EUR, double EUR_TO_UAH, double EUR_TO_USD, double UAH_TO_USD, double UAH_TO_EUR) {
        this.name = name;
        this.USD_TO_UAH = USD_TO_UAH;
        this.USD_TO_EUR = USD_TO_EUR;
        this.EUR_TO_UAH = EUR_TO_UAH;
        this.EUR_TO_USD = EUR_TO_USD;
        this.UAH_TO_USD = UAH_TO_USD;
        this.UAH_TO_EUR = UAH_TO_EUR;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name +
                ", USD_TO_UAH=" + USD_TO_UAH +
                ", USD_TO_EUR=" + USD_TO_EUR +
                ", EUR_TO_UAH=" + EUR_TO_UAH +
                ", EUR_TO_USD=" + EUR_TO_USD +
                ", UAH_TO_USD=" + UAH_TO_USD +
                ", UAH_TO_EUR=" + UAH_TO_EUR +
                '}';
    }
}
