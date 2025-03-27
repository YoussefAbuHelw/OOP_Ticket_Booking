import java.util.Arrays;

public class Stadium {
    private String name;
    private City city;
    private int[] prices;


    public Stadium(String name, City city, int[] prices) {
        this.name = name;
        this.city = city;
        this.prices = prices;
    }

    public Stadium(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int[] getPrices(int category) {
        return prices;
    }

    public void setPrices(int[] prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "name='" + name + '\'' +
                ", city=" + city +
                ", prices=" + Arrays.toString(prices) +
                '}';
    }

    public double getPrice(int category) {
        return prices[category - 1];
    }
}
